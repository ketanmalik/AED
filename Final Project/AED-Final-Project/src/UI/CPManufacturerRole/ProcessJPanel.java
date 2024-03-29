/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPManufacturerRole;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.CompoundPharmacyEnterprise;
import Business.EnterpriseDirectory.Enterprise;
import Business.Network.Network;
import Business.Organization.InspectionOrganization;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Report.Report;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class ProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ManufactureOrganization manufactureOrganization;
    private EcoSystem ecoSystem;
    private WorkRequest request;
    private static int id = 1;
    String activeIngredient = "";
    String sub1 = "";
    String sub2 = "";
    int r1 = 0;
    int r2 = 0;

    public ProcessJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem, WorkRequest request) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.manufactureOrganization = (ManufactureOrganization) organization;
        this.ecoSystem = ecoSystem;
        this.request = request;
        if (request.getReport() == null) {
            request.setReport(new Report());
            request.getReport().setActiveIngredient(activeIngredient);
            request.getReport().setS1(sub1);
            request.getReport().setS2(sub2);
            request.getReport().setR1(r1);
            request.getReport().setR2(r2);

        }
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
        jLabel1 = new javax.swing.JLabel();
        notesTxtField = new javax.swing.JTextField();
        completeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        orderNoTxtField = new javax.swing.JTextField();
        medicineNameTxtField = new javax.swing.JTextField();
        activeIngredientTxtField = new javax.swing.JTextField();
        sub1txtField = new javax.swing.JTextField();
        sub2TxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ratio1TxtField = new javax.swing.JTextField();
        ratio2TxtField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Notes to Inspection Team:");

        notesTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesTxtFieldActionPerformed(evt);
            }
        });

        completeBtn.setText("Complete Process");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Number:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Active Ingredient:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Substance 1:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Substance 2:");

        orderNoTxtField.setEnabled(false);

        medicineNameTxtField.setEnabled(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ratio:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ratio:");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

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
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activeIngredientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sub2TxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub1txtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(notesTxtField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ratio2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ratio1TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(medicineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(completeBtn)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backBtn)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(medicineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(activeIngredientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sub1txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sub2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ratio1TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ratio2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(notesTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeBtn)
                    .addComponent(saveBtn))
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateDetails() {
        orderNoTxtField.setText(request.getId());
        medicineNameTxtField.setText(request.getMedicine().getName());
        activeIngredientTxtField.setText(request.getReport().getActiveIngredient());
        sub1txtField.setText(request.getReport().getS1());
        sub2TxtField.setText(request.getReport().getS2());
        if (request.getReport().getR1() == 0) {
            ratio1TxtField.setText("");
        } else {
            ratio1TxtField.setText(String.valueOf(request.getReport().getR1()));
        }
        if (request.getReport().getR2() == 0) {
            ratio2TxtField.setText("");
        } else {
            ratio2TxtField.setText(String.valueOf(request.getReport().getR2()));
        }
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManufacturerWorkAreaJPanel mwjp = (ManufacturerWorkAreaJPanel) component;
        mwjp.populateTables();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        if (checkDetails()) {
            saveDetails();
            int input = JOptionPane.showOptionDialog(null, "Are you sure you want to send " + request.getId() + " order for inspection?", "Process Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if (input == JOptionPane.OK_OPTION) {
                String progress = (notesTxtField.getText() == null || notesTxtField.getText().equals("")) ? "" : notesTxtField.getText();
                request.setProgress(progress);
                request.setStatus("Sent for inspection");
                request.setSender(userAccount);
                request.setReceiver(null);
                userAccount.getWorkQueue().getWorkRequestList().clear();
                saveDetails();
                sendToInspection();
                JOptionPane.showMessageDialog(null, "Your request has been sent to inspection team");
                displayPanel.remove(this);
                Component[] componentArray = displayPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                ManufacturerWorkAreaJPanel mwjp = (ManufacturerWorkAreaJPanel) component;
                mwjp.populateTables();
                CardLayout layout = (CardLayout) displayPanel.getLayout();
                layout.previous(displayPanel);
            }
        }

    }//GEN-LAST:event_completeBtnActionPerformed

    private boolean checkDetails() {
        boolean correct = true;
        activeIngredient = activeIngredientTxtField.getText();
        if (activeIngredient.equals("") || activeIngredient == null) {
            JOptionPane.showMessageDialog(null, "Please enter valid active ingredient", "Invalid String", JOptionPane.ERROR_MESSAGE);
            activeIngredient = "";
            correct = false;
            return correct;
        }
        sub1 = sub1txtField.getText();
        if (sub1.equals("") || sub1 == null) {
            JOptionPane.showMessageDialog(null, "Please enter valid substance 1", "Invalid String", JOptionPane.ERROR_MESSAGE);
            sub1 = "";
            correct = false;
            return correct;
        }
        sub2 = sub2TxtField.getText();
        if (sub2.equals("") || sub2 == null) {
            JOptionPane.showMessageDialog(null, "Please enter valid substance 2", "Invalid String", JOptionPane.ERROR_MESSAGE);
            sub2 = "";
            correct = false;
            return correct;
        }
        try {
            Integer.parseInt(ratio1TxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid ratio for substance 1", "Invalid Number", JOptionPane.ERROR_MESSAGE);
            r1 = 0;
            correct = false;
            return correct;
        }
        if (Integer.parseInt(ratio1TxtField.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Ratio cannot be 0", "Invalid Ratio", JOptionPane.ERROR_MESSAGE);
            correct = false;
            return correct;
        }
        try {
            Integer.parseInt(ratio2TxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid ratio for substance 2", "Invalid Number", JOptionPane.ERROR_MESSAGE);
            r2 = 0;
            correct = false;
            return correct;
        }
        if (Integer.parseInt(ratio1TxtField.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Ratio cannot be 0", "Invalid Ratio", JOptionPane.ERROR_MESSAGE);
            correct = false;
            return correct;
        }
        r1 = Integer.parseInt(ratio1TxtField.getText());
        r2 = Integer.parseInt(ratio2TxtField.getText());
        return correct;
    }

    private void saveDetails() {
        request.getReport().setActiveIngredient(activeIngredient);
        request.getReport().setS1(sub1);
        request.getReport().setS2(sub2);
        request.getReport().setR1(r1);
        request.getReport().setR2(r2);
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if (!activeIngredientTxtField.getText().equalsIgnoreCase(activeIngredient)) {
            activeIngredient = activeIngredientTxtField.getText();
        }
        if (!sub1txtField.getText().equalsIgnoreCase(sub1)) {
            sub1 = sub1txtField.getText();
        }
        if (!sub2TxtField.getText().equalsIgnoreCase(sub2)) {
            sub2 = sub2TxtField.getText();
        }
        try {
            Integer.parseInt(ratio1TxtField.getText());
            if (Integer.parseInt(ratio1TxtField.getText()) != r1) {
                r1 = Integer.parseInt(ratio1TxtField.getText());
            }
        } catch (Exception e) {
            if (ratio1TxtField.getText().equals("") || ratio1TxtField.getText() == null) {
                r1 = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter valid ratio for substance 1", "Invalid Number", JOptionPane.ERROR_MESSAGE);
                r1 = 0;
                return;
            }
        }
        try {
            Integer.parseInt(ratio2TxtField.getText());
            if (Integer.parseInt(ratio2TxtField.getText()) != r2) {
                r2 = Integer.parseInt(ratio2TxtField.getText());
            }
        } catch (Exception e) {
            if (ratio2TxtField.getText().equals("") || ratio2TxtField.getText() == null) {
                r1 = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter valid ratio for substance 2", "Invalid Number", JOptionPane.ERROR_MESSAGE);
                r2 = 0;
                return;
            }
        }
        saveDetails();
        JOptionPane.showMessageDialog(null, "Details saved successfully");

    }//GEN-LAST:event_saveBtnActionPerformed

    private void notesTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notesTxtFieldActionPerformed

    private void sendToInspection() {
//        Organization org = null;
        boolean foundcp = false;
        boolean foundI = false;
        List<Organization> org = new ArrayList<>();

        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof CompoundPharmacyEnterprise) {
                    foundcp = true;
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof InspectionOrganization) {
                            foundI = true;
                            org.add(o);
                        }
                    }
                }
            }
        }
//        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (o instanceof InspectionOrganization) {
//                org = o;
//                break;
//            }
//        }
        if (!foundcp) {
            JOptionPane.showMessageDialog(null, "Compound Pharmacy enterprise not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            foundcp = false;
        }
        if (!foundI) {
            JOptionPane.showMessageDialog(null, "Inspection Organization not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            foundI = false;
        }

        if (org != null) {
            for (Organization o : org) {
                o.getWorkQueue().getWorkRequestList().add(request);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeIngredientTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField medicineNameTxtField;
    private javax.swing.JTextField notesTxtField;
    private javax.swing.JTextField orderNoTxtField;
    private javax.swing.JTextField ratio1TxtField;
    private javax.swing.JTextField ratio2TxtField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField sub1txtField;
    private javax.swing.JTextField sub2TxtField;
    // End of variables declaration//GEN-END:variables
}
