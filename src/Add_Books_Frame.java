

/**
 *
 * @author tejas eknath jogale
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Add_Books_Frame extends javax.swing.JFrame {

    static Add_Books_Frame abf;
    String title, bauthor, publisher, numOfCopy, isbnNum, edition, dateAdded;
    private DialogSetterClass dsc = new DialogSetterClass();
    private Connection con = null;
    private Date cd;

    public Add_Books_Frame() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        String s = "Add_Books_Logo.png";
        slf.setLogo(lbFrameLogo, s);
        MyConnectionClass mcc = new MyConnectionClass();
        con = mcc.returnConObj();
        cd = new Date();

    }

    private void makeItBlank() {
        tfBookAuthor.setText("");
        tfBookEdition.setText("");
        tfBookTitle.setText("");
        tfBookDate.setText("");
        tfNoOfBooks.setText("");
        tfBookPub.setText("");
        tfISBN.setText("");
        cbAddCurDate.setSelected(false);
        tfBookDate.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBookTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfBookAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfBookPub = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNoOfBooks = new javax.swing.JTextField();
        tfISBN = new javax.swing.JTextField();
        tfBookEdition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfBookDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbAddCurDate = new javax.swing.JCheckBox();
        btnAddBooks = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Enter book title :-");

        tfBookTitle.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Enter book author name :-");

        tfBookAuthor.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfBookAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookAuthorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Enter book publisher name :-");

        tfBookPub.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookPub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Enter number of copies :-");

        jLabel6.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Enter ISBN number of book :-");

        jLabel7.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Enter book edition numer :-");

        tfNoOfBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfNoOfBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));
        tfNoOfBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoOfBooksActionPerformed(evt);
            }
        });

        tfISBN.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        tfBookEdition.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookEdition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel8.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Enter the date book added :-");

        tfBookDate.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tfBookDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 165)));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Want to set current date ? then check this box");

        cbAddCurDate.setBorder(null);
        cbAddCurDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddCurDateActionPerformed(evt);
            }
        });

        btnAddBooks.setBackground(new java.awt.Color(255, 153, 51));
        btnAddBooks.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAddBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBooks.setText("ADD BOOKS");
        btnAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBooksActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(249, 103, 1));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ENTER FOLLOWING DETAILS ADD BOOKS INTO LIBRARY :-");

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(167, 151, 133));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Date Format is dd/mm/yy");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(167, 151, 133));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ISBN format must be of 10 or 13 digits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnAddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfBookDate)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAddCurDate))
                            .addComponent(tfBookPub)
                            .addComponent(tfBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(tfNoOfBooks)
                            .addComponent(tfISBN)
                            .addComponent(tfBookEdition)
                            .addComponent(tfBookAuthor)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(132, 132, 132))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfBookDate, tfBookEdition, tfBookPub, tfBookTitle, tfISBN, tfNoOfBooks});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddBooks, btnBack});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookAuthor))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookPub))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNoOfBooks))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfISBN))
                .addGap(1, 1, 1)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookEdition))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBookDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAddCurDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(33, 33, 33))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfBookAuthor, tfBookDate, tfBookEdition, tfBookPub, tfBookTitle, tfISBN, tfNoOfBooks});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddBooks, btnBack});

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

    private void tfNoOfBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoOfBooksActionPerformed
    }//GEN-LAST:event_tfNoOfBooksActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        abf.dispose();
        Librarian_Logged_in.main(new String[]{});
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBooksActionPerformed
        title = tfBookTitle.getText();
        bauthor = tfBookAuthor.getText();
        publisher = tfBookPub.getText();
        numOfCopy = tfNoOfBooks.getText();
        int bookQuantity = Integer.parseInt(numOfCopy);
        isbnNum = tfISBN.getText();
        edition = tfBookEdition.getText();
        dateAdded = tfBookDate.getText();
        if (title.isEmpty() || bauthor.isEmpty() || publisher.isEmpty() || numOfCopy.isEmpty() || isbnNum.isEmpty() || edition.isEmpty() || dateAdded.isEmpty()) {
            dsc.setEmptyFielidDialog(abf, "Please fill up all details.", "Empty Fields Detected");
        } else {
            if (numOfCopy.matches("\\d+")) {
                if ((isbnNum.matches("\\d+"))&& ((isbnNum.length()==10)||isbnNum.length()==13)){
                if (dateAdded.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                    try {
                        PreparedStatement smt = con.prepareStatement("SELECT * from books where book_title=? and book_edition_no=?");
                        smt.setString(1, title);
                        smt.setString(2, edition);
                        ResultSet rs = smt.executeQuery();

                        if (!rs.next()) {
                            PreparedStatement pst = con.prepareStatement("insert into books (book_title,book_author,book_publisher,book_quantity,book_isbn,book_edition_no,book_date_added) values (?,?,?,?,?,?,?)");
                            pst.setString(1, title);
                            pst.setString(2, bauthor);
                            pst.setString(3, publisher);
                            pst.setInt(4, bookQuantity);
                            pst.setString(5, isbnNum);
                            pst.setString(6, edition);
                            pst.setString(7, dateAdded);

                            int result1 = pst.executeUpdate();
                            if (result1 > 0) {
                                dsc.setBookAddedDialog(abf, title);
                                makeItBlank();
                                
                            } else {
                                dsc.setBookProblemDialog(abf, "Book was not added due to some error.\nTry to check entered ISBN number format.", "Book Not Added");
                            }
                        } else {
                            PreparedStatement pst2 = con.prepareStatement("update books set book_quantity = ? , book_date_added = ? WHERE book_isbn = ?");
                            int curQuantity = rs.getInt("book_quantity");
                            pst2.setInt(1, bookQuantity + curQuantity);
                            pst2.setString(2, dateAdded);
                            pst2.setString(3, isbnNum);
                            int result2 = pst2.executeUpdate();
                            if (result2 > 0) {
                                dsc.setBookAddedDialog(abf, title);
                            } else {
                                dsc.setBookProblemDialog(abf, "Book was not added due to some error.\nTry to check entered ISBN number format.", "Book Not Added");
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        dsc.setDatabaseErrorDialog(abf);
                    }
                } else {
                    dsc.setEmptyFielidDialog(abf, "Please Enter Correct Date Format like :-\n01/01/2021", "Invalid Date Format");
                }
                }else{
                    dsc.setEmptyFielidDialog(abf, "Please Enter Valid ISBN number of book.", "Invalid ISBN");
                }
            } else {
                dsc.setEmptyFielidDialog(abf, "Please Enter Quantity in numbers.", "Invalid Quantity Format");
            }
        }
    }//GEN-LAST:event_btnAddBooksActionPerformed

    private void cbAddCurDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddCurDateActionPerformed

        if (cbAddCurDate.isSelected()) {
            //String CurDate = cd.getDate() + "/" + (cd.getMonth() + 1) + "/" + (cd.getYear() + 1900);
            final String pattern = "dd/MM/yyyy";
            String CurDate = new SimpleDateFormat(pattern).format(new Date());
            tfBookDate.setText(CurDate);
            tfBookDate.setEditable(false);
        }
        if (!cbAddCurDate.isSelected()) {
            tfBookDate.setText("");
            tfBookDate.setEditable(true);
            tfBookDate.requestFocus(true);
        }
    }//GEN-LAST:event_cbAddCurDateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Books_Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                abf = new Add_Books_Frame();
                abf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBooks;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox cbAddCurDate;
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
    private javax.swing.JLabel lbFrameLogo;
    private javax.swing.JTextField tfBookAuthor;
    private javax.swing.JTextField tfBookDate;
    private javax.swing.JTextField tfBookEdition;
    private javax.swing.JTextField tfBookPub;
    private javax.swing.JTextField tfBookTitle;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfNoOfBooks;
    // End of variables declaration//GEN-END:variables
}
