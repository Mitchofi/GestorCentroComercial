/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import controlador.ControladorVentanaSignUp;
import excepciones.ExcepcionClienteDuplicado;
import java.awt.Color;
import javax.swing.JOptionPane;
import src.Cliente;
import src.Negocio;
import src.Vehiculo;
import static ventana.VentanaContrato.validarLetras;

/**
 *
 * @author Acer
 */
public class VentanaSignUp extends javax.swing.JFrame {

    ControladorVentanaSignUp controlador;
    Negocio negocio;

    public VentanaSignUp() {
        initComponents();
        setLocationRelativeTo(this);
        txtTipoDeVehiculo.setEnabled(false);
        txtPlacaVehiculo.setEnabled(false);
        controlador = new ControladorVentanaSignUp();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRegistrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        checkVehiculo = new java.awt.Checkbox();
        txtPlacaVehiculo = new javax.swing.JTextField();
        txtTipoDeVehiculo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jPanel1.setName("dd"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Iniciar sesion"));

        jLabel1.setText("¿Tienes una cuenta?");

        jLabelRegistrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar.setText("Entrar");
        jLabelRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegistrar)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelRegistrar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Registro"));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        checkVehiculo.setLabel("¿Tiene Vehiculo?");
        checkVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkVehiculoItemStateChanged(evt);
            }
        });

        txtPlacaVehiculo.setForeground(new java.awt.Color(153, 153, 153));
        txtPlacaVehiculo.setText("Placa del vehiculo");
        txtPlacaVehiculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlacaVehiculoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaVehiculoFocusLost(evt);
            }
        });

        txtTipoDeVehiculo.setForeground(new java.awt.Color(153, 153, 153));
        txtTipoDeVehiculo.setText("Tipo de vehiculo");
        txtTipoDeVehiculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTipoDeVehiculoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTipoDeVehiculoFocusLost(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEdad)
                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo)
                    .addComponent(txtContrasena)
                    .addComponent(txtTipoDeVehiculo)
                    .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoDeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void jLabelRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarMouseClicked
        if (jLabelRegistrar.getText().equals("Volver")) {
            VentanaAdministradorNegocio ventanaAdministradorNegocio = new VentanaAdministradorNegocio(negocio);
            ventanaAdministradorNegocio.setVisible(true);
            this.dispose();
        } else {
            VentanaLogIn ventanaLogIn = new VentanaLogIn();
            ventanaLogIn.reinciarLogIn();
            ventanaLogIn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabelRegistrarMouseClicked

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
            Vehiculo vehiculo = vehiculo();
            Cliente cliente = new Cliente(vehiculo, nombre, cedula, telefono, correo, contrasena, edad);
            try {
                if (controlador.anadirCliente(cliente)) {
                    JOptionPane.showMessageDialog(this, "Registrado correctamente");
                    cleanTextField();
                }
            } catch (ExcepcionClienteDuplicado ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPlacaVehiculoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaVehiculoFocusGained
        if (txtPlacaVehiculo.getText().equals("Placa del vehiculo")) {
            txtPlacaVehiculo.setText("");
            txtPlacaVehiculo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPlacaVehiculoFocusGained

    private void txtPlacaVehiculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaVehiculoFocusLost
        if (txtPlacaVehiculo.getText().equals("")) {
            txtPlacaVehiculo.setText("Placa del vehiculo");
            txtPlacaVehiculo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPlacaVehiculoFocusLost

    private void txtTipoDeVehiculoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTipoDeVehiculoFocusGained
        if (txtTipoDeVehiculo.getText().equals("Tipo de vehiculo")) {
            txtTipoDeVehiculo.setText("");
            txtTipoDeVehiculo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTipoDeVehiculoFocusGained

    private void txtTipoDeVehiculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTipoDeVehiculoFocusLost
        if (txtTipoDeVehiculo.getText().equals("")) {
            txtTipoDeVehiculo.setText("Tipo de vehiculo");
            txtTipoDeVehiculo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTipoDeVehiculoFocusLost

    private void checkVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkVehiculoItemStateChanged
        if (checkVehiculo.getState()) {
            txtTipoDeVehiculo.setEnabled(true);
            txtPlacaVehiculo.setEnabled(true);
        } else {
            txtTipoDeVehiculo.setEnabled(false);
            txtPlacaVehiculo.setEnabled(false);
            txtTipoDeVehiculo.setText("Tipo de vehiculo");
            txtTipoDeVehiculo.setForeground(Color.gray);
            txtPlacaVehiculo.setText("Placa del vehiculo");
            txtPlacaVehiculo.setForeground(Color.gray);
        }

    }//GEN-LAST:event_checkVehiculoItemStateChanged

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getText().equals("Nombre completo")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (!validarLetras(txtNombre.getText()) && !txtNombre.getText().equals("Nombre completo")) {
            txtNombre.setBackground(Color.red);
        } else {
            txtNombre.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    public static boolean validarNumeros(String datos) {
        return datos.matches("[0-9]*");
    }

    public static boolean validarLetras(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    /**
     * @param args the command line arguments
     */
    public Vehiculo vehiculo() {
        Vehiculo vehiculo = null;
        if (checkVehiculo.getState()) {
            if (txtPlacaVehiculo.getText().equals("Placa del vehiculo") || txtTipoDeVehiculo.getText().equals("Tipo de vehiculo")
                    || txtPlacaVehiculo.getText().equals("")
                    || txtTipoDeVehiculo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Por favor rellena todos los datos");
            } else {
                String tipoVehiculo = txtTipoDeVehiculo.getText();
                String placa = txtPlacaVehiculo.getText();
                vehiculo = new Vehiculo(tipoVehiculo, placa);
            }
        }
        return vehiculo;
    }

    public void cleanTextField() {
        txtTipoDeVehiculo.setText("Tipo de vehiculo");
        txtTipoDeVehiculo.setForeground(Color.gray);
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

    public void abrirDesdeAdminNegocio(Negocio negocio) {
        this.negocio = negocio;
        jPanel3.setName("Volver");
        jLabel1.setText("¿Quieres volver?");
        jLabelRegistrar.setText("Volver");
    }

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
            java.util.logging.Logger.getLogger(VentanaSignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSignUp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlacaVehiculo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDeVehiculo;
    // End of variables declaration//GEN-END:variables
}
