package View;

public class FrameListaAnimal extends javax.swing.JFrame {

    public FrameListaAnimal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Animal", "Peligrosidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 320, 420));

        tbl2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Animal", "Raza"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 320, 420));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo1.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 160));

        JLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        JLabel1.setText("Animal Salvaje");
        jPanel1.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        JLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        JLabel2.setText("Lista de animales");
        jPanel1.add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        JLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        JLabel3.setText("Animal doméstico");
        jPanel1.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jButtonVolver.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoNuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        FrameLogistica FLog = new FrameLogistica();
        FLog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    // End of variables declaration//GEN-END:variables
}
