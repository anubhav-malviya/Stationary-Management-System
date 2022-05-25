/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stationary.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author ANUBHAV MALVIYA
 */
public class Home extends javax.swing.JFrame {
    
    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("anubhav.malviya2000@gmail.com")) {
            btnCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
            btnVerifyUsers.setVisible(false);
            btnAddNewSupplierBill.setVisible(false);
            btnManageSupplierBills.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnViewBillOrderPlacedDetails = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnChangeSecurityQuestion = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        btnAddNewSupplierBill = new javax.swing.JButton();
        btnManageSupplierBills = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 13, -1, -1));

        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 13, -1, -1));

        btnViewBillOrderPlacedDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewBillOrderPlacedDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewBillOrderPlacedDetails.setText("View Bill & Order Placed Details");
        btnViewBillOrderPlacedDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillOrderPlacedDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillOrderPlacedDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 13, -1, -1));

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 13, -1, -1));

        btnChangeSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeSecurityQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        btnChangeSecurityQuestion.setText("Change Security Question");
        btnChangeSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSecurityQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 13, -1, -1));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 13, -1, -1));

        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View, Edit & Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));

        btnVerifyUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 660, -1, -1));

        btnAddNewSupplierBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddNewSupplierBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Supplier Bill.png"))); // NOI18N
        btnAddNewSupplierBill.setText("Add New Supplier Bill");
        btnAddNewSupplierBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSupplierBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNewSupplierBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 716, -1, -1));

        btnManageSupplierBills.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageSupplierBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Manage Bills.png"))); // NOI18N
        btnManageSupplierBills.setText("Manage Supplier Bills");
        btnManageSupplierBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSupplierBillsActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageSupplierBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 716, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewBillOrderPlacedDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillOrderPlacedDetailsActionPerformed
        // TODO add your handling code here:
        new ViewBillsOrderPlacedDetails().setVisible(true);
    }//GEN-LAST:event_btnViewBillOrderPlacedDetailsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnChangeSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSecurityQuestionActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSecurityQuestionActionPerformed

    private void btnAddNewSupplierBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSupplierBillActionPerformed
        // TODO add your handling code here:
        new AddNewSupplierBill().setVisible(true);
    }//GEN-LAST:event_btnAddNewSupplierBillActionPerformed

    private void btnManageSupplierBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSupplierBillsActionPerformed
        // TODO add your handling code here:
        new ManageSupplierBills().setVisible(true);
    }//GEN-LAST:event_btnManageSupplierBillsActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSupplierBill;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSecurityQuestion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageSupplierBills;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewBillOrderPlacedDetails;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
