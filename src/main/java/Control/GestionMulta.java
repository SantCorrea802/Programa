/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author HP
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionMulta {
    String rutaMultas = "BaseDatos/multas.csv";

    public void descargarMultaMensual(String idUsuario) {
        String nombreArchivoPDF = "multa_" + idUsuario + ".pdf";
        boolean multaEncontrada = false;
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivoPDF));
            documento.open();
            documento.add(new Paragraph("Multas del Usuario ID: " + idUsuario));
            documento.add(new Paragraph(" "));
            try (BufferedReader reader = new BufferedReader(new FileReader(rutaMultas))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(";");
                    if (datos.length == 9) {
                        
                        
                        
                        String idReceptor = datos[0];
                        String nombreEmisor = datos[1];
                        String fechaEvento = datos[2];
                        String fechaMulta = datos[3];
                        String fechaPago = datos[4];
                        String costo = datos[5];
                        String descripcion = datos[6];
                        String idMulta = datos[7];
                        String pagoUsuario = datos[8];
                        if (idReceptor.equals(idUsuario)) {
                            multaEncontrada = true;
                            
                        double costoDouble = Double.parseDouble(costo);
                        if (costoDouble == 0) {
                            documento.add(new Paragraph("ID de la Multa: " + idMulta));
                            documento.add(new Paragraph("Emisor: " + nombreEmisor));
                            documento.add(new Paragraph("Fecha del Evento: " + fechaEvento));
                            documento.add(new Paragraph("Fecha de la Multa: " + fechaMulta));
                            documento.add(new Paragraph("Fecha de Pago: " + fechaPago));
                            documento.add(new Paragraph("Costo Total de la Multa: $" + costo));
                            documento.add(new Paragraph("La multa ha sido pagada en su totalidad."));
                        } else {
                            documento.add(new Paragraph("ID de la Multa: " + idMulta));
                            documento.add(new Paragraph("Emisor: " + nombreEmisor));
                            documento.add(new Paragraph("Fecha del Evento: " + fechaEvento));
                            documento.add(new Paragraph("Fecha de la Multa: " + fechaMulta));
                            documento.add(new Paragraph("Fecha de Pago: " + fechaPago));
                            documento.add(new Paragraph("Costo de la Multa: $" + costo));
                            documento.add(new Paragraph("Pago Realizado por Usuario: $" + pagoUsuario));
                            documento.add(new Paragraph("Descripción: " + descripcion));
                        }
                        documento.add(new Paragraph(" "));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer el archivo de multas.");
                return;
            }

            if (!multaEncontrada) {
                JOptionPane.showMessageDialog(null, "No se encontraron multas para el ID proporcionado.");
                documento.close();
                return;
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Multa mensual descargada correctamente en: " + nombreArchivoPDF);

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF.");
        } finally {
            if (documento.isOpen()) {
                documento.close();
            }
        }
    }


    public void pagarMultaMensual(String idUsuario) {
        List<String> lineasActualizadas = new ArrayList<>();
        boolean multaEncontrada = false;

        String idMulta = JOptionPane.showInputDialog("Ingrese el ID de la multa a pagar:");

        if (idMulta == null || idMulta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID de la multa no ingresado. Operación cancelada.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaMultas))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 9) {
                    String idReceptor = datos[0];
                    String idMultaArchivo = datos[7];
                    String costo = datos[5];
                    String pagoUsuario = datos[8];
                    if (idMultaArchivo.equals(idMulta) && idReceptor.equals(idUsuario)) {
                        multaEncontrada = true;

                        double costoDouble = Double.parseDouble(costo);
                        double pagoUsuarioDouble = Double.parseDouble(pagoUsuario);

                        if (costoDouble == 0) {
                            JOptionPane.showMessageDialog(null, "No hay saldo pendiente. La multa ya está pagada en su totalidad.");
                            lineasActualizadas.add(linea);
                            continue;
                        }

                        double saldoPendiente = costoDouble;
                        String montoPagoStr = JOptionPane.showInputDialog("El saldo pendiente es de $" + saldoPendiente + ". Ingrese el monto a pagar:");
                        if (montoPagoStr == null || montoPagoStr.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Monto de pago no ingresado. Operación cancelada.");
                            lineasActualizadas.add(linea);
                            continue;
                        }
                        try {
                            double montoPago = Double.parseDouble(montoPagoStr);

                            if (montoPago > saldoPendiente) {
                                JOptionPane.showMessageDialog(null, "El monto a pagar no puede ser mayor que el saldo pendiente.");
                                lineasActualizadas.add(linea);
                                continue;
                            } else {

                                pagoUsuarioDouble += montoPago;
                                saldoPendiente = costoDouble - pagoUsuarioDouble;
                                if (saldoPendiente <= 0) {
                                    costoDouble = 0;
                                    JOptionPane.showMessageDialog(null, "Pago completo realizado. La multa ha sido pagada en su totalidad.");
                                } else {
                                    costoDouble = saldoPendiente;
                                    JOptionPane.showMessageDialog(null, "Pago parcial realizado. El saldo restante es de $" + costoDouble);
                                }
                            }
                            datos[5] = String.valueOf(costoDouble); 
                            datos[8] = String.valueOf(pagoUsuarioDouble);
                            lineasActualizadas.add(String.join(";", datos));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Monto de pago no válido. Operación cancelada.");
                            lineasActualizadas.add(linea);
                        }
                    } else {
                        lineasActualizadas.add(linea);
                    }
                } else {
                    lineasActualizadas.add(linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de multas.");
            return;
        }
        if (!multaEncontrada) {
            JOptionPane.showMessageDialog(null, "La multa con el ID proporcionado no existe para el usuario actual.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaMultas))) {
            for (String lineaActualizada : lineasActualizadas) {
                writer.write(lineaActualizada);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Multa actualizada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar el archivo de multas.");
        }
    }

}
