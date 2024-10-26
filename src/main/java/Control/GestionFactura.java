/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Beans.Casa;
import Beans.Propietario;

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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionFactura {
    String rutaPropietarios = "BaseDatos/propietarios.csv";
    String rutaCasas = "BaseDatos/casas.csv";
    String rutaFactura;

    public void descargarFactura(String idUsuario) {
        Propietario propietario = obtenerPropietarioPorId(idUsuario);

        if (propietario == null) {
            System.out.println("Propietario no encontrado.");
            return;
        }

        Casa casa = obtenerCasaPorPropietarioId(idUsuario);

        if (casa == null) {
            System.out.println("No se encontraron casas asociadas al propietario.");
            return;
        }
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Factura_" + idUsuario + ".pdf"));
            documento.open();
            documento.add(new Paragraph("Factura del Propietario"));
            documento.add(new Paragraph("Nombre: " + propietario.getNombre() + " " + propietario.getApellido()));
            documento.add(new Paragraph("Correo: " + propietario.getCorreo()));
            documento.add(new Paragraph("ID: " + propietario.getId()));
            documento.add(new Paragraph("Fecha de Registro: " + propietario.getFechaRegistro().toString()));
            documento.add(new Paragraph("Número de Contacto: " + propietario.getNumeroContacto()));
            documento.add(new Paragraph("Salario: " + propietario.getSalario()));
            documento.add(new Paragraph("\nInformación de la Casa"));
            documento.add(new Paragraph("ID de la Casa: " + casa.getIdCasa()));
            documento.add(new Paragraph("Estado: " + casa.getEstado()));
            
            documento.add(new Paragraph("Saldo: " + casa.getSaldo()));
            
            
            documento.add(new Paragraph("Costo de Administración: " + casa.getCostoAdministracion()));
            documento.add(new Paragraph("Metros Cuadrados: " + casa.getMetrosCuadrados()));
            
            documento.close();
            System.out.println("Factura generada correctamente.");

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
    private Propietario obtenerPropietarioPorId(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaPropietarios))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(";");
                
                if (data.length < 12) {
                    System.out.println("Formato incorrecto en la línea del archivo: " + linea);
                    continue;
                }

                String idRegistrado = data[4].trim();
                
                if (idRegistrado.equals(id)) {
                    try {
                        double salario = Double.parseDouble(data[0].trim());
                        LocalDate fechaRegistro = LocalDate.parse(data[1].trim(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                        String nombre = data[2].trim();
                        String correo = data[3].trim();
                        LocalDate fechaNacimiento = LocalDate.parse(data[5].trim(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                        String numeroContacto = data[6].trim();
                        String genero = data[7].trim();
                        String contraseña = data[8].trim();
                        String profesion = data[9].trim();
                        String apellido = data[10].trim();
                        int rol = Integer.parseInt(data[11].trim());

                        return new Propietario(salario, fechaRegistro, nombre, correo, id, fechaNacimiento, numeroContacto, genero, contraseña, profesion, apellido, rol);
                    } catch (NumberFormatException e) {
                        System.out.println("Error al convertir un valor numérico en la línea: " + linea);
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Casa obtenerCasaPorPropietarioId(String idPropietario) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaCasas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(";");

                if (data.length < 8) {
                    System.out.println("Formato incorrecto en la línea del archivo: " + linea);
                    continue;
                }

                String idCasa = data[0].trim();
                String propietarioId = data[3].trim();

                try {
                    double facturaMensual = parseDoubleSafely(data[4].trim(), "facturaMensual");
                    double costoAdministracion = parseDoubleSafely(data[5].trim(), "costoAdministracion");
                    double metrosCuadrados = parseDoubleSafely(data[6].trim(), "metrosCuadrados");
                    String estado = data[7].trim();

                    if (propietarioId.equals(idPropietario)) {
                        Propietario propietario = obtenerPropietarioPorId(idPropietario);
                        return new Casa(idCasa, propietario, facturaMensual, costoAdministracion, metrosCuadrados, estado);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error al convertir un valor numérico en la línea: " + linea);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private double parseDoubleSafely(String value, String fieldName) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir " + fieldName + ": " + value);
            throw e;
        }
    }
    
    public void descargarFacturaMensual(String idUsuario) {
        String nombreArchivoPDF = "factura_" + idUsuario + ".pdf";
        boolean facturaEncontrada = false;
        Document documento = new Document();
        String rutaFacturas = "BaseDatos/facturas.csv";
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivoPDF));
            documento.open();
            documento.add(new Paragraph("Facturas del Propietario ID: " + idUsuario));
            documento.add(new Paragraph(" "));
            try (BufferedReader reader = new BufferedReader(new FileReader(rutaFacturas))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(";");

                    if (datos.length == 6) {
                        String numFactura = datos[0];
                        String fechaPago = datos[1];
                        String fechaFactura = datos[2];
                        String valorPagar = datos[3];
                        String valorPagado = datos[4];
                        String idEmisor = datos[5];

                        if (idEmisor.equals(idUsuario)) {
                            facturaEncontrada = true;
                            documento.add(new Paragraph("Número de Factura: " + numFactura));
                            documento.add(new Paragraph("Fecha de Pago: " + fechaPago));
                            documento.add(new Paragraph("Fecha de Factura: " + fechaFactura));
                            documento.add(new Paragraph("Valor a Pagar: " + valorPagar));
                            documento.add(new Paragraph("Valor Pagado: " + valorPagado));
                            documento.add(new Paragraph(" "));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer el archivo de facturas.");
                return;
            }

            if (!facturaEncontrada) {
                JOptionPane.showMessageDialog(null, "No se encontraron facturas para el ID proporcionado.");
                documento.close();
                return;
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Factura mensual descargada correctamente en: " + nombreArchivoPDF);

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF.");
        } finally {
            if (documento.isOpen()) {
                documento.close();
            }
        }
    }
public void pagarFacturaMensual(String idUsuario) {
    List<String> lineasActualizadas = new ArrayList<>();
    boolean facturaEncontrada = false;

    String numFactura = JOptionPane.showInputDialog("Ingrese el número de factura a pagar:");

    if (numFactura == null || numFactura.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Número de factura no ingresado. Operación cancelada.");
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader("BaseDatos/facturas.csv"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(";");
            if (datos.length == 6) {
                String numFacturaArchivo = datos[0];
                String fechaPago = datos[1];
                String fechaFactura = datos[2];
                String valorPagar = datos[3];
                String valorPagado = datos[4];
                String idEmisor = datos[5];
                if (numFacturaArchivo.equals(numFactura) && idEmisor.equals(idUsuario)) {
                    facturaEncontrada = true;

                    double valorPagarDouble = Double.parseDouble(valorPagar);
                    double valorPagadoDouble = Double.parseDouble(valorPagado);
                    double saldoPendiente = valorPagarDouble - valorPagadoDouble;
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
                        } else if (montoPago == saldoPendiente) {
                            valorPagadoDouble += montoPago;
                            valorPagarDouble = 0;
                            JOptionPane.showMessageDialog(null, "Pago completo realizado. La factura ha sido pagada en su totalidad.");
                        } else {
                            valorPagadoDouble += montoPago;
                            valorPagarDouble -= montoPago;
                            JOptionPane.showMessageDialog(null, "Pago parcial realizado. El saldo restante es de $" + valorPagarDouble);
                        }
                        datos[3] = String.valueOf(valorPagarDouble);
                        datos[4] = String.valueOf(valorPagadoDouble);
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
        JOptionPane.showMessageDialog(null, "Error al leer el archivo de facturas.");
        return;
    }
    if (!facturaEncontrada) {
        JOptionPane.showMessageDialog(null, "La factura con el número proporcionado no existe para el usuario actual.");
        return;
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("BaseDatos/facturas.csv"))) {
        for (String lineaActualizada : lineasActualizadas) {
            writer.write(lineaActualizada);
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null, "Factura actualizada correctamente.");
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar el archivo de facturas.");
    }
}

}
