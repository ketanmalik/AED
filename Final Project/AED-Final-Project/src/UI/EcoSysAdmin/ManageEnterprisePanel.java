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
import UI.MainJFrame.MainJFrame;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ManageEnterprisePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprisePanel
     */
    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private UserAccount currentUser;
    private Enterprise enterpriseToUpdate = null;
    private String mode;

    public ManageEnterprisePanel(JPanel displayPanel, EcoSystem ecoSystem, UserAccount currentUser) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecoSystem = ecoSystem;
        this.currentUser = currentUser;
        modifyButtons();
        populateTable();
        populateDropdowns();
        enableFields(false);
    }

    private void enableFields(boolean bool) {
        networkDropdown.setEnabled(bool);
        typeDropdown.setEnabled(bool);
        nameTxtField.setEnabled(bool);
        confirmBtn.setEnabled(bool);
    }

    private void modifyButtons() {
        MainJFrame.manageNetworkBtn.setOpaque(false);
        MainJFrame.manageNetworkBtn.setContentAreaFilled(false);
        MainJFrame.manageNetworkBtn.setBorderPainted(false);
        MainJFrame.manageNetworkBtn.setForeground(Color.white);

        MainJFrame.manageEnterpriseBtn.setOpaque(false);
        MainJFrame.manageEnterpriseBtn.setContentAreaFilled(false);
        MainJFrame.manageEnterpriseBtn.setBorderPainted(false);
        MainJFrame.manageEnterpriseBtn.setForeground(Color.black);

        MainJFrame.manageAdminBtn.setOpaque(false);
        MainJFrame.manageAdminBtn.setContentAreaFilled(false);
        MainJFrame.manageAdminBtn.setBorderPainted(false);
        MainJFrame.manageAdminBtn.setForeground(Color.white);

        MainJFrame.logoutBtn.setOpaque(false);
        MainJFrame.logoutBtn.setContentAreaFilled(false);
        MainJFrame.logoutBtn.setBorderPainted(false);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseTbl.getModel();
        dtm.setRowCount(0);
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = e;
                row[1] = n;
                row[2] = e.getType();

                dtm.addRow(row);
            }
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

        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTbl = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        networkDropdown = new javax.swing.JComboBox<>();
        typeDropdown = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 153));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        enterpriseTbl.setAutoCreateRowSorter(true);
        enterpriseTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Connected Network", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTbl);

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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("All Connected Enterprises:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Network:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTxtField)
                                    .addComponent(networkDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeDropdown, 0, 180, Short.MAX_VALUE))))))
                .addContainerGap(391, Short.MAX_VALUE))
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
                        .addComponent(updateBtn)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(confirmBtn)
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean isUnique(String str) {
        boolean unique = true;
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase(str)) {
                    unique = false;
                    return unique;
                }
            }

        }
        return unique;
    }

    private void populateDropdowns() {
        networkDropdown.removeAllItems();
        typeDropdown.removeAllItems();

        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            networkDropdown.addItem(n.toString());
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                typeDropdown.addItem(e.getType());
            }
        }
    }

    private boolean validateStr(String str) {
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        return m.matches();
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        mode = "add";
        enableFields(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = enterpriseTbl.getSelectedRow();
        if (selectedRow >= 0) {
            enableFields(false);
            Enterprise e = (Enterprise) enterpriseTbl.getValueAt(selectedRow, 0);
            Network n = (Network) enterpriseTbl.getValueAt(selectedRow, 1);
            networkDropdown.setSelectedItem(n.getName());
            typeDropdown.setSelectedItem(e.getType());
            nameTxtField.setText(e.getName());
        } else {
            JOptionPane.showMessageDialog(null, "Please select an enterprise to view");
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = enterpriseTbl.getSelectedRow();
        if (selectedRow >= 0) {
            mode = "update";
            enableFields(false);
            enterpriseToUpdate = (Enterprise) enterpriseTbl.getValueAt(selectedRow, 0);
            Network network = (Network) enterpriseTbl.getValueAt(selectedRow, 1);
            nameTxtField.setEnabled(true);
            confirmBtn.setEnabled(true);
            nameTxtField.setText(enterpriseToUpdate.getName());
            typeDropdown.setSelectedItem(enterpriseToUpdate.getType());
            networkDropdown.setSelectedItem(network.getName());

        } else {
            JOptionPane.showMessageDialog(null, "Please select an enterprise to update");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String name = nameTxtField.getText();
        if (name.equals("") || name == null) {
            JOptionPane.showMessageDialog(null, "Please enter a valid enterprise name to continue", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mode.equals("add")) {
            if (!isUnique(name)) {
                JOptionPane.showMessageDialog(null, "An enterprise with name '" + name + "' already exists", "Duplicate Enterprise", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String s = String.valueOf(networkDropdown.getSelectedItem());
            String type = String.valueOf(typeDropdown.getSelectedItem());
            Network temp = null;
            for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
                if (n.getName().equalsIgnoreCase(s)) {
                    temp = n;
                    break;
                }
            }

            Enterprise newEnterprise = temp.getEnterpriseDirectory().createEnterprise(name);
            newEnterprise.setType(type);
            populateTable();
            nameTxtField.setText("");
            enableFields(false);
            JOptionPane.showMessageDialog(null, "New enterprise added to network", "Success", JOptionPane.PLAIN_MESSAGE);
        }

        if (mode.equals("update")) {
            if (name.equalsIgnoreCase(enterpriseToUpdate.getName())) {
                JOptionPane.showMessageDialog(null, "Please make some changes to update details", "No changes made", JOptionPane.ERROR_MESSAGE);
                return;
            }
            enterpriseToUpdate.setName(name);
            populateTable();
            enableFields(false);
            nameTxtField.setText("");
            JOptionPane.showMessageDialog(null, "Enterprise details updated in the Network", "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_confirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTable enterpriseTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox<String> networkDropdown;
    private javax.swing.JComboBox<String> typeDropdown;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}