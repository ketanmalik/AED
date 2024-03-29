/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MktPatientRole;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.util.DateUtil;
import Business.WorkQueue.WorkRequest;
import UI.MktDoctorRole.ManufactureWRJPanel;
import UI.RequestDetails.ViewMedicineList;
import UI.RequestDetails.ViewRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private JPanel displayPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem ecoSystem;

    public PatientWorkAreaJPanel(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        setLabel();
        populateTable();
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
        requestTbl = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        requestMedicineBtn = new javax.swing.JButton();
        viewOrderBtn = new javax.swing.JButton();
        description1 = new javax.swing.JLabel();
        viewMedicineBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        requestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Receiver", "Request Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTbl);

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome Name");

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Role: Enterprise Admin");

        requestMedicineBtn.setText("Request Medicine");
        requestMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicineBtnActionPerformed(evt);
            }
        });

        viewOrderBtn.setText("View Order Details");
        viewOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderBtnActionPerformed(evt);
            }
        });

        description1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        description1.setForeground(new java.awt.Color(255, 255, 255));
        description1.setText("As a patient representative, you can 'Request Medicine' to order from a list of medicines we currently manufacture");

        viewMedicineBtn.setText("View Medicine List");
        viewMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(enterpriseLabel)
                            .addComponent(titleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(description1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(requestMedicineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(viewMedicineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterpriseLabel)
                .addGap(35, 35, 35)
                .addComponent(description1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(requestMedicineBtn)
                        .addGap(18, 18, 18)
                        .addComponent(viewOrderBtn)
                        .addGap(18, 18, 18)
                        .addComponent(viewMedicineBtn)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLabel() {
        titleLabel.setText("Welcome " + userAccount.getName());
        enterpriseLabel.setText("Enterprise: " + enterprise.getName());
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) requestTbl.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = DateUtil.getDateToString(request.getRequestDate());
            row[3] = request.getStatus();

            dtm.addRow(row);
        }
    }

    private void requestMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicineBtnActionPerformed
        ManufactureWRJPanel manufactureWR = new ManufactureWRJPanel(displayPanel, userAccount, enterprise, organization, ecoSystem);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("manufactureWR", manufactureWR);
        layout.next(displayPanel);
    }//GEN-LAST:event_requestMedicineBtnActionPerformed

    private void viewOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderBtnActionPerformed
        int selectedRow = requestTbl.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest wr = (WorkRequest) requestTbl.getValueAt(selectedRow, 0);
            ViewRequest vr = new ViewRequest(displayPanel, wr);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            displayPanel.add("vr", vr);
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view");
            return;
        }
    }//GEN-LAST:event_viewOrderBtnActionPerformed

    private void viewMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicineBtnActionPerformed
        ViewMedicineList vml = new ViewMedicineList(displayPanel, ecoSystem);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        displayPanel.add("vml", vml);
        layout.next(displayPanel);
    }//GEN-LAST:event_viewMedicineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel description1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestMedicineBtn;
    private javax.swing.JTable requestTbl;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewMedicineBtn;
    private javax.swing.JButton viewOrderBtn;
    // End of variables declaration//GEN-END:variables
}
