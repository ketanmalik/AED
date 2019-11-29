/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPEntpAdmin;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ManageCPOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;

    public ManageCPOrganizationJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        populateTable();
        populateDropdown();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) organizationTbl.getModel();
        dtm.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[3];
            row[0] = o;
            row[1] = enterprise.getName();
            row[2] = enterprise.getEnterpriseType().getValue();

            dtm.addRow(row);
        }
    }

    private void populateDropdown() {
        typeDropdown.removeAllItems();
        if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("compound pharmacy")) {
            typeDropdown.addItem("Manufacturing Organization");
            typeDropdown.addItem("Research Organization");
            typeDropdown.addItem("Inspection Organization");
            typeDropdown.addItem("Delivery Organization");
        } else {
            typeDropdown.addItem("Advertising Organization");
            typeDropdown.addItem("Doctor Organization");
            typeDropdown.addItem("Patient Organization");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typeDropdown = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Name", "Connected Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationTbl);
        if (organizationTbl.getColumnModel().getColumnCount() > 0) {
            organizationTbl.getColumnModel().getColumn(0).setResizable(false);
            organizationTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Organizations List:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Organization Type:");

        addBtn.setText("Add Organization");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(typeDropdown, 0, 250, Short.MAX_VALUE)
                                    .addComponent(nameTxtField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(addBtn)))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addComponent(addBtn)
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String s = String.valueOf(typeDropdown.getSelectedItem());
        String name = nameTxtField.getText();
        if (!uniqueName(name)) {
            JOptionPane.showMessageDialog(null, "An organization with '" + name + "' already exists", "Duplicate Name", JOptionPane.ERROR_MESSAGE);
            return;
        }
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
        Organization temp = enterprise.getOrganizationDirectory().createOrganization(type);
        temp.setName(name);
        nameTxtField.setText("");
        populateTable();
        populateDropdown();
    }//GEN-LAST:event_addBtnActionPerformed

    private boolean uniqueName(String name) {
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
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JComboBox<String> typeDropdown;
    // End of variables declaration//GEN-END:variables
}