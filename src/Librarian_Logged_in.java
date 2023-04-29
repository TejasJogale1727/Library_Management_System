/**
 *
 * @author tejas eknath jogale
 */
public class Librarian_Logged_in extends javax.swing.JFrame {

    static Librarian_Logged_in lli;
    public Librarian_Logged_in() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        String s = "librarian_logged_in(circle).png";
        //String s = "librarian_logged_in(women).png";
        slf.setLogo(lbFrameLogo, s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        btnAddBooks = new javax.swing.JButton();
        btnViewBooks = new javax.swing.JButton();
        btnIssueBooks = new javax.swing.JButton();
        btnViewIssuedBooks = new javax.swing.JButton();
        btnReturnBooks = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));

        btnAddBooks.setBackground(new java.awt.Color(255, 153, 51));
        btnAddBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnAddBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBooks.setText("ADD BOOKS");
        btnAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBooksActionPerformed(evt);
            }
        });

        btnViewBooks.setBackground(new java.awt.Color(255, 153, 51));
        btnViewBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnViewBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBooks.setText("VIEW BOOKS");
        btnViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBooksActionPerformed(evt);
            }
        });

        btnIssueBooks.setBackground(new java.awt.Color(255, 153, 51));
        btnIssueBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnIssueBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBooks.setText("ISSUE BOOKS");
        btnIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBooksActionPerformed(evt);
            }
        });

        btnViewIssuedBooks.setBackground(new java.awt.Color(255, 153, 51));
        btnViewIssuedBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnViewIssuedBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewIssuedBooks.setText("VIEW ISSUED BOOKS");
        btnViewIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewIssuedBooksActionPerformed(evt);
            }
        });

        btnReturnBooks.setBackground(new java.awt.Color(255, 153, 51));
        btnReturnBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnReturnBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBooks.setText("RETURN BOOKS");
        btnReturnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBooksActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 153, 51));
        btnLogOut.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("LOGOUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 103, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("As Librarian you may perform folllowing things :-");

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Issue and Return Books History");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnLogOut)
                    .addComponent(btnViewBooks)
                    .addComponent(btnIssueBooks)
                    .addComponent(btnViewIssuedBooks)
                    .addComponent(btnReturnBooks)
                    .addComponent(btnAddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddBooks, btnIssueBooks, btnLogOut, btnReturnBooks, btnViewBooks, btnViewIssuedBooks, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnAddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnViewBooks)
                .addGap(25, 25, 25)
                .addComponent(btnIssueBooks)
                .addGap(25, 25, 25)
                .addComponent(btnViewIssuedBooks)
                .addGap(25, 25, 25)
                .addComponent(btnReturnBooks)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(btnLogOut)
                .addGap(34, 34, 34))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddBooks, btnIssueBooks, btnLogOut, btnReturnBooks, btnViewBooks, btnViewIssuedBooks, jButton1});

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

    private void btnIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBooksActionPerformed
        lli.dispose();
        Issue_Books_Frame.main(new String[]{});
    }//GEN-LAST:event_btnIssueBooksActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        lli.dispose();
        Home.main(new String[]{});
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBooksActionPerformed
        lli.dispose();
        Add_Books_Frame.main(new String[]{});
    }//GEN-LAST:event_btnAddBooksActionPerformed

    private void btnViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBooksActionPerformed
        lli.dispose();
        View_Books_Frame.main(new String[]{});
    }//GEN-LAST:event_btnViewBooksActionPerformed

    private void btnViewIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewIssuedBooksActionPerformed
        lli.dispose();
        View_Issued_Books.main(new String[]{});
    }//GEN-LAST:event_btnViewIssuedBooksActionPerformed

    private void btnReturnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBooksActionPerformed
        lli.dispose();
        Return_Issued_Books.main(new String[]{});
    }//GEN-LAST:event_btnReturnBooksActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lli.dispose();
        View_Return_History_Frame.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Librarian_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarian_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarian_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarian_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lli = new Librarian_Logged_in();
                lli.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBooks;
    private javax.swing.JButton btnIssueBooks;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReturnBooks;
    private javax.swing.JButton btnViewBooks;
    private javax.swing.JButton btnViewIssuedBooks;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFrameLogo;
    // End of variables declaration//GEN-END:variables
}
