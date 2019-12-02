/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EntpAdmin;

import Business.EcoSystem.EcoSystem;
import Business.Employee.Employee;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Role;
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
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;
    private String mode = "";
    private String identifier = "";

    public ManageOrganizationJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem, String mode) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        this.mode = mode;
        setLabel();
        populateTable();
        modifyButtons();
        populateDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        orgTypeLabel = new javax.swing.JLabel();
        orgTypeDropdown = new javax.swing.JComboBox<>();
        orgNameLabel = new javax.swing.JLabel();
        orgNameTxtField = new javax.swing.JTextField();
        orgCompLabel = new javax.swing.JLabel();
        orgAddBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Name", "Organization Type", "Connected Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationTbl);
        if (organizationTbl.getColumnModel().getColumnCount() > 0) {
            organizationTbl.getColumnModel().getColumn(0).setResizable(false);
            organizationTbl.getColumnModel().getColumn(1).setResizable(false);
            organizationTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        orgTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgTypeLabel.setText("Organization Type:");

        orgTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTypeDropdownActionPerformed(evt);
            }
        });

        orgNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgNameLabel.setText("Organization Name:");

        orgNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNameTxtFieldActionPerformed(evt);
            }
        });

        orgCompLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgCompLabel.setText("Organizations List:");

        orgAddBtn.setText("Add Organization");
        orgAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAddBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome Name");

        roleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setText("Role: Enterprise Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(titleLabel)
                            .addComponent(roleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgCompLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(orgTypeLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(orgTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(orgNameLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(orgNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(orgAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleLabel)
                .addGap(50, 50, 50)
                .addComponent(orgCompLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgTypeLabel)
                    .addComponent(orgTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(orgAddBtn)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLabel() {
        titleLabel.setText("Welcome " + userAccount.getName());
    }

    private void modifyButtons() {
        MainJFrame.manageNetworkBtn.setVisible(true);
        MainJFrame.manageNetworkBtn.setText("Manage Organizations");
        MainJFrame.manageNetworkBtn.setOpaque(false);
        MainJFrame.manageNetworkBtn.setContentAreaFilled(false);
        MainJFrame.manageNetworkBtn.setBorderPainted(false);
        MainJFrame.manageNetworkBtn.setForeground(Color.black);

        MainJFrame.manageEnterpriseBtn.setVisible(true);
        MainJFrame.manageEnterpriseBtn.setText("Manage Employees");
        MainJFrame.manageEnterpriseBtn.setOpaque(false);
        MainJFrame.manageEnterpriseBtn.setContentAreaFilled(false);
        MainJFrame.manageEnterpriseBtn.setBorderPainted(false);
        MainJFrame.manageEnterpriseBtn.setForeground(Color.white);

        MainJFrame.manageAdminBtn.setVisible(true);
        MainJFrame.manageAdminBtn.setText("Manage User Accounts");
        MainJFrame.manageAdminBtn.setOpaque(false);
        MainJFrame.manageAdminBtn.setContentAreaFilled(false);
        MainJFrame.manageAdminBtn.setBorderPainted(false);
        MainJFrame.manageAdminBtn.setForeground(Color.white);

        MainJFrame.logoutBtn.setOpaque(false);
        MainJFrame.logoutBtn.setContentAreaFilled(false);
        MainJFrame.logoutBtn.setBorderPainted(false);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) organizationTbl.getModel();
        dtm.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[3];
            row[0] = o;
            row[1] = o.getOrgType();
            row[2] = enterprise.getName();

            dtm.addRow(row);
        }
    }

    private void populateDropdown() {
        orgTypeDropdown.removeAllItems();
        if (mode.equals("org")) {
            if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("compound pharmacy")) {
                orgTypeDropdown.addItem("Manufacturing");
                orgTypeDropdown.addItem("Research");
                orgTypeDropdown.addItem("Inspection");
                orgTypeDropdown.addItem("Delivery");
            } else {
                orgTypeDropdown.addItem("Advertising");
                orgTypeDropdown.addItem("Doctor");
                orgTypeDropdown.addItem("Patient");
            }
        }
    }

    private void orgTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgTypeDropdownActionPerformed

    }//GEN-LAST:event_orgTypeDropdownActionPerformed

    private void orgNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNameTxtFieldActionPerformed

    }//GEN-LAST:event_orgNameTxtFieldActionPerformed

    private Organization.Type getType(String s) {
        Organization.Type type = null;
        if (s.equalsIgnoreCase("Manufacturing")) {
            type = Organization.Type.Manufacture;
        } else if (s.equalsIgnoreCase("Research")) {
            type = Organization.Type.Research;
        } else if (s.equalsIgnoreCase("Inspection")) {
            type = Organization.Type.Inspection;
        } else if (s.equalsIgnoreCase("Delivery")) {
            type = Organization.Type.Delivery;
        } else if (s.equalsIgnoreCase("Advertising")) {
            type = Organization.Type.Advertising;
        } else if (s.equalsIgnoreCase("Doctor")) {
            type = Organization.Type.Doctor;
        } else if (s.equalsIgnoreCase("Patient")) {
            type = Organization.Type.Patient;
        }
        return type;
    }

    private boolean uniqueOrgName(String name) {
        boolean unique = true;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase(name)) {
                unique = false;
                return unique;
            }
        }
        return unique;
    }

    private void orgAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAddBtnActionPerformed
        String s = String.valueOf(orgTypeDropdown.getSelectedItem());
        String name = orgNameTxtField.getText();
        if (name == null || name.equals("") || !RegexValidations.nameValidation(name)) {
            JOptionPane.showMessageDialog(null, "Please enter valid name", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!uniqueOrgName(name)) {
            JOptionPane.showMessageDialog(null, "An organization with '" + name + "' already exists", "Duplicate Name", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Type type = getType(s);

        Organization temp = enterprise.getOrganizationDirectory().createOrganization(type);
        temp.setName(name);
        orgNameTxtField.setText("");
        populateTable();
        populateDropdown();
    }//GEN-LAST:event_orgAddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orgAddBtn;
    private javax.swing.JLabel orgCompLabel;
    private javax.swing.JLabel orgNameLabel;
    private javax.swing.JTextField orgNameTxtField;
    private javax.swing.JComboBox<String> orgTypeDropdown;
    private javax.swing.JLabel orgTypeLabel;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
