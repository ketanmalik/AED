/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPInspectorRole;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.CompoundPharmacyEnterprise;
import Business.EnterpriseDirectory.Enterprise;
import Business.EnterpriseDirectory.MarketingEnterprise;
import Business.Network.Network;
import Business.Organization.AdvertisingOrganization;
import Business.Organization.DeliveryOrganization;
import Business.Organization.InspectionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
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
public class InspectorProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InspectorProcessJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private InspectionOrganization manufactureOrganization;
    private EcoSystem ecoSystem;
    private WorkRequest request;
    private static int id = 1;
    private boolean researcherMode;

    public InspectorProcessJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem, WorkRequest request, boolean researchMode) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.manufactureOrganization = (InspectionOrganization) organization;
        this.ecoSystem = ecoSystem;
        this.request = request;
        this.researcherMode = researchMode;
        if (!researchMode) {
            showFields(true);
            completeBtn.setEnabled(false);
            failBtn.setEnabled(false);
            runInspectionBtn.setEnabled(true);
        } else {
            showFields(false);
            completeBtn.setEnabled(true);
            failBtn.setEnabled(true);
            runInspectionBtn.setEnabled(false);
        }
    }

    public void showFields(boolean bool) {
        jLabel2.setVisible(bool);
        jLabel3.setVisible(bool);
        jLabel4.setVisible(bool);
        jLabel5.setVisible(bool);
        jLabel6.setVisible(bool);
        activeIngredient.setVisible(bool);
        sub1.setVisible(bool);
        ratio1.setVisible(bool);
        sub2.setVisible(bool);
        ratio2.setVisible(bool);
        runInspectionBtn.setVisible(bool);

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
        completeBtn = new javax.swing.JButton();
        failBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        activeIngredient = new javax.swing.JTextField();
        sub1 = new javax.swing.JTextField();
        ratio1 = new javax.swing.JTextField();
        sub2 = new javax.swing.JTextField();
        ratio2 = new javax.swing.JTextField();
        runInspectionBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        completeBtn.setText("Complete Process");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        failBtn.setText("Fail Inspection");
        failBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Active Ingredient:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Substance 1:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ratio of substance 1:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Substance 2:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ratio of substance 2:");

        activeIngredient.setEnabled(false);

        sub1.setEnabled(false);

        ratio1.setEnabled(false);

        sub2.setEnabled(false);

        ratio2.setEnabled(false);

        runInspectionBtn.setText("Run Inspection");
        runInspectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runInspectionBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Complete Process: Approves the inspection request and adds the medicine to the medicine list if not already there");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fail Inspection: Disapproves the inspection request and sends it back to either manufacture or research organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(completeBtn)
                                .addGap(18, 18, 18)
                                .addComponent(failBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backBtn)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(ratio2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(activeIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ratio1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(runInspectionBtn)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(runInspectionBtn)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(activeIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ratio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ratio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeBtn)
                    .addComponent(failBtn))
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InspectorWorkAreaJPanel iwjp = (InspectorWorkAreaJPanel) component;
        iwjp.populateTables();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        if (request.getMedicine().getPrice() == 0) {
            int input = JOptionPane.showOptionDialog(null, "Are you you want to send " + request.getId() + " request for marketing?", "Process Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
//                String progress = (notesTxtField.getText() == null || notesTxtField.getText().equals("")) ? "" : notesTxtField.getText();
//                request.setProgress(progress);
                request.setStatus("Sent for marketing");
                request.setSender(userAccount);
                request.setReceiver(null);
                userAccount.getWorkQueue().getWorkRequestList().clear();
                sendToMarketing();
                JOptionPane.showMessageDialog(null, "Your request has been sent to marketing organization");
                displayPanel.remove(this);
                Component[] componentArray = displayPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                InspectorWorkAreaJPanel mwjp = (InspectorWorkAreaJPanel) component;
                mwjp.populateTables();
                CardLayout layout = (CardLayout) displayPanel.getLayout();
                layout.previous(displayPanel);
            }

        } else {
            int input = JOptionPane.showOptionDialog(null, "Are you you want to send " + request.getId() + " order for delivery?", "Process Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
//                String progress = (notesTxtField.getText() == null || notesTxtField.getText().equals("")) ? "" : notesTxtField.getText();
//                request.setProgress(progress);
                request.setStatus("Sent for delivery");
                request.setSender(userAccount);
                request.setReceiver(null);
                userAccount.getWorkQueue().getWorkRequestList().clear();
                sendToDelivery();
                JOptionPane.showMessageDialog(null, "Your request has been sent to delivery team");
                displayPanel.remove(this);
                Component[] componentArray = displayPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                InspectorWorkAreaJPanel mwjp = (InspectorWorkAreaJPanel) component;
                mwjp.populateTables();
                CardLayout layout = (CardLayout) displayPanel.getLayout();
                layout.previous(displayPanel);
            }
        }


    }//GEN-LAST:event_completeBtnActionPerformed

    private void failBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_failBtnActionPerformed
//        String message = notesTxtField.getText();
//        if (message == null || message.equals("") || !RegexValidations.nameValidation(message)) {
//            JOptionPane.showMessageDialog(null, "Please enter valid message for failing the inspection", "Invalid Message", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        int input = JOptionPane.showOptionDialog(null, "Are you you want to fail inspection for " + request.getId() + " request?", "Process Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        if (input == JOptionPane.OK_OPTION) {
//            request.setMessage(message);
            request.setSender(userAccount);
            request.setReceiver(null);
            userAccount.getWorkQueue().getWorkRequestList().clear();

            if (request.getMedicine().getPrice() == 0) {
                request.setStatus("Research Request Accepted");
            } else {
                request.setStatus("Order Confirmed");
            }
            JOptionPane.showMessageDialog(null, "Your request has been sent back to the appropriate team");
            displayPanel.remove(this);
            Component[] componentArray = displayPanel.getComponents();
            Component component = componentArray[componentArray.length - 1];
            InspectorWorkAreaJPanel mwjp = (InspectorWorkAreaJPanel) component;
            mwjp.populateTables();
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.previous(displayPanel);
        }
    }//GEN-LAST:event_failBtnActionPerformed

    private void runInspectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runInspectionBtnActionPerformed
        boolean pass = true;
        if (!request.getReport().getActiveIngredient().equalsIgnoreCase(request.getMedicine().getActiveIngredient())) {
            activeIngredient.setText("Fail");
            pass = false;
        } else {
            activeIngredient.setText("Pass");
        }
        if (!request.getReport().getS1().equalsIgnoreCase(request.getMedicine().getS1())) {
            sub1.setText("Fail");
            pass = false;
        } else {
            sub1.setText("Pass");
        }
        if (request.getReport().getR1() != request.getMedicine().getR1()) {
            ratio1.setText("Fail");
            pass = false;
        } else {
            ratio1.setText("Pass");
        }
        if (!request.getReport().getS2().equalsIgnoreCase(request.getMedicine().getS2())) {
            sub2.setText("Fail");
            pass = false;
        } else {
            sub2.setText("Pass");
        }
        if (request.getReport().getR2() != request.getMedicine().getR2()) {
            ratio2.setText("Fail");
            pass = false;
        } else {
            ratio2.setText("Pass");
        }

        if (pass) {
            completeBtn.setEnabled(true);
            failBtn.setEnabled(false);
        } else {
            completeBtn.setEnabled(false);
            failBtn.setEnabled(true);
        }
    }//GEN-LAST:event_runInspectionBtnActionPerformed
    private void sendToDelivery() {
//        Organization org = null;
        boolean foundcp = false;
        boolean foundI = false;
        List<Organization> org = new ArrayList<>();

//        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (o instanceof DeliveryOrganization) {
//                org = o;
//                break;
//            }
//        }
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof CompoundPharmacyEnterprise) {
                    foundcp = true;
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof DeliveryOrganization) {
                            foundI = true;
                            org.add(o);
                        }
                    }
                }
            }
        }

        if (!foundcp) {
            JOptionPane.showMessageDialog(null, "Compound Pharmacy enterprise not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            foundcp = false;
        }
        if (!foundI) {
            JOptionPane.showMessageDialog(null, "Delivery Organization not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            foundI = false;
        }

        if (org != null) {
//            org.getWorkQueue().getWorkRequestList().add(request);
            for (Organization o : org) {
                o.getWorkQueue().getWorkRequestList().add(request);
            }
        }
    }

    private void sendToMarketing() {
//        Organization org = null;
        boolean foundM = false;
        boolean foundA = false;
        List<Organization> org = new ArrayList<>();
        for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof MarketingEnterprise) {
                    foundM = true;
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof AdvertisingOrganization) {
                            foundA = true;
                            org.add(o);
                        }
                    }
                }
            }
        }

        if (!foundM) {
            JOptionPane.showMessageDialog(null, "Marketing enterprise not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            foundM = false;
        }
        if (!foundA) {
            JOptionPane.showMessageDialog(null, "Advertising Organization not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            foundA = false;
        }

        if (org != null) {
//            org.getWorkQueue().getWorkRequestList().add(request);
            for (Organization o : org) {
                o.getWorkQueue().getWorkRequestList().add(request);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeIngredient;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JButton failBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField ratio1;
    private javax.swing.JTextField ratio2;
    private javax.swing.JButton runInspectionBtn;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    // End of variables declaration//GEN-END:variables
}
