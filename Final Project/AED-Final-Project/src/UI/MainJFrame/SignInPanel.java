/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MainJFrame;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.EcoSysAdmin.ManageNetworkPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class SignInPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private UserAccount userFound = null;
    private Enterprise inEnterprise = null;
    private Organization inOrganization = null;

    public SignInPanel(JPanel displayPanel, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        signInBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        usernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtFieldActionPerformed(evt);
            }
        });

        signInBtn.setText("Sign In");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(signInBtn)))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(signInBtn)
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtFieldActionPerformed

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        String username = usernameTxtField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        userFound = ecoSystem.getUserAccountDirectory().authenticateUser(username, password);
        if (userFound != null) {
            MainJFrame.setCurrentUser(userFound);
            ManageNetworkPanel manageNetworkPanel = new ManageNetworkPanel(displayPanel, ecoSystem, userFound);
            displayPanel.add("manageNetworkPanel", manageNetworkPanel);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
            MainJFrame.showButtons(true);
            return;
        } else {
            for (Network n : ecoSystem.getNetworkDirectory().getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    userFound = e.getUserAccountDirectory().authenticateUser(username, password);
                    if (userFound == null) {
                        System.out.println("UI.MainJFrame.SignInPanel.signInBtnActionPerformed()");
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            userFound = o.getUserAccountDirectory().authenticateUser(username, password);
                            if (userFound != null) {
                                inEnterprise = e;
                                inOrganization = o;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = e;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        if (userFound == null) {
            JOptionPane.showMessageDialog(null, "Please enter valid credentials", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        } else {
            MainJFrame.setCurrentUser(userFound);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            displayPanel.add("workArea", userFound.getRole().createWorkArea(displayPanel, userFound, inEnterprise, inOrganization, ecoSystem));
            layout.next(displayPanel);
        }
    }//GEN-LAST:event_signInBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signInBtn;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
