/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MktDoctorRole;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.CompoundPharmacyEnterprise;
import Business.EnterpriseDirectory.Enterprise;
import Business.MedicineList.Medicine;
import Business.Network.Network;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CPManufactureWorkRequest;
import UI.MktPatientRole.PatientWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class ManufactureWRJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufactureWRJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;
    private static int id;
    private static int idPatient;

    public ManufactureWRJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        this.id = ecoSystem.getId();
        this.idPatient = ecoSystem.getId();
        populateDetails();
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
        medicineDropdown = new javax.swing.JComboBox<>();
        confirmBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        messageTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        quantityDropdown = new javax.swing.JComboBox<>();
        orderTypeTxtField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        medicineDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineDropdownActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm Order");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Message:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Price:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Type:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicine Name:");

        priceTxtField.setEnabled(false);

        quantityDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Pack", "2 Pack", "3 Pack", "4 Pack", "5 Pack", "6 Pack", "7 Pack", "8 Pack", "9 Pack" }));
        quantityDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityDropdownActionPerformed(evt);
            }
        });

        orderTypeTxtField.setEnabled(false);

        quantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantityLabel.setText("jLabel6");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(including taxes)");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone Number:");

        phoneTxtField.setText("8572078509");
        phoneTxtField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medicineDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantityDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceTxtField)
                            .addComponent(messageTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(orderTypeTxtField)
                            .addComponent(phoneTxtField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLabel)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(confirmBtn)))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backBtn)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medicineDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(71, 71, 71)
                .addComponent(confirmBtn)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateDetails() {
        for (Medicine m : ecoSystem.getMedicineList()) {
            medicineDropdown.addItem(m.getName());
        }
        orderTypeTxtField.setText("Manufacture");
        setPrice();
    }

    public void setPrice() {
        String med = String.valueOf(medicineDropdown.getSelectedItem());
        String q = String.valueOf(quantityDropdown.getSelectedItem());

        Medicine medicine = getMedicineName(med);

        int quantity = Integer.parseInt(q.substring(0, 1));
        double price = quantity * medicine.getQuantity() * medicine.getPrice();
        priceTxtField.setText("$" + String.valueOf(price));
        quantityLabel.setText("(" + medicine.getQuantity() + " units per pack)");
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (userAccount.getIdentifier().equals("mp")) {
            PatientWorkAreaJPanel pwjp = (PatientWorkAreaJPanel) component;
            pwjp.populateTable();
        } else {
            DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
            dwjp.populateTable();
        }
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private Medicine getMedicineName(String m) {
        Medicine med = null;
        for (Medicine medicine : ecoSystem.getMedicineList()) {
            if (medicine.getName().equals(m)) {
                med = medicine;
                break;
            }
        }
        return med;
    }
    private void medicineDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineDropdownActionPerformed
        setPrice();
    }//GEN-LAST:event_medicineDropdownActionPerformed

    private void quantityDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityDropdownActionPerformed
        setPrice();
    }//GEN-LAST:event_quantityDropdownActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String med = String.valueOf(medicineDropdown.getSelectedItem());
        Medicine medicine = getMedicineName(med);
        int quantity = Integer.parseInt(String.valueOf(quantityDropdown.getSelectedItem()).substring(0, 1)) * medicine.getQuantity();
        double price = Double.parseDouble(priceTxtField.getText().substring(1));
        String message = (messageTxtField.getText().equals("") || messageTxtField.getText() == null) ? "" : messageTxtField.getText();
        String phoneNumber = phoneTxtField.getText();
        CPManufactureWorkRequest request = new CPManufactureWorkRequest();
        if (userAccount.getIdentifier().equals("mp")) {
            request.setId("PM-WR-" + idPatient++);
            ecoSystem.setId(idPatient);
        } else {
            request.setId("DM-WR-" + id++);
            ecoSystem.setId(id);
        }
        request.setMedicine(medicine);
        request.setQuantity(quantity);
        request.setSender(userAccount);
        request.setStatus("Order Confirmed");
        request.setMessage(message);
        request.setPrice(price);
        request.setOriginator(userAccount);
        request.setPhoneNo("+1" + phoneNumber);

//        Organization org = null;
//        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
//            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                if (e instanceof CompoundPharmacyEnterprise) {
//                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
//                        if (o instanceof ManufactureOrganization) {
//                            org = o;
//                            break;
//                        }
//                    }
//                    break;
//                }
//            }
//        }
        List<Organization> org = new ArrayList<>();
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof CompoundPharmacyEnterprise) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof ManufactureOrganization) {
                            org.add(o);
                        }
                    }
                }
            }
        }

        if (org != null) {
            for (Organization o : org) {
                o.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        if (org != null) {
//            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);

            int input = JOptionPane.showOptionDialog(null, "Your order has been placed. Do you want to go back main screen?", "Order Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                displayPanel.remove(this);
                Component[] componentArray = displayPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                if (userAccount.getIdentifier().equals("mp")) {
                    PatientWorkAreaJPanel pwjp = (PatientWorkAreaJPanel) component;
                    pwjp.populateTable();
                } else {
                    DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
                    dwjp.populateTable();
                }
                CardLayout layout = (CardLayout) displayPanel.getLayout();
                layout.previous(displayPanel);
            }
        }
    }//GEN-LAST:event_confirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> medicineDropdown;
    private javax.swing.JTextField messageTxtField;
    private javax.swing.JTextField orderTypeTxtField;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JComboBox<String> quantityDropdown;
    private javax.swing.JLabel quantityLabel;
    // End of variables declaration//GEN-END:variables
}
