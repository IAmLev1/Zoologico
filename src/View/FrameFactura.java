package View;
import Control.DeptoLogistica;
import Model.Client;
import java.util.ArrayList;
import java.util.List;


public class FrameFactura extends javax.swing.JFrame {
    
    private List<Client> cliente;
    private DeptoLogistica deptolog;
    private String cedula;

    public FrameFactura() {
        initComponents();
        deptolog = new DeptoLogistica();
        cedula = FrameVentas.dni;
        factura();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCed = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblNomInst = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblSumaPrecios = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        lblNomInst1 = new javax.swing.JLabel();
        lblSumaPrecios1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        lblTotal.setText("(TOTAL)");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 120, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Resolución DIAN 123456789/1234");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Correo                    :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("LOSMIPAISAS@gmail.com");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Medellín - TEL:   /  604 0000");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 390, 10));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel6.setText("    ZOOLÓGICO LOS MIPAI  S.A.S");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 260, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("NIT:  01234567-0");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        lblCed.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCed.setText("Atributo cédula");
        jPanel1.add(lblCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 230, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Cédula                    :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre.setText("Atributo nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, -1));

        lblTel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTel.setText("Atributo correo");
        jPanel1.add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 220, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 15));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setText("Cliente                    :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 390, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setText("Cantidad");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCantidad.setText("(cantidad)");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setText(" IVA (19%)");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setText("Valor");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        lblNomInst.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNomInst.setText("Adiciones");
        jPanel1.add(lblNomInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        lblIVA.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblIVA.setText("(iva)");
        jPanel1.add(lblIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setText("Descripción");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel24.setText("Factura de venta : 1234 - 56789");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 310, 30));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel25.setText("SUBTOTAL");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        lblSumaPrecios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblSumaPrecios.setText("(precio)");
        jPanel1.add(lblSumaPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        lblSubTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblSubTotal.setText("(subtotal)");
        jPanel1.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel28.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel28.setText("Total:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 60, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 390, 10));

        btnVolver.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        lblNomInst1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNomInst1.setText("Boletos");
        jPanel1.add(lblNomInst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        lblSumaPrecios1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblSumaPrecios1.setText("(precio)");
        jPanel1.add(lblSumaPrecios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoFactura1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
//        ventana2 ventInst = new ventana2();
//        ventInst.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    
    void factura(){
        cliente = deptolog.showListClien();
        for(int i=0; i < cliente.size(); i++){
            if(cliente.get(i).getCedula().equals(cedula))
            lblNombre.setText(cliente.get(i).getNombre());
            lblCed.setText(cedula);
            lblTel.setText(cliente.get(i).getCorreo());
            lblCantidad.setText(""+cliente.get(i).getContAdiciones());
            lblNomInst1.setText(cliente.get(i).getPlan().getNumPlan());
            lblSumaPrecios1.setText(""+cliente.get(i).getPlan().getPrecio());
            lblSumaPrecios.setText(""+cliente.get(i).getValorAdiciones());
            lblTotal.setText(""+cliente.get(i).getDinero());
            
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCed;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblNomInst;
    private javax.swing.JLabel lblNomInst1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblSumaPrecios;
    private javax.swing.JLabel lblSumaPrecios1;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
