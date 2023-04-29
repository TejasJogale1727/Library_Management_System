/**
 *
 * @author tejas eknath jogale
 */
public class Admin_Logged_in extends javax.swing.JFrame {

    static Admin_Logged_in ali;
    public Admin_Logged_in() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        String s = "admin_logged_in_logo(colorful).png";
        //String s = "admin_logged_in_logo(white).png";
        //String s = "admin_logged_in_logo(black).png";
        slf.setLogo(lbFrameLogo, s);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        btnAddLibrarian = new javax.swing.JButton();
        btnViewLibrarian = new javax.swing.JButton();
        btnDeleteLibrarian = new javax.swing.JButton();
        btnLibrarianMode = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));

        btnAddLibrarian.setBackground(new java.awt.Color(255, 153, 51));
        btnAddLibrarian.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnAddLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        btnAddLibrarian.setText("ADD LIBRARIAN");
        btnAddLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLibrarianActionPerformed(evt);
            }
        });

        btnViewLibrarian.setBackground(new java.awt.Color(255, 153, 51));
        btnViewLibrarian.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnViewLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        btnViewLibrarian.setText("VIEW LIBRARIAN");
        btnViewLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLibrarianActionPerformed(evt);
            }
        });

        btnDeleteLibrarian.setBackground(new java.awt.Color(255, 153, 51));
        btnDeleteLibrarian.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnDeleteLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteLibrarian.setText("DELETE LIBRARIAN");
        btnDeleteLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLibrarianActionPerformed(evt);
            }
        });

        btnLibrarianMode.setBackground(new java.awt.Color(255, 153, 51));
        btnLibrarianMode.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnLibrarianMode.setForeground(new java.awt.Color(255, 255, 255));
        btnLibrarianMode.setText("ENTER AS LIBRAIRAN");
        btnLibrarianMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrarianModeActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 51));
        btnLogout.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 103, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("As ADMIN you may perform folllowing things :-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout)
                            .addComponent(btnLibrarianMode)
                            .addComponent(btnAddLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(btnViewLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddLibrarian, btnDeleteLibrarian, btnLibrarianMode, btnLogout, btnViewLibrarian});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(btnAddLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnViewLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDeleteLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnLibrarianMode)
                .addGap(40, 40, 40)
                .addComponent(btnLogout)
                .addGap(54, 54, 54))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddLibrarian, btnDeleteLibrarian, btnLibrarianMode, btnLogout, btnViewLibrarian});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        ali.dispose();
        Home.main(new String[]{});
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLibrarianActionPerformed
        ali.dispose();
        Add_Librarian_Frame.main(new String[]{});
    }//GEN-LAST:event_btnAddLibrarianActionPerformed

    private void btnViewLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLibrarianActionPerformed
        ali.dispose();
        View_Librarian_Frame.main(new String[]{});
    }//GEN-LAST:event_btnViewLibrarianActionPerformed

    private void btnDeleteLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLibrarianActionPerformed
        ali.dispose();
        Delete_Librarian_Frame.main(new String[]{});
    }//GEN-LAST:event_btnDeleteLibrarianActionPerformed

    private void btnLibrarianModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrarianModeActionPerformed
        ali.dispose();
        Librarian_Logged_in.main(new String[]{});
    }//GEN-LAST:event_btnLibrarianModeActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ali = new Admin_Logged_in();
                ali.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLibrarian;
    private javax.swing.JButton btnDeleteLibrarian;
    private javax.swing.JButton btnLibrarianMode;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewLibrarian;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFrameLogo;
    // End of variables declaration//GEN-END:variables
}
