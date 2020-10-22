
package salesorderform;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class SalesOrderFormSandz extends javax.swing.JFrame {
    public SalesOrderFormSandz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        generate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        cat1 = new javax.swing.JTextField();
        sup1 = new javax.swing.JTextField();
        bra1 = new javax.swing.JTextField();
        ite1 = new javax.swing.JTextField();
        qty1 = new javax.swing.JTextField();
        cost1 = new javax.swing.JTextField();
        totCost1 = new javax.swing.JLabel();
        cost2 = new javax.swing.JTextField();
        totCost2 = new javax.swing.JLabel();
        qty2 = new javax.swing.JTextField();
        ite2 = new javax.swing.JTextField();
        sup2 = new javax.swing.JTextField();
        bra2 = new javax.swing.JTextField();
        cat2 = new javax.swing.JTextField();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cat3 = new javax.swing.JTextField();
        sup3 = new javax.swing.JTextField();
        bra3 = new javax.swing.JTextField();
        ite3 = new javax.swing.JTextField();
        qty3 = new javax.swing.JTextField();
        cost3 = new javax.swing.JTextField();
        totCost3 = new javax.swing.JLabel();
        totCost4 = new javax.swing.JLabel();
        cost4 = new javax.swing.JTextField();
        qty4 = new javax.swing.JTextField();
        ite4 = new javax.swing.JTextField();
        bra4 = new javax.swing.JTextField();
        sup4 = new javax.swing.JTextField();
        cat4 = new javax.swing.JTextField();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cat5 = new javax.swing.JTextField();
        sup5 = new javax.swing.JTextField();
        bra5 = new javax.swing.JTextField();
        ite5 = new javax.swing.JTextField();
        qty5 = new javax.swing.JTextField();
        cost5 = new javax.swing.JTextField();
        totCost5 = new javax.swing.JLabel();
        otherCostOfMos = new javax.swing.JTextField();
        vatLossPer = new javax.swing.JTextField();
        othersOthers = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        outside = new javax.swing.JRadioButton();
        moneyDisplay = new javax.swing.JLabel();
        cosMonths = new javax.swing.JTextField();
        inside = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        forloss = new javax.swing.JTextField();
        muniTax = new javax.swing.JLabel();
        othersIndi = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        perShip = new javax.swing.JTextField();
        truckDisplay = new javax.swing.JTextField();
        cosMonPer = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        shipDisplay = new javax.swing.JLabel();
        totDirect = new javax.swing.JLabel();
        totIndirect = new javax.swing.JLabel();
        forDisplay = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        vatInc = new javax.swing.JLabel();
        vatEx = new javax.swing.JTextField();
        targetNetProfitPercent = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        projectName = new javax.swing.JTextField();
        contactPerson = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        contactDetails = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        poNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        totPer = new javax.swing.JTextField();
        cusPo = new javax.swing.JTextField();
        cusDel = new javax.swing.JTextField();
        cusAcc = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        EmcReg = new javax.swing.JTextField();
        hpCode = new javax.swing.JTextField();
        EmcNum = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        special = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        totOtherCost = new javax.swing.JLabel();
        totPayment = new javax.swing.JLabel();
        totDate = new javax.swing.JLabel();
        cusDelShow = new javax.swing.JLabel();
        cusAccShow = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        otherCostOfPer = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        vatLos = new javax.swing.JLabel();
        otherCostOfMon = new javax.swing.JLabel();
        totCost = new javax.swing.JLabel();
        targetCostToManage = new javax.swing.JLabel();
        actNetProAbsAmt = new javax.swing.JLabel();
        actTotCost = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        actNetProPer = new javax.swing.JLabel();
        targetNetProfitAbsAmt = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        cusPoShow = new javax.swing.JLabel();
        cb6 = new javax.swing.JCheckBox();
        cat6 = new javax.swing.JTextField();
        sup6 = new javax.swing.JTextField();
        bra6 = new javax.swing.JTextField();
        ite6 = new javax.swing.JTextField();
        qty6 = new javax.swing.JTextField();
        cost6 = new javax.swing.JTextField();
        totCost6 = new javax.swing.JLabel();
        cost7 = new javax.swing.JTextField();
        totCost7 = new javax.swing.JLabel();
        qty7 = new javax.swing.JTextField();
        ite7 = new javax.swing.JTextField();
        sup7 = new javax.swing.JTextField();
        bra7 = new javax.swing.JTextField();
        cat7 = new javax.swing.JTextField();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cat8 = new javax.swing.JTextField();
        sup8 = new javax.swing.JTextField();
        bra8 = new javax.swing.JTextField();
        ite8 = new javax.swing.JTextField();
        qty8 = new javax.swing.JTextField();
        cost8 = new javax.swing.JTextField();
        totCost8 = new javax.swing.JLabel();
        totCost9 = new javax.swing.JLabel();
        cost9 = new javax.swing.JTextField();
        qty9 = new javax.swing.JTextField();
        ite9 = new javax.swing.JTextField();
        bra9 = new javax.swing.JTextField();
        sup9 = new javax.swing.JTextField();
        cat9 = new javax.swing.JTextField();
        cb9 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cat10 = new javax.swing.JTextField();
        sup10 = new javax.swing.JTextField();
        bra10 = new javax.swing.JTextField();
        ite10 = new javax.swing.JTextField();
        qty10 = new javax.swing.JTextField();
        cost10 = new javax.swing.JTextField();
        totCost10 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        invalid = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(30, 61, 88));
        jPanel2.setForeground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SANDZ SOLUTIONS PHILIPPINES INC.");

        jLabel43.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("SALES ORDER FORM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Order Form");
        setFocusable(false);

        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1599, 2500));
        jScrollPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(245, 240, 225));
        jPanel1.setMinimumSize(new java.awt.Dimension(1499, 3000));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1599, 4816));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generate.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        generate.setText("Generate SOF");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 2600, 210, 57));

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 2600, 210, 57));

        print.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 2600, 220, 57));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel25.setText("IV.");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 960, -1, 30));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel26.setText("COST COMPUTATION");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 960, -1, 30));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel27.setText("A. DIRECT COST");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1010, -1, -1));

        cb1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1100, -1, -1));

        cat1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1100, 220, -1));

        sup1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1100, 210, -1));

        bra1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1100, 200, -1));

        ite1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1100, 230, -1));

        qty1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty1.setText("0");
        qty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty1ActionPerformed(evt);
            }
        });
        jPanel1.add(qty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1100, 70, -1));

        cost1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost1.setText("0");
        jPanel1.add(cost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1100, 180, -1));

        totCost1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost1.setText("0");
        jPanel1.add(totCost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1100, 180, 20));

        cost2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost2.setText("0");
        jPanel1.add(cost2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1140, 180, -1));

        totCost2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost2.setText("0");
        jPanel1.add(totCost2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1134, 180, 30));

        qty2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty2.setText("0");
        jPanel1.add(qty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1140, 70, -1));

        ite2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1140, 230, -1));

        sup2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1140, 210, -1));

        bra2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1140, 200, -1));

        cat2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1140, 220, -1));

        cb2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel1.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1140, -1, -1));

        cb3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        jPanel1.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1180, -1, -1));

        cat3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1180, 220, -1));

        sup3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1180, 210, -1));

        bra3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1180, 200, -1));

        ite3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1180, 230, -1));

        qty3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty3.setText("0");
        jPanel1.add(qty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1180, 70, -1));

        cost3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost3.setText("0");
        jPanel1.add(cost3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1180, 180, -1));

        totCost3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost3.setText("0");
        jPanel1.add(totCost3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1180, 180, 30));

        totCost4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost4.setText("0");
        jPanel1.add(totCost4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1220, 180, -1));

        cost4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost4.setText("0");
        jPanel1.add(cost4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1220, 180, -1));

        qty4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty4.setText("0");
        jPanel1.add(qty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1220, 70, -1));

        ite4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1220, 230, -1));

        bra4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        bra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bra4ActionPerformed(evt);
            }
        });
        jPanel1.add(bra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1220, 200, -1));

        sup4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1220, 210, -1));

        cat4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1220, 220, -1));

        cb4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        jPanel1.add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1220, -1, -1));

        cb5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        jPanel1.add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1260, -1, -1));

        cat5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1260, 220, -1));

        sup5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1260, 210, -1));

        bra5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1260, 200, -1));

        ite5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1260, 230, -1));

        qty5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty5.setText("0");
        jPanel1.add(qty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1260, 70, -1));

        cost5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost5.setText("0");
        jPanel1.add(cost5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1260, 180, -1));

        totCost5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost5.setText("0");
        jPanel1.add(totCost5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1260, 180, -1));

        otherCostOfMos.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        otherCostOfMos.setText("0");
        otherCostOfMos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherCostOfMosActionPerformed(evt);
            }
        });
        jPanel1.add(otherCostOfMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1860, 60, -1));

        vatLossPer.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        vatLossPer.setText("0");
        vatLossPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatLossPerActionPerformed(evt);
            }
        });
        jPanel1.add(vatLossPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1900, 60, -1));

        othersOthers.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        othersOthers.setText("0");
        othersOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersOthersActionPerformed(evt);
            }
        });
        jPanel1.add(othersOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1940, 80, -1));

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel38.setText("3. Others: (Contingency)");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1940, 320, -1));

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel37.setText("2. VAT Loss:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1900, -1, -1));

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel36.setText("1. Cost Of Money: (Retention - Standard 3 years)");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1860, 450, -1));

        outside.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        outside.setText("Outside Metro");
        outside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outsideActionPerformed(evt);
            }
        });
        jPanel1.add(outside, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 1600, -1, 40));

        moneyDisplay.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        moneyDisplay.setText("               ");
        jPanel1.add(moneyDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 1650, 150, 30));

        cosMonths.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cosMonths.setText("0");
        cosMonths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosMonthsActionPerformed(evt);
            }
        });
        jPanel1.add(cosMonths, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1650, 60, 30));

        inside.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        inside.setText("Within Metro");
        jPanel1.add(inside, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1600, -1, 40));

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel41.setText("Months:");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1650, -1, -1));

        forloss.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        forloss.setText("0");
        forloss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forlossActionPerformed(evt);
            }
        });
        jPanel1.add(forloss, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1690, 70, -1));

        muniTax.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        muniTax.setText("                    ");
        jPanel1.add(muniTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1730, 150, -1));

        othersIndi.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        othersIndi.setText("0");
        jPanel1.add(othersIndi, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1760, 90, -1));

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel34.setText("6. Others:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1770, -1, -1));

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel33.setText("5. Municipal Tax: ");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1730, -1, -1));

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel32.setText("4. Forex Loss:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1690, -1, -1));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel31.setText("3. Cost Of Money: ");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1650, -1, -1));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel30.setText("2. Trucking Internal:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1610, -1, -1));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel29.setText("1. Shipping:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1570, -1, -1));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel28.setText("B. INDIRECT COST");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1530, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setText("%");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1650, 20, 30));

        perShip.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        perShip.setText("0");
        jPanel1.add(perShip, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1570, 70, -1));

        truckDisplay.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        truckDisplay.setText("0");
        jPanel1.add(truckDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1610, 70, 30));

        cosMonPer.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cosMonPer.setText("0");
        cosMonPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosMonPerActionPerformed(evt);
            }
        });
        jPanel1.add(cosMonPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1650, 70, 30));

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel40.setText("%");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1570, 20, 30));

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel39.setText("D. TOTAL COST");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 2000, -1, 30));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel35.setText("C. OTHERS COST");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1820, -1, -1));

        shipDisplay.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        shipDisplay.setText("       ");
        jPanel1.add(shipDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1570, 180, 30));

        totDirect.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(totDirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1000, 210, 30));

        totIndirect.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totIndirect.setText("                   ");
        jPanel1.add(totIndirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1530, 200, 30));

        forDisplay.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        forDisplay.setText("           ");
        jPanel1.add(forDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1690, 130, 30));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel13.setText("I.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel14.setText("Total Contract Value (VAT Inc):");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel15.setText("Total Contract Value (VAT Ex):");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        vatInc.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        vatInc.setText("                                              ");
        jPanel1.add(vatInc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 230, 30));

        vatEx.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        vatEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatExActionPerformed(evt);
            }
        });
        vatEx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vatExKeyTyped(evt);
            }
        });
        jPanel1.add(vatEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 230, -1));

        targetNetProfitPercent.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        targetNetProfitPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetNetProfitPercentActionPerformed(evt);
            }
        });
        jPanel1.add(targetNetProfitPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 230, 30));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel20.setText("Actual Net Profit (Absolute Amount):");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 760, -1, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel19.setText("Actual Net Profit (in %):");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 720, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel18.setText("Target Net Profit (Absolute Amount):");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel17.setText("Target Net Profit (in %):");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel16.setText("II.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel22.setText("III.");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 810, -1, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel21.setText("Target Cost to Manage:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 840, -1, 30));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel23.setText("Actual Total Cost:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 880, -1, 30));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel24.setText("Balance:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 910, -1, 40));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel3.setText("Customer Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        customerName.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });
        jPanel1.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 310, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel4.setText("Project Name: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        projectName.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(projectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 310, 30));

        contactPerson.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(contactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 310, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel5.setText("Contact Person:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel6.setText("Designation:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        designation.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 310, -1));

        contactDetails.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(contactDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 310, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel7.setText("Contact Details:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel9.setText("Customer Delivery Date:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel8.setText("Date of PO: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel12.setText("PO Number:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        poNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(poNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 250, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel11.setText("Date Submitted: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 48, 73));

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexa\\Desktop\\sandz.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 240));

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel44.setText("V. Payment Terms");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 2050, -1, -1));

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel45.setText("Total: ");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2220, -1, -1));

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel46.setText("Estimated Date");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 2060, -1, -1));

        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel47.setText("2. Upon Customer Delivery:");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2140, -1, -1));

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel48.setText("3. Upon Customer Acceptance:");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2180, -1, -1));

        totPer.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totPer.setText(" ");
        jPanel1.add(totPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 2210, 90, -1));

        cusPo.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cusPo.setText("0");
        jPanel1.add(cusPo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 2090, 90, -1));

        cusDel.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cusDel.setText("0");
        cusDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusDelActionPerformed(evt);
            }
        });
        jPanel1.add(cusDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 2130, 90, -1));

        cusAcc.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cusAcc.setText("0");
        cusAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusAccActionPerformed(evt);
            }
        });
        jPanel1.add(cusAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 2170, 90, -1));

        jLabel49.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel49.setText("VI. Principal Codes (For Loading - Please fill up related codes)");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 2270, -1, -1));

        jLabel50.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel50.setText("3. EMC Deal Registration Number: ");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 2410, -1, -1));

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel51.setText("1. HP Claim Code:");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 2330, -1, -1));

        jLabel52.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel52.setText("2. EMC Cart Number:");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 2370, -1, -1));

        EmcReg.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(EmcReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 2410, 230, -1));

        hpCode.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(hpCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 2330, 230, -1));

        EmcNum.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(EmcNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 2370, 230, -1));

        jLabel53.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel53.setText("VII. Special Instructions");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2480, -1, -1));

        special.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(special, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 2520, 1060, -1));

        jDateChooser1.setDateFormatString("MMM dd, yyyy ");
        jDateChooser1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2090, 210, 30));

        jDateChooser2.setDateFormatString("MMM dd, yyyy ");
        jDateChooser2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2130, 210, 30));

        jDateChooser3.setDateFormatString("MMM dd, yyyy ");
        jDateChooser3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2170, 210, 30));

        jDateChooser5.setDateFormatString("MMM dd, yyyy ");
        jDateChooser5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 250, 30));

        jDateChooser6.setDateFormatString("MMM dd, yyyy ");
        jDateChooser6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 250, 30));

        jDateChooser7.setDateFormatString("MMM dd, yyyy ");
        jDateChooser7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 250, 30));

        totOtherCost.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(totOtherCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1820, 210, 30));

        totPayment.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totPayment.setText(" ");
        jPanel1.add(totPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 2210, 210, 30));

        totDate.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totDate.setText(" ");
        jPanel1.add(totDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2210, 210, 30));

        cusDelShow.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cusDelShow.setText(" ");
        jPanel1.add(cusDelShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 2130, 160, 30));

        cusAccShow.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cusAccShow.setText(" ");
        jPanel1.add(cusAccShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 2170, 160, 30));

        jLabel56.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel56.setText("Forex Rate Used:");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, -1));

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel57.setText("Currency Use:");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, -1, -1));

        jLabel58.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel58.setText("Recovery Amount:");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 620, -1, -1));

        jTextField17.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 570, 180, 30));

        jTextField18.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 530, 180, 30));

        jLabel63.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 610, 180, 30));

        otherCostOfPer.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        otherCostOfPer.setText("0");
        otherCostOfPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherCostOfPerActionPerformed(evt);
            }
        });
        jPanel1.add(otherCostOfPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1860, 60, -1));

        jLabel55.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel55.setText("%");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 2050, 20, 30));

        jLabel64.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel64.setText("Months:");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1860, -1, -1));

        jLabel65.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel65.setText("%");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1860, 20, 30));

        vatLos.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        vatLos.setText("          ");
        jPanel1.add(vatLos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1900, 210, 30));

        otherCostOfMon.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        otherCostOfMon.setText("       ");
        jPanel1.add(otherCostOfMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1860, 220, 30));

        totCost.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(totCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2000, 250, 30));

        targetCostToManage.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(targetCostToManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 840, 230, 30));

        actNetProAbsAmt.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(actNetProAbsAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 760, 230, 30));

        actTotCost.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(actTotCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 880, 230, 30));

        bal.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 920, 230, 30));

        actNetProPer.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(actNetProPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 720, 230, 30));

        targetNetProfitAbsAmt.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(targetNetProfitAbsAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 230, 30));

        jLabel66.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel66.setText("%");
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1900, 20, 30));

        cusPoShow.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cusPoShow.setText(" ");
        jPanel1.add(cusPoShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 2090, 160, 30));

        cb6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });
        jPanel1.add(cb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1300, -1, -1));

        cat6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1300, 220, -1));

        sup6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1300, 210, -1));

        bra6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1300, 200, -1));

        ite6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1300, 230, -1));

        qty6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty6.setText("0");
        qty6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty6ActionPerformed(evt);
            }
        });
        jPanel1.add(qty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1300, 70, -1));

        cost6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost6.setText("0");
        jPanel1.add(cost6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1300, 180, -1));

        totCost6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost6.setText("0");
        jPanel1.add(totCost6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1300, 180, -1));

        cost7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost7.setText("0");
        jPanel1.add(cost7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1340, 180, -1));

        totCost7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost7.setText("0");
        jPanel1.add(totCost7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1340, 180, -1));

        qty7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty7.setText("0");
        jPanel1.add(qty7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1340, 70, -1));

        ite7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1340, 230, -1));

        sup7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1340, 210, -1));

        bra7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1340, 200, -1));

        cat7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1340, 220, -1));

        cb7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });
        jPanel1.add(cb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1340, -1, -1));

        cb8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });
        jPanel1.add(cb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1380, -1, -1));

        cat8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1380, 220, -1));

        sup8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1380, 210, -1));

        bra8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1380, 200, -1));

        ite8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1380, 230, -1));

        qty8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty8.setText("0");
        jPanel1.add(qty8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1380, 70, -1));

        cost8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost8.setText("0");
        jPanel1.add(cost8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1380, 180, -1));

        totCost8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost8.setText("0");
        jPanel1.add(totCost8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1380, 180, -1));

        totCost9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost9.setText("0");
        jPanel1.add(totCost9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1420, 180, -1));

        cost9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost9.setText("0");
        jPanel1.add(cost9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1420, 180, -1));

        qty9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty9.setText("0");
        jPanel1.add(qty9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1420, 70, -1));

        ite9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1420, 230, -1));

        bra9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        bra9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bra9ActionPerformed(evt);
            }
        });
        jPanel1.add(bra9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1420, 200, -1));

        sup9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1420, 210, -1));

        cat9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1420, 220, -1));

        cb9.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb9ActionPerformed(evt);
            }
        });
        jPanel1.add(cb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1420, -1, -1));

        cb10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb10ActionPerformed(evt);
            }
        });
        jPanel1.add(cb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1460, -1, -1));

        cat10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(cat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1460, 220, -1));

        sup10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(sup10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1460, 210, -1));

        bra10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(bra10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1460, 200, -1));

        ite10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jPanel1.add(ite10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1460, 230, -1));

        qty10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        qty10.setText("0");
        jPanel1.add(qty10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 1460, 70, -1));

        cost10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cost10.setText("0");
        jPanel1.add(cost10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 1460, 180, -1));

        totCost10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        totCost10.setText("0");
        jPanel1.add(totCost10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1460, 180, -1));

        jLabel54.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel54.setText("(HP, EMC, etc.)");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1070, -1, -1));

        jLabel59.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel59.setText("Category ");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1040, -1, -1));

        jLabel60.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel60.setText("Supplier ");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 1040, -1, -1));

        jLabel61.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel61.setText("Brand");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1070, -1, -1));

        jLabel62.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel62.setText("_______________");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1230, -1, -1));

        jLabel67.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel67.setText("Qty");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 1070, -1, -1));

        jLabel68.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel68.setText("Cost");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 1070, 40, -1));

        jLabel69.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel69.setText("(hw,sw,services, others)");
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1070, -1, -1));

        jLabel70.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel70.setText("Price");
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 1070, -1, -1));

        jLabel71.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel71.setText("Item");
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1070, -1, -1));

        jLabel72.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel72.setText("Check the box");
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1250, -1, 30));

        jLabel73.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel73.setText("if the item is");
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1280, -1, -1));

        jLabel74.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel74.setText("overseas and");
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1300, -1, -1));

        jLabel75.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel75.setText("hardware");
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1320, -1, -1));

        jLabel76.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel76.setText("_______________");
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1330, -1, -1));

        jPanel4.setBackground(new java.awt.Color(16, 24, 32));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel77.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("SANDZ SOLUTIONS PHILIPPINES INC.");

        jLabel78.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("SALES ORDER FORM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78))
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 1400, 240));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 2700, 700, 1950));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel10.setText("10.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1460, 30, -1));

        jLabel79.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel79.setText("1.");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1100, 20, -1));

        jLabel80.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel80.setText("2.");
        jPanel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1140, 20, -1));

        jLabel81.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel81.setText("3.");
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1180, 20, -1));

        jLabel82.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel82.setText("4.");
        jPanel1.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1220, 20, -1));

        jLabel83.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel83.setText("5.");
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1260, 20, -1));

        jLabel84.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel84.setText("6.");
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1300, 20, -1));

        jLabel85.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel85.setText("7.");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1340, 20, -1));

        jLabel86.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel86.setText("8.");
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1380, 20, -1));

        jLabel87.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel87.setText("9.");
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1420, 20, -1));

        jLabel88.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel88.setText("1. Upon Customer PO: ");
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2100, -1, -1));

        jLabel89.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel89.setText("(AR - please input # of months)");
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1650, -1, 30));

        jLabel90.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel90.setText("(to be accomplished by Finance)");
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1690, -1, 30));

        jLabel91.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel91.setText(" (VAN-PhP1500 within Metro Manila; 2500 outside Metro Manila)");
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1610, 330, 30));

        jLabel92.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel92.setText("(to be accomplished by Finance)");
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1560, -1, 40));

        jLabel93.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel93.setText("(Contingency - please purpose after the cell)");
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1760, -1, 40));

        invalid.setFont(new java.awt.Font("Trebuchet MS", 3, 13)); // NOI18N
        invalid.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 170, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(5717, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb10ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb9ActionPerformed

    private void bra9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bra9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bra9ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb7ActionPerformed

    private void qty6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty6ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb6ActionPerformed

    private void otherCostOfPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherCostOfPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherCostOfPerActionPerformed

    private void cusAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusAccActionPerformed

    private void cusDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusDelActionPerformed

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void targetNetProfitPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetNetProfitPercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetNetProfitPercentActionPerformed

    private void cosMonPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosMonPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosMonPerActionPerformed

    private void forlossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forlossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forlossActionPerformed

    private void cosMonthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosMonthsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosMonthsActionPerformed

    private void outsideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outsideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outsideActionPerformed

    private void othersOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_othersOthersActionPerformed

    private void vatLossPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatLossPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatLossPerActionPerformed

    private void otherCostOfMosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherCostOfMosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherCostOfMosActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    private void bra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bra4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bra4ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void qty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed

        //       JCheckBox check1 = new JCheckBox();
        //       check1.setSelected(false);
        //       if (check1.isSelected()) {
            //
    }//GEN-LAST:event_cb1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        
       try{
           area.print();
       }
       catch(Exception e){
       }
    }//GEN-LAST:event_printActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DecimalFormat df = new DecimalFormat("#,###,##0.00");
       
//       try{
//       double ex = Double.parseDouble(vatEx.getText());
//       }
//        catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(null,"Illegal Characters found in your input.");
//        }
        double totalContractValueVatEx = Double.parseDouble(vatEx.getText());
        double totalContractValueVatInc;
        totalContractValueVatInc = totalContractValueVatEx * 1.12;
        vatInc.setText(String.valueOf(df.format(totalContractValueVatInc)));

        double targetNetProfitPer = Double.parseDouble(targetNetProfitPercent.getText());
        double targetNetProfitAbsoluteAmount;
        targetNetProfitAbsoluteAmount = totalContractValueVatEx * (targetNetProfitPer/100);
        targetNetProfitAbsAmt.setText(String.valueOf(df.format(targetNetProfitAbsoluteAmount)));

        double targetCostToMan;
        targetCostToMan = totalContractValueVatEx - targetNetProfitAbsoluteAmount;
        targetCostToManage.setText(String.valueOf(df.format(targetCostToMan)));

        double quantity1 = Double.parseDouble(qty1.getText());
        double itemPrice1 = Double.parseDouble(cost1.getText());
        double itemCost1;
        itemCost1 = quantity1 * itemPrice1;
        totCost1.setText(String.valueOf(itemCost1));

        double quantity2 = Double.parseDouble(qty2.getText());
        double itemPrice2 = Double.parseDouble(cost2.getText());
        double itemCost2;
        itemCost2 = quantity2 * itemPrice2;
        totCost2.setText(String.valueOf(itemCost2));

        double quantity3 = Double.parseDouble(qty3.getText());
        double itemPrice3 = Double.parseDouble(cost3.getText());
        double itemCost3;
        itemCost3 = quantity3 * itemPrice3;
        totCost3.setText(String.valueOf(itemCost3));

        double quantity4 = Double.parseDouble(qty4.getText());
        double itemPrice4 = Double.parseDouble(cost4.getText());
        double itemCost4;
        itemCost4 = quantity4 * itemPrice4;
        totCost4.setText(String.valueOf(itemCost4));

        double quantity5 = Double.parseDouble(qty5.getText());
        double itemPrice5 = Double.parseDouble(cost5.getText());
        double itemCost5;
        itemCost5 = quantity5 * itemPrice5;
        totCost5.setText(String.valueOf(itemCost5));
        
        double quantity6 = Double.parseDouble(qty6.getText());
        double itemPrice6 = Double.parseDouble(cost6.getText());
        double itemCost6;
        itemCost6 = quantity6 * itemPrice6;
        totCost6.setText(String.valueOf(itemCost6));
        
         double quantity7 = Double.parseDouble(qty7.getText());
        double itemPrice7 = Double.parseDouble(cost7.getText());
        double itemCost7;
        itemCost7 = quantity7 * itemPrice7;
        totCost7.setText(String.valueOf(itemCost7));
        
         double quantity8 = Double.parseDouble(qty8.getText());
        double itemPrice8 = Double.parseDouble(cost8.getText());
        double itemCost8;
        itemCost8 = quantity8 * itemPrice8;
        totCost8.setText(String.valueOf(itemCost8));
        
         double quantity9 = Double.parseDouble(qty9.getText());
        double itemPrice9 = Double.parseDouble(cost9.getText());
        double itemCost9;
        itemCost9 = quantity9 * itemPrice9;
        totCost9.setText(String.valueOf(itemCost9));
        
         double quantity10 = Double.parseDouble(qty10.getText());
        double itemPrice10 = Double.parseDouble(cost10.getText());
        double itemCost10;
        itemCost10 = quantity10 * itemPrice10;
        totCost10.setText(String.valueOf(itemCost10));

        double totalDirectCost;
        totalDirectCost = itemCost1+itemCost2+itemCost3+itemCost4+itemCost5+itemCost6+itemCost7+itemCost8+itemCost9+itemCost10;
        totDirect.setText(String.valueOf(df.format(totalDirectCost)));

        double shipping;
        double ship1;
        double ship2;
        double ship3;
        double ship4;
        double ship5;
        double ship6;
        double ship7;
        double ship8;
        double ship9;
        double ship10;
        if( cb1.isSelected()){
            ship1 = itemCost1;
        }
        else{
            ship1 = 0;
        }

        if( cb2.isSelected()){
            ship2 = itemCost2;
        }
        else{
            ship2 = 0;
        }

        if( cb3.isSelected()){
            ship3 = itemCost3;
        }
        else{
            ship3 = 0;
        }

        if( cb4.isSelected()){
            ship4 = itemCost5;
        }
        else{
            ship4 = 0;
        }

        if( cb5.isSelected()){
            ship5 = itemCost5;
        }
        else{
            ship5 = 0;
        }
         if( cb6.isSelected()){
            ship6 = itemCost6;
        }
        else{
            ship6 = 0;
        }

        if( cb7.isSelected()){
            ship7 = itemCost7;
        }
        else{
            ship7 = 0;
        }

        if( cb8.isSelected()){
            ship8 = itemCost8;
        }
        else{
            ship8 = 0;
        }

        if( cb9.isSelected()){
            ship9 = itemCost9;
        }
        else{
            ship9 = 0;
        }

        if( cb10.isSelected()){
            ship10 = itemCost10;
        }
        else{
            ship10 = 0;
        }
        double ship = ship1 + ship2 + ship3 + ship4 + ship5+ ship6+ ship7+ ship8+ ship9+ ship10;

        double shipPercentage = Double.parseDouble(perShip.getText());
        shipping = (shipPercentage /100) * ship;
        shipDisplay.setText(String.valueOf(df.format(shipping)));

        double costOfMoneyPercentage = Double.parseDouble(cosMonPer.getText());
        double costOfMoneyMonths = Double.parseDouble(cosMonths.getText());
        double costOfMoney;
        costOfMoney =  ((costOfMoneyPercentage/100) * totalContractValueVatInc)*costOfMoneyMonths;
        moneyDisplay.setText(String.valueOf(df.format(costOfMoney)));

        double forexLoss = Double.parseDouble(forloss.getText());
        forDisplay.setText(String.valueOf(forexLoss));

        double municipalTax;
        municipalTax = totalContractValueVatEx * 0.01;
        muniTax.setText(String.valueOf(df.format(municipalTax)));

        double totalIndirect;

        double trucking = 0 ;
        if(inside.isSelected()){
            trucking = 1500;
            truckDisplay.setText(String.valueOf(1500));

        }
        else if(outside.isSelected()){

            trucking = 2500;
            truckDisplay.setText(String.valueOf(2500));

        }
        double othersIndirect;
        othersIndirect = Double.parseDouble(othersIndi.getText());

        totalIndirect = shipping + costOfMoney + forexLoss + municipalTax + trucking + othersIndirect;
        totIndirect.setText(String.valueOf(df.format(totalIndirect)));

        double otherCostOfMoneyPercentage = Double.parseDouble(otherCostOfPer.getText());
        double otherCostOfMoneyMonths = Double.parseDouble(otherCostOfMos.getText());
        double otherCostOfMoney;
        otherCostOfMoney = (totalContractValueVatInc * .10)* (otherCostOfMoneyMonths * 12) * (otherCostOfMoneyPercentage/100);
        otherCostOfMon.setText(String.valueOf(df.format(otherCostOfMoney)));

        double vatLossPercentage =  Double.parseDouble(vatLossPer.getText());
        double vatLoss;
        vatLoss = totalContractValueVatEx * (vatLossPercentage /100);
        vatLos.setText(String.valueOf(df.format(vatLoss)));

        double otherOther;
        otherOther=  Double.parseDouble(othersOthers.getText());

        double totalOtherCost;
        totalOtherCost = otherCostOfMoney + vatLoss + otherOther;
        totOtherCost.setText(String.valueOf(df.format(totalOtherCost)));

        double totalCost;
        totalCost = totalIndirect + totalOtherCost + totalDirectCost;
        totCost.setText(String.valueOf(df.format(totalCost)));

        actTotCost.setText(String.valueOf(df.format(totalCost)));

        //double vatLossPercentage =  Double.parseDouble(vatLossPer.getText())
        double actualNetProfitAbsoluteAmount;
        actualNetProfitAbsoluteAmount = totalContractValueVatEx - totalCost;
        actNetProAbsAmt.setText(String.valueOf(df.format(actualNetProfitAbsoluteAmount)));

        double actualNetProfitPercentage;
        actualNetProfitPercentage = (actualNetProfitAbsoluteAmount / totalContractValueVatEx)*100;
        actNetProPer.setText(String.valueOf(df.format(actualNetProfitPercentage)));

        double balance;
        balance = targetCostToMan - totalCost;
        bal.setText(String.valueOf(df.format(balance)));

        try{
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date firstDate = jDateChooser1.getDate();
            Date secondDate = jDateChooser2.getDate();
            Date thirdDate = jDateChooser3.getDate();

            long diffInMillies = Math.abs( thirdDate.getTime() - secondDate.getTime());
            long diffInMilliess = Math.abs( secondDate.getTime() - firstDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMilliess, TimeUnit.MILLISECONDS);
            long diff1 = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            totDate.setText(String.valueOf(diff+diff1));
        }catch (Exception e) {
            e.printStackTrace();
        }

        double customerPo =  Double.parseDouble(cusPo.getText());
        double uponCustomerPo;
        uponCustomerPo = (customerPo / 100)* totalContractValueVatInc;
        cusPoShow.setText(String.valueOf(df.format(uponCustomerPo)));

        double customerDelivery =  Double.parseDouble(cusDel.getText());
        double uponCustomerDelivery;
        uponCustomerDelivery = (customerDelivery / 100)* totalContractValueVatInc;
        cusDelShow.setText(String.valueOf(df.format(uponCustomerDelivery)));

        double customerAcceptance =  Double.parseDouble(cusAcc.getText());
        double uponCustomerAcceptance;
        uponCustomerAcceptance = (customerAcceptance / 100)* totalContractValueVatInc;
        cusAccShow.setText(String.valueOf(df.format(uponCustomerAcceptance)));

        double totalPercentage;
        totalPercentage =  customerPo + customerDelivery + customerAcceptance;
        totPer.setText(String.valueOf(df.format(totalPercentage)));

        double totalPayment;
        totalPayment = uponCustomerPo + uponCustomerDelivery + uponCustomerAcceptance;
        totPayment.setText(String.valueOf(df.format( totalPayment)));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
     
                area.setText( "****************************************************************************************************************\n");
                area.setText(area.getText() +"\t\t\t\t          SANDZ SOLUTIONS PHILIPPINES INC.,\t\t\t\n");
                area.setText(area.getText() + "\t\t\t\t\t          Sales Order Form \t\t\t\n");
                area.setText(area.getText() + "****************************************************************************************************************\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\tCustomer Name:  " + customerName.getText()+ "\n");
                area.setText(area.getText() + "\tProject Name:  " + projectName.getText()+"\n");
                area.setText(area.getText() + "\tContact Person:  " + contactPerson.getText()+ "\n");
                area.setText(area.getText() + "\tDesignation:  " + designation.getText()+ "\n");
                area.setText(area.getText() + "\tContact Details:  " + contactDetails.getText() + "\n");
                area.setText(area.getText()+ "\tDate Submitted: "+ jDateChooser5.getDate()+"\n");
                area.setText(area.getText() + "\tPO Number: "+ poNumber.getText()+"\n");
                area.setText(area.getText() + "\tDate Of PO: "+ jDateChooser6.getDate()+"\n");
                area.setText(area.getText() + "\tCustomer Delivery Date: "+ jDateChooser5.getDate()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "****************************************************************************************************************\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\tI. " + "\n");
                area.setText(area.getText() + "\t\tTotal Contract Value (VAT INC):  " + vatInc.getText()+ "\n");
                area.setText(area.getText() + "\t\tTotal Contract Value (VAT EX):  " + vatEx.getText()+ "\n");
                area.setText(area.getText() + "\tII. " + "\n");
                area.setText(area.getText() + "\t\tTarget Net Profit(in %):  " + targetNetProfitPercent.getText()+ "\n");
                area.setText(area.getText() + "\t\tTarget Net Profit(Absolute Amount):  " + targetNetProfitAbsAmt.getText()+ "\n");
                area.setText(area.getText() + "\t\tActual Net Profit(in %):  " + actNetProPer.getText()+ "\n");
                area.setText(area.getText() + "\t\tActual Net Profit(Absolute Amount):  " + actNetProAbsAmt.getText()+ "\n");
                area.setText(area.getText() + "\tIII. " + "\n");
                area.setText(area.getText() + "\t\tTarget Cost to Manage:  " + targetCostToManage.getText()+ "\n");
                area.setText(area.getText() + "\t\tActual Total Cost:  " + actTotCost.getText()+ "\n");
                area.setText(area.getText() + "\t\tBalance:  " + bal.getText()+ "\n");
                area.setText(area.getText() + "\tIV. Cost Computation" + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\t     A.DIRECT COST");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t1."+"Category: " +cat1.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup1.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra1.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite1.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty1.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost1.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost1.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t2."+"Category: " +cat2.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup2.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra2.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite2.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty2.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost2.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost2.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t3."+"Category: " +cat3.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup3.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra3.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite3.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty3.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost3.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost3.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t4."+"Category: " +cat4.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup4.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra4.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite4.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity:  "+qty4.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost4.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost4.getText()+"\n");
                 area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t5."+"Category: " +cat5.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup5.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra5.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite5.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty5.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost5.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost5.getText()+"\n");
                 area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t6."+"Category: " +cat6.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup6.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra6.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite6.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty6.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost6.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost6.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t7."+"Category: " +cat7.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup7.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra7.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite7.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty7.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost7.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost7.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t8."+"Category: " +cat8.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup8.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra8.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite8.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty8.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost8.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost8.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t9."+"Category: " +cat9.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup9.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra9.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite9.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty9.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost9.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost9.getText()+"\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t10."+"Category: " +cat10.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Supplier: "+sup10.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Brand: "+bra10.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Item: "+ite10.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Quantity: "+qty10.getText()+"\n"); 
                area.setText(area.getText() +"\t\t"+"Price: "+cost10.getText()+"\n");
                area.setText(area.getText() +"\t\t"+"Cost: "+totCost10.getText()+"\n");
                area.setText(area.getText() + "\n"); 
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\t\t\tTotal Direct Cost:"+ totDirect.getText()+ "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\t     B.INDIRECT COST");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t1."+"Shipping:  " +shipDisplay.getText()+"\n");
                area.setText(area.getText() +"\t\t2."+"Trucking Internal:  " +truckDisplay.getText()+"\n");
                area.setText(area.getText() +"\t\t3."+"Cost Of Money:  " +moneyDisplay.getText()+"\n");
                area.setText(area.getText() +"\t\t4."+"Forex Loss:  " +forDisplay.getText()+"\n");
                area.setText(area.getText() +"\t\t5."+"Municipal Tax:  " +muniTax.getText()+"\n");
                area.setText(area.getText() +"\t\t6."+"Others:  " +othersIndi.getText()+"\n");
                area.setText(area.getText() + "\t\t\tTotal Indirect Cost:"+ totIndirect.getText()+ "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\t     C.OTHER COST");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() +"\t\t1."+"Cost Of Money:  " +otherCostOfMon.getText()+"\n");
                area.setText(area.getText() +"\t\t2."+"VAT Loss:  " +vatLos.getText()+"\n");
                area.setText(area.getText() +"\t\t3."+"Others:  "+ othersOthers.getText()+"\n");
                area.setText(area.getText() + "\t\t\tTotal Other Cost:"+ totOtherCost.getText()+ "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\t    D.TOTAL COST:     " + totCost.getText());
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\tV. Payment Terms" + "\n");
                area.setText(area.getText() +"\t\t1."+"Cost Of Money:  "+ otherCostOfMon.getText()+"\n");
                area.setText(area.getText() +"\t\t2."+"VAT Loss:  "+ vatLos.getText()+"\n");
                area.setText(area.getText() +"\t\t1."+"Others:  "+ othersOthers.getText()+"\n");
                area.setText(area.getText() + "\t\t\tTotal Date:"+ totDate.getText()+ "\n");
                area.setText(area.getText() + "\t\t\tTotal Payment:"+ totPayment.getText()+ "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\tVI. Principal Codes (For Loading - Please Fill Up Related Codes)" + "\n");
                area.setText(area.getText() +"\t\t1."+"HP Claim Code:  "+ hpCode.getText()+"\n");
                area.setText(area.getText() +"\t\t2."+"EMC Cart:  "+ EmcNum.getText()+"\n");
                area.setText(area.getText() +"\t\t1."+"EMC Deal Registration:  "+ EmcReg.getText()+"\n");
                 area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\n");
                area.setText(area.getText() + "\tVII. Special Instructions" + "\n");
                area.setText(area.getText() +"\t\t"+ special.getText()+"\n");
                
               
                
                
          
                                        
    }//GEN-LAST:event_generateActionPerformed

    private void vatExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatExActionPerformed
//        try{
//         double totalContractValueVatEx =Double.parseDouble(vatEx.getText());
//       }
//        catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(null,"Please remove the illegal characters in your input! ");
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_vatExActionPerformed

    private void vatExKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatExKeyTyped
       try{
        double ex =Double.parseDouble(vatEx.getText());
         invalid.setText("");
     }
       catch(NumberFormatException e){
           invalid.setText("*Invalid Numbers");
           
       }
    }//GEN-LAST:event_vatExKeyTyped

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
            java.util.logging.Logger.getLogger(SalesOrderFormSandz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesOrderFormSandz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesOrderFormSandz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesOrderFormSandz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SalesOrderFormSandz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmcNum;
    private javax.swing.JTextField EmcReg;
    private javax.swing.JLabel actNetProAbsAmt;
    private javax.swing.JLabel actNetProPer;
    private javax.swing.JLabel actTotCost;
    private javax.swing.JTextArea area;
    private javax.swing.JLabel bal;
    private javax.swing.JTextField bra1;
    private javax.swing.JTextField bra10;
    private javax.swing.JTextField bra2;
    private javax.swing.JTextField bra3;
    private javax.swing.JTextField bra4;
    private javax.swing.JTextField bra5;
    private javax.swing.JTextField bra6;
    private javax.swing.JTextField bra7;
    private javax.swing.JTextField bra8;
    private javax.swing.JTextField bra9;
    private javax.swing.JTextField cat1;
    private javax.swing.JTextField cat10;
    private javax.swing.JTextField cat2;
    private javax.swing.JTextField cat3;
    private javax.swing.JTextField cat4;
    private javax.swing.JTextField cat5;
    private javax.swing.JTextField cat6;
    private javax.swing.JTextField cat7;
    private javax.swing.JTextField cat8;
    private javax.swing.JTextField cat9;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private javax.swing.JTextField contactDetails;
    private javax.swing.JTextField contactPerson;
    private javax.swing.JTextField cosMonPer;
    private javax.swing.JTextField cosMonths;
    private javax.swing.JTextField cost1;
    private javax.swing.JTextField cost10;
    private javax.swing.JTextField cost2;
    private javax.swing.JTextField cost3;
    private javax.swing.JTextField cost4;
    private javax.swing.JTextField cost5;
    private javax.swing.JTextField cost6;
    private javax.swing.JTextField cost7;
    private javax.swing.JTextField cost8;
    private javax.swing.JTextField cost9;
    private javax.swing.JTextField cusAcc;
    private javax.swing.JLabel cusAccShow;
    private javax.swing.JTextField cusDel;
    private javax.swing.JLabel cusDelShow;
    private javax.swing.JTextField cusPo;
    private javax.swing.JLabel cusPoShow;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel forDisplay;
    private javax.swing.JTextField forloss;
    private javax.swing.JButton generate;
    private javax.swing.JTextField hpCode;
    private javax.swing.JRadioButton inside;
    private javax.swing.JLabel invalid;
    private javax.swing.JTextField ite1;
    private javax.swing.JTextField ite10;
    private javax.swing.JTextField ite2;
    private javax.swing.JTextField ite3;
    private javax.swing.JTextField ite4;
    private javax.swing.JTextField ite5;
    private javax.swing.JTextField ite6;
    private javax.swing.JTextField ite7;
    private javax.swing.JTextField ite8;
    private javax.swing.JTextField ite9;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JLabel moneyDisplay;
    private javax.swing.JLabel muniTax;
    private javax.swing.JLabel otherCostOfMon;
    private javax.swing.JTextField otherCostOfMos;
    private javax.swing.JTextField otherCostOfPer;
    private javax.swing.JTextField othersIndi;
    private javax.swing.JTextField othersOthers;
    private javax.swing.JRadioButton outside;
    private javax.swing.JTextField perShip;
    private javax.swing.JTextField poNumber;
    private javax.swing.JButton print;
    private javax.swing.JTextField projectName;
    private javax.swing.JTextField qty1;
    private javax.swing.JTextField qty10;
    private javax.swing.JTextField qty2;
    private javax.swing.JTextField qty3;
    private javax.swing.JTextField qty4;
    private javax.swing.JTextField qty5;
    private javax.swing.JTextField qty6;
    private javax.swing.JTextField qty7;
    private javax.swing.JTextField qty8;
    private javax.swing.JTextField qty9;
    private javax.swing.JLabel shipDisplay;
    private javax.swing.JTextField special;
    private javax.swing.JTextField sup1;
    private javax.swing.JTextField sup10;
    private javax.swing.JTextField sup2;
    private javax.swing.JTextField sup3;
    private javax.swing.JTextField sup4;
    private javax.swing.JTextField sup5;
    private javax.swing.JTextField sup6;
    private javax.swing.JTextField sup7;
    private javax.swing.JTextField sup8;
    private javax.swing.JTextField sup9;
    private javax.swing.JLabel targetCostToManage;
    private javax.swing.JLabel targetNetProfitAbsAmt;
    private javax.swing.JTextField targetNetProfitPercent;
    private javax.swing.JLabel totCost;
    private javax.swing.JLabel totCost1;
    private javax.swing.JLabel totCost10;
    private javax.swing.JLabel totCost2;
    private javax.swing.JLabel totCost3;
    private javax.swing.JLabel totCost4;
    private javax.swing.JLabel totCost5;
    private javax.swing.JLabel totCost6;
    private javax.swing.JLabel totCost7;
    private javax.swing.JLabel totCost8;
    private javax.swing.JLabel totCost9;
    private javax.swing.JLabel totDate;
    private javax.swing.JLabel totDirect;
    private javax.swing.JLabel totIndirect;
    private javax.swing.JLabel totOtherCost;
    private javax.swing.JLabel totPayment;
    private javax.swing.JTextField totPer;
    private javax.swing.JTextField truckDisplay;
    private javax.swing.JTextField vatEx;
    private javax.swing.JLabel vatInc;
    private javax.swing.JLabel vatLos;
    private javax.swing.JTextField vatLossPer;
    // End of variables declaration//GEN-END:variables
}
