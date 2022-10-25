/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import controlador.ControladorVentanaAdministrador;
import java.awt.Color;
import javax.swing.JOptionPane;
import src.AdministradorDeNegocio;
import src.Local;

/**
 *
 * @author Acer
 */
public class VentanaLocal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdministrador
     */
    VentanaAdministrador ventanaAdministrador;
    ControladorVentanaAdministrador controlador;

    public VentanaLocal(VentanaAdministrador ventanaAdministrador, Local local) {
        initComponents();
        setLocationRelativeTo(this);
        this.ventanaAdministrador = ventanaAdministrador;
        this.controlador = new ControladorVentanaAdministrador();
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
        jLabel2 = new javax.swing.JLabel();
        jLabelAdminNegocio = new javax.swing.JLabel();
        jLabelEmpleados = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelRegistrar2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelRegistrar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("CONTRATO");

        jLabelAdminNegocio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelAdminNegocio.setForeground(new java.awt.Color(51, 153, 255));
        jLabelAdminNegocio.setText("Administrador negocio");
        jLabelAdminNegocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAdminNegocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdminNegocioMouseClicked(evt);
            }
        });

        jLabelEmpleados.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEmpleados.setForeground(new java.awt.Color(51, 153, 255));
        jLabelEmpleados.setText("Contrato");
        jLabelEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmpleados)
                    .addComponent(jLabelAdminNegocio)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jLabelAdminNegocio)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmpleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro administrador negocio"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("¿Desea regresar al inicio?");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        jLabelRegistrar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar2.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar2.setText("Volver");
        jLabelRegistrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabelRegistrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Numero movil");
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        jPanel4.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 219, 210, -1));

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Nombre completo");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 101, 210, -1));

        txtEdad.setForeground(new java.awt.Color(153, 153, 153));
        txtEdad.setText("Edad");
        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });
        jPanel4.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 249, 210, -1));

        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Cedula");
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        jPanel4.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 131, 210, -1));

        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("Correo");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        jPanel4.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 161, 210, -1));

        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setText("******");
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        jPanel4.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 191, 210, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 279, 210, -1));

        jTabbedPane1.addTab("Arrendatario", jPanel4);

        jLabel3.setText("¿Deseas salir de la cuenta?");

        jLabelRegistrar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar1.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar1.setText("Salir");
        jLabelRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegistrar1)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelRegistrar1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contrato", jPanel5);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 690, 460));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAdminNegocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdminNegocioMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabelAdminNegocioMouseClicked

    private void jLabelEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmpleadosMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabelEmpleadosMouseClicked

    private void jLabelRegistrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar1MouseClicked
        ventanaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegistrar1MouseClicked

    private void jLabelRegistrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar2MouseClicked
        ventanaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegistrar2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtCorreo.getText().equals("") || txtCorreo.getText().equals("Correo")
                || String.valueOf(txtContrasena.getPassword()).equals("")
                || String.valueOf(txtContrasena.getPassword()).equals("******")
                || txtCedula.getText().equals("") || txtCedula.getText().equals("Cedula")
                || txtEdad.getText().equals("") || txtEdad.getText().equals("Edad")
                || txtNombre.getText().equals("") || txtNombre.getText().equals("Nombre completo")
                || txtTelefono.getText().equals("") || txtTelefono.getText().equals("Numero movil")) {
            JOptionPane.showMessageDialog(this, "Por favor rellena todos los datos");
        } else {
            String telefono = txtTelefono.getText();
            String nombre = txtNombre.getText();
            short edad = Short.parseShort(txtEdad.getText());
            String cedula = txtCedula.getText();
            String correo = txtCorreo.getText();
            String contrasena = String.valueOf(txtContrasena.getPassword());
            AdministradorDeNegocio administradorNegocio = new AdministradorDeNegocio(nombre, cedula, telefono, correo, contrasena, edad);
            if (controlador.anadirAdministradorNegocio(administradorNegocio)) {
                JOptionPane.showMessageDialog(this, "Registrado correctamente");
                cleanTextField();
            } else {
                JOptionPane.showMessageDialog(this, "No pudiste ser registrado"
                        + " debido a que hay un usuario registrado con algunos de los datos que escribistes ");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if (txtTelefono.getText().equals("Numero movil")) {
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (txtTelefono.getText().equals("")) {
            txtTelefono.setText("Numero movil");
            txtTelefono.setForeground(Color.gray);
        }
        if (!validarNumeros(txtTelefono.getText()) && !txtTelefono.getText().equals("Numero movil")) {
            txtTelefono.setBackground(Color.red);
        } else {
            txtTelefono.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getText().equals("Nombre completo")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().equals("")) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (!validarLetras(txtNombre.getText()) && !txtNombre.getText().equals("Nombre completo")) {
            txtNombre.setBackground(Color.red);
        } else {
            txtNombre.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        if (txtEdad.getText().equals("Edad")) {
            txtEdad.setText("");
            txtEdad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEdadFocusGained

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        if (txtEdad.getText().equals("")) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (!validarNumeros(txtEdad.getText()) && !txtEdad.getText().equals("Edad")) {
            txtEdad.setBackground(Color.red);
        } else {
            txtEdad.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusGained
        if (txtCedula.getText().equals("Cedula")) {
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCedulaFocusGained

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (txtCedula.getText().equals("")) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (!validarNumeros(txtCedula.getText()) && !txtCedula.getText().equals("Cedula")) {
            txtCedula.setBackground(Color.red);
        } else {
            txtCedula.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if (txtCorreo.getText().equals("Correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (txtCorreo.getText().equals("")) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (String.valueOf(txtContrasena.getPassword()).equals("******")) {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if (String.valueOf(txtContrasena.getPassword()).equals("")) {
            txtContrasena.setText("******");
            txtContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContrasenaFocusLost
    public static boolean validarNumeros(String datos) {
        return datos.matches("[0-9]*");
    }

    public static boolean validarLetras(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    public void cleanTextField() {
        txtTelefono.setText("Numero movil");
        txtTelefono.setForeground(Color.gray);
        txtNombre.setText("Nombre completo");
        txtNombre.setForeground(Color.gray);
        txtEdad.setText("Edad");
        txtEdad.setForeground(Color.gray);
        txtCedula.setText("Cedula");
        txtCedula.setForeground(Color.gray);
        txtCorreo.setText("Correo");
        txtCorreo.setForeground(Color.gray);
        txtContrasena.setText("******");
        txtContrasena.setForeground(Color.gray);
    }

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
            java.util.logging.Logger.getLogger(VentanaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAdminNegocio;
    private javax.swing.JLabel jLabelEmpleados;
    private javax.swing.JLabel jLabelRegistrar1;
    private javax.swing.JLabel jLabelRegistrar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
