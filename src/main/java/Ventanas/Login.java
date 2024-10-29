/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Beans.Propietario;
import Control.GestionLogueo;
import Control.GestionPropietario;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jToggleButtonIniciar = new javax.swing.JToggleButton();
        jToggleButtonRegistrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(137, 167, 177));

        jPanel2.setBackground(new java.awt.Color(86, 105, 129));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");

        jTextFieldId.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldId.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldId.setText("Id");
        jTextFieldId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIdFocusGained(evt);
            }
        });
        jTextFieldId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldIdMousePressed(evt);
            }
        });
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jPasswordFieldContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContraseña.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPasswordFieldContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldContraseña.setText("****************");
        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusGained(evt);
            }
        });
        jPasswordFieldContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldContraseñaMousePressed(evt);
            }
        });

        jToggleButtonIniciar.setBackground(new java.awt.Color(58, 65, 90));
        jToggleButtonIniciar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jToggleButtonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonIniciar.setText("Iniciar");
        jToggleButtonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonIniciarMouseClicked(evt);
            }
        });
        jToggleButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonIniciarActionPerformed(evt);
            }
        });

        jToggleButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonRegistrar.setText("¿No tienes una cuenta? Regístrate");
        jToggleButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButtonRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButtonRegistrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jToggleButtonRegistrar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(jTextFieldId))))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jToggleButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonRegistrar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Regresar al menú");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(160, 160, 160))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
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

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jToggleButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonIniciarActionPerformed

    }//GEN-LAST:event_jToggleButtonIniciarActionPerformed

    private void jTextFieldIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldIdMousePressed
        limpiarCampo(jTextFieldId, "Id");
        verificarContraseña(jPasswordFieldContraseña, "****************");
    }//GEN-LAST:event_jTextFieldIdMousePressed

    private void jPasswordFieldContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaMousePressed
        limpiarContraseña(jPasswordFieldContraseña, "****************");
        verificarCampo(jTextFieldId, "Id");
    }//GEN-LAST:event_jPasswordFieldContraseñaMousePressed

    private void jTextFieldIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIdFocusGained
        limpiarCampo(jTextFieldId, "Id");
        verificarContraseña(jPasswordFieldContraseña, "****************");
    }//GEN-LAST:event_jTextFieldIdFocusGained

    private void jPasswordFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusGained
        limpiarContraseña(jPasswordFieldContraseña, "****************");
        verificarCampo(jTextFieldId, "Id");
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusGained

    private void jToggleButtonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegistrarMouseEntered
        jToggleButtonRegistrar.setForeground(Color.BLUE);
    }//GEN-LAST:event_jToggleButtonRegistrarMouseEntered

    private void jToggleButtonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegistrarMouseExited
        jToggleButtonRegistrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jToggleButtonRegistrarMouseExited

    private void jToggleButtonIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonIniciarMouseClicked
        String id = jTextFieldId.getText();
        String contraseña = String.copyValueOf(jPasswordFieldContraseña.getPassword());
        GestionLogueo gl = new GestionLogueo(id, 1);
        
        if (id.isEmpty() || id.equals("Id") || contraseña.isEmpty() || contraseña.equals("****************")){
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

        }
        else if(gl.loginUsuario(id, contraseña)){
            if (gl.verificarTipoUsuario(id) == 1){
                
                MenuPropietario menuPropietario = new MenuPropietario(id);
                menuPropietario.setVisible(true);
                this.setVisible(false);  
            }
            else if(gl.verificarTipoUsuario(id) == 2){
                MenuEmpleado menuEmpleado = new MenuEmpleado(id);
                menuEmpleado.setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error, usuario no registrado");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_jToggleButtonIniciarMouseClicked

    private void jToggleButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonRegistrarMouseClicked
        Registro ventanaRegistro = new Registro();
        ventanaRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButtonRegistrarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Index menuIndex = new Index();
        menuIndex.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void verificarCampo(JTextField campo, String textoPredeterminado) {
        if (campo.getText().isEmpty()) {
            campo.setText(textoPredeterminado);
            campo.setForeground(new Color(102, 102, 102));
        }
    }

    private void verificarContraseña(JPasswordField campo, String textoPredeterminado) {
        if (String.valueOf(campo.getPassword()).isEmpty()) {
            campo.setText(textoPredeterminado); // Ojo: Esto sobrescribirá el valor de la contraseña
            campo.setForeground(new Color(102, 102, 102));
        }
    }

    private void limpiarCampo(JTextField campo, String textoPredeterminado) {
        if (campo.getText().equals(textoPredeterminado)) {
            campo.setText("");
            campo.setForeground(Color.BLACK);
        }
    }

    private void limpiarContraseña(JPasswordField campo, String textoPredeterminado) {
        if (String.valueOf(campo.getPassword()).equals(textoPredeterminado)) {
            campo.setText(""); // Limpia el campo de contraseña
            campo.setForeground(Color.BLACK);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JToggleButton jToggleButtonIniciar;
    private javax.swing.JLabel jToggleButtonRegistrar;
    // End of variables declaration//GEN-END:variables
}
