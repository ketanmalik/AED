/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPAdmin;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.MainJFrame.MainJFrame;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class CPAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CPAdminWorkArea
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;

    public CPAdminWorkArea(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        setLabel();
//        modifyButtons();
    }

    private void setLabel() {
        titleLabel.setText("Welcome " + userAccount.getName());
    }

//    private void modifyButtons() {
//        MainJFrame.mana
//    }

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

        setBackground(new java.awt.Color(0, 153, 153));

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
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleLabel)
                    .addComponent(titleLabel))
                .addContainerGap(757, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleLabel)
                .addContainerGap(682, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
