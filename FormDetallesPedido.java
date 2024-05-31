/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Models.Ticket;

/**
 *
 * @author Chikiritaviri
 */
public class FormDetallesPedido extends javax.swing.JFrame {

    /**
     * Creates new form FromDetallesPedido
     */
    public FormDetallesPedido() {
        initComponents();
        
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelDetallesPedido = new javax.swing.JLabel();
        TituloCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        TituloPago = new javax.swing.JLabel();
        jLabelFormaPago = new javax.swing.JLabel();
        TituloPedido = new javax.swing.JLabel();
        jLabelPedido = new javax.swing.JLabel();
        TituloDireccion = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        TituloObservaciones = new javax.swing.JLabel();
        jLabelObservaciones = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(135, 206, 250));

        jLabelDetallesPedido.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jLabelDetallesPedido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDetallesPedido.setText("Detalles del pedido ");

        TituloCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        TituloCliente.setForeground(new java.awt.Color(255, 255, 255));
        TituloCliente.setText("Cliente");

        jLabelNombreCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreCliente.setText("jLabel1");

        TituloPago.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        TituloPago.setForeground(new java.awt.Color(255, 255, 255));
        TituloPago.setText("Forma de pago");

        jLabelFormaPago.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormaPago.setText("jLabel1");

        TituloPedido.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        TituloPedido.setForeground(new java.awt.Color(255, 255, 255));
        TituloPedido.setText("Pedido");

        jLabelPedido.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelPedido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPedido.setText("jLabel1");

        TituloDireccion.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        TituloDireccion.setForeground(new java.awt.Color(255, 255, 255));
        TituloDireccion.setText("Direccion");

        jLabelDireccion.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("jLabel2");

        TituloObservaciones.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        TituloObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        TituloObservaciones.setText("Observaciones");

        jLabelObservaciones.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservaciones.setText("jLabel1");

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jButton1.setText("Imprimir Ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreCliente)
                            .addComponent(TituloCliente)
                            .addComponent(TituloDireccion)
                            .addComponent(jLabelDireccion)
                            .addComponent(TituloObservaciones)
                            .addComponent(jLabelObservaciones)
                            .addComponent(TituloPago)
                            .addComponent(jLabelFormaPago))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 597, Short.MAX_VALUE)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPedido)
                            .addComponent(TituloPedido)
                            .addComponent(jButton1)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabelDetallesPedido)))
                .addGap(441, 441, 441))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabelDetallesPedido)
                .addGap(35, 35, 35)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloCliente)
                    .addComponent(TituloPedido))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCliente)
                    .addComponent(jLabelPedido))
                .addGap(33, 33, 33)
                .addComponent(TituloDireccion)
                .addGap(18, 18, 18)
                .addComponent(jLabelDireccion)
                .addGap(39, 39, 39)
                .addComponent(TituloObservaciones)
                .addGap(18, 18, 18)
                .addComponent(jLabelObservaciones)
                .addGap(49, 49, 49)
                .addComponent(TituloPago)
                .addGap(18, 18, 18)
                .addComponent(jLabelFormaPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Ticket ticket = new Ticket();
        ticket.imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloCliente;
    private javax.swing.JLabel TituloDireccion;
    private javax.swing.JLabel TituloObservaciones;
    private javax.swing.JLabel TituloPago;
    private javax.swing.JLabel TituloPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDetallesPedido;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFormaPago;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelPedido;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
