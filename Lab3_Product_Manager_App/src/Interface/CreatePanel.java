/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.ProductCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private JPanel displayPanel;
    private ProductCatalog productCatalog;

    public CreatePanel(JPanel displayPanel, ProductCatalog productCatalog) {
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

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        availabilityTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionTxtField = new javax.swing.JTextField();
        createProductBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/backIcon16px.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Create Product");

        jLabel2.setText("Product Name:*");

        jLabel3.setText("Availability:*");

        jLabel4.setText("Price:*");

        jLabel5.setText("Description:*");

        createProductBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        createProductBtn.setText("Create Product");
        createProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availabilityTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(createProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backBtn)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(availabilityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descriptionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(createProductBtn)
                .addContainerGap(301, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);

    }//GEN-LAST:event_backBtnActionPerformed

    private void createProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProductBtnActionPerformed
        // TODO add your handling code here:
        String name = nameTxtField.getText();
        if (name == null || name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name text field cannot be empty", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(availabilityTxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid value for availability", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Double.parseDouble(priceTxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid value for price", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String description = descriptionTxtField.getText();
        if (description == null || description.equals("")) {
            JOptionPane.showMessageDialog(null, "Description field cannot be empty", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Product product = productCatalog.addProduct();
        product.setName(name);
        product.setAvailability(Integer.parseInt(availabilityTxtField.getText()));
        product.setPrice(Double.parseDouble(priceTxtField.getText()));
        product.setDescription(descriptionTxtField.getText());
        JOptionPane.showMessageDialog(null, "Product added to catalog", "Product Created", JOptionPane.PLAIN_MESSAGE);
        nameTxtField.setText("");
        availabilityTxtField.setText("");
        priceTxtField.setText("");
        descriptionTxtField.setText("");
    }//GEN-LAST:event_createProductBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createProductBtn;
    private javax.swing.JTextField descriptionTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField priceTxtField;
    // End of variables declaration//GEN-END:variables
}