/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EcoSysAdmin;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.util.DateUtil;
import UI.MainJFrame.MainJFrame;
import java.awt.Color;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class EcoSysAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form EcoSysAdminPanel
     */
    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private UserAccount currentUser;
    private static Network networkToUpdate = null;
    private static String mode;
    
    public EcoSysAdminPanel(JPanel displayPanel, EcoSystem ecoSystem, UserAccount currentUser) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecoSystem = ecoSystem;
        this.currentUser = currentUser;
        modifyButtons();
        populateTable();
        enableFields(false);
        clearFields();
        labelEnterprise.setVisible(false);
    }
    
    private void modifyButtons() {
        MainJFrame.manageNetworkBtn.setOpaque(false);
        MainJFrame.manageNetworkBtn.setContentAreaFilled(false);
        MainJFrame.manageNetworkBtn.setBorderPainted(false);
        MainJFrame.manageNetworkBtn.setForeground(Color.black);
        
        MainJFrame.manageEnterpriseBtn.setOpaque(false);
        MainJFrame.manageEnterpriseBtn.setContentAreaFilled(false);
        MainJFrame.manageEnterpriseBtn.setBorderPainted(false);
        
        MainJFrame.manageAdminBtn.setOpaque(false);
        MainJFrame.manageAdminBtn.setContentAreaFilled(false);
        MainJFrame.manageAdminBtn.setBorderPainted(false);
        
        MainJFrame.logoutBtn.setOpaque(false);
        MainJFrame.logoutBtn.setContentAreaFilled(false);
        MainJFrame.logoutBtn.setBorderPainted(false);
    }
    
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) networksTbl.getModel();
        dtm.setRowCount(0);
        for (Network n : ecoSystem.getNetworkList()) {
            Object[] row = new Object[3];
            row[0] = n;
            row[1] = n.getLocation();
            row[2] = n.getEnterpriseDirectory().getEnterpriseList().size();
            
            dtm.addRow(row);
        }
    }
    
    private void enableFields(boolean bool) {
        nameTxtField.setEnabled(bool);
        locationTxtField.setEnabled(bool);
        enterpriseDropdown.setEnabled(bool);
        createdByTxtField.setEnabled(bool);
        createdOnTxtField.setEnabled(bool);
        lastUpdatedTxtField.setEnabled(bool);
        confirmBtn.setEnabled(bool);
    }
    
    private void clearFields() {
        nameTxtField.setText("");
        locationTxtField.setText("");
        enterpriseDropdown.removeAllItems();
        createdByTxtField.setText("");
        createdOnTxtField.setText("");
        lastUpdatedTxtField.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        networksTbl = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        locationTxtField = new javax.swing.JTextField();
        createdByTxtField = new javax.swing.JTextField();
        createdOnTxtField = new javax.swing.JTextField();
        lastUpdatedTxtField = new javax.swing.JTextField();
        enterpriseDropdown = new javax.swing.JComboBox<>();
        labelEnterprise = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("All Connected Networks:");

        networksTbl.setAutoCreateRowSorter(true);
        networksTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "No. of Enterprises"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networksTbl);
        if (networksTbl.getColumnModel().getColumnCount() > 0) {
            networksTbl.getColumnModel().getColumn(0).setResizable(false);
            networksTbl.getColumnModel().getColumn(1).setResizable(false);
            networksTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Location:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enterprise List:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Created By:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Created On:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Updated On:");

        locationTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtFieldActionPerformed(evt);
            }
        });

        labelEnterprise.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        labelEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        labelEnterprise.setText("(Please go to Manage Enterprise option to add enterprises in this network)");

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(locationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createdByTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createdOnTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastUpdatedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEnterprise))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(confirmBtn))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(createdByTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEnterprise)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(createdOnTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lastUpdatedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addComponent(confirmBtn)
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = networksTbl.getSelectedRow();
        if (selectedRow >= 0) {
            ecoSystem.getNetworkList().remove(networksTbl.getValueAt(selectedRow, 0));
            populateTable();
            clearFields();
            enableFields(false);
            JOptionPane.showMessageDialog(null, "Network deleted from Ecosystem", "Success", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a network to delete");
            
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void locationTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTxtFieldActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = networksTbl.getSelectedRow();
        if (selectedRow >= 0) {
            labelEnterprise.setVisible(false);
            enableFields(false);
            enterpriseDropdown.setEnabled(true);
            Network selectedNetwork = (Network) networksTbl.getValueAt(selectedRow, 0);
            nameTxtField.setText(selectedNetwork.getName());
            locationTxtField.setText(selectedNetwork.getLocation());
            createdByTxtField.setText(selectedNetwork.getCreatedBy().getUsername());
            createdOnTxtField.setText(DateUtil.getDateToString(selectedNetwork.getCreatedOn()));
            lastUpdatedTxtField.setText(DateUtil.getDateToString(selectedNetwork.getLastUpdatedOn()));
            if (selectedNetwork.getEnterpriseDirectory().getEnterpriseList().size() != 0) {
                for (Enterprise e : selectedNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                    enterpriseDropdown.addItem(e.getName());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a network to view details");
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        mode = "add";
        labelEnterprise.setText("(Please go to 'Manage Enterprise' option to add enterprises in this network)");
        labelEnterprise.setVisible(true);
        enableFields(true);
        enterpriseDropdown.setEnabled(false);
        clearFields();
        createdByTxtField.setText(currentUser.getUsername());
        createdByTxtField.setEnabled(false);
        createdOnTxtField.setText(DateUtil.getDateToString(new Date()));
        createdOnTxtField.setEnabled(false);
        lastUpdatedTxtField.setText(DateUtil.getDateToString(new Date()));
        lastUpdatedTxtField.setEnabled(false);

    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = networksTbl.getSelectedRow();
        if (selectedRow >= 0) {
            mode = "update";
            labelEnterprise.setText("(Please go to 'Manage Enterprise' option to update enterprise details in this network)");
            labelEnterprise.setVisible(true);
            enableFields(true);
            enterpriseDropdown.setEnabled(false);
            createdByTxtField.setEnabled(false);
            createdOnTxtField.setEnabled(false);
            lastUpdatedTxtField.setEnabled(false);
            Network selectedNetwork = (Network) networksTbl.getValueAt(selectedRow, 0);
            networkToUpdate = selectedNetwork;
            nameTxtField.setText(selectedNetwork.getName());
            locationTxtField.setText(selectedNetwork.getLocation());
            createdByTxtField.setText(selectedNetwork.getCreatedBy().getUsername());
            createdOnTxtField.setText(DateUtil.getDateToString(selectedNetwork.getCreatedOn()));
            lastUpdatedTxtField.setText(DateUtil.getDateToString(selectedNetwork.getLastUpdatedOn()));
            if (selectedNetwork.getEnterpriseDirectory().getEnterpriseList().size() != 0) {
                for (Enterprise e : selectedNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                    enterpriseDropdown.addItem(e.getName());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a network to update details");
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String name = nameTxtField.getText();
        String location = locationTxtField.getText();
        if (name.equals("") || name == null || !validateFields(name)) {
            invalidFieldsMessage("name");
            return;
        }
        if (location.equals("") || location == null || !validateFields(location)) {
            invalidFieldsMessage("location");
            return;
        }
        if (mode == "add") {
            if (!isUnique(name)) {
                JOptionPane.showMessageDialog(null, "A network with name '" + name + "' already exists", "Duplicate Network", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Network newNetwork = new Network();
            newNetwork.setName(name);
            newNetwork.setLocation(location);
            newNetwork.setCreatedBy(currentUser);
            newNetwork.setCreatedOn(DateUtil.getStringToDate(createdOnTxtField.getText()));
            newNetwork.setLastUpdatedOn(DateUtil.getStringToDate(lastUpdatedTxtField.getText()));
            
            ecoSystem.getNetworkList().add(newNetwork);
            populateTable();
            clearFields();
            enableFields(false);
            JOptionPane.showMessageDialog(null, "New network added in the Ecosystem. Please add Enterprises to this network", "Success", JOptionPane.PLAIN_MESSAGE);
        }
        
        if (mode == "update") {
            if (name.equalsIgnoreCase(networkToUpdate.getName()) && location.equalsIgnoreCase(networkToUpdate.getLocation())) {
                JOptionPane.showMessageDialog(null, "Please make some changes to update details", "No changes made", JOptionPane.ERROR_MESSAGE);
                return;
            }
            networkToUpdate.setName(name);
            networkToUpdate.setLocation(location);
            networkToUpdate.setLastUpdatedOn(new Date());
            populateTable();
            clearFields();
            enableFields(false);
            JOptionPane.showMessageDialog(null, "Network details updated in the Ecosystem", "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_confirmBtnActionPerformed
    
    private boolean validateFields(String str) {
        Pattern p = Pattern.compile("^[\\w]+[-\\w]*");
        Matcher m = p.matcher(str);
        return m.matches();
    }
    
    private void invalidFieldsMessage(String msg) {
        JOptionPane.showMessageDialog(null, "Please enter valid " + msg + " to continue", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }
    
    private boolean isUnique(String str) {
        boolean unique = true;
        for (Network n : ecoSystem.getNetworkList()) {
            if (n.getName().equalsIgnoreCase(str)) {
                unique = false;
                return unique;
            }
        }
        return unique;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField createdByTxtField;
    private javax.swing.JTextField createdOnTxtField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> enterpriseDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEnterprise;
    private javax.swing.JTextField lastUpdatedTxtField;
    private javax.swing.JTextField locationTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable networksTbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
