/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import src.CentroComercial;
import src.Cliente;
import src.Negocio;

/**
 *
 * @author usuario
 */
public class VentanaConcursoAdminNegocio extends javax.swing.JFrame {

    private DefaultTableModel modeloConcursosVigentes;
    private Cliente cliente;
    private VentanaCliente ventanaCliente;
    private Negocio negocio;

    /**
     * Creates new form VentanaSeparados
     */
    public VentanaConcursoAdminNegocio(Negocio negocio) {
        initComponents();
        setLocationRelativeTo(this);
        this.negocio = negocio;
        this.cliente = cliente;
        this.modeloConcursosVigentes = new DefaultTableModel();
        limpiarTablaConcursosVigentes();
        cargarConcursosVigentes();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConcursosVigentes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelEmpleados = new javax.swing.JLabel();
        jLabelClientes1 = new javax.swing.JLabel();
        jLabelSolicitudes = new javax.swing.JLabel();
        jLabelConcursos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelRegistrar6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Concursos vigentes"));

        jTableConcursosVigentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo curso", "Nombre", "Premio", "Valor minimo", "Fecha de Fin", "Participantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConcursosVigentes.setToolTipText("");
        jScrollPane2.setViewportView(jTableConcursosVigentes);
        if (jTableConcursosVigentes.getColumnModel().getColumnCount() > 0) {
            jTableConcursosVigentes.getColumnModel().getColumn(0).setResizable(false);
            jTableConcursosVigentes.getColumnModel().getColumn(1).setResizable(false);
            jTableConcursosVigentes.getColumnModel().getColumn(2).setResizable(false);
            jTableConcursosVigentes.getColumnModel().getColumn(3).setResizable(false);
            jTableConcursosVigentes.getColumnModel().getColumn(4).setResizable(false);
            jTableConcursosVigentes.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        jLabelClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setText("Concursos");
        jLabelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClientesMouseClicked(evt);
            }
        });

        jLabelEmpleados.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEmpleados.setForeground(new java.awt.Color(51, 153, 255));
        jLabelEmpleados.setText("Empleados");
        jLabelEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmpleadosMouseClicked(evt);
            }
        });

        jLabelClientes1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelClientes1.setForeground(new java.awt.Color(51, 153, 255));
        jLabelClientes1.setText("Clientes");
        jLabelClientes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClientes1MouseClicked(evt);
            }
        });

        jLabelSolicitudes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelSolicitudes.setForeground(new java.awt.Color(51, 153, 255));
        jLabelSolicitudes.setText("Solicitudes");
        jLabelSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSolicitudesMouseClicked(evt);
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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("ADMINISTRADOR");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("NEGOCIO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10))
                    .addComponent(jLabelEmpleados)
                    .addComponent(jLabelClientes1)
                    .addComponent(jLabelConcursos)
                    .addComponent(jLabelSolicitudes)
                    .addComponent(jLabelClientes))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmpleados)
                .addGap(18, 18, 18)
                .addComponent(jLabelClientes1)
                .addGap(18, 18, 18)
                .addComponent(jLabelConcursos)
                .addGap(18, 18, 18)
                .addComponent(jLabelClientes)
                .addGap(18, 18, 18)
                .addComponent(jLabelSolicitudes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("¿Deseas salir de la cuenta?");

        jLabelRegistrar6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRegistrar6.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistrar6.setText("Salir");
        jLabelRegistrar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrar6jLabelRegistrar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRegistrar6)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelRegistrar6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClientesMouseClicked
        VentanaHistorialCompra ventanaHistorialCompra = new VentanaHistorialCompra(cliente);
        ventanaHistorialCompra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelClientesMouseClicked

    private void jLabelRegistrar6jLabelRegistrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrar6jLabelRegistrar2MouseClicked
        VentanaLogIn ventanaLogIn = new VentanaLogIn();
        ventanaLogIn.reinciarLogIn();
        ventanaLogIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegistrar6jLabelRegistrar2MouseClicked

    private void jLabelEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmpleadosMouseClicked
        VentanaAdministradorNegocio ventanaAdministradorNegocio = new VentanaAdministradorNegocio(negocio);
        ventanaAdministradorNegocio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelEmpleadosMouseClicked

    private void jLabelClientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClientes1MouseClicked
        VentanaSignUp ventanaSignUp = new VentanaSignUp();
        ventanaSignUp.abrirDesdeAdminNegocio(negocio);
        ventanaSignUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelClientes1MouseClicked

    private void jLabelSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSolicitudesMouseClicked
        VentanaSolicitud ventanaSolicitud = new VentanaSolicitud(negocio);
        ventanaSolicitud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelSolicitudesMouseClicked

    private void jLabelConcursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConcursosMouseClicked
        VentanaVentas ventanaVentas = new VentanaVentas(negocio);
        ventanaVentas.setVisible(true);
        jLabelConcursos.setForeground(Color.gray);
        this.dispose();
    }//GEN-LAST:event_jLabelConcursosMouseClicked
    public void cargarConcursosVigentes() {
        modeloConcursosVigentes = (DefaultTableModel) jTableConcursosVigentes.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < CentroComercial.concursos.Size(); i++) {
            if (CentroComercial.concursos.obtenerDato(i) != null) {
                ob[0] = CentroComercial.concursos.obtenerDato(i).getCodigo();
                ob[1] = CentroComercial.concursos.obtenerDato(i).getNombreConcurso();
                ob[2] = CentroComercial.concursos.obtenerDato(i).getPremioConcurso();
                ob[3] = CentroComercial.concursos.obtenerDato(i).getValorMinimo();
                ob[4] = CentroComercial.concursos.obtenerDato(i).getFechaFinConcurso();
                ob[5] = CentroComercial.concursos.obtenerDato(i).getParticipantes().Size();
                modeloConcursosVigentes.addRow(ob);
            }
        }
        jTableConcursosVigentes.setModel(modeloConcursosVigentes);
    }

    public void limpiarTablaConcursosVigentes() {
        for (int i = 0; i < modeloConcursosVigentes.getRowCount(); i++) {
            modeloConcursosVigentes.removeRow(i);
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
            java.util.logging.Logger.getLogger(VentanaConcursoAdminNegocio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConcursoAdminNegocio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConcursoAdminNegocio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConcursoAdminNegocio.class
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelClientes1;
    private javax.swing.JLabel jLabelConcursos;
    private javax.swing.JLabel jLabelEmpleados;
    private javax.swing.JLabel jLabelRegistrar6;
    private javax.swing.JLabel jLabelSolicitudes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConcursosVigentes;
    // End of variables declaration//GEN-END:variables
}
