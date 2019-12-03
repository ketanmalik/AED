/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EcoSysAdmin;

import Business.EcoSystem.EcoSystem;
import Business.Employee.Employee;
import Business.EnterpriseDirectory.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CPEntpAdmin;
import Business.Role.MktEntpAdmin;
import Business.UserAccount.UserAccount;
import Business.util.RegexValidations;
import UI.MainJFrame.MainJFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ManageEnterpriseAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdmin
     */
    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private UserAccount currentUser;
    private String mode;
    private UserAccount uaToUpdate = null;

    public ManageEnterpriseAdmin(JPanel displayPanel, EcoSystem ecoSystem, UserAccount currentUser) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecoSystem = ecoSystem;
        this.currentUser = currentUser;
        modifyButtons();
        populateTable();
        enableFields(false);
        populateDropdowns();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseAdminTbl.getModel();
        dtm.setRowCount(0);
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount u : e.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = e.getName();
                    row[1] = n.getName();
                    row[2] = u.getEmployee().getName();
                    row[3] = u;

                    dtm.addRow(row);
                }
            }
        }
    }

    private void populateDropdowns() {
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()) {
            networkDropdown.addItem(network.toString());
        }
    }

    private void modifyButtons() {
        MainJFrame.manageNetworkBtn.setOpaque(false);
        MainJFrame.manageNetworkBtn.setContentAreaFilled(false);
        MainJFrame.manageNetworkBtn.setBorderPainted(false);
        MainJFrame.manageNetworkBtn.setForeground(Color.white);

        MainJFrame.manageEnterpriseBtn.setOpaque(false);
        MainJFrame.manageEnterpriseBtn.setContentAreaFilled(false);
        MainJFrame.manageEnterpriseBtn.setBorderPainted(false);
        MainJFrame.manageEnterpriseBtn.setForeground(Color.white);

        MainJFrame.manageAdminBtn.setOpaque(false);
        MainJFrame.manageAdminBtn.setContentAreaFilled(false);
        MainJFrame.manageAdminBtn.setBorderPainted(false);
        MainJFrame.manageAdminBtn.setForeground(Color.black);

        MainJFrame.logoutBtn.setOpaque(false);
        MainJFrame.logoutBtn.setContentAreaFilled(false);
        MainJFrame.logoutBtn.setBorderPainted(false);
    }

    private void enableFields(boolean bool) {
        networkDropdown.setEnabled(bool);
        enterpriseDropdown.setEnabled(bool);
        nameTxtField.setEnabled(bool);
        usernameTxtField.setEnabled(bool);
        passwordTxtField.setEnabled(bool);
        confirmBtn.setEnabled(bool);
    }

    private void clearFields() {
        nameTxtField.setText("");
        usernameTxtField.setText("");
        passwordTxtField.setText("");
    }

    private boolean authenticateUsername(String username) {
        boolean unique = true;
        for (UserAccount u : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                unique = false;
                return unique;
            }
        }
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount u : e.getUserAccountDirectory().getUserAccountList()) {
                    if (u.getUsername().equalsIgnoreCase(username)) {
                        unique = false;
                        return unique;
                    }
                }
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(username)) {
                            unique = false;
                            return unique;
                        }
                    }
                }
            }
        }
        return unique;
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
        enterpriseAdminTbl = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        networkDropdown = new javax.swing.JComboBox<>();
        enterpriseDropdown = new javax.swing.JComboBox<>();
        nameTxtField = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        passwordTxtField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enterprise Admins:");

        enterpriseAdminTbl.setAutoCreateRowSorter(true);
        enterpriseAdminTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Connected Network", "Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminTbl);
        if (enterpriseAdminTbl.getColumnModel().getColumnCount() > 0) {
            enterpriseAdminTbl.getColumnModel().getColumn(0).setResizable(false);
            enterpriseAdminTbl.getColumnModel().getColumn(1).setResizable(false);
            enterpriseAdminTbl.getColumnModel().getColumn(2).setResizable(false);
            enterpriseAdminTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Network:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enterprise:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name:");

        networkDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkDropdownActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(6-12 characters)");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(Atleast 8 letters, 1 uppercase, 1 lowercase, 1 digit & 1 special character)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(confirmBtn))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enterpriseDropdown, 0, 200, Short.MAX_VALUE)
                                    .addComponent(networkDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(70, 70, 70)
                .addComponent(confirmBtn)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        enableFields(true);
        clearFields();
        mode = "add";
    }//GEN-LAST:event_addBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String entp = String.valueOf(enterpriseDropdown.getSelectedItem());
        if (entp.equals("") || entp == null || entp.equals("null")) {
            JOptionPane.showMessageDialog(null, "Please add enterprise in this network", "No Enterprise", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String name = nameTxtField.getText();
        if (name == null || name.equals("") || !RegexValidations.nameValidation(name)) {
            JOptionPane.showMessageDialog(null, "Please enter valid name", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String username = usernameTxtField.getText();
        if (username == null || username.equals("") || !RegexValidations.usernameValidation(username)) {
            JOptionPane.showMessageDialog(null, "Please enter valid username", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String password = passwordTxtField.getText();
        if (password == null || password.equals("") || RegexValidations.passwordValidation(password)) {
            JOptionPane.showMessageDialog(null, "Please enter valid password", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mode == "update") {
            if (name.equalsIgnoreCase(uaToUpdate.getName())
                    && password.equals(uaToUpdate.getPassword())
                    && username.equalsIgnoreCase(uaToUpdate.getUsername())) {
                JOptionPane.showMessageDialog(null, "Please make some changes to update", "No changes made", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!authenticateUsername(username)) {
                if (!username.equalsIgnoreCase(uaToUpdate.getUsername())) {
                    JOptionPane.showMessageDialog(null, "Username already exists. Please provide a different username", "Duplicate username", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            uaToUpdate.setUsername(username);
            uaToUpdate.setPassword(password);
            uaToUpdate.setName(name);
        } else {
            String identifier = enterpriseDropdown.getSelectedItem().equals("Compound Pharmacy") ? "cpAdmin" : "mktAdmin";

            if (!authenticateUsername(username)) {
                JOptionPane.showMessageDialog(null, "Username already exists. Please provide a different username", "Duplicate username", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Enterprise tempEntp = null;
            for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getName().equalsIgnoreCase(entp)) {
                        if (e.getUserAccountDirectory().getUserAccountList().size() != 0) {
                            JOptionPane.showMessageDialog(null, "This enterprise already has an admin. Please update the details of existing admin or choose a different enterprise", "Multiple Admins", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        tempEntp = e;
                        break;
                    }
                }
            }
            Employee emp = tempEntp.getEmployeeDirectory().createEmployee(name);
            tempEntp.getUserAccountDirectory().createUserAccount(name, username, password, emp, identifier.equals("cpAdmin") ? new CPEntpAdmin() : new MktEntpAdmin(), identifier);
        }
        populateTable();
        clearFields();
        enableFields(false);
        JOptionPane.showMessageDialog(null, "Enterprise admin added to the network");
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void networkDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkDropdownActionPerformed
        Network network = null;
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            if (n.getName().equals(networkDropdown.getSelectedItem())) {
                network = n;
            }
        }
        if (network != null) {
            populateEnterpriseDropdown(network);
        }
    }//GEN-LAST:event_networkDropdownActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = enterpriseAdminTbl.getSelectedRow();
        if (selectedRow >= 0) {
            mode = "update";
            enableFields(false);
            usernameTxtField.setEnabled(true);
            passwordTxtField.setEnabled(true);
            confirmBtn.setEnabled(true);
            nameTxtField.setEnabled(true);
            uaToUpdate = (UserAccount) enterpriseAdminTbl.getValueAt(selectedRow, 3);
            usernameTxtField.setText(uaToUpdate.getUsername());
            passwordTxtField.setText(uaToUpdate.getPassword());
            nameTxtField.setText(uaToUpdate.getName());
            String network = (String) enterpriseAdminTbl.getValueAt(selectedRow, 1);
            String enterprise = (String) enterpriseAdminTbl.getValueAt(selectedRow, 0);
            networkDropdown.setSelectedItem(network);
            enterpriseDropdown.setSelectedItem(enterprise);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = enterpriseAdminTbl.getSelectedRow();
        if (selectedRow >= 0) {
            enableFields(false);
            UserAccount ua = (UserAccount) enterpriseAdminTbl.getValueAt(selectedRow, 3);
            usernameTxtField.setText(ua.getUsername());
            passwordTxtField.setText(ua.getPassword());
            nameTxtField.setText(ua.getName());
            String network = (String) enterpriseAdminTbl.getValueAt(selectedRow, 1);
            String enterprise = (String) enterpriseAdminTbl.getValueAt(selectedRow, 0);
            networkDropdown.setSelectedItem(network);
            enterpriseDropdown.setSelectedItem(enterprise);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view");
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void populateEnterpriseDropdown(Network network) {
        enterpriseDropdown.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseDropdown.addItem(enterprise.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTable enterpriseAdminTbl;
    private javax.swing.JComboBox<String> enterpriseDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox<String> networkDropdown;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameTxtField;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
