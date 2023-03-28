/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Adicion;
import java.util.ArrayList;
import java.util.List;
import Model.Client;
import Model.Plan;

/**
 *
 * @author Levi.ing
 */
public class FrameVentas extends javax.swing.JFrame {
    
     private List<Client> clientes;
     private FrameLogistica frameLog;
    /**
     * Creates new form Frame2
     */
    public FrameVentas() {
        clientes = new ArrayList<Client>();
        initComponents();
        setLocationRelativeTo(null);
        bloqueoTxt();
        blockCheckLBasica();
        blockCheckLEstaandar();
        blockCheckLZP();
        blockCheckLZV();
        blockPlans();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreEmpresa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JButton();
        btnIngresoCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        rbPlan1 = new javax.swing.JRadioButton();
        rbPlan2 = new javax.swing.JRadioButton();
        rbPlan3 = new javax.swing.JRadioButton();
        rbPlan4 = new javax.swing.JRadioButton();
        rbPlan5 = new javax.swing.JRadioButton();
        jButtonVolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbAdicionBasica1 = new javax.swing.JCheckBox();
        cbAdicionBasica2 = new javax.swing.JCheckBox();
        cbAdicionBasica3 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbAdicionEstandar1 = new javax.swing.JCheckBox();
        cbAdicionEstandar2 = new javax.swing.JCheckBox();
        cbAdicionEstandar3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        cbAdicionZV1 = new javax.swing.JCheckBox();
        cbAdicionZV2 = new javax.swing.JCheckBox();
        cbAdicionZV3 = new javax.swing.JCheckBox();
        cbAdicionZV4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cbAdicionZP1 = new javax.swing.JCheckBox();
        cbAdicionZP2 = new javax.swing.JCheckBox();
        cbAdicionZP3 = new javax.swing.JCheckBox();
        cbAdicionZP4 = new javax.swing.JCheckBox();
        agregarCompra = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 120));

        NombreEmpresa.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        NombreEmpresa.setText("LOS MIPAI");
        jPanel1.add(NombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel4.setText("Cedula:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 32, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 32, -1, -1));

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel6.setText("Nombre: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 71, -1, -1));

        txtCedula.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 32, 140, -1));

        txtNombre.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 71, 140, -1));

        txtEdad.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 32, 124, -1));

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel7.setText("Correo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 71, 124, -1));

        jLabel10.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel10.setText("Lvl frecuencia");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 46, 102, -1));

        jLabel11.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 69, 32, 44));

        btnNuevoCliente.setBackground(new java.awt.Color(135, 106, 48));
        btnNuevoCliente.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnNuevoCliente.setBorderPainted(false);
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 117, 30));

        btnIngresoCliente.setBackground(new java.awt.Color(135, 106, 48));
        btnIngresoCliente.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnIngresoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresoCliente.setText("Ingresar Cliente");
        btnIngresoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnIngresoCliente.setBorderPainted(false);
        btnIngresoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 117, 33));

        jLabel12.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel12.setText("Sexo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 111, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Otro", " " }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 6, 880, 150));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "COMPRA DE BOLETAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jList1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "      === PLAN 1 ===", "          (Individual)", "- Tour por zoo.", "- Ingreso a zona verde.", " ", "Precio:", "             $ 25,000.", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 57, 170, 167));

        jList2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jList2.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "           === PLAN 2 ===", "            (Dos personas)", "- Tour por zoo.", "- Ingreso a zona verde.", "- Ingreso a zona de cisnes.", " ", "Precio: ", "                  $ 55,000" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 170, 167));

        jList3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jList3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "         === PLAN 4 ===", "             (Individual)", "- Ingreso a zona verde.", "- Espectaculo de delfines.", "- Entrada a zona de pesca", "(no incluye compras)", " ", "Precio:", "               $ 50,000" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 190, 256));

        jList4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jList4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "      === PLAN 3 ===", "       (Dos personas)", "- Safari.", "- Ingreso a zona verde.", "- Paseo en caballos.", " ", "Precio:", "            $ 63,000" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 170, 167));

        jList5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jList5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "           === PLAN 5 ===", "                 (Familiar)", "- Ingreso de 4 personas.", "- Tour por el zoo.", "- Espectaculo de delfines.", "- Ingreso a zona verde.", " ", "Precio:", "                 $ 78,000", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 202, 256));

        buttonGroup1.add(rbPlan1);
        rbPlan1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        rbPlan1.setText("Comprar");
        rbPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlan1ActionPerformed(evt);
            }
        });
        jPanel3.add(rbPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 236, 108, 31));

        buttonGroup1.add(rbPlan2);
        rbPlan2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        rbPlan2.setText("Comprar");
        rbPlan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlan2ActionPerformed(evt);
            }
        });
        jPanel3.add(rbPlan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 106, 31));

        buttonGroup1.add(rbPlan3);
        rbPlan3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        rbPlan3.setText("Comprar");
        rbPlan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlan3ActionPerformed(evt);
            }
        });
        jPanel3.add(rbPlan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 94, 31));

        buttonGroup1.add(rbPlan4);
        rbPlan4.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        rbPlan4.setText("Comprar");
        jPanel3.add(rbPlan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 97, 32));

        buttonGroup1.add(rbPlan5);
        rbPlan5.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        rbPlan5.setText("Comprar");
        rbPlan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPlan5ActionPerformed(evt);
            }
        });
        jPanel3.add(rbPlan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, 32));

        jButtonVolver.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButtonVolver.setText("VOLVER");
        jButtonVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 680, 610));

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Adiciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 14))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel1.setText("Adiciones basicas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        cbAdicionBasica1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionBasica1.setText("Gorra con logo del zoo                                   $10,000");
        cbAdicionBasica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdicionBasica1ActionPerformed(evt);
            }
        });
        jPanel4.add(cbAdicionBasica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 52, -1, -1));

        cbAdicionBasica2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionBasica2.setText("Bloqueador para el sol                                     $7,000");
        jPanel4.add(cbAdicionBasica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 79, -1, -1));

        cbAdicionBasica3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionBasica3.setText("Repelente para mosquitos     $15,000");
        jPanel4.add(cbAdicionBasica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 106, -1, -1));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel2.setText("Adiciones de zona verde");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        cbAdicionEstandar1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionEstandar1.setText("Bote de comida para animales                         $4,000");
        jPanel4.add(cbAdicionEstandar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 171, -1, -1));

        cbAdicionEstandar2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionEstandar2.setText("Paseo en semi montana rusa                            $8,000");
        jPanel4.add(cbAdicionEstandar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 198, -1, -1));

        cbAdicionEstandar3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionEstandar3.setText("Foto con Fiton (Piton del zoo)                        $10,000");
        jPanel4.add(cbAdicionEstandar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 225, -1, -1));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel3.setText("Adiciones estandars");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        cbAdicionZV1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZV1.setText("Acesso a fogata con malvaviscos                     $8,000");
        jPanel4.add(cbAdicionZV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 288, -1, -1));

        cbAdicionZV2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZV2.setText("Acesso a tobogan de agua                             $15,000");
        jPanel4.add(cbAdicionZV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 315, -1, -1));

        cbAdicionZV3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZV3.setText("Entrada a zona de Capybaras                         $8,000");
        jPanel4.add(cbAdicionZV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 342, -1, -1));

        cbAdicionZV4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZV4.setText("Camisa de (Amor por los carpinchos)             $18,000");
        cbAdicionZV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdicionZV4ActionPerformed(evt);
            }
        });
        jPanel4.add(cbAdicionZV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 369, -1, -1));

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel8.setText("Adiciones en zona de pescas");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        cbAdicionZP1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZP1.setText(" Alquiler de Cana de pescar con carnadas    $35,000");
        jPanel4.add(cbAdicionZP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 432, -1, -1));

        cbAdicionZP2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZP2.setText("Gorro de pesca                                              $13,000");
        jPanel4.add(cbAdicionZP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 459, -1, -1));

        cbAdicionZP3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZP3.setText("Paseo en bote por el lago de pesca                $10,000");
        cbAdicionZP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdicionZP3ActionPerformed(evt);
            }
        });
        jPanel4.add(cbAdicionZP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 486, -1, -1));

        cbAdicionZP4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        cbAdicionZP4.setText("Visita a la isla de kong                                   $17,000");
        jPanel4.add(cbAdicionZP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 513, -1, -1));

        agregarCompra.setBackground(new java.awt.Color(102, 102, 0));
        agregarCompra.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        agregarCompra.setText("Agregar Compra");
        agregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCompraActionPerformed(evt);
            }
        });
        jPanel4.add(agregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 187, 53));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 165, 390, 620));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoNuevo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
        txtCedula.setText("");
        txtCorreo.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        btnNuevoCliente.setEnabled(false);
        desbloqueoTxt();
        
        
    }//GEN-LAST:event_btnNuevoClienteActionPerformed
    
    private void btnIngresoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoClienteActionPerformed
        // TODO add your handling code here:
        btnNuevoCliente.setEnabled(true);
        
        String nombre, cedula, correo, sexo;
        float pago;
        int edad;
        Plan plan = null;
        
        nombre = txtNombre.getText();
        cedula = txtCedula.getText();
        correo = txtCorreo.getText();
        edad = Integer.parseInt(txtEdad.getText());
        pago = 0;
        sexo = (String)jComboBox1.getSelectedItem();
        
        clientes.add(crearCliente(nombre, cedula, correo, edad, sexo, pago, plan));
        unlockPlans();
    }//GEN-LAST:event_btnIngresoClienteActionPerformed

    private void cbAdicionZP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdicionZP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdicionZP3ActionPerformed

    private void rbPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlan1ActionPerformed
        unlockBasic();
        unlockEstandar();
        unlockZV();
    }//GEN-LAST:event_rbPlan1ActionPerformed

    private void rbPlan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlan2ActionPerformed
        unlockBasic();
        unlockEstandar();
        unlockZV();
    }//GEN-LAST:event_rbPlan2ActionPerformed

    private void rbPlan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlan3ActionPerformed
        unlockBasic();
        unlockZV();
        unlockZP();
    }//GEN-LAST:event_rbPlan3ActionPerformed

    private void rbPlan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPlan5ActionPerformed
        unlockBasic();
        unlockEstandar();
        unlockZV();
    }//GEN-LAST:event_rbPlan5ActionPerformed

    private void cbAdicionZV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdicionZV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdicionZV4ActionPerformed

    private void agregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCompraActionPerformed
        float valorTotal = 0.0f;
        Plan plan = new Plan();
        Client client, clientToFrameLog;
        Adicion adicion;
        
        if(rbPlan1.isSelected()) {
            plan = new Plan (25000f, "Plan 1");
            plan.addBeneficios("Tour por zoo");
            plan.addBeneficios("Ingreso a zona verde");   
            valorTotal += 25000f;
        }
        else if (rbPlan2.isSelected()) {
            plan = new Plan (55000f, "Plan 2");
            plan.addBeneficios("Tour por zoo");
            plan.addBeneficios("Ingreso a zona verde");  
            plan.addBeneficios("Ingreso a zona de cisnes");
            valorTotal += 55000f;
        }
        else if (rbPlan3.isSelected()) {
            plan = new Plan (63000f, "Plan 3");
            plan.addBeneficios("Safari");
            plan.addBeneficios("Ingreso a zona verde");
            plan.addBeneficios("Paseo en caballos");
            valorTotal += 63000f;
        }
        else if (rbPlan4.isSelected()) {
            plan = new Plan (50000f, "Plan 4");
            plan.addBeneficios("Ingreso a zona verde");  
            plan.addBeneficios("Espectáculo de delfines");
            plan.addBeneficios("Entrada a zona de pesca");
            valorTotal += 50000f;
        }
        else if (rbPlan5.isSelected()) {
            plan = new Plan (78000f, "Plan 5");
            plan.addBeneficios("Ingreso de 4 personas");
            plan.addBeneficios("Tour por el zoo");  
            plan.addBeneficios("Espectáculo de delfines");
            plan.addBeneficios("Ingreso a zona verde");
            valorTotal += 78000f;
        }
        
        if(cbAdicionBasica1.isSelected()) {
            adicion = new Adicion("Gorra con logo del zoo", 10000f);
            plan.addAdiciones(adicion);
            valorTotal += 10000f;
        }
        if(cbAdicionBasica2.isSelected()) {
            adicion = new Adicion("Bloqueador solar", 7000f);
            plan.addAdiciones(adicion);
            valorTotal += 7000f;
        }
        if(cbAdicionBasica3.isSelected()) {
            adicion = new Adicion("Repelente para mosquitos", 15000f);
            plan.addAdiciones(adicion);
            valorTotal += 15000f;
        }
        if(cbAdicionEstandar1.isSelected()) {
            adicion = new Adicion("Bote de comida para animales", 5000f);
            plan.addAdiciones(adicion);
            valorTotal += 5000f;
        }
        if(cbAdicionEstandar2.isSelected()) {
            adicion = new Adicion("Paseo en semi montaña rusa", 8000f);
            plan.addAdiciones(adicion);
            valorTotal += 8000f;
        }
        if(cbAdicionEstandar3.isSelected()) {
            adicion = new Adicion("Foto con Fiton", 10000f);
            plan.addAdiciones(adicion);
            valorTotal += 10000f;
        }
        if(cbAdicionZV1.isSelected()) {
            adicion = new Adicion("Fogata con malvaviscos", 8000f);
            plan.addAdiciones(adicion);
            valorTotal += 8000f;
        }
        if(cbAdicionZV2.isSelected()) {
            adicion = new Adicion("Tobogán de agua", 15000f);
            plan.addAdiciones(adicion);
            valorTotal += 15000f;
        }
        if(cbAdicionZV3.isSelected()) {
            adicion = new Adicion("Xona de capybaras", 8000f);
            plan.addAdiciones(adicion);
            valorTotal += 8000f;
        }
        if(cbAdicionZV4.isSelected()) {
            adicion = new Adicion("Camisa 'Amor por los carpinchos'", 18000f);
            plan.addAdiciones(adicion);
        }
        if(cbAdicionZP1.isSelected()) {
            adicion = new Adicion("Caña de pescar con carnadas", 35000f);
            plan.addAdiciones(adicion);
            valorTotal += 35000f;
        }
        if(cbAdicionZP2.isSelected()) {
            adicion = new Adicion("Gorro de pesca", 13000f);
            plan.addAdiciones(adicion);
            valorTotal += 13000f;
        }
        if(cbAdicionZP3.isSelected()) {
            adicion = new Adicion("Paseo en bote por el lago de pesca", 10000f);
            plan.addAdiciones(adicion);
            valorTotal += 10000f;
        }
        if(cbAdicionZP4.isSelected()) {
            adicion = new Adicion("Visita a la isla Kong", 17000f);
            plan.addAdiciones(adicion);
            valorTotal += 17000f;
        }
        
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCedula().equals(txtCedula.getText())) {
                clientes.get(i).setDinero(valorTotal);
                clientes.get(i).setLvlFrecuencia(clientes.get(i).getLvlFrecuencia()+0.2f);
                jLabel11.setText(Float.toString(clientes.get(i).getLvlFrecuencia()));
                clientes.get(i).setPlan(plan);
                clientToFrameLog = clientes.get(i);
                frameLog.addClientToList(clientToFrameLog);
            }
        }
    }//GEN-LAST:event_agregarCompraActionPerformed

    private void cbAdicionBasica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdicionBasica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdicionBasica1ActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Principal main = new Principal();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed
    
    void bloqueoTxt(){
        txtCedula.setEditable(false);
        txtCorreo.setEditable(false);
        txtEdad.setEditable(false);
        txtNombre.setEditable(false);
    }
    
    void desbloqueoTxt(){
        txtCedula.setEditable(true);
        txtCorreo.setEditable(true);
        txtEdad.setEditable(true);
        txtNombre.setEditable(true);
    }
    
    void blockPlans(){
        rbPlan1.setEnabled(false);
        rbPlan2.setEnabled(false);
        rbPlan3.setEnabled(false);
        rbPlan4.setEnabled(false);
        rbPlan5.setEnabled(false);
    }
    
    void unlockPlans(){
        rbPlan1.setEnabled(true);
        rbPlan2.setEnabled(true);
        rbPlan3.setEnabled(true);
        rbPlan4.setEnabled(true);
        rbPlan5.setEnabled(true);
    }
    
    public Client crearCliente(String nombre, String cedula, String correo, int edad, String sexo, float pago, Plan plan){
        Client cliente = new Client(nombre, cedula, correo, sexo, edad, pago, plan);
        return cliente;
    }
    
    void blockCheckLBasica(){
        cbAdicionBasica1.setEnabled(false);
        cbAdicionBasica2.setEnabled(false);
        cbAdicionBasica3.setEnabled(false);
    }
    
    void unlockBasic(){
        cbAdicionBasica1.setEnabled(true);
        cbAdicionBasica2.setEnabled(true);
        cbAdicionBasica3.setEnabled(true);
    }
    
    void blockCheckLEstaandar(){
        cbAdicionEstandar1.setEnabled(false);
        cbAdicionEstandar2.setEnabled(false);
        cbAdicionEstandar3.setEnabled(false);
    }
    
    void unlockEstandar(){
        cbAdicionEstandar1.setEnabled(true);
        cbAdicionEstandar2.setEnabled(true);
        cbAdicionEstandar3.setEnabled(true);
    }
    
    void blockCheckLZV(){
        cbAdicionZV1.setEnabled(false);
        cbAdicionZV2.setEnabled(false);
        cbAdicionZV3.setEnabled(false);
        cbAdicionZV4.setEnabled(false);
    }
    
    void unlockZV(){
        cbAdicionZV1.setEnabled(true);
        cbAdicionZV2.setEnabled(true);
        cbAdicionZV3.setEnabled(true);
        cbAdicionZV4.setEnabled(true);
    }
    
    void blockCheckLZP(){
        cbAdicionZP1.setEnabled(false);
        cbAdicionZP2.setEnabled(false);
        cbAdicionZP3.setEnabled(false);
        cbAdicionZP4.setEnabled(false);
    }
    
    void unlockZP(){
       cbAdicionZP1.setEnabled(true);
        cbAdicionZP2.setEnabled(true);
        cbAdicionZP3.setEnabled(true);
        cbAdicionZP4.setEnabled(true); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JButton agregarCompra;
    private javax.swing.JButton btnIngresoCliente;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbAdicionBasica1;
    private javax.swing.JCheckBox cbAdicionBasica2;
    private javax.swing.JCheckBox cbAdicionBasica3;
    private javax.swing.JCheckBox cbAdicionEstandar1;
    private javax.swing.JCheckBox cbAdicionEstandar2;
    private javax.swing.JCheckBox cbAdicionEstandar3;
    private javax.swing.JCheckBox cbAdicionZP1;
    private javax.swing.JCheckBox cbAdicionZP2;
    private javax.swing.JCheckBox cbAdicionZP3;
    private javax.swing.JCheckBox cbAdicionZP4;
    private javax.swing.JCheckBox cbAdicionZV1;
    private javax.swing.JCheckBox cbAdicionZV2;
    private javax.swing.JCheckBox cbAdicionZV3;
    private javax.swing.JCheckBox cbAdicionZV4;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rbPlan1;
    private javax.swing.JRadioButton rbPlan2;
    private javax.swing.JRadioButton rbPlan3;
    private javax.swing.JRadioButton rbPlan4;
    private javax.swing.JRadioButton rbPlan5;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
