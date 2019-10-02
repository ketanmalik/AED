/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.ProductCatalog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private ProductCatalog productCatalog;
    public ViewJPanel(ProductCatalog productCatalog) {
        initComponents();
        confirmProductBtn.setEnabled(false);
        this.productCatalog = productCatalog;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)productCatalogTbl.getModel();
        dtm.setRowCount(0);
        
        for(Product e: productCatalog.getProductCatalog())
        {
            Object row[] = new Object[2];
            row[0] = e;
            row[1] = e.getDescription();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalogTbl = new javax.swing.JTable();
        viewProductBtn = new javax.swing.JButton();
        deleteProductBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        availNumTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descriptionTxtField = new javax.swing.JTextField();
        updateProductBtn = new javax.swing.JButton();
        confirmProductBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("CREATE PRODUCT");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("VIEW PRODUCT CATALOG");

        productCatalogTbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        productCatalogTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productCatalogTbl);

        viewProductBtn.setText("View Product");
        viewProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBtnActionPerformed(evt);
            }
        });

        deleteProductBtn.setText("Delete Product");
        deleteProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Name:");

        nameTxtField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Price:");

        priceTxtField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Availability Number:");

        availNumTxtField.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Description:");

        descriptionTxtField.setEnabled(false);

        updateProductBtn.setText("Update");
        updateProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductBtnActionPerformed(evt);
            }
        });

        confirmProductBtn.setText("Confirm");
        confirmProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descriptionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(confirmProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(viewProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewProductBtn)
                    .addComponent(deleteProductBtn)
                    .addComponent(updateProductBtn))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(availNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(descriptionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(confirmProductBtn)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductBtnActionPerformed
        setEnabled(false);
        confirmProductBtn.setEnabled(false);
        int selectedRow = productCatalogTbl.getSelectedRow();
       
        if(selectedRow >=0) {
            productCatalog.deleteProducts((Product) productCatalogTbl.getValueAt(selectedRow, 0));
            JOptionPane.showMessageDialog(null, "Product deleted successfully!");
            populateTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a product to delete");
        }
    }//GEN-LAST:event_deleteProductBtnActionPerformed

    private void viewProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBtnActionPerformed
        setFieldEnabled(false);
        confirmProductBtn.setEnabled(false);
        int selectedRow = productCatalogTbl.getSelectedRow();
        
        if(selectedRow >= 0) {
        Product selectedRowProduct = (Product) productCatalogTbl.getValueAt(selectedRow, 0);
        nameTxtField.setText(selectedRowProduct.getName()); 
        priceTxtField.setText(selectedRowProduct.getPrice());
        availNumTxtField.setText(selectedRowProduct.getAvailNum());
        descriptionTxtField.setText(selectedRowProduct.getDescription());
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a product to view");
        }
    }//GEN-LAST:event_viewProductBtnActionPerformed

    private void updateProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductBtnActionPerformed
        int selectedRow = productCatalogTbl.getSelectedRow();
        
        if(selectedRow >= 0) {
            setFieldEnabled(true);
            confirmProductBtn.setEnabled(true);
            Product selectedRowProduct = (Product) productCatalogTbl.getValueAt(selectedRow, 0);
            nameTxtField.setText(selectedRowProduct.getName() + "");
            priceTxtField.setText(selectedRowProduct.getPrice() + "");
            availNumTxtField.setText(selectedRowProduct.getAvailNum() + "");
            descriptionTxtField.setText(selectedRowProduct.getDescription() + "");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a product to update");
        }
    }//GEN-LAST:event_updateProductBtnActionPerformed

    private void confirmProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmProductBtnActionPerformed
        int selectedRow = productCatalogTbl.getSelectedRow();
        
        if(selectedRow >= 0) {
            Product selectedRowProduct = (Product) productCatalogTbl.getValueAt(selectedRow, 0);
            selectedRowProduct.setName(nameTxtField.getText());
            selectedRowProduct.setPrice(priceTxtField.getText());
            selectedRowProduct.setAvailNum(availNumTxtField.getText());
            selectedRowProduct.setDescription(descriptionTxtField.getText());
            
            JOptionPane.showMessageDialog(null, "Product information updated successfully!");
            populateTable();
            setFieldEnabled(false);
            confirmProductBtn.setEnabled(false);
            
        }
    }//GEN-LAST:event_confirmProductBtnActionPerformed

    private void setFieldEnabled(boolean b) {
        nameTxtField.setEnabled(b);
        priceTxtField.setEnabled(b);
        availNumTxtField.setEnabled(b);
        descriptionTxtField.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availNumTxtField;
    private javax.swing.JButton confirmProductBtn;
    private javax.swing.JButton deleteProductBtn;
    private javax.swing.JTextField descriptionTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTable productCatalogTbl;
    private javax.swing.JButton updateProductBtn;
    private javax.swing.JButton viewProductBtn;
    // End of variables declaration//GEN-END:variables
}