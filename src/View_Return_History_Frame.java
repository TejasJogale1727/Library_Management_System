

/**
 *
 * @author tejas eknath jogale
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
public class View_Return_History_Frame extends javax.swing.JFrame {

        static View_Return_History_Frame vrf;
    private DialogSetterClass dsc = new DialogSetterClass();
    private Connection con = null;
    DefaultTableModel tblModel ;
    public View_Return_History_Frame() {
        initComponents();
        SetLogoFile slf = new SetLogoFile();
        String s = "database_history.png";
        slf.setLogo(lbFrameLogo, s);
        MyConnectionClass mcc = new MyConnectionClass();
        con = mcc.returnConObj();
        GetAndShowData();
    }

        private void GetAndShowData(){
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from return_books");
            while(rs.next()){
                String bookTitle = rs.getString("book_title");
                String bookAuthor = rs.getString("book_author");
                String bookEdition = rs.getString("book_edition");
                String stuRoll = Integer.toString(rs.getInt("student_roll_num"));
                String stuName = rs.getString("student_name");
                String stuClass = rs.getString("student_class");
                String DateIssued = rs.getString("date_of_issue");
                String DateReturned = rs.getString("date_of_return");
                
                String Tdata[] = {bookTitle,bookAuthor,bookEdition,stuName,stuRoll,stuClass,DateIssued,DateReturned};
                tblModel = (DefaultTableModel)tbViewReturnedBooks.getModel();
                tblModel.addRow(Tdata);
            }
        }catch(Exception e){e.printStackTrace();}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFrameLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbViewReturnedBooks = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnClrHistory = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 249, 241));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(167, 151, 133), 5, true));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 103, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("This Following all issued and returned Book History");

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 165), 3, true));

        tbViewReturnedBooks.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        tbViewReturnedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Book Author", "Book Edition", "Student Name", "Student Roll No.", "Student Class", "Issue Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbViewReturnedBooks.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jScrollPane1.setViewportView(tbViewReturnedBooks);
        if (tbViewReturnedBooks.getColumnModel().getColumnCount() > 0) {
            tbViewReturnedBooks.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbViewReturnedBooks.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbViewReturnedBooks.getColumnModel().getColumn(4).setPreferredWidth(50);
            tbViewReturnedBooks.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        btnRefresh.setBackground(new java.awt.Color(255, 153, 51));
        btnRefresh.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnClrHistory.setBackground(new java.awt.Color(255, 153, 51));
        btnClrHistory.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnClrHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnClrHistory.setText("Cear History");
        btnClrHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrHistoryActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 153, 51));
        btnBack.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClrHistory)
                            .addGap(62, 62, 62)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClrHistory, btnRefresh});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbFrameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClrHistory)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClrHistory, btnRefresh});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        vrf.dispose();
        Librarian_Logged_in.main(new String[]{});
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        tblModel.setRowCount(0);
        if (tblModel.getRowCount() == 0) {
            GetAndShowData();
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnClrHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrHistoryActionPerformed
        if (tblModel.getRowCount() == 0) {
            dsc.setEmptyFielidDialog(vrf, "Cannot Clear Because it is already empty", "Not Able to clear");
        }else{
        try{
            Statement st = con.createStatement();
            int result = st.executeUpdate(" TRUNCATE return_books");
            if(result!=0){
                dsc.setSuccessDialog(vrf, "Cleared History", "Cleared");
            }else{
                dsc.setSuccessDialog(vrf, "Not Cleared History", "Not Cleared");
            }
        }catch(Exception e){e.printStackTrace();}
        }
    }//GEN-LAST:event_btnClrHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(View_Return_History_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Return_History_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Return_History_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Return_History_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vrf = new View_Return_History_Frame();
                vrf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClrHistory;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFrameLogo;
    private javax.swing.JTable tbViewReturnedBooks;
    // End of variables declaration//GEN-END:variables
}
