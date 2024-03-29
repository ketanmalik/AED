/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ProductCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class ManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private JPanel displayPanel;
    private ProductCatalog productCatalog;

    public ManagerPanel(JPanel displayPanel, ProductCatalog productCatalog) {
        initComponents();
        this.displayPanel = displayPanel;
        this.productCatalog = productCatalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createProductBtn = new javax.swing.JButton();
        manageProductBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        createProductBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        createProductBtn.setText("Create Product");
        createProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductBtnActionPerformed(evt);
            }
        });

        manageProductBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        manageProductBtn.setText("Manage Product");
        manageProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(createProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProductBtn)
                    .addComponent(manageProductBtn))
                .addContainerGap(643, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductBtnActionPerformed
        // TODO add your handling code here:
        ManageProductPanel manageProductPanel = new ManageProductPanel(displayPanel, productCatalog);
        displayPanel.add("manageProductPanel", manageProductPanel);
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_manageProductBtnActionPerformed

    private void createProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProductBtnActionPerformed
        // TODO add your handling code here:
        CreatePanel createPanel = new CreatePanel(displayPanel, productCatalog);
        displayPanel.add("createPanel", createPanel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_createProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createProductBtn;
    private javax.swing.JButton manageProductBtn;
    // End of variables declaration//GEN-END:variables
}
