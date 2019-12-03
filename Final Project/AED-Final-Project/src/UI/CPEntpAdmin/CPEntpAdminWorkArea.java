/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPEntpAdmin;

import Business.EcoSystem.EcoSystem;
import Business.Employee.Employee;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.AddDoctorsRole;
import Business.Role.AddPatientsRole;
import Business.Role.AdvertisingSupervisorRole;
import Business.Role.DeliveryAssistantRole;
import Business.Role.InspectorRole;
import Business.Role.ManufacturerRole;
import Business.Role.ResearcherRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UI.MainJFrame.MainJFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class CPEntpAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CPEntpAdminWorkArea
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;
    private String mode = "";
    private String identifier = "";
    private String col[] = new String[4];

    public CPEntpAdminWorkArea(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        setLabel();
        orgPassTxtField.setVisible(false);
        orgPassLabel.setVisible(false);
        manageOrganizationComponents(false);
        orgEmpLabel.setVisible(false);
        orgEmpDropdown.setVisible(false);
        orgRoleLeble.setVisible(false);
        orgRoleDropdown.setVisible(false);
        modifyButtons();
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

    private void setLabel() {
        titleLabel.setText("Welcome " + userAccount.getName());
    }

    private void populateOrgTable(String mode, String[] col) {
        DefaultTableModel dtm = (DefaultTableModel) organizationTbl.getModel();
        dtm.setRowCount(0);
        dtm.setColumnCount(0);
        if (mode.equals("org")) {
            dtm.addColumn(col[0]);
            dtm.addColumn(col[1]);
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                Object[] row = new Object[3];
                row[0] = o;
                row[1] = enterprise.getName();

                dtm.addRow(row);
            }
        } else if (mode.equals("emp")) {
            dtm.addColumn(col[0]);
            dtm.addColumn(col[1]);
            dtm.addColumn(col[2]);
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
                    Object[] row = new Object[3];
                    row[0] = e;
                    row[1] = o;
                    row[2] = o.getOrgType();
                    dtm.addRow(row);
                }
            }
        } else if (mode.equals("user")) {
            dtm.addColumn(col[0]);
            dtm.addColumn(col[1]);
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = u;
                    row[1] = u.getRole();
                    dtm.addRow(row);
                }
            }
        }

    }

    private void populateOrgDropdown(String mode) {
        orgTypeDropdown.removeAllItems();
        if (mode.equals("org")) {
            if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("compound pharmacy")) {
                orgTypeDropdown.addItem("Manufacturing Organization");
                orgTypeDropdown.addItem("Research Organization");
                orgTypeDropdown.addItem("Inspection Organization");
                orgTypeDropdown.addItem("Delivery Organization");
            } else {
                orgTypeDropdown.addItem("Advertising Organization");
                orgTypeDropdown.addItem("Doctor Organization");
                orgTypeDropdown.addItem("Patient Organization");
            }
        } else if (mode.equals("emp") || mode.equals("user")) {
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                orgTypeDropdown.addItem(String.valueOf(o.getName()));
            }
        }
    }

    public void manageOrganizationComponents(boolean bool) {
        orgAddBtn.setVisible(bool);
        orgCompLabel.setVisible(bool);
        orgNameLabel.setVisible(bool);
        orgTypeLabel.setVisible(bool);
        jScrollPane1.setVisible(bool);
        organizationTbl.setVisible(bool);
        orgTypeDropdown.setVisible(bool);
        orgNameTxtField.setVisible(bool);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        organizationManageBtn = new javax.swing.JButton();
        employeesManageBtn = new javax.swing.JButton();
        userAccountManageBtn = new javax.swing.JButton();
        orgCompLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        orgTypeLabel = new javax.swing.JLabel();
        orgTypeDropdown = new javax.swing.JComboBox<>();
        orgNameLabel = new javax.swing.JLabel();
        orgNameTxtField = new javax.swing.JTextField();
        orgAddBtn = new javax.swing.JButton();
        orgPassLabel = new javax.swing.JLabel();
        orgPassTxtField = new javax.swing.JTextField();
        orgEmpLabel = new javax.swing.JLabel();
        orgEmpDropdown = new javax.swing.JComboBox<>();
        orgRoleLeble = new javax.swing.JLabel();
        orgRoleDropdown = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 153));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome Name");

        roleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setText("Role: Enterprise Admin");

        organizationManageBtn.setText("Manage Organizations");
        organizationManageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationManageBtnActionPerformed(evt);
            }
        });

        employeesManageBtn.setText("Manage Employees");
        employeesManageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesManageBtnActionPerformed(evt);
            }
        });

        userAccountManageBtn.setText("Manage User Accounts");
        userAccountManageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAccountManageBtnActionPerformed(evt);
            }
        });

        orgCompLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgCompLabel.setText("Organizations List:");

        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(organizationTbl);

        orgTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgTypeLabel.setText("Organization Type:");

        orgTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTypeDropdownActionPerformed(evt);
            }
        });

        orgNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgNameLabel.setText("Username:");

        orgNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNameTxtFieldActionPerformed(evt);
            }
        });

        orgAddBtn.setText("Add User Account");
        orgAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAddBtnActionPerformed(evt);
            }
        });

        orgPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgPassLabel.setText("Password:");

        orgEmpLabel.setForeground(new java.awt.Color(255, 255, 255));
        orgEmpLabel.setText("Employee:");

        orgRoleLeble.setForeground(new java.awt.Color(255, 255, 255));
        orgRoleLeble.setText("Role:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(employeesManageBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(organizationManageBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(userAccountManageBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orgCompLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orgNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orgRoleLeble, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgTypeDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orgNameTxtField)
                            .addComponent(orgRoleDropdown, 0, 160, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orgPassLabel)
                            .addComponent(orgEmpLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgPassTxtField)
                            .addComponent(orgEmpDropdown, 0, 160, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orgAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(titleLabel)
                    .addComponent(roleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleLabel)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orgCompLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(organizationManageBtn)
                        .addGap(18, 18, 18)
                        .addComponent(employeesManageBtn)
                        .addGap(18, 18, 18)
                        .addComponent(userAccountManageBtn)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgTypeLabel)
                    .addComponent(orgTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgEmpLabel)
                    .addComponent(orgEmpDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgNameLabel)
                    .addComponent(orgPassLabel)
                    .addComponent(orgPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(orgAddBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orgRoleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orgRoleLeble)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userAccountManageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAccountManageBtnActionPerformed
        populateOrgDropdown("user");
        orgPassLabel.setVisible(true);
        orgPassTxtField.setVisible(true);
        orgEmpLabel.setVisible(true);
        orgEmpDropdown.setVisible(true);
        orgRoleLeble.setVisible(true);
        orgRoleDropdown.setVisible(true);
        orgNameTxtField.setText("");
        orgPassTxtField.setText("");
        orgCompLabel.setText("User Accounts List:");
        orgAddBtn.setText("Add User Account");
        orgNameLabel.setText("Username:");
        orgTypeLabel.setText("Organization Name:");
        manageOrganizationComponents(true);
        col[0] = "Username";
        col[1] = "Role";
        mode = "user";
        populateOrgTable(mode, col);
    }//GEN-LAST:event_userAccountManageBtnActionPerformed

    private void organizationManageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationManageBtnActionPerformed
        orgPassLabel.setVisible(false);
        orgPassTxtField.setVisible(false);
        orgEmpLabel.setVisible(false);
        orgEmpDropdown.setVisible(false);
        orgRoleLeble.setVisible(false);
        orgRoleDropdown.setVisible(false);
        orgNameTxtField.setText("");
        orgCompLabel.setText("Organization List:");
        orgAddBtn.setText("Add Organization");
        orgNameLabel.setText("Organization Name:");
        orgTypeLabel.setText("Organization Type:");
        mode = "org";
        col[0] = "Organization Name";
        col[1] = "Connected Enterprise";
        manageOrganizationComponents(true);
        populateOrgTable(mode, col);
        populateOrgDropdown("org");
    }//GEN-LAST:event_organizationManageBtnActionPerformed

    private void orgAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAddBtnActionPerformed
        String s = String.valueOf(orgTypeDropdown.getSelectedItem());
        String name = orgNameTxtField.getText();
        Type type = getType(s);
        if (mode.equals("org")) {
            if (!uniqueOrgName(name)) {
                JOptionPane.showMessageDialog(null, "An organization with '" + name + "' already exists", "Duplicate Name", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Organization temp = enterprise.getOrganizationDirectory().createOrganization(type);
            temp.setName(name);
            orgNameTxtField.setText("");
            populateOrgTable(mode, col);
            populateOrgDropdown(mode);
        } else if (mode.equals("emp")) {
            if (type == null) {
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getName().equals(s)) {
                        type = o.getOrgType();
                        break;
                    }
                }
            }
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (type.getValue().equals(o.getOrgType().getValue())) {
                    o.getEmployeeDirectory().createEmployee(name);
                    break;
                }
            }
            populateOrgTable(mode, col);
            populateOrgDropdown(mode);
            orgNameTxtField.setText("");
        } else if (mode.equals("user")) {
            String username = orgNameTxtField.getText();
            String password = orgPassTxtField.getText();
            String empName = String.valueOf(orgEmpDropdown.getSelectedItem());
            String r = String.valueOf(orgRoleDropdown.getSelectedItem());

            if (username.equals("") || username == null) {
                JOptionPane.showMessageDialog(null, "Username cannot be empty");
                return;
            }
            if (password.equals("") || password == null) {
                JOptionPane.showMessageDialog(null, "Password cannot be empty");
                return;
            }
            if (type == null) {
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getName().equals(s)) {
                        type = o.getOrgType();
                        break;
                    }
                }
            }
            Organization org = null;
            Employee emp = null;
            Role role = getRole(r);
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (type.getValue().equals(o.getOrgType().getValue())) {
                    org = o;
                    for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
                        if (e.getName().equalsIgnoreCase(empName)) {
                            emp = e;
                            break;
                        }
                    }
                    break;
                }
            }
            org.getUserAccountDirectory().createUserAccount(emp.getName(), username, password, emp, role, identifier);
            populateOrgTable(mode, col);
        }

    }//GEN-LAST:event_orgAddBtnActionPerformed

    private Role getRole(String r) {
        Role role = null;
        if (r.equals("ManufacturerRole")) {
            role = new ManufacturerRole();
            identifier = "cm";
        } else if (r.equalsIgnoreCase("ResearcherRole")) {
            role = new ResearcherRole();
            identifier = "cr";
        } else if (r.equalsIgnoreCase("InspectorRole")) {
            role = new InspectorRole();
            identifier = "ci";
        } else if (r.equalsIgnoreCase("DeliveryAssistantRole")) {
            role = new DeliveryAssistantRole();
            identifier = "cd";
        } else if (r.equalsIgnoreCase("AdvertisingSupervisorRole")) {
            role = new AdvertisingSupervisorRole();
            identifier = "ma";
        } else if (r.equalsIgnoreCase("DoctorsHRRole")) {
            role = new AddDoctorsRole();
            identifier = "md";
        } else if (r.equalsIgnoreCase("PatientsHRRole")) {
            role = new AddPatientsRole();
            identifier = "mp";
        }
        return role;
    }

    private Type getType(String s) {
        Type type = null;
        if (s.equalsIgnoreCase("Manufacturing Organization")) {
            type = Organization.Type.Manufacture;
        } else if (s.equalsIgnoreCase("Research Organization")) {
            type = Organization.Type.Research;
        } else if (s.equalsIgnoreCase("Inspection Organization")) {
            type = Organization.Type.Inspection;
        } else if (s.equalsIgnoreCase("Delivery Organization")) {
            type = Organization.Type.Delivery;
        } else if (s.equalsIgnoreCase("Advertising Organization")) {
            type = Organization.Type.Advertising;
        } else if (s.equalsIgnoreCase("Doctor Organization")) {
            type = Organization.Type.Doctor;
        } else if (s.equalsIgnoreCase("Patient Organization")) {
            type = Organization.Type.Patient;
        }
        return type;
    }

    private void employeesManageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesManageBtnActionPerformed
        orgPassLabel.setVisible(false);
        orgPassTxtField.setVisible(false);
        orgEmpLabel.setVisible(false);
        orgEmpDropdown.setVisible(false);
        orgRoleLeble.setVisible(false);
        orgRoleDropdown.setVisible(false);
        orgNameTxtField.setText("");
        orgPassTxtField.setText("");
        orgCompLabel.setText("Employee List:");
        orgAddBtn.setText("Add Employee");
        orgNameLabel.setText("Employee Name:");
        orgTypeLabel.setText("Organization Name:");
        manageOrganizationComponents(true);
        mode = "emp";
        col[0] = "Employee Name";
        col[1] = "Connected Organization";
        col[2] = "Organization Type";
        populateOrgTable(mode, col);
        populateOrgDropdown(mode);
    }//GEN-LAST:event_employeesManageBtnActionPerformed

    private void orgNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgNameTxtFieldActionPerformed

    private void orgTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgTypeDropdownActionPerformed
        try {
            if (mode.equals("user")) {
                String s = String.valueOf(orgTypeDropdown.getSelectedItem());
                Type type = getType(s);
                if (type == null) {
                    for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equals(s)) {
                            type = o.getOrgType();
                            break;
                        }
                    }
                }
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getOrgType().getValue().equals(type.getValue())) {
                        populateEmployeeComboBox(o);
                        populateRoleComboBox(o);
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "d");
        }
    }//GEN-LAST:event_orgTypeDropdownActionPerformed

    private void populateEmployeeComboBox(Organization organization) {
        orgEmpDropdown.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            orgEmpDropdown.addItem(String.valueOf(employee));
        }
    }

    private void populateRoleComboBox(Organization organization) {
        orgRoleDropdown.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            orgRoleDropdown.addItem(String.valueOf(role));
        }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeesManageBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orgAddBtn;
    private javax.swing.JLabel orgCompLabel;
    private javax.swing.JComboBox<String> orgEmpDropdown;
    private javax.swing.JLabel orgEmpLabel;
    private javax.swing.JLabel orgNameLabel;
    private javax.swing.JTextField orgNameTxtField;
    private javax.swing.JLabel orgPassLabel;
    private javax.swing.JTextField orgPassTxtField;
    private javax.swing.JComboBox<String> orgRoleDropdown;
    private javax.swing.JLabel orgRoleLeble;
    private javax.swing.JComboBox<String> orgTypeDropdown;
    private javax.swing.JLabel orgTypeLabel;
    private javax.swing.JButton organizationManageBtn;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton userAccountManageBtn;
    // End of variables declaration//GEN-END:variables
}
