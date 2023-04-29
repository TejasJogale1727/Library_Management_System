/**
 *
 * @author tejas eknath jogale
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Return_Issued_Books extends javax.swing.JFrame {

    static Return_Issued_Books rib;
    private DialogSetterClass dsc = new DialogSetterClass();
    private Connection con = null;
    private Date cd;

    public Return_Issued_Books() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        //String s = "return_book(Border).png";
        String s = "return_book(two).png";
        //String s = "return_book(no Border).png";
        slf.setLogo(lbFrameLogo, s);
        MyConnectionClass mcc = new MyConnectionClass();
        con = mcc.returnConObj();
        cd = new Date();
    }

    private void makeItBlank(){
        tfBookAuthor.setText("");
        tfBookEdition.setText("");
        tfBookTitle.setText("");
        tfDateOfReturn.setText("");
        tfStudentClass.setText("");
        tfStudName.setText("");
        tfStudRoll.setText("");
        cbAddCurDate.setSelected(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBookTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfBookAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfStudRoll = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfStudName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfStudentClass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDateOfReturn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbAddCurDate = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfBookEdition = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));

        jLabel10.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(249, 103, 1));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ENTER FOLLOWING DETAILS TO RETURN BOOK TO LIBRARY :-");

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Enter book title :-");

        tfBookTitle.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Enter book author :- ");

        tfBookAuthor.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfBookAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookAuthorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Enter student roll number :- ");

        tfStudRoll.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfStudRoll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

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

        jLabel6.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Enter student class :-");

        tfStudentClass.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfStudentClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Enter date of return :-");

        tfDateOfReturn.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfDateOfReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Want to set current date ? then check the box");

        cbAddCurDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddCurDateActionPerformed(evt);
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

        btnReturn.setBackground(new java.awt.Color(255, 153, 51));
        btnReturn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("RETURN BOOK");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Enter book edition number :-");

        tfBookEdition.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookEdition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(167, 151, 133));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Date Format is dd/mm/yy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(380, 380, 380))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfStudName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfStudRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(tfStudentClass, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbAddCurDate))
                                        .addComponent(tfBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(tfBookAuthor)
                                        .addComponent(tfDateOfReturn)
                                        .addComponent(tfBookEdition)))))
                        .addGap(138, 138, 138))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnReturn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookTitle))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBookEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStudRoll))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStudName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStudentClass))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfDateOfReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAddCurDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(20, 20, 20))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnReturn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3});

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
        rib.dispose();
        Librarian_Logged_in.main(new String[]{});
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        String bookTitle = tfBookTitle.getText();
        String bookAuthor = tfBookAuthor.getText();
        String bookEdition = tfBookEdition.getText();
        String stuRoll = tfStudRoll.getText();
        String stuName = tfStudName.getText();
        String stuClass = tfStudentClass.getText();
        String dor = tfDateOfReturn.getText();
        if (bookTitle.isEmpty() || bookAuthor.isEmpty() || bookEdition.isEmpty() || stuRoll.isEmpty() || stuName.isEmpty() || stuClass.isEmpty() || dor.isEmpty()) {
            dsc.setEmptyFielidDialog(rib, "Please fill up all details.", "Empty Fields Detected");
        } else {
            int rollNum = Integer.parseInt(stuRoll);
            try {
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM issue_books where book_title=? and book_author=? and book_edition_no=? and student_roll_num = ? and student_class=? and student_name=?");
                stmt.setString(1, bookTitle);
                stmt.setString(2, bookAuthor);
                stmt.setString(3, bookEdition);
                stmt.setInt(4, rollNum);
                stmt.setString(5, stuClass);
                stmt.setString(6, stuName);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    PreparedStatement pst = con.prepareStatement("UPDATE books SET book_quantity = book_quantity+1 WHERE book_title=? and book_edition_no=? and book_author=?");
                    pst.setString(1, bookTitle);
                    pst.setString(2, bookEdition);
                    pst.setString(3, bookAuthor);
                    int result2 = pst.executeUpdate();
                    /*if (result2 > 0) {
                        dsc.setEmptyFielidDialog(rib, "Updated book table", "Successfully Issued");
                    } else {
                        dsc.setBookProblemDialog(rib, "Book Table is not updated,Due to some error", "Book Table Not Updated");
                    }*/
                    PreparedStatement pst2 = con.prepareStatement("DELETE  FROM issue_books where book_title=? and book_author=? and book_edition_no=? and student_roll_num = ? and student_class=? and student_name=?");
                    pst2.setString(1, bookTitle);
                    pst2.setString(2, bookAuthor);
                    pst2.setString(3, bookEdition);
                    pst2.setInt(4, rollNum); 
                    pst2.setString(5, stuClass);
                    pst2.setString(6, stuName);
                    int result3 = pst2.executeUpdate();
                    /*if (result3 > 0) {
                        dsc.setEmptyFielidDialog(rib, "Updated issue book table", "Successfully Issued");
                    } else {
                        dsc.setBookProblemDialog(rib, "Issue Book Table is not updated,Due to some error", "Issue Book Table Not Updated");
                    }*/
                    PreparedStatement pst3 = con.prepareStatement("INSERT INTO return_books (book_title, book_author, book_edition, student_name, student_class, student_roll_num, date_of_issue, date_of_return) VALUES (?,?,?,?,?,?,?,?)");
                    pst3.setString(1, bookTitle);
                    pst3.setString(2, bookAuthor);
                    pst3.setString(3, bookEdition);
                    pst3.setString(4, stuName);
                    pst3.setString(5, stuClass);
                    pst3.setInt(6, rollNum); 
                    pst3.setString(7, rs.getString("date_of_issue"));
                    pst3.setString(8,dor);
                    int result4 = pst3.executeUpdate();
                    /*if (result4 > 0) {
                        dsc.setEmptyFielidDialog(rib, "Insert into return book table", "Successfully Issued");
                    } else {
                        dsc.setBookProblemDialog(rib, "Return Book Table is not inserted,Due to some error", "Return Book Table Not Updated");
                    }*/
                    
                    if(result2>0&result3>0&result4>0){
                        dsc.setSuccessDialog(rib, "Book Returned Successfully.", "Succssfull Return");
                        makeItBlank();
                    }else{
                        dsc.setReturnUnsuccessDialog(rib);
                    }
                } else {
                    dsc.setInvalidBookDialog(rib);
                }
            } catch (Exception e) {
                e.printStackTrace();
                dsc.setDatabaseErrorDialog(rib);
            }
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void cbAddCurDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddCurDateActionPerformed

        if (cbAddCurDate.isSelected()) {
            //String CurDate = cd.getDate() + "/" + (cd.getMonth() + 1) + "/" + (cd.getYear() + 1900);
            final String pattern = "dd/MM/yyyy";
            String CurDate = new SimpleDateFormat(pattern).format(new Date());
            tfDateOfReturn.setText(CurDate);
            tfDateOfReturn.setEditable(false);
        }
        if (!cbAddCurDate.isSelected()) {
            tfDateOfReturn.setText("");
            tfDateOfReturn.setEditable(true);
            tfDateOfReturn.requestFocus(true);
        }
    }//GEN-LAST:event_cbAddCurDateActionPerformed

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
            java.util.logging.Logger.getLogger(Return_Issued_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_Issued_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_Issued_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_Issued_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                rib = new Return_Issued_Books();
                rib.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReturn;
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
    private javax.swing.JTextField tfDateOfReturn;
    private javax.swing.JTextField tfStudName;
    private javax.swing.JTextField tfStudRoll;
    private javax.swing.JTextField tfStudentClass;
    // End of variables declaration//GEN-END:variables
}
