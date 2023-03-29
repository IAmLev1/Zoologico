package View;

import Model.Animal;
import Model.AnimalDomestico;
import Model.AnimalSalvaje;
import Model.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Levi.ing
 */
public class FrameLogistica extends javax.swing.JFrame {
    private List<Animal> animales;
    private List<String> retiros;
    private List<String> adopciones;
    
    public FrameLogistica() {
        initComponents();
        animales = new ArrayList<Animal>();
        retiros = new ArrayList<String>();
        adopciones = new ArrayList<String>();
        this.setLocationRelativeTo(null);
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
        Logo = new javax.swing.JLabel();
        NombreEmpresa = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonVerListaAnimales = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazaAnimal = new javax.swing.JTextField();
        txtCodigoAnimal = new javax.swing.JTextField();
        rbSalvaje = new javax.swing.JRadioButton();
        rbDomestico = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        cbNivelPeli = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtNombreAnimal1 = new javax.swing.JTextField();
        btnIngresoAnimal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedulaAdop = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEdadAdop = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreAdop = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCorreoAdop = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigAnimalAdop = new javax.swing.JTextField();
        jButtonAdoptarAnimal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCodigoAnimalBusq = new javax.swing.JTextField();
        txtMotivoRetiro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnRetiroAnimal1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 120));

        NombreEmpresa.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        NombreEmpresa.setText("LOS MIPAI");
        jPanel1.add(NombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jButtonVolver.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, 40));

        jButtonVerListaAnimales.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButtonVerListaAnimales.setText("Ver lista de animales");
        jButtonVerListaAnimales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVerListaAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerListaAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVerListaAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Ingresar Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel4.setText("Raza: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, -1));
        jPanel2.add(txtRazaAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, -1));
        jPanel2.add(txtCodigoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 60, -1));

        rbSalvaje.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        rbSalvaje.setText("Salvaje");
        rbSalvaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSalvajeActionPerformed(evt);
            }
        });
        jPanel2.add(rbSalvaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        rbDomestico.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        rbDomestico.setText("Doméstico");
        rbDomestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDomesticoActionPerformed(evt);
            }
        });
        jPanel2.add(rbDomestico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel17.setText("Tipo de animal:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cbNivelPeli.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        cbNivelPeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel2.add(cbNivelPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 50, -1));

        jLabel18.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel18.setText("Nivel de peligrosidad:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, -1));

        txtNombreAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAnimal1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreAnimal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 40, 120, -1));

        btnIngresoAnimal.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btnIngresoAnimal.setText("Ingresar Animal");
        btnIngresoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoAnimalActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 370, 280));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Adoptar Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 18))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        jLabel5.setText("Esta opción solo está disponible");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        jLabel6.setText("para animales domésticos.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        jLabel7.setText("Ingrese los datos de la persona");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        jLabel8.setText("que va a adoptar el animal:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        jPanel3.add(txtCedulaAdop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 120, -1));

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel9.setText("Cédula:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel10.setText("Edad:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));
        jPanel3.add(txtEdadAdop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 50, -1));

        jLabel11.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel11.setText(" Nombre:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, -1));
        jPanel3.add(txtNombreAdop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, -1));

        jLabel12.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel12.setText("Correo:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, -1));
        jPanel3.add(txtCorreoAdop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 190, -1));

        jLabel13.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        jLabel13.setText("Ingrese el código del animal domés-");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Kristen ITC", 1, 16)); // NOI18N
        jLabel14.setText("tico que va a ser adoptado:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        jPanel3.add(txtCodigAnimalAdop, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 60, -1));

        jButtonAdoptarAnimal.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButtonAdoptarAnimal.setText("Adoptar Animal");
        jButtonAdoptarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdoptarAnimalActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAdoptarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 350, 410));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Retirar Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 18))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel15.setText("Código:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel4.add(txtCodigoAnimalBusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, -1));
        jPanel4.add(txtMotivoRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, -1));

        jLabel16.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel16.setText(" Motivo:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        btnRetiroAnimal1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btnRetiroAnimal1.setText("Retirar Animal");
        btnRetiroAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroAnimal1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnRetiroAnimal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 370, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoNuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoAnimalActionPerformed
        Animal animal = new Animal();
        String nomAnimal, nivelPeligrosidad, raza;
        int codAnimal;
        if (rbSalvaje.isSelected()) {
            nomAnimal = txtNombreAnimal1.getText();
            nivelPeligrosidad = (String) cbNivelPeli.getSelectedItem();
            codAnimal = Integer.parseInt(txtCodigoAnimal.getText());
            animal = new AnimalSalvaje(nivelPeligrosidad, codAnimal, nomAnimal);
        }
        else if (rbDomestico.isSelected()) {
            nomAnimal = txtNombreAnimal1.getText();
            raza = txtRazaAnimal.getText();
            codAnimal = Integer.parseInt(txtCodigoAnimal.getText());
            animal = new AnimalDomestico(raza, codAnimal, nomAnimal);
        }
        
        animales.add(animal);
    }//GEN-LAST:event_btnIngresoAnimalActionPerformed

    private void rbSalvajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSalvajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSalvajeActionPerformed

    private void rbDomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDomesticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDomesticoActionPerformed

    private void btnRetiroAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroAnimal1ActionPerformed
        String motivoRetiro, retiro;
        int codAnimal, codAnimalRetiro;
        codAnimal = Integer.parseInt(txtCodigoAnimalBusq.getText());
        motivoRetiro = txtMotivoRetiro.getText();
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getCodigo() == codAnimal) {
                animales.remove(i);
                retiro = "El ánimal con el código: " + codAnimal + " ha sido eliminado.\nMotivo: " + motivoRetiro;
                retiros.add(retiro);
                JOptionPane.showMessageDialog(null, "El ánimal ha sido eliminado exitosamente");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningún animal con este código");
            }
        }
    }//GEN-LAST:event_btnRetiroAnimal1ActionPerformed

    private void txtNombreAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAnimal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAnimal1ActionPerformed

    private void jButtonAdoptarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdoptarAnimalActionPerformed
        String cedula, nombre, correo, adopcion;
        int codAnim, edad;
        
        cedula = txtCedulaAdop.getText();
        nombre = txtNombreAdop.getText();
        correo = txtCorreoAdop.getText();
        codAnim = Integer.parseInt(txtCodigAnimalAdop.getText());
        edad = Integer.parseInt(txtEdadAdop.getText());
        
        if (edad >= 18) {
            for (int i = 0; i < animales.size(); i++) {
                if (animales.get(i).getCodigo() == codAnim && animales.get(i).getClass().getName().equals("AnimalDomestico")) {
                    adopcion = "El animal con el código: " + codAnim + "ha sido adoptado por: " + nombre;
                    animales.remove(i);
                    adopciones.add(adopcion);
                    JOptionPane.showMessageDialog(null, "Adopçao exitosa");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado animal con este código o el código ingresado pertenece a un animal salvaje");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe ser mayor de edad para llevar a cabo la adopción");
        }
    }//GEN-LAST:event_jButtonAdoptarAnimalActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Principal main = new Principal();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonVerListaAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerListaAnimalesActionPerformed
        FrameListaAnimal FListaAnimal = new FrameListaAnimal();
        FListaAnimal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVerListaAnimalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JButton btnIngresoAnimal;
    private javax.swing.JButton btnRetiroAnimal1;
    private javax.swing.JComboBox<String> cbNivelPeli;
    private javax.swing.JButton jButtonAdoptarAnimal;
    private javax.swing.JButton jButtonVerListaAnimales;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbDomestico;
    private javax.swing.JRadioButton rbSalvaje;
    private javax.swing.JTextField txtCedulaAdop;
    private javax.swing.JTextField txtCodigAnimalAdop;
    private javax.swing.JTextField txtCodigoAnimal;
    private javax.swing.JTextField txtCodigoAnimalBusq;
    private javax.swing.JTextField txtCorreoAdop;
    private javax.swing.JTextField txtEdadAdop;
    private javax.swing.JTextField txtMotivoRetiro;
    private javax.swing.JTextField txtNombreAdop;
    private javax.swing.JTextField txtNombreAnimal1;
    private javax.swing.JTextField txtRazaAnimal;
    // End of variables declaration//GEN-END:variables
}
