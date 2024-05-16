/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sign_up;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class currentBookings extends javax.swing.JFrame {
    public currentBookings() {
        initComponents();
        this.setLocationRelativeTo(null);
        Color background = new Color(243, 224, 190);
        getContentPane().setBackground(background);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        b_details = new javax.swing.JTable();
        displayBooking = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        srcBtn = new javax.swing.JButton();
        dltBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editBtn.setBackground(new java.awt.Color(255, 255, 204));
        editBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(51, 153, 255));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        b_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Email", "IC/Passport No", "Check In Date", "Check Out Date", "Room ID", "Total Charges"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        b_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(b_details);

        displayBooking.setBackground(new java.awt.Color(255, 255, 204));
        displayBooking.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        displayBooking.setForeground(new java.awt.Color(0, 204, 204));
        displayBooking.setText("View Current Booking");
        displayBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBookingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setText("Current Booking Details");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        srcBtn.setBackground(new java.awt.Color(255, 255, 204));
        srcBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        srcBtn.setForeground(new java.awt.Color(0, 204, 204));
        srcBtn.setText("Search");
        srcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcBtnActionPerformed(evt);
            }
        });

        dltBtn.setBackground(new java.awt.Color(255, 255, 204));
        dltBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        dltBtn.setForeground(new java.awt.Color(255, 51, 51));
        dltBtn.setText("Delete");
        dltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(258, 258, 258)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(editBtn)
                        .addGap(43, 43, 43)
                        .addComponent(dltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayBooking)
                        .addGap(154, 154, 154)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(srcBtn)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBooking)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srcBtn)
                    .addComponent(editBtn)
                    .addComponent(dltBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBookingActionPerformed
        try{
            File file = new File("booking.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            DefaultTableModel model = (DefaultTableModel) b_details.getModel();
            model.setRowCount(0);

            while ((line = br.readLine()) != null) {
                String[] rowData = line.trim().split(",");
                model.addRow(rowData);
            }
            br.close();
        }catch(IOException ex){
            Logger.getLogger(available_room.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_displayBookingActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        editForm a = new editForm();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        home_page a = new home_page();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void b_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_detailsMouseClicked
        int selectedRow = b_details.getSelectedRow();
        if (selectedRow != -1) {
            dltBtn.setEnabled(true);
            String roomId = (String) b_details.getValueAt(selectedRow, 6);
        } else {
            dltBtn.setEnabled(false);
        }
    }//GEN-LAST:event_b_detailsMouseClicked

    private void srcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcBtnActionPerformed
        String search = searchInput.getText().toLowerCase().trim();
        DefaultTableModel model = (DefaultTableModel) b_details.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        b_details.setRowSorter(sorter);
        int[] columnsToSearch = {0, 1, 2, 3, 4, 5, 6, 7};
        if (!search.isEmpty()) {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + search, columnsToSearch));
            if (sorter.getViewRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "The data that you searched for is not exist!", "No matching data", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            b_details.setRowSorter(null); // clear the filter
        }
    }//GEN-LAST:event_srcBtnActionPerformed

    private void dltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBtnActionPerformed
        int selectedRow = b_details.getSelectedRow();
        if (selectedRow != -1){
            int option = JOptionPane.showConfirmDialog(this, "Delete this booking record?", "Confirm Delete", JOptionPane.YES_OPTION);
            if (option == JOptionPane.YES_OPTION){
                DefaultTableModel model = (DefaultTableModel) b_details.getModel();
                String roomId = (String) model.getValueAt(selectedRow, 6);
                boolean success = editDisplay.deleteBooking(roomId);
                if (success) {
                    // Remove the row from the table
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "The Record Has Been Deleted.", "Delete Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete record", "Delete Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_dltBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    
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
            java.util.logging.Logger.getLogger(currentBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currentBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currentBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currentBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currentBookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable b_details;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton displayBooking;
    private javax.swing.JButton dltBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchInput;
    private javax.swing.JButton srcBtn;
    // End of variables declaration//GEN-END:variables
}
