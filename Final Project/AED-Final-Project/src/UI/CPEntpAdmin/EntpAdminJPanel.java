/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPEntpAdmin;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.CPCharts.EmpWrChart;
import UI.CPCharts.EntpOrgChart;
import UI.CPCharts.MedManufChart;
import UI.CPCharts.MedResearchChart;
import UI.MainJFrame.MainJFrame;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ketanmalik
 */
public class EntpAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntpAdminJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;

    public EntpAdminJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        setLabel();
        modifyButtons();
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
        MainJFrame.manageEnterpriseBtn.setForeground(Color.white);

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

    private void setLabel() {
        titleLabel.setText("Welcome " + userAccount.getName());
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
        orgChartBtn = new javax.swing.JButton();
        empWrChartBtn = new javax.swing.JButton();
        medManufactureChartBtn = new javax.swing.JButton();
        medResearchChartBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome Name");

        roleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setText("Role: Enterprise Admin");

        orgChartBtn.setText("View Employee-Organization Distribution");
        orgChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgChartBtnActionPerformed(evt);
            }
        });

        empWrChartBtn.setText("View Organization-WorkRequest Distribution");
        empWrChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empWrChartBtnActionPerformed(evt);
            }
        });

        medManufactureChartBtn.setText("View Medicine-Manufacturing Distribution");
        medManufactureChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medManufactureChartBtnActionPerformed(evt);
            }
        });

        medResearchChartBtn.setText("View Medicine-Research Distribution");
        medResearchChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medResearchChartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(titleLabel)
                            .addComponent(roleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(empWrChartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orgChartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medManufactureChartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medResearchChartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleLabel)
                .addGap(132, 132, 132)
                .addComponent(orgChartBtn)
                .addGap(18, 18, 18)
                .addComponent(empWrChartBtn)
                .addGap(18, 18, 18)
                .addComponent(medManufactureChartBtn)
                .addGap(18, 18, 18)
                .addComponent(medResearchChartBtn)
                .addContainerGap(405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgChartBtnActionPerformed
        String title = "No. of employees in each Organization";
        EntpOrgChart orgChart = new EntpOrgChart(displayPanel, enterprise, title);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("orgChart", orgChart);
        layout.next(displayPanel);
    }//GEN-LAST:event_orgChartBtnActionPerformed

    private void empWrChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empWrChartBtnActionPerformed
        String title = "No. of work requests under each Employee";
        EmpWrChart empChart = new EmpWrChart(displayPanel, enterprise, title);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("empChart", empChart);
        layout.next(displayPanel);
    }//GEN-LAST:event_empWrChartBtnActionPerformed

    private void medManufactureChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medManufactureChartBtnActionPerformed
        String title = "Work Requests for manufacturing medicine";
        MedManufChart medManufChart = new MedManufChart(displayPanel, enterprise, ecoSystem, title);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("medManufChart", medManufChart);
        layout.next(displayPanel);
    }//GEN-LAST:event_medManufactureChartBtnActionPerformed

    private void medResearchChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medResearchChartBtnActionPerformed
        String title = "Work Requests for research on medicine";
        MedResearchChart medResearchChart = new MedResearchChart(displayPanel, enterprise, ecoSystem, title);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("medResearchChart", medResearchChart);
        layout.next(displayPanel);
    }//GEN-LAST:event_medResearchChartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empWrChartBtn;
    private javax.swing.JButton medManufactureChartBtn;
    private javax.swing.JButton medResearchChartBtn;
    private javax.swing.JButton orgChartBtn;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
