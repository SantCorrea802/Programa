/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Utilidades.VerificacionDatos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ReservaZonaComun extends javax.swing.JFrame {
    String idPropietario;
    String zonaComun;
    String archivocsv = "BaseDatos/reservaszonascomunes.csv";
    /**
     * Creates new form ReservaZonaComun
     */
    public ReservaZonaComun(String idPropietario, String zonaComun) {
        
        this.idPropietario = idPropietario;
        this.zonaComun = zonaComun;
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarHorasDisponibles();
        jLabel1.setText("Reserva: " + this.zonaComun);
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFechaReserva = new javax.swing.JTextField();
        jComboBoxCantidad = new javax.swing.JComboBox<>();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jButtonReservar = new javax.swing.JButton();
        jButtonDescargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 105, 129));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reserva: Zona común");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa la fecha de reserva");

        jTextFieldFechaReserva.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jComboBoxCantidad.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxCantidad.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantidad de personas", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBoxHora.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxHora.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "06:00 - 08:00", "08:00 - 10:00", "10:00 - 12:00", "12:00 - 14:00", "14:00 - 16:00", "16:00 - 18:00", "18:00 - 20:00", "20:00 - 22:00" }));

        jButtonReservar.setBackground(new java.awt.Color(137, 167, 177));
        jButtonReservar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonReservar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReservar.setText("Reservar");
        jButtonReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        jButtonDescargar.setBackground(new java.awt.Color(137, 167, 177));
        jButtonDescargar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonDescargar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDescargar.setText("Descargar");
        jButtonDescargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescargarActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horas disponibles");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Volver al menú");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxHora, 0, 238, Short.MAX_VALUE))
                        .addGap(80, 80, 80))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButtonReservar)
                        .addGap(91, 91, 91)
                        .addComponent(jButtonDescargar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jComboBoxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDescargar))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String hora = (String) jComboBoxHora.getSelectedItem();
    String cantidad = (String) jComboBoxCantidad.getSelectedItem();
    String fechaReserva = jTextFieldFechaReserva.getText();

    if ("Hora".equals(hora) || "Cantidad de personas".equals(cantidad) || fechaReserva.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        return;
    }

    VerificacionDatos vd = new VerificacionDatos();
    if (!vd.verificarFecha(jTextFieldFechaReserva, "dd/MM/yyyy")) {
        JOptionPane.showMessageDialog(null, "La fecha debe estar en formato dd/mm/aaaa");
        return;
    }
        LocalDate fechaReservaParsed = LocalDate.parse(fechaReserva, f);

        String archivoHorasDisponibles = "BaseDatos/horasdisponibles.csv";
        boolean reservaRealizada = false;


        List<String> lineasActualizadas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoHorasDisponibles))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String zona = datos[0];
                    String horaDisponible = datos[1];
                    String disponible = datos[2];

                    if (zona.equalsIgnoreCase(this.zonaComun) && horaDisponible.equals(hora) && "true".equals(disponible)) {
                        disponible = "false";
                        reservaRealizada = true;
                    }

                    lineasActualizadas.add(zona + ";" + horaDisponible + ";" + disponible);
                } else {
                    lineasActualizadas.add(linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de horas disponibles.");
            return;
        }

        if (reservaRealizada) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoHorasDisponibles))) {
                for (String lineaActualizada : lineasActualizadas) {
                    writer.write(lineaActualizada);
                    writer.newLine();
                }

                JOptionPane.showMessageDialog(null, "Reserva realizada y disponibilidad actualizada correctamente.");

                String archivoReservas = "BaseDatos/reservaszonascomunes.csv";
                try (FileWriter csvWriter = new FileWriter(archivoReservas, true)) {
                    csvWriter.append(this.zonaComun).append(";").append(hora).append(";").append(fechaReserva).append(";").append(this.idPropietario).append(";").append(cantidad).append("\n");
                    csvWriter.flush();

                    JOptionPane.showMessageDialog(null, "Reserva guardada correctamente.");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al guardar la reserva. Por favor, intenta nuevamente.");
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al actualizar el archivo de horas disponibles.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La hora seleccionada no está disponible. Por favor, elige otra hora.");
        }
    }//GEN-LAST:event_jButtonReservarActionPerformed

    private void jButtonDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescargarActionPerformed
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hora = (String) jComboBoxHora.getSelectedItem();
        String cantidad = (String) jComboBoxCantidad.getSelectedItem();
        String fechaReserva = jTextFieldFechaReserva.getText();
        Document document = new Document();
        if ("Hora".equals(hora) || "Cantidad de personas".equals(cantidad) || fechaReserva.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return;
        }

        VerificacionDatos vd = new VerificacionDatos();
        if (!vd.verificarFecha(jTextFieldFechaReserva, "dd/MM/yyyy")) {
            JOptionPane.showMessageDialog(null, "La fecha debe estar en formato dd/mm/aaaa");
            return;
        }

        LocalDate fechaReservaParsed = LocalDate.parse(fechaReserva, f);

        String archivoHorasDisponibles = "BaseDatos/horasdisponibles.csv";
        boolean reservaValida = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoHorasDisponibles))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String zona = datos[0];
                    String horaDisponible = datos[1];
                    String disponible = datos[2];

                    if (zona.equalsIgnoreCase(this.zonaComun) && horaDisponible.equals(hora) && "true".equals(disponible)) {
                        reservaValida = true;
                        break;  // La hora está disponible, podemos generar el pdf
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de horas disponibles.");
            return;
        }

        
        if (!reservaValida) { // Si la hora no está disponible, no generamos el pdf
            JOptionPane.showMessageDialog(null, "La hora seleccionada no está disponible. No se puede generar el PDF.");
            return;
        }

        // Generar el pdf solo si la hora está disponible
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Reserva_" + this.idPropietario + ".pdf"));
            document.open();
            document.add(new Paragraph("Reservas de Zonas Comunes"));
            document.add(new Paragraph(" "));
            try (BufferedReader csvReader = new BufferedReader(new FileReader(archivocsv))) {
                String fila;
                while ((fila = csvReader.readLine()) != null) {
                    String[] datos = fila.split(";");
                    if (datos.length == 5) {
                        String zona = datos[0];
                        String horaReservada = datos[1];
                        String fechaReservada = datos[2];
                        String idProp = datos[3];
                        String cant = datos[4];
                        if (zona.equalsIgnoreCase(this.zonaComun) && horaReservada.equals(hora)) {
                            document.add(new Paragraph("Zona Común: " + zona));
                            document.add(new Paragraph("Hora Reservada: " + horaReservada));
                            document.add(new Paragraph("Fecha Reservada: " + fechaReservada));
                            document.add(new Paragraph("ID Propietario: " + idProp));
                            document.add(new Paragraph("Cantidad de Personas: " + cant));
                            document.add(new Paragraph(" "));  // ponemos un espacio en blanco entre reservas
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "PDF generado correctamente.");
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF.");
        } finally {
            document.close();
        }

    }//GEN-LAST:event_jButtonDescargarActionPerformed

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained

    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked

    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MousePressed

    }//GEN-LAST:event_jTextArea1MousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        MenuPropietario menuPropietario = new MenuPropietario(this.idPropietario);
        menuPropietario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked



    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDescargar;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JComboBox<String> jComboBoxCantidad;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldFechaReserva;
    // End of variables declaration//GEN-END:variables
    private void mostrarHorasDisponibles() {
        String archivoHorasDisponibles = "BaseDatos/horasdisponibles.csv";
        StringBuilder contenidoTextArea = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoHorasDisponibles))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String zona = datos[0];
                    String horaDisponible = datos[1];
                    String disponible = datos[2];

                    if (zona.equalsIgnoreCase(this.zonaComun) && "true".equals(disponible)) {
                        contenidoTextArea.append(horaDisponible).append("\n");
                    }
                }
            }
            jTextArea1.setText(contenidoTextArea.toString());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de horas disponibles.");
        }
    }
    
    
}
