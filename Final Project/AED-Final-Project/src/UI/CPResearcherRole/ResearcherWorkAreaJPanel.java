/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CPResearcherRole;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UI.RequestDetails.ViewRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ResearcherWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResearcherWorkAreaJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ResearchOrganization researchOrganization;
    private EcoSystem ecoSystem;

    public ResearcherWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.researchOrganization = (ResearchOrganization) organization;
        this.ecoSystem = ecoSystem;
        setLabel();
        populateTables();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        openRequestTbl = new javax.swing.JTable();
        assignToMeBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        closedRequestTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewOrderBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome Name");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("As a Researcher, you can assign the research work request to yourseld and");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("it gets ready for inspection once the request is processed by you");

        openRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Medicine Name", "Sender", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(openRequestTbl);

        assignToMeBtn.setText("Assign to me");
        assignToMeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeBtnActionPerformed(evt);
            }
        });

        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        closedRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Medicine Name", "Sender", "Receiver"
            }
        ));
        jScrollPane2.setViewportView(closedRequestTbl);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Closed Request:");

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Role: Enterprise Admin");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Open Requests:");

        viewOrderBtn.setText("View Order Details");
        viewOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderBtnActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(assignToMeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(processBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(enterpriseLabel)
                            .addComponent(titleLabel))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterpriseLabel)
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(assignToMeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(processBtn)
                        .addGap(18, 18, 18)
                        .addComponent(viewOrderBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLabel() {
        titleLabel.setText("Welcome " + userAccount.getName());
        enterpriseLabel.setText("Organization:" + " " + researchOrganization.getName());
    }

    public void populateTables() {
        DefaultTableModel dtm = (DefaultTableModel) openRequestTbl.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) closedRequestTbl.getModel();

        dtm.setRowCount(0);
        dtm1.setRowCount(0);
        List<String> temp = new ArrayList<>();
        for (WorkRequest request : researchOrganization.getWorkQueue().getWorkRequestList()) {

            if (!(temp.contains(request.getId()))) {
                temp.add(request.getId());
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getMedicine();
                row[2] = request.getSender();
                row[3] = request.getReceiver();

                if (request.getStatus().equalsIgnoreCase("Research Request Accepted")
                        || request.getStatus().equalsIgnoreCase("ready for research")
                        || request.getStatus().equalsIgnoreCase("research in process")) {
                    dtm.addRow(row);
                } else {
                    dtm1.addRow(row);

                }
            }
        }
    }

    private void assignToMeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeBtnActionPerformed
        int selectedRow = openRequestTbl.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) openRequestTbl.getValueAt(selectedRow, 0);
            if (request.getReceiver() == null) {
                if (userAccount.getWorkQueue().getWorkRequestList().size() != 0) {
                    JOptionPane.showMessageDialog(null, "You already have an open request. Please process it before taking new requests", "Multiple Assignment", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    request.setReceiver(userAccount);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    request.setStatus("Ready for Research");
                    populateTables();
                }
            } else {
                JOptionPane.showMessageDialog(null, "The request has already been assigned to " + request.getReceiver(), "Multiple Assignment", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to assign");
            return;
        }
    }//GEN-LAST:event_assignToMeBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        int selectedRow = openRequestTbl.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) openRequestTbl.getValueAt(selectedRow, 0);
            if (request.getReceiver() == null || !(request.getReceiver().getName().equalsIgnoreCase(userAccount.getName()))) {
                JOptionPane.showMessageDialog(null, "The request has not been assigned to you", "Unauthorized Process", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                request.setStatus("Research In Process");
                ProcessJPanel process = new ProcessJPanel(displayPanel, userAccount, enterprise, researchOrganization, ecoSystem, request);
                CardLayout layout = (CardLayout) displayPanel.getLayout();
                displayPanel.add("process", process);
                layout.next(displayPanel);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process");
            return;
        }
    }//GEN-LAST:event_processBtnActionPerformed

    private void viewOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderBtnActionPerformed
        int selectedRow = openRequestTbl.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest wr = (WorkRequest) openRequestTbl.getValueAt(selectedRow, 0);
            ViewRequest vr = new ViewRequest(displayPanel, wr);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            displayPanel.add("vr", vr);
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view");
            return;
        }
    }//GEN-LAST:event_viewOrderBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeBtn;
    private javax.swing.JTable closedRequestTbl;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable openRequestTbl;
    private javax.swing.JButton processBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewOrderBtn;
    // End of variables declaration//GEN-END:variables
}
