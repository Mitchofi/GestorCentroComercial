/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import controlador.ControladorVentanaAdministrador;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.Articulo;
import src.CentroComercial;
import src.Local;

/**
 *
 * @author Acer
 */
public class VentanaVendedorNegocio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdministrador
     */
    private LogIn ventanaLogIn;
    private ControladorVentanaAdministrador controlador;
    private DefaultTableModel modelo;
    private Local local;

    public VentanaVendedorNegocio(LogIn logIn, Local local) {
        initComponents();
        setLocationRelativeTo(this);
        this.ventanaLogIn = logIn;
        this.controlador = new ControladorVentanaAdministrador();
        this.local = local;
        modelo = new DefaultTableModel();
        limpiarTabla();
        cargar();
        txtDescuento.setEnabled(false);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtArticulo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox3 = new javax.swing.JComboBox<>();
        txtDescuento = new javax.swing.JTextField();
        checkVehiculo = new java.awt.Checkbox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabelRegistrar2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("BIENVENIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Registrar nueva Venta"));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtCantidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidad.setText("Cantidad");
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });

        txtValor.setForeground(new java.awt.Color(153, 153, 153));
        txtValor.setText("Valor");
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });

        txtArticulo.setForeground(new java.awt.Color(153, 153, 153));
        txtArticulo.setText("Nombre articulo");
        txtArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtArticuloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtArticuloFocusLost(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Accesorios para Vehículos", "Agro", "Alimentos y Bebidas", "Animales y Mascotas", "Antigüedades y Colecciones", "Arte, Papelería y Mercería", "Bebés", "Belleza y Cuidado Personal", "Boletas para Espectáculos", "Cámaras y Accesorios", "Carros, Motos y Otros", "Celulares y Teléfonos", "Computación", "Consolas y Videojuegos", "Construcción", "Deportes y Fitness", "Electrodomésticos", "Electrónica, Audio y Video", "Herramientas", "Hogar y Muebles", "Industrias y Oficinas", "Inmuebles", "Instrumentos Musicales", "Juegos y Juguetes", "Libros, Revistas y Comics", "Música, Películas y Series", "Recuerdos, Piñatería y Fiestas", "Relojes y Joyas", "Ropa y Accesorios", "Salud y Equipamiento Médico", "Servicios", "Otras categorías" }));

        txtDescuento.setForeground(new java.awt.Color(153, 153, 153));
        txtDescuento.setText("Porcentaje de descuento");
        txtDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescuentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescuentoFocusLost(evt);
            }
        });

        checkVehiculo.setLabel("¿Tiene Descuento?");
        checkVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkVehiculoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValor)
                    .addComponent(txtArticulo)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 192, Short.MAX_VALUE)
                    .addComponent(txtDescuento))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, 360));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Categoria", "Valor", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 447, 153));

        jLabel4.setText("¿Deseas salir de la cuenta?");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, -1, -1));

        jLabelRegistrar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar2.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar2.setText("Salir");
        jLabelRegistrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabelRegistrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, -1, -1));

        jLabel1.setText("AUN NO ES FUNCIONAL");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtArticulo.getText().equals("") || txtArticulo.getText().equals("Nombre articulo")
                || txtValor.getText().equals("") || txtValor.getText().equals("Valor")
                || txtCantidad.getText().equals("") || txtCantidad.getText().equals("Cantidad")
                || jComboBox3.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor rellena todos los datos");
        } else {
            String nombreArticulo = txtArticulo.getText();
            String categoria = String.valueOf(jComboBox3.getSelectedItem());
            String descripcion = jTextArea1.getText();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            float valor = Float.parseFloat(txtValor.getText());
            int descuento = 0;
            if (!txtDescuento.getText().equals("Porcentaje de descuento")) {
                descuento = Integer.parseInt(txtDescuento.getText());
            }
            Articulo articulo = new Articulo(nombreArticulo, descripcion, categoria, valor, descuento, cantidad);
            local.getNegocio().getArticulos().add(articulo);
            limpiarTabla();
            cargar();
            CentroComercial.serializarListaLocales();
            JOptionPane.showMessageDialog(this, "Registrado correctamente");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusGained
        if (txtCantidad.getText().equals("Cantidad")) {
            txtCantidad.setText("");
            txtCantidad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCantidadFocusGained

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
        if (txtCantidad.getText().equals("")) {
            txtCantidad.setText("Cantidad");
            txtCantidad.setForeground(Color.gray);
        }
        if (!validarNumeros(txtCantidad.getText()) && !txtCantidad.getText().equals("Cantidad")) {
            txtCantidad.setBackground(Color.red);
        } else {
            txtCantidad.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtCantidadFocusLost

    private void txtValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusGained
        if (txtValor.getText().equals("Valor")) {
            txtValor.setText("");
            txtValor.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtValorFocusGained

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        if (txtValor.getText().equals("")) {
            txtValor.setText("Valor");
            txtValor.setForeground(Color.gray);
        }
        if (!validarNumeros(txtValor.getText()) && !txtValor.getText().equals("Valor")) {
            txtValor.setBackground(Color.red);
        } else {
            txtValor.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtValorFocusLost

    private void txtArticuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtArticuloFocusGained
        if (txtArticulo.getText().equals("Nombre articulo")) {
            txtArticulo.setText("");
            txtArticulo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtArticuloFocusGained

    private void txtArticuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtArticuloFocusLost
        if (txtArticulo.getText().equals("")) {
            txtArticulo.setText("Nombre articulo");
            txtArticulo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtArticuloFocusLost

    private void txtDescuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoFocusGained
        if (txtDescuento.getText().equals("Tipo de vehiculo")) {
            txtDescuento.setText("");
            txtDescuento.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDescuentoFocusGained

    private void txtDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoFocusLost
        if (txtDescuento.getText().equals("")) {
            txtDescuento.setText("Tipo de vehiculo");
            txtDescuento.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDescuentoFocusLost

    private void checkVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkVehiculoItemStateChanged
        if (checkVehiculo.getState()) {
            txtDescuento.setEnabled(true);
        } else {
            txtDescuento.setEnabled(false);
            txtDescuento.setText("Porcentaje de descuento");
            txtDescuento.setForeground(Color.gray);
        }
    }//GEN-LAST:event_checkVehiculoItemStateChanged

    private void jLabelRegistrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar2MouseClicked
        ventanaLogIn.reinciarLogIn();
        ventanaLogIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegistrar2MouseClicked

    public void llenarArticulos() {
        for (int i = 0; i < CentroComercial.locales.length; i++) {
            for (int j = 0; j < CentroComercial.locales[i].length; j++) {
                if (CentroComercial.locales[i][j].getNegocio() != null) {
                    if (CentroComercial.locales[i][j].getNegocio().getArticulos() != null) {

                    }
                }
            }
        }
    }

    public static boolean validarNumeros(String datos) {
        return datos.matches("[0-9]*");
    }

    public static boolean validarLetras(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    public void cargar() {
        modelo = (DefaultTableModel) jTable1.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < CentroComercial.locales.length; i++) {
            for (int j = 0; j < CentroComercial.locales[i].length; j++) {
                if (CentroComercial.locales[i][j].getNegocio() != null) {
                    if (CentroComercial.locales[i][j].getNegocio().getArticulos() != null) {
                        for (int k = 0; k < CentroComercial.locales[i][j].getNegocio().getArticulos().Size(); k++) {
                            Articulo arti = (Articulo) CentroComercial.locales[i][j].getNegocio().getArticulos().obtenerDato(k);
                            ob[0] = arti.getNombreProducto();
                            ob[1] = arti.getNombreCategoria();
                            ob[2] = arti.getValorDelProducto();
                            ob[3] = arti.getCantidadProducto();
                            modelo.addRow(ob);
                        }
                    }
                }
            }
        }
        jTable1.setModel(modelo);
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
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
            java.util.logging.Logger.getLogger(VentanaVendedorNegocio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVendedorNegocio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVendedorNegocio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVendedorNegocio.class
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
    private java.awt.Checkbox checkVehiculo;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelRegistrar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
