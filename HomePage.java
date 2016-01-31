
import java.awt.GraphicsConfiguration;
import javax.swing.JButton;




public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        newApp=new AppointmentForm();
        newApp.setVisible(false);
        jDesktopPane1.add(newApp);
        
        checkup=new PatientCheckupForm();
        checkup.setVisible(false);
        jDesktopPane1.add(checkup);
        
        staffInfo=new StaffInfoForm();
        staffInfo.setVisible(false);
        jDesktopPane1.add(staffInfo);
        
        bill=new BillingForm();
        bill.setVisible(false);
        jDesktopPane1.add(bill);
    
        admin=new AdminForm();
        admin.setVisible(false);
        jDesktopPane1.add(admin);
        
        mainL=new MainLoginForm(this);
        mainL.setVisible(true);
        jDesktopPane1.add(mainL);
        
        
    
    }
    
    public JButton getAppBtn(){
        return Appbtn;
    }
    public JButton getSiBtn(){
        return sibtn;
    }
    public JButton getBgBtn(){
        return Bgbtn;
    }
     public JButton getAdBtn(){
        return Adbtn;
    }
      public JButton getPcBtn(){
        return Pcbtn;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        Appbtn = new javax.swing.JButton();
        Pcbtn = new javax.swing.JButton();
        sibtn = new javax.swing.JButton();
        Bgbtn = new javax.swing.JButton();
        Adbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGEMENT");
        setBackground(new java.awt.Color(153, 255, 204));
        setForeground(new java.awt.Color(102, 0, 255));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 204, 0)));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setName("Manage"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("                    Hospital Management");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 255, 102)));

        Appbtn.setBackground(new java.awt.Color(0, 255, 102));
        Appbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Appbtn.setText("New Appointment");
        Appbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Appbtn.setEnabled(false);
        Appbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppbtnActionPerformed(evt);
            }
        });

        Pcbtn.setBackground(new java.awt.Color(0, 255, 102));
        Pcbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Pcbtn.setText("Patient Checkup");
        Pcbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Pcbtn.setEnabled(false);
        Pcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcbtnActionPerformed(evt);
            }
        });

        sibtn.setBackground(new java.awt.Color(0, 255, 102));
        sibtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sibtn.setText("Staff Info");
        sibtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        sibtn.setEnabled(false);
        sibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sibtnActionPerformed(evt);
            }
        });

        Bgbtn.setBackground(new java.awt.Color(0, 255, 102));
        Bgbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bgbtn.setText("Billing");
        Bgbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Bgbtn.setEnabled(false);
        Bgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgbtnActionPerformed(evt);
            }
        });

        Adbtn.setBackground(new java.awt.Color(0, 255, 102));
        Adbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Adbtn.setText("Admin");
        Adbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Adbtn.setEnabled(false);
        Adbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PROJECT BY:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Neetu Khatra");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Charvi Dhawan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Pcbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Appbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(Adbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bgbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sibtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1)
                .addGap(11, 11, 11))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Appbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Bgbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Adbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppbtnActionPerformed
     newApp.setVisible(true);
    }//GEN-LAST:event_AppbtnActionPerformed

    private void PcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcbtnActionPerformed
        checkup.setVisible(true);
    }//GEN-LAST:event_PcbtnActionPerformed

    private void sibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sibtnActionPerformed
       staffInfo.setVisible(true);
    }//GEN-LAST:event_sibtnActionPerformed

    private void AdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdbtnActionPerformed
        admin.setVisible(true);
    }//GEN-LAST:event_AdbtnActionPerformed

    private void BgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgbtnActionPerformed
        bill.setVisible(true);
    }//GEN-LAST:event_BgbtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        System.out.println("mainL.ul "+mainL.ul);
        
        if(mainL.ul){
            Appbtn.setEnabled(true);
            
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    private MainLoginForm mainL;
    private AdminForm admin;
    private BillingForm bill;
    private StaffInfoForm staffInfo;
    private PatientCheckupForm checkup;
    private AppointmentForm newApp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adbtn;
    private javax.swing.JButton Appbtn;
    private javax.swing.JButton Bgbtn;
    private javax.swing.JButton Pcbtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sibtn;
    // End of variables declaration//GEN-END:variables
}
