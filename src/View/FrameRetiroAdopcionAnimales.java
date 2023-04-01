package View;

import Control.DeptoLogistica;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrameRetiroAdopcionAnimales extends javax.swing.JFrame {
    
    private DeptoLogistica deptoLog;
    private List<String> retiros;
    private List<String> adopciones;
    private String[] columnaAnimalesRetirados;
    private String[] columnaAnimalesAdoptados;
    private DefaultTableModel modeloTablaAnimalesRetirados;
    private DefaultTableModel modeloTablaAnimalesAdoptados;
    
    public FrameRetiroAdopcionAnimales() {
        initComponents();
        setLocationRelativeTo(null);
        deptoLog = new DeptoLogistica();
        retiros = deptoLog.showListRetiros();
        adopciones = deptoLog.showListAdopciones();
        ImplementarTablas();
        LlenarListas();
    }
    
    void ImplementarTablas(){
        modeloTablaAnimalesRetirados = new DefaultTableModel();
        modeloTablaAnimalesAdoptados = new DefaultTableModel();
        tblAnimalRetirado.setModel(modeloTablaAnimalesRetirados);
        columnaAnimalesRetirados = new String[1];
        columnaAnimalesRetirados[0] = "Código y motivo del animal retirado";
        tblAnimalAdoptado.setModel(modeloTablaAnimalesAdoptados);
        columnaAnimalesAdoptados = new String[1];
        columnaAnimalesAdoptados[0] = "Código del animal y nombre del adoptante";
        modeloTablaAnimalesRetirados.setColumnIdentifiers(columnaAnimalesRetirados);
        modeloTablaAnimalesAdoptados.setColumnIdentifiers(columnaAnimalesAdoptados);
    }
    
    void LlenarListas(){
        modeloTablaAnimalesRetirados.getDataVector().removeAllElements();
        modeloTablaAnimalesAdoptados.getDataVector().removeAllElements();
        tblAnimalRetirado.updateUI();
        tblAnimalAdoptado.updateUI();
        
        for (int i = 0; i < retiros.size(); i++)
        {
            modeloTablaAnimalesRetirados.addRow(new Object[]{retiros.get(i)});
        }
        
        for (int i = 0; i < adopciones.size(); i++)
        {
            modeloTablaAnimalesAdoptados.addRow(new Object[]{adopciones.get(i)});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnimalAdoptado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnimalRetirado = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAnimalAdoptado.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        tblAnimalAdoptado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblAnimalAdoptado);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 480, 420));

        tblAnimalRetirado.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        tblAnimalRetirado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblAnimalRetirado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 440, 420));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo1.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 160));

        JLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        JLabel4.setText("Animales retirados");
        jPanel1.add(JLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        JLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        JLabel3.setText("Animales adoptados");
        jPanel1.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        JLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        JLabel2.setText("Lista de animales retirados y adoptados");
        jPanel1.add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jButtonVolver.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        FrameLogistica FLog = new FrameLogistica();
        FLog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAnimalAdoptado;
    private javax.swing.JTable tblAnimalRetirado;
    // End of variables declaration//GEN-END:variables
}
