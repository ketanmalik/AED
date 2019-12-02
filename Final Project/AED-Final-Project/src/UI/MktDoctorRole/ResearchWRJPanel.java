/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MktDoctorRole;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.MedicineList.Medicine;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CPResearchWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class ResearchWRJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResearchWRJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;
    private static int id = 1;

    public ResearchWRJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medicineNameTxtField = new javax.swing.JTextField();
        strengthTxtField = new javax.swing.JTextField();
        ingredientTxtField = new javax.swing.JTextField();
        medicineTypeDropdown = new javax.swing.JComboBox<>();
        stateDropdown = new javax.swing.JComboBox<>();
        confirmOrderBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        phoneTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicine Name:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medicine Type:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Strength:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Active Ingredient:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State:");

        ingredientTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientTxtFieldActionPerformed(evt);
            }
        });

        medicineTypeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Capsule", "Syrup" }));
        medicineTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineTypeDropdownActionPerformed(evt);
            }
        });

        stateDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arizona", "California", "Colorado", "Florida", "Georgia", "Illinois", "Massachusetts", "Michigan", "Texas", "Wisconsin" }));

        confirmOrderBtn.setText("Send Research Request");
        confirmOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderBtnActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(mg)");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicineTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(strengthTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(ingredientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(confirmOrderBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(601, 601, 601))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backBtn)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medicineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medicineTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(strengthTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ingredientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stateDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(63, 63, 63)
                .addComponent(confirmOrderBtn)
                .addContainerGap(301, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void ingredientTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientTxtFieldActionPerformed
    }//GEN-LAST:event_ingredientTxtFieldActionPerformed

    private void confirmOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderBtnActionPerformed
        String medicineName = medicineNameTxtField.getText();
        if (medicineName == null || medicineName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter valid medicine name", "Invalid medicine name", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String medicineType = String.valueOf(medicineTypeDropdown.getSelectedItem());
        int medicineStrength;
        if (medicineType.equals("Syrup")) {
            medicineStrength = 0;
        } else {
            try {
                Integer.parseInt(strengthTxtField.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please enter valid medicine strength", "Invalid medicine strength", JOptionPane.ERROR_MESSAGE);
                return;
            }
            medicineStrength = Integer.parseInt(strengthTxtField.getText());
        }
        String activeIngredient = ingredientTxtField.getText();
        if (activeIngredient == null || activeIngredient.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter valid active ingredient", "Invalid active ingredient", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String phoneNumber = phoneTxtField.getText();
        String state = String.valueOf(stateDropdown.getSelectedItem());
        Medicine medicine = new Medicine(medicineName, medicineStrength, "", 0, 0, 0, activeIngredient, medicineType);

        CPResearchWorkRequest request = new CPResearchWorkRequest();
        request.setId("DR-WR-" + id++);
        request.setSender(userAccount);
        request.setStatus("Research Request Accepted");
        request.setOriginator(userAccount);
        request.setMedicine(medicine);
        request.setActiveIngredient(activeIngredient);
        request.setState(state);
        request.setPhoneNo("+1" + phoneNumber);

        Organization org = null;
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof ResearchOrganization) {
                        org = o;
                        break;
                    }
                }
                break;
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);

            int input = JOptionPane.showOptionDialog(null, "Your request has been placed. Do you want to go back main screen?", "Request Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                displayPanel.remove(this);
                Component[] componentArray = displayPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
                dwjp.populateTable();
                CardLayout layout = (CardLayout) displayPanel.getLayout();
                layout.previous(displayPanel);
            }
        }
    }//GEN-LAST:event_confirmOrderBtnActionPerformed

    private void medicineTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineTypeDropdownActionPerformed
        String type = String.valueOf(medicineTypeDropdown.getSelectedItem());
        if (type.equals("Syrup")) {
            strengthTxtField.setText("");
            strengthTxtField.setEnabled(false);
        } else {
            strengthTxtField.setEnabled(true);
        }
    }//GEN-LAST:event_medicineTypeDropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmOrderBtn;
    private javax.swing.JTextField ingredientTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField medicineNameTxtField;
    private javax.swing.JComboBox<String> medicineTypeDropdown;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JComboBox<String> stateDropdown;
    private javax.swing.JTextField strengthTxtField;
    // End of variables declaration//GEN-END:variables
}
