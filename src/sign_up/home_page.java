/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sign_up;

import java.awt.Color;
import javax.swing.JOptionPane;


public class home_page extends javax.swing.JFrame {
    
    public home_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        Color background = new Color(240, 234, 214);
        getContentPane().setBackground(background);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddBooking = new javax.swing.JButton();
        viewRooms = new javax.swing.JButton();
        currentbookingBtn = new javax.swing.JButton();
        viewImg = new javax.swing.JLabel();
        manageImg = new javax.swing.JLabel();
        bookImg = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel1.setText("WELCOME BACK STAFF");

        AddBooking.setBackground(new java.awt.Color(255, 204, 204));
        AddBooking.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        AddBooking.setText("Add a Booking");
        AddBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookingActionPerformed(evt);
            }
        });

        viewRooms.setBackground(new java.awt.Color(255, 204, 204));
        viewRooms.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        viewRooms.setText("View All Rooms");
        viewRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomsActionPerformed(evt);
            }
        });

        currentbookingBtn.setBackground(new java.awt.Color(255, 204, 204));
        currentbookingBtn.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        currentbookingBtn.setText("Manage Current Booking");
        currentbookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentbookingBtnActionPerformed(evt);
            }
        });

        viewImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel-occupancy.jpg"))); // NOI18N

        manageImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managing.png"))); // NOI18N

        bookImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N

        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SimHei", 0, 12)); // NOI18N
        jLabel2.setText("*click here to view all current room information");

        jLabel3.setFont(new java.awt.Font("SimHei", 0, 12)); // NOI18N
        jLabel3.setText("*click here to manage room booking details");

        jLabel4.setFont(new java.awt.Font("SimHei", 0, 12)); // NOI18N
        jLabel4.setText("*click here to add new booking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addComponent(logoutBtn)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageImg, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(viewImg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(viewRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bookImg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AddBooking)
                                .addGap(42, 42, 42)))
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(currentbookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(logoutBtn))
                        .addGap(58, 58, 58)
                        .addComponent(AddBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookImg, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewImg, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(currentbookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(manageImg, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookingActionPerformed
        booking_page a = new booking_page();
        a.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_AddBookingActionPerformed

    private void viewRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomsActionPerformed
        available_room a = new available_room();
        a.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_viewRoomsActionPerformed

    private void currentbookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentbookingBtnActionPerformed
        currentBookings a = new currentBookings();
        a.setVisible(true);//set visible is help show another form 
        this.setVisible(false);
    }//GEN-LAST:event_currentbookingBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Would you like to log out the system?", "Terminate System", JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_logoutBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBooking;
    private javax.swing.JLabel bookImg;
    private javax.swing.JButton currentbookingBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel manageImg;
    private javax.swing.JLabel viewImg;
    private javax.swing.JButton viewRooms;
    // End of variables declaration//GEN-END:variables
}
