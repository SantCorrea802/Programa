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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GeneracionPDFMulta {

    public void crearPDF(String idReceptor, String nombreEmisor, String fechaEvento, String fechaMulta,
                         String fechaPago, String costo, String descripcion, String idMulta, String pagoUsuario) {
        String nombreArchivoPDF = "multa" + idReceptor + ".pdf";
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivoPDF));
            document.open();
            
            document.add(new Paragraph("Información de la Multa"));
            document.add(new Paragraph(" "));  // Espacio en blanco
            document.add(new Paragraph("ID Receptor: " + idReceptor));
            document.add(new Paragraph("Nombre del Emisor: " + nombreEmisor));
            document.add(new Paragraph("Fecha del Evento: " + fechaEvento));
            document.add(new Paragraph("Fecha de la Multa: " + fechaMulta));
            document.add(new Paragraph("Fecha de Pago: " + fechaPago));
            document.add(new Paragraph("Costo de la Multa: " + costo));
            document.add(new Paragraph("Pago Realizado por Usuario: " + pagoUsuario));
            document.add(new Paragraph("Descripción: " + descripcion));
            document.add(new Paragraph("ID de la Multa: " + idMulta));
            
            JOptionPane.showMessageDialog(null, "PDF generado correctamente: " + nombreArchivoPDF);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF.");
        } finally {
            document.close();
        }
    }
    public void registrarMultaEnCSV(String idReceptor, String nombreEmisor, String fechaEvento, String fechaMulta,
                                    String fechaPago, String costo, String descripcion, String idMulta, String pagoUsuario) {
        String archivoCSV = "BaseDatos/multas.csv";
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            csvWriter.append(idReceptor).append(";").append(nombreEmisor).append(";").append(fechaEvento).append(";").append(fechaMulta).append(";").append(fechaPago).append(";").append(costo).append(";").append(descripcion).append(";").append(idMulta).append(";").append(pagoUsuario).append("\n");
            csvWriter.flush();

            JOptionPane.showMessageDialog(null, "Multa registrada correctamente en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar la multa en el archivo CSV.");
        }
    }
}
