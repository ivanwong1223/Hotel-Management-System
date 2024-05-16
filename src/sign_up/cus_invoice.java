/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sign_up;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;


public class cus_invoice extends javax.swing.JFrame {
    public cus_invoice() {
        initComponents();
        this.setLocationRelativeTo(null);
        Color background = new Color(243, 224, 190);
        getContentPane().setBackground(background);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoicePNL = new javax.swing.JPanel();
        cusNameLabel = new javax.swing.JLabel();
        roomFees = new javax.swing.JLabel();
        roomDays = new javax.swing.JLabel();
        taxAmount = new javax.swing.JLabel();
        tTax = new javax.swing.JLabel();
        totalDisplay = new javax.swing.JLabel();
        nxtBtn = new javax.swing.JButton();
        totalAmount = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        roomid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicePNL.setBackground(new java.awt.Color(255, 255, 255));

        cusNameLabel.setText("Name:");

        roomFees.setText("Room Charges:");

        roomDays.setText("Days of stays:");

        taxAmount.setText("Service Tax (10%):");

        tTax.setText("*Tourism Tax (Rm10 per night):");

        totalDisplay.setText("Total Charges:");

        nxtBtn.setBackground(new java.awt.Color(255, 255, 204));
        nxtBtn.setText("Done");
        nxtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoicePNLLayout = new javax.swing.GroupLayout(invoicePNL);
        invoicePNL.setLayout(invoicePNLLayout);
        invoicePNLLayout.setHorizontalGroup(
            invoicePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePNLLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(nxtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(invoicePNLLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(invoicePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tTax, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(invoicePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(invoicePNLLayout.createSequentialGroup()
                            .addComponent(totalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalAmount))
                        .addComponent(taxAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addComponent(roomFees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cusNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        invoicePNLLayout.setVerticalGroup(
            invoicePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePNLLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cusNameLabel)
                .addGap(26, 26, 26)
                .addComponent(roomDays)
                .addGap(26, 26, 26)
                .addComponent(roomFees)
                .addGap(26, 26, 26)
                .addComponent(taxAmount)
                .addGap(28, 28, 28)
                .addComponent(tTax)
                .addGap(40, 40, 40)
                .addGroup(invoicePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalDisplay)
                    .addComponent(totalAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(nxtBtn)
                .addContainerGap())
        );

        viewBtn.setBackground(new java.awt.Color(255, 255, 204));
        viewBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        viewBtn.setText("View Invoice");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel10.setText("Customer Invoice");

        roomid.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        roomid.setForeground(new java.awt.Color(0, 0, 153));
        roomid.setText("Room ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(invoicePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewBtn)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(roomid))
                        .addGap(192, 192, 192))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(roomid)
                .addGap(18, 18, 18)
                .addComponent(invoicePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtnActionPerformed
        String ta;
        
        ta = totalAmount.getText();
        try {
            List<String> lines = Files.readAllLines(Paths.get("booking.txt"));
            String lastLine = lines.get(lines.size() - 1);
            String updatedLastLine = lastLine + ", " + ta;
            lines.set(lines.size() - 1, updatedLastLine);
            Files.write(Paths.get("booking.txt"), lines);
            JOptionPane.showMessageDialog(null,"Customer Payment Has Been Updated.","Success",JOptionPane.INFORMATION_MESSAGE);
            currentBookings a = new currentBookings();
            a.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_nxtBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        calculatorInvoice viewInvoiceInstance = new calculatorInvoice(roomid, cusNameLabel, roomDays, roomFees, taxAmount, tTax, totalAmount);
        viewInvoiceInstance.display();
    }//GEN-LAST:event_viewBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(cus_invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cus_invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cusNameLabel;
    private javax.swing.JPanel invoicePNL;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JButton nxtBtn;
    private javax.swing.JLabel roomDays;
    private javax.swing.JLabel roomFees;
    private javax.swing.JLabel roomid;
    private javax.swing.JLabel tTax;
    private javax.swing.JLabel taxAmount;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JLabel totalDisplay;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
