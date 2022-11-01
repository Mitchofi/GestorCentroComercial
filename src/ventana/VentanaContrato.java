/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import controlador.ControladorVentanaContrato;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import src.AdministradorDeNegocio;
import src.Contrato;
import src.Local;
import src.Negocio;

/**
 *
 * @author Acer
 */
public class VentanaContrato extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdministrador
     */
    private VentanaAdministrador ventanaAdministrador;
    private ControladorVentanaContrato controlador;
    private Local local;

    public VentanaContrato(VentanaAdministrador ventanaAdministrador, Local local) {
        initComponents();
        setLocationRelativeTo(this);
        this.ventanaAdministrador = ventanaAdministrador;
        this.controlador = new ControladorVentanaContrato();
        this.local = local;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelRegistrar2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtNombreNegocio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtContrato = new javax.swing.JTextArea();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateFinal = new com.toedter.calendar.JDateChooser();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("CONTRATO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar negocio"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("¿Desea regresar al inicio?");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabelRegistrar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar2.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar2.setText("Volver");
        jLabelRegistrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabelRegistrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 210, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador del negocio"));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 260));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Negocio y contrato"));

        txtNombreNegocio.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreNegocio.setText("Nombre negocio");
        txtNombreNegocio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreNegocioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreNegocioFocusLost(evt);
            }
        });

        txtContrato.setColumns(20);
        txtContrato.setForeground(new java.awt.Color(153, 153, 153));
        txtContrato.setRows(5);
        txtContrato.setText("Condiciones de contrato");
        txtContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContratoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContratoFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtContrato);

        jLabel1.setText("Fecha inicio:");

        jLabel3.setText("Fecha Final:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtNombreNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 260, 260));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 688, 490));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtCorreo.getText().equals("") || txtCorreo.getText().equals("Correo")
                || String.valueOf(txtContrasena.getPassword()).equals("")
                || String.valueOf(txtContrasena.getPassword()).equals("******")
                || txtCedula.getText().equals("") || txtCedula.getText().equals("Cedula")
                || txtEdad.getText().equals("") || txtEdad.getText().equals("Edad")
                || txtNombre.getText().equals("") || txtNombre.getText().equals("Nombre completo")
                || txtTelefono.getText().equals("") || txtTelefono.getText().equals("Numero movil")
                || txtNombreNegocio.getText().equals("Nombre negocio")
                || txtNombreNegocio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor rellena todos los datos");
        } else {
            String telefono = txtTelefono.getText();
            String nombre = txtNombre.getText();
            short edad = Short.parseShort(txtEdad.getText());
            String cedula = txtCedula.getText();
            String correo = txtCorreo.getText();
            String contrasena = String.valueOf(txtContrasena.getPassword());
            String descripcion = txtContrato.getText();
            Date fechaInicio = jDateInicio.getDate();
            Date fechaFinal = jDateFinal.getDate();
            if (controlador.validarCorreo(correo)) {
                JOptionPane.showMessageDialog(this, "Ya hay un usuario registrado con ese correo");
            } else {
                AdministradorDeNegocio administradorNegocio = new AdministradorDeNegocio(nombre, cedula, telefono, correo, contrasena, edad);
                Negocio negocio = new Negocio();
                negocio.setNombre(nombre);
                negocio.setAdministrador(administradorNegocio);
                Contrato contrato = new Contrato(negocio, descripcion, fechaInicio, fechaFinal);
                if (controlador.anadirNegocio(administradorNegocio, negocio, contrato, local)) {
                    JOptionPane.showMessageDialog(this, "Registrado correctamente");
                    cleanTextField();
                    ventanaAdministrador.limpiarTablaVentas();
                    ventanaAdministrador.cargarTablaVentas();
                    ventanaAdministrador.validarPosiciones();
                } else {
                    JOptionPane.showMessageDialog(this, "No pudiste ser registrado"
                            + " debido a que hay un usuario registrado con algunos de los datos que escribistes ");
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("******");
            txtContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (String.valueOf(txtContrasena.getPassword()).equals("******")) {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if (txtCorreo.getText().equals("Correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (!validarNumeros(txtCedula.getText()) && !txtCedula.getText().equals("Cedula")) {
            txtCedula.setBackground(Color.red);
        } else {
            txtCedula.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusGained
        if (txtCedula.getText().equals("Cedula")) {
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCedulaFocusGained

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (!validarNumeros(txtEdad.getText()) && !txtEdad.getText().equals("Edad")) {
            txtEdad.setBackground(Color.red);
        } else {
            txtEdad.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        if (txtEdad.getText().equals("Edad")) {
            txtEdad.setText("");
            txtEdad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEdadFocusGained

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

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getText().equals("Nombre completo")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setText("Numero movil");
            txtTelefono.setForeground(Color.gray);
        }
        if (!validarNumeros(txtTelefono.getText()) && !txtTelefono.getText().equals("Numero movil")) {
            txtTelefono.setBackground(Color.red);
        } else {
            txtTelefono.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if (txtTelefono.getText().equals("Numero movil")) {
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void jLabelRegistrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar2MouseClicked
        ventanaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegistrar2MouseClicked

    private void txtNombreNegocioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreNegocioFocusGained
        if (txtNombreNegocio.getText().equals("Nombre negocio")) {
            txtNombreNegocio.setText("");
            txtNombreNegocio.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreNegocioFocusGained

    private void txtNombreNegocioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreNegocioFocusLost
        if (txtNombreNegocio.getText().isEmpty()) {
            txtNombreNegocio.setText("Nombre negocio");
            txtNombreNegocio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreNegocioFocusLost

    private void txtContratoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContratoFocusGained
        if (txtContrato.getText().equals("Condiciones de contrato")) {
            txtContrato.setText("");
            txtContrato.setForeground(Color.black);
         }    }//GEN-LAST:event_txtContratoFocusGained

    private void txtContratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContratoFocusLost
        if (txtContrato.getText().isEmpty()) {
            txtContrato.setText("Condiciones de contrato");
            txtContrato.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContratoFocusLost

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
            java.util.logging.Logger.getLogger(VentanaContrato.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaContrato.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaContrato.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaContrato.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateFinal;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelRegistrar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextArea txtContrato;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreNegocio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
