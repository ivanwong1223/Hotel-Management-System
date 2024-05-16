/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sign_up;


import java.awt.Color;
import javax.swing.JOptionPane;


public class booking_page extends javax.swing.JFrame {
    
    public booking_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        Color background = new Color(243, 224, 190);
        getContentPane().setBackground(background);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cEmail = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbDate = new javax.swing.JComboBox<>();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        cmbDated = new javax.swing.JComboBox<>();
        cmbMonthed = new javax.swing.JComboBox<>();
        cmbYeared = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentRooms = new javax.swing.JTable();
        rSelection = new javax.swing.JComboBox<>();
        viewroomBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Customer Name:");

        cName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel2.setText("Add a Booking");

        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("Customer IC/Passport:");

        cIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cICActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("Customer Contact No:");

        cContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cContactActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("Customer Email:");

        cEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEmailActionPerformed(evt);
            }
        });

        nextBtn.setBackground(new java.awt.Color(255, 255, 204));
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 0, 204));
        jLabel6.setText("Check In Date:");

        jLabel7.setForeground(new java.awt.Color(51, 0, 204));
        jLabel7.setText("Check Out Date:");

        cmbDate.setForeground(new java.awt.Color(0, 51, 255));
        cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-date-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cmbDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDateActionPerformed(evt);
            }
        });

        cmbMonth.setForeground(new java.awt.Color(0, 0, 255));
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-month-", "Jan", "Feb", "Mar", "Apr", "May", " " }));

        cmbYear.setForeground(new java.awt.Color(0, 0, 255));
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));

        cmbDated.setForeground(new java.awt.Color(51, 51, 255));
        cmbDated.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-date-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cmbDated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDatedActionPerformed(evt);
            }
        });

        cmbMonthed.setForeground(new java.awt.Color(102, 102, 255));
        cmbMonthed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-month-", "Jan", "Feb", "Mar", "Apr", "May", " " }));

        cmbYeared.setForeground(new java.awt.Color(51, 51, 255));
        cmbYeared.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));

        currentRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Floor", "Room Status", "Room Type", "Price per Night"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(currentRooms);

        rSelection.setBackground(new java.awt.Color(255, 255, 204));
        rSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select here to view rooms-" }));
        rSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSelectionActionPerformed(evt);
            }
        });

        viewroomBtn.setBackground(new java.awt.Color(255, 255, 204));
        viewroomBtn.setText("View Available Rooms");
        viewroomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewroomBtnActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setText("Room Options:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(cName, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbDated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbMonthed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cmbYeared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cIC, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(viewroomBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 815, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(rSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(51, 51, 51)
                                .addComponent(nextBtn)
                                .addGap(59, 59, 59))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMonthed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbYeared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewroomBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBtn)
                            .addComponent(backBtn))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNameActionPerformed

    private void cEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEmailActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        String CHKin, CHKout;
        
        String name = cName.getText();
        String contact = cContact.getText();
        String email = cEmail.getText();
        String ic = cIC.getText();
        String checkinDate = String.valueOf(cmbDate.getSelectedItem());
        String checkoutDate = String.valueOf(cmbDated.getSelectedItem());
        String checkinMonth = String.valueOf(cmbMonth.getSelectedItem());
        String checkoutMonth = String.valueOf(cmbMonthed.getSelectedItem());
        String year = String.valueOf(cmbYear.getSelectedItem());
        String roomSelected = String.valueOf(rSelection.getSelectedItem());
        CHKin = checkinDate + "-" + checkinMonth + "-" + year;
        CHKout = checkoutDate + "-" + checkoutMonth + "-" + year;
        
        bookingDate insert = new bookingDate(name, contact, email, ic, checkinDate, checkoutDate, checkinMonth, checkoutMonth, year, CHKin, CHKout, roomSelected);
        String res = insert.obj1();
        if(res.equals("Success")){
            JOptionPane.showMessageDialog(null,"Customer Details added. Cick 'OK' to proceed to payment","Success",JOptionPane.INFORMATION_MESSAGE);
            cus_invoice a = new cus_invoice();
            a.setVisible(true); 
            this.setVisible(false);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void cContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cContactActionPerformed

    private void cICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cICActionPerformed

    private void viewroomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewroomBtnActionPerformed
        displayRooms.display(currentRooms);
    }//GEN-LAST:event_viewroomBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        home_page a = new home_page();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void rSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSelectionActionPerformed
        displayRooms.displayCMB(rSelection);
    }//GEN-LAST:event_rSelectionActionPerformed

    private void cmbDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDateActionPerformed

    private void cmbDatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDatedActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cContact;
    private javax.swing.JTextField cEmail;
    private javax.swing.JTextField cIC;
    private javax.swing.JTextField cName;
    private javax.swing.JComboBox<String> cmbDate;
    private javax.swing.JComboBox<String> cmbDated;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbMonthed;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JComboBox<String> cmbYeared;
    private javax.swing.JTable currentRooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JComboBox<String> rSelection;
    private javax.swing.JButton viewroomBtn;
    // End of variables declaration//GEN-END:variables
}
