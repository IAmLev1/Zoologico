package View;

import Control.DeptoLogistica;

public class Principal extends javax.swing.JFrame {

    DeptoLogistica Depto;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Depto = new DeptoLogistica();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonIrVentas = new javax.swing.JButton();
        jButtonIrLogistica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo1.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CartelLogistica1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 280, 280));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CartelVentas.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 280, 280));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel2.setText("Zoológico Los Mipai");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButtonIrVentas.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButtonIrVentas.setText("Ir a Ventas");
        jButtonIrVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrVentasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIrVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 140, 40));

        jButtonIrLogistica.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButtonIrLogistica.setText("Ir a Logistica");
        jButtonIrLogistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrLogisticaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIrLogistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIrLogisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrLogisticaActionPerformed
        FrameLogistica FLog = new FrameLogistica();
        FLog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIrLogisticaActionPerformed

    private void jButtonIrVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrVentasActionPerformed
        FrameVentas Fvent = new FrameVentas();
        Fvent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIrVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButtonIrLogistica;
    private javax.swing.JButton jButtonIrVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
