

/**
 *
 * @author tejas eknath jogale
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Issue_Books_Frame extends javax.swing.JFrame {

    static Issue_Books_Frame ibf;
    private DialogSetterClass dsc = new DialogSetterClass();
    private Connection con = null;
    private Date cd;
    String Btitle, Bauthor, Bedition, StuRollStr, stuName, StuClass, doi;
    int stuRoll;

    public Issue_Books_Frame() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        //String s = "issue_book(one_hand).png";
        String s = "issue_book(two_hand).png";
        slf.setLogo(lbFrameLogo, s);
        MyConnectionClass mcc = new MyConnectionClass();
        con = mcc.returnConObj();
        cd = new Date();
    }

    private void makeItBlank(){
        tfBookAuthor.setText("");
        tfBookEdition.setText("");
        tfBookTitle.setText("");
        tfDateOfIssue.setText("");
        tfStudClass.setText("");
        tfStudName.setText("");
        tfStudRoll.setText("");
        cbAddCurDate.setSelected(false);
    }
    
    private void UpdateBookTable(int quantity) {
        try {
            PreparedStatement pst = con.prepareStatement("UPDATE books SET book_quantity =? WHERE book_title=? and book_edition_no=? and book_author=?");
            int newQuantity = quantity - 1;
            pst.setInt(1, newQuantity);
            pst.setString(2, Btitle);
            pst.setString(3, Bedition);
            pst.setString(4, Bauthor);

            int result1 = pst.executeUpdate();
            if (result1 > 0) {
                dsc.setEmptyFielidDialog(ibf, "Updated book table", "Successfully Issued");
            } else {
                dsc.setBookProblemDialog(ibf, "Book Table is not updated,Due to some error", "Book Table Not Updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
            dsc.setDatabaseErrorDialog(ibf);
        }
    }

    private void MakeItIssued() {
        try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO issue_books (book_title, book_author,book_edition_no, student_roll_num, student_name, student_class, date_of_issue) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, Btitle);
            pst.setString(2, Bauthor);
            pst.setString(3, Bedition);
            pst.setInt(4, stuRoll);
            pst.setString(5, stuName);
            pst.setString(6, StuClass);
            pst.setString(7, doi);

            int result1 = pst.executeUpdate();
            if (result1 > 0) {
                dsc.setBookIssuedDialog(ibf);
                makeItBlank();
            } else {
                dsc.setBookNotIssuedDialog(ibf);
            }
        } catch (Exception e) {
            e.printStackTrace();
            dsc.setDatabaseErrorDialog(ibf);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBookTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfBookAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfStudName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfStudClass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDateOfIssue = new javax.swing.JTextField();
        btnIssueBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbAddCurDate = new javax.swing.JCheckBox();
        tfStudRoll = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfBookEdition = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));

        jLabel9.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(249, 103, 1));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ENTER FOLLOWING DETAILS TO ISSUE BOOK FROM OUR LIBRARY :-");

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Enter book title :- ");

        tfBookTitle.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Enter book author name :-");

        tfBookAuthor.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookAuthor.setToolTipText("With this Name and Password the Librarian you add will Login into the system.");
        tfBookAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfBookAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookAuthorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Enter student roll no. :-");
        jLabel4.setToolTipText("With this Name and Password the Librarian you add will Login into the system.");

        jLabel5.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Enter student name :-");

        tfStudName.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfStudName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfStudName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Enter student class :-");

        tfStudClass.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfStudClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Enter date of book issue :-");

        tfDateOfIssue.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfDateOfIssue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        btnIssueBook.setBackground(new java.awt.Color(255, 153, 51));
        btnIssueBook.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnIssueBook.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBook.setText("Submit Details");
        btnIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Want to set current date ? then check the box");

        cbAddCurDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddCurDateActionPerformed(evt);
            }
        });

        tfStudRoll.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfStudRoll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfStudRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudRollActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(167, 151, 133));
        jLabel1.setText("Date Format is dd/mm/yy");

        jLabel10.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("Enter book edition number :-");

        tfBookEdition.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookEdition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBookAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                    .addComponent(tfBookTitle)
                                    .addComponent(tfBookEdition)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAddCurDate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfStudName)
                                    .addComponent(tfStudClass)
                                    .addComponent(tfDateOfIssue)
                                    .addComponent(tfStudRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))))))
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfBookAuthor, tfBookEdition});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBookTitle)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfStudRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(tfStudName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfStudClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDateOfIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAddCurDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnIssueBook});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfBookAuthor, tfBookEdition});

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

    private void tfBookAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookAuthorActionPerformed
    }//GEN-LAST:event_tfBookAuthorActionPerformed

    private void tfStudNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudNameActionPerformed
    }//GEN-LAST:event_tfStudNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ibf.dispose();
        Librarian_Logged_in.main(new String[]{});
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookActionPerformed

        Btitle = tfBookTitle.getText();
        Bauthor = tfBookAuthor.getText();
        Bedition = tfBookEdition.getText();
        StuRollStr = tfStudRoll.getText();
        stuName = tfStudName.getText();
        StuClass = tfStudClass.getText();
        doi = tfDateOfIssue.getText();
        if (Btitle.isEmpty() || Bauthor.isEmpty() || Bedition.isEmpty() || StuRollStr.isEmpty() || stuName.isEmpty() || StuClass.isEmpty() || doi.isEmpty()) {
            dsc.setEmptyFielidDialog(ibf, "Please fill up all details.", "Empty Fields Detected");
        } else {
            if (StuRollStr.matches("\\d+")) {
                stuRoll = Integer.parseInt(StuRollStr);
                if (doi.matches("^\\d{2}/\\d{2}/\\d{4}$")) {

                    try {
                        PreparedStatement stmt = con.prepareStatement("SELECT * FROM books where book_title=? and book_author=? and book_edition_no=?");
                        stmt.setString(1, Btitle);
                        stmt.setString(2, Bauthor);
                        stmt.setString(3, Bedition);
                        ResultSet rs = stmt.executeQuery();
                        if (rs.next()) {
                            MakeItIssued();
                            int curQuantity = rs.getInt("book_quantity");
                            UpdateBookTable(curQuantity);
                        } else {
                            dsc.setDuplicateBookDialog(ibf, Btitle);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        dsc.setDatabaseErrorDialog(ibf);
                    }

                } else {
                    dsc.setEmptyFielidDialog(ibf, "Please Enter Correct Date Format like :-\n01/01/2021", "Invalid Date Format");
                }
            } else {
                dsc.setEmptyFielidDialog(ibf, "Please Enter Student Roll Number in numbers not in words.", "Invalid Roll Number Format");

            }
        }
    }//GEN-LAST:event_btnIssueBookActionPerformed

    private void cbAddCurDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddCurDateActionPerformed
        if (cbAddCurDate.isSelected()) {
            //String CurDate = cd.getDate() + "/" + (cd.getMonth() + 1) + "/" + (cd.getYear() + 1900);
            final String pattern = "dd/MM/yyyy";
            String CurDate = new SimpleDateFormat(pattern).format(new Date());
            tfDateOfIssue.setText(CurDate);
            tfDateOfIssue.setEditable(false);
        }
        if (!cbAddCurDate.isSelected()) {
            tfDateOfIssue.setText("");
            tfDateOfIssue.setEditable(true);
            tfDateOfIssue.requestFocus(true);
        }
    }//GEN-LAST:event_cbAddCurDateActionPerformed

    private void tfStudRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudRollActionPerformed

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
            java.util.logging.Logger.getLogger(Issue_Books_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue_Books_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue_Books_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_Books_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ibf = new Issue_Books_Frame();
                ibf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnIssueBook;
    private javax.swing.JCheckBox cbAddCurDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFrameLogo;
    private javax.swing.JTextField tfBookAuthor;
    private javax.swing.JTextField tfBookEdition;
    private javax.swing.JTextField tfBookTitle;
    private javax.swing.JTextField tfDateOfIssue;
    private javax.swing.JTextField tfStudClass;
    private javax.swing.JTextField tfStudName;
    private javax.swing.JTextField tfStudRoll;
    // End of variables declaration//GEN-END:variables
}
