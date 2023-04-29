
/**
 *
 * @author tejas eknath jogale
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class Add_Librarian_Frame extends javax.swing.JFrame {

    static Add_Librarian_Frame alf;
    private DialogSetterClass dsc = new DialogSetterClass();
    private Connection con = null;
    private PreparedStatement pst;
    private Statement selectPst;
    private Date cd;

    public Add_Librarian_Frame() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        String s = "Add_Librarian.png";
        slf.setLogo(lbFrameLogo, s);
        cd = new Date();
        getTopId();
    }

    private void getTopId() {
        try {

            MyConnectionClass mcc = new MyConnectionClass();
            con = mcc.returnConObj();
            selectPst = con.createStatement();
            ResultSet rs = selectPst.executeQuery("SELECT librarian_id FROM librarian where librarian_id=( SELECT max(librarian_id) from librarian)");
            if (rs.next()) {
                String CurLibId = Integer.toString(rs.getInt("librarian_id") + 1);
                tfLibId.setText(CurLibId);
            }
            selectPst.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeItBlank() {
        tfLibAddress.setText("");
        tfLibCity.setText("");
        tfLibContact.setText("");
        tfLibEmail.setText("");
        tfLibId.setText("");
        tfLibJoinDate.setText("");
        tfLibName.setText("");
        tfLibPass.setText("");
        cbCurDate.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfLibId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfLibName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfLibEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfLibCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfLibContact = new javax.swing.JTextField();
        btnAddLib = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        tfLibPass = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfLibAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfLibJoinDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbCurDate = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Enter librarian ID :- ");

        tfLibId.setEditable(false);
        tfLibId.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfLibId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLibIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Enter librarian name :-");

        tfLibName.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibName.setToolTipText("With this Name and Password the Librarian you add will Login into the system.");
        tfLibName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfLibName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLibNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Enter password :-");
        jLabel4.setToolTipText("With this Name and Password the Librarian you add will Login into the system.");

        jLabel5.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Enter e-mail :-");

        tfLibEmail.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfLibEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLibEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Enter address :-");

        jLabel7.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Enter city :-");

        tfLibCity.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Enter contact no.:- ");

        tfLibContact.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        btnAddLib.setBackground(new java.awt.Color(255, 153, 51));
        btnAddLib.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAddLib.setForeground(new java.awt.Color(255, 255, 255));
        btnAddLib.setText("Add Librarian");
        btnAddLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLibActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 153, 51));
        btnBack.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tfLibPass.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibPass.setToolTipText("With this Name and Password the Librarian you add will Login into the system.");
        tfLibPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        tfLibAddress.setColumns(10);
        tfLibAddress.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibAddress.setLineWrap(true);
        tfLibAddress.setRows(4);
        tfLibAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfLibAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(tfLibAddress);
        tfLibAddress.getAccessibleContext().setAccessibleParent(jPanel1);

        jLabel9.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(249, 103, 1));
        jLabel9.setText("ENTER FOLLOWING DETAILS OF THE PERSON TO ADD HIM AS LIBRARIAN IN OUR LIBRARY :-");

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Enter Joining Date :-");

        tfLibJoinDate.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfLibJoinDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("Want to set current date ? then check this box");

        cbCurDate.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        cbCurDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCurDateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(167, 151, 133));
        jLabel11.setText("Date Format is dd/mm/yy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnAddLib, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLibName)
                                    .addComponent(tfLibId, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(tfLibPass)
                                    .addComponent(tfLibEmail)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLibContact)
                                        .addComponent(tfLibCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(132, 132, 132))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLibJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCurDate)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddLib, btnBack});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfLibCity, tfLibContact, tfLibId, tfLibJoinDate, tfLibName, tfLibPass});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLibId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLibName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLibPass))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLibEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLibCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLibContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfLibJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbCurDate)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddLib, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(23, 23, 23))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddLib, btnBack});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfLibCity, tfLibContact, tfLibEmail, tfLibId, tfLibJoinDate, tfLibName, tfLibPass});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel8});

        tfLibPass.getAccessibleContext().setAccessibleDescription("");

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

    private void tfLibNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLibNameActionPerformed
    }//GEN-LAST:event_tfLibNameActionPerformed

    private void tfLibEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLibEmailActionPerformed
    }//GEN-LAST:event_tfLibEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        alf.dispose();
        Admin_Logged_in.main(new String[]{});
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLibActionPerformed
        if (tfLibName.getText().isEmpty() || tfLibPass.getText().isEmpty() || tfLibEmail.getText().isEmpty() || tfLibAddress.getText().isEmpty() || tfLibCity.getText().isEmpty() || tfLibContact.getText().isEmpty()) {
            dsc.setEmptyFielidDialog(alf, "Please fill up all details.", "Empty Fields Detected");
        } else {
            String LibName = tfLibName.getText();
            String LibPass = tfLibPass.getText();
            String LibEmail = tfLibEmail.getText();
            String LibAdd = tfLibAddress.getText();
            String LibCity = tfLibCity.getText();
            String LibContact = tfLibContact.getText();
            String LibDate = tfLibJoinDate.getText();
            if (LibPass.length() > 8) {
                if (LibEmail.contains("@") && LibEmail.endsWith(".com")) {
                    if (LibContact.matches("\\d+") && LibContact.length() == 10) {
                        if (LibDate.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                            try {
                                pst = con.prepareStatement("INSERT INTO librarian (librarian_name, librarian_password, librarian_email, librarian_address, librarian_city, librarian_contact,librarian_date_of_join) VALUES ('" + LibName + "','" + LibPass + "','" + LibEmail + "','" + LibAdd + "','" + LibCity + "','" + LibContact + "','" + LibDate + "')");
                                int i = pst.executeUpdate();
                                if (i == 1) {
                                    dsc.setLibAddedDialog(alf);
                                    makeItBlank();
                                    getTopId();
                                }
                                pst.close();
                                con.close();
                            } catch (java.sql.SQLIntegrityConstraintViolationException SCE) {
                                dsc.setDuplicateDataDialog(alf);
                                SCE.printStackTrace();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            dsc.setEmptyFielidDialog(alf, "Please Enter Correct Date Format like :-\n01/01/2021", "Invalid Date Format");
                        }
                    } else {
                        dsc.setEmptyFielidDialog(alf, "Please enter valid Contact number.", "Invalid Contact !!!");
                    }
                } else {
                    dsc.setEmptyFielidDialog(alf, "Please enter valid E-mail.", "Invalid E-Mail !!!");
                }
            } else {
                dsc.setEmptyFielidDialog(alf, "Password must be greater than 8.", "Password Length Warning !!!");
            }
        }
    }//GEN-LAST:event_btnAddLibActionPerformed

    private void cbCurDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCurDateActionPerformed

        if (cbCurDate.isSelected()) {
            //String CurDate = cd.getDate() + "/" + (cd.getMonth() + 1) + "/" + (cd.getYear() + 1900);
            final String pattern = "dd/MM/yyyy";
            String CurDate = new SimpleDateFormat(pattern).format(new Date());
            tfLibJoinDate.setText(CurDate);
            tfLibJoinDate.setEditable(false);
        }
        if (!cbCurDate.isSelected()) {
            tfLibJoinDate.setText("");
            tfLibJoinDate.setEditable(true);
            tfLibJoinDate.requestFocus(true);
        }
    }//GEN-LAST:event_cbCurDateActionPerformed

    private void tfLibIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLibIdActionPerformed
    }//GEN-LAST:event_tfLibIdActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Librarian_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Librarian_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Librarian_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Librarian_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                alf = new Add_Librarian_Frame();
                alf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLib;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox cbCurDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFrameLogo;
    private javax.swing.JTextArea tfLibAddress;
    private javax.swing.JTextField tfLibCity;
    private javax.swing.JTextField tfLibContact;
    private javax.swing.JTextField tfLibEmail;
    private javax.swing.JTextField tfLibId;
    private javax.swing.JTextField tfLibJoinDate;
    private javax.swing.JTextField tfLibName;
    private javax.swing.JPasswordField tfLibPass;
    // End of variables declaration//GEN-END:variables
}
