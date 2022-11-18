/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import controlador.ControladorVentanaAdministrador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import src.Local;

/**
 *
 * @author Acer
 */
public class VentanaAdministrador extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form VentanaAdministrador
     */
    private JButton[][] botones;
    private ControladorVentanaAdministrador controlador;
    
    public VentanaAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        this.botones = new JButton[5][4];
        this.controlador = new ControladorVentanaAdministrador();
        initBotones();
        validarPosiciones();
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
        jLabelLocales = new javax.swing.JLabel();
        jLabelEmpleados = new javax.swing.JLabel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelConcursos = new javax.swing.JLabel();
        jLabelVentas = new javax.swing.JLabel();
        jLabelSolicitudes1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelRegistrar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("ADMINISTRADOR");

        jLabelLocales.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelLocales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLocales.setText("Locales");
        jLabelLocales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelEmpleados.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEmpleados.setForeground(new java.awt.Color(51, 153, 255));
        jLabelEmpleados.setText("Empleados");
        jLabelEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmpleadosMouseClicked(evt);
            }
        });

        jLabelClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(51, 153, 255));
        jLabelClientes.setText("Clientes");
        jLabelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClientesMouseClicked(evt);
            }
        });

        jLabelConcursos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelConcursos.setForeground(new java.awt.Color(51, 153, 255));
        jLabelConcursos.setText("Ventas");
        jLabelConcursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConcursosMouseClicked(evt);
            }
        });

        jLabelVentas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelVentas.setForeground(new java.awt.Color(51, 153, 255));
        jLabelVentas.setText("Concursos");
        jLabelVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVentasMouseClicked(evt);
            }
        });

        jLabelSolicitudes1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelSolicitudes1.setForeground(new java.awt.Color(51, 153, 255));
        jLabelSolicitudes1.setText("Solicitudes");
        jLabelSolicitudes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSolicitudes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSolicitudes1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabelEmpleados)
                    .addComponent(jLabelLocales)
                    .addComponent(jLabelClientes)
                    .addComponent(jLabelConcursos)
                    .addComponent(jLabelVentas)
                    .addComponent(jLabelSolicitudes1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelLocales)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmpleados)
                .addGap(18, 18, 18)
                .addComponent(jLabelClientes)
                .addGap(18, 18, 18)
                .addComponent(jLabelConcursos)
                .addGap(18, 18, 18)
                .addComponent(jLabelVentas)
                .addGap(18, 18, 18)
                .addComponent(jLabelSolicitudes1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("¿Deseas salir de la cuenta?");

        jLabelRegistrar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar2.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar2.setText("Salir");
        jLabelRegistrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegistrar2)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelRegistrar2))
                .addGap(6, 6, 6))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 570));

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmpleadosMouseClicked
        VentanaGestionarEmpleadoCentroComercial ventanaRegistroEmpleados = new VentanaGestionarEmpleadoCentroComercial();
        ventanaRegistroEmpleados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelEmpleadosMouseClicked

    private void jLabelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClientesMouseClicked
        VentanaGestionarCliente ventanaGestionarCliente = new VentanaGestionarCliente();
        ventanaGestionarCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelClientesMouseClicked

    private void jLabelConcursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConcursosMouseClicked
        VentanaVentasGeneradas ventanaVentasGeneradas = new VentanaVentasGeneradas();
        ventanaVentasGeneradas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelConcursosMouseClicked

    private void jLabelVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVentasMouseClicked
        VentanaGestionarConcurso ventanaGestionarConcurso = new VentanaGestionarConcurso();
        ventanaGestionarConcurso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelVentasMouseClicked

    private void jLabelRegistrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar2MouseClicked
        VentanaLogIn ventanaLogIn = new VentanaLogIn();
        ventanaLogIn.reinciarLogIn();
        ventanaLogIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegistrar2MouseClicked

    private void jLabelSolicitudes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSolicitudes1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSolicitudes1MouseClicked
    
    private void initBotones() {
        int ancho = 90;
        int alto = 90;
        int separado1 = 20;
        int texto = 1;
        
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setBounds((separado1 * 6) + j * ancho + separado1, (separado1) + i * alto + separado1, ancho, alto);
                botones[i][j].setText(Integer.toString(texto));
                botones[i][j].addActionListener(this);
                jPanel4.add(botones[i][j]);
                texto++;
            }
        }
    }
    
    public void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Local local = controlador.obtenerLocal(i, j);
                if (local.isDisponible()) {
                    botones[i][j].setBackground(Color.white);
                } else {
                    botones[i][j].setBackground(Color.yellow);
                    botones[i][j].setText(local.getNegocio().getNombre());
                }
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource().equals(botones[i][j])) {
                    Local local = controlador.obtenerLocal(i, j);
                    if (local.isDisponible()) {
                        VentanaContrato ventanaLocal = new VentanaContrato(local);
                        ventanaLocal.setVisible(true);
                        this.dispose();
                    } else {
                        ventanaInfoLocal ventanaInfoLocal = new ventanaInfoLocal(this, local);
                        ventanaInfoLocal.setVisible(true);
                        this.dispose();
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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelConcursos;
    private javax.swing.JLabel jLabelEmpleados;
    private javax.swing.JLabel jLabelLocales;
    private javax.swing.JLabel jLabelRegistrar2;
    private javax.swing.JLabel jLabelSolicitudes1;
    private javax.swing.JLabel jLabelVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
