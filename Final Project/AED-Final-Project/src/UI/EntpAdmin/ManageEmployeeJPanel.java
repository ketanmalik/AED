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
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;
    private String mode = "";
    private String identifier = "";

    public ManageEmployeeJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem, String mode) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        this.mode = mode;
        setLabel();
        populateTable();
        populateDropdown();
        modifyButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        orgTypeLabel = new javax.swing.JLabel();
        orgNameDropdown = new javax.swing.JComboBox<>();
        orgNameLabel = new javax.swing.JLabel();
        empNameTxtField = new javax.swing.JTextField();
        orgCompLabel = new javax.swing.JLabel();
        orgAddBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        roleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setText("Role: Enterprise Admin");

        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Connected Organization", "Organization Type"
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
        orgTypeLabel.setText("Organization Name:");

        orgNameDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNameDropdownActionPerformed(evt);
            }
        });

        orgNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgNameLabel.setText("Employee Name:");

        empNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameTxtFieldActionPerformed(evt);
            }
        });

        orgCompLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgCompLabel.setText("Employee List:");

        orgAddBtn.setText("Add Employee");
        orgAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAddBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome Name");

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orgNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgNameDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(orgAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
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
                    .addComponent(orgTypeLabel)
                    .addComponent(orgNameDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgNameLabel))
                .addGap(50, 50, 50)
                .addComponent(orgAddBtn)
                .addContainerGap(197, Short.MAX_VALUE))
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
        MainJFrame.manageNetworkBtn.setForeground(Color.white);

        MainJFrame.manageEnterpriseBtn.setVisible(true);
        MainJFrame.manageEnterpriseBtn.setText("Manage Employees");
        MainJFrame.manageEnterpriseBtn.setOpaque(false);
        MainJFrame.manageEnterpriseBtn.setContentAreaFilled(false);
        MainJFrame.manageEnterpriseBtn.setBorderPainted(false);
        MainJFrame.manageEnterpriseBtn.setForeground(Color.black);

        MainJFrame.manageAdminBtn.setVisible(true);
        MainJFrame.manageAdminBtn.setText("Manage User Accounts");
        MainJFrame.manageAdminBtn.setOpaque(false);
        MainJFrame.manageAdminBtn.setContentAreaFilled(false);
        MainJFrame.manageAdminBtn.setBorderPainted(false);
        MainJFrame.manageAdminBtn.setForeground(Color.white);

        MainJFrame.homeBtn.setVisible(true);
        MainJFrame.homeBtn.setOpaque(false);
        MainJFrame.homeBtn.setContentAreaFilled(false);
        MainJFrame.homeBtn.setBorderPainted(false);

        MainJFrame.logoutBtn.setOpaque(false);
        MainJFrame.logoutBtn.setContentAreaFilled(false);
        MainJFrame.logoutBtn.setBorderPainted(false);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) organizationTbl.getModel();
        dtm.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[3];
                row[0] = e;
                row[1] = o;
                row[2] = o.getOrgType();

                dtm.addRow(row);
            }

        }
    }

    private void populateDropdown() {
        orgNameDropdown.removeAllItems();
        if (mode.equals("emp") || mode.equals("user")) {
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                orgNameDropdown.addItem(String.valueOf(o.getName()));
            }
        }
    }

    private Organization.Type getType(String s) {
        Organization.Type type = null;
        if (s.equalsIgnoreCase("Manufacture")) {
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

    private void orgNameDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNameDropdownActionPerformed

    }//GEN-LAST:event_orgNameDropdownActionPerformed

    private void empNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameTxtFieldActionPerformed

    }//GEN-LAST:event_empNameTxtFieldActionPerformed

    private void orgAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAddBtnActionPerformed
        String empName = empNameTxtField.getText();
        String s = String.valueOf(orgNameDropdown.getSelectedItem());
        Type type = null;
//        Type type = getType(s);

        if (s == null || s.equals("") || s.equals("null")) {
            JOptionPane.showMessageDialog(null, "Please create an organization first", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (empName == null || empName.equals("") || !RegexValidations.nameValidation(empName)) {
            JOptionPane.showMessageDialog(null, "Please enter valid employee name", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equals(s)) {
                type = o.getOrgType();
                o.getEmployeeDirectory().createEmployee(empName);
                break;
            }
        }

//        if (type == null) {
//            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                if (o.getName().equals(s)) {
//                    type = o.getOrgType();
//                    break;
//                }
//            }
//        }
//        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (type.getValue().equals(o.getOrgType().getValue())) {
//                o.getEmployeeDirectory().createEmployee(empName);
//                break;
//            }
//        }
        populateTable();
        populateDropdown();
        empNameTxtField.setText("");
    }//GEN-LAST:event_orgAddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empNameTxtField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orgAddBtn;
    private javax.swing.JLabel orgCompLabel;
    private javax.swing.JComboBox<String> orgNameDropdown;
    private javax.swing.JLabel orgNameLabel;
    private javax.swing.JLabel orgTypeLabel;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
