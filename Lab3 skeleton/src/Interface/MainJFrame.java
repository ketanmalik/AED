/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 123
 */
public class MainJFrame extends javax.swing.JFrame {

    double defaultMax = 140;
    double defaultMin = 70;

    /**
     * Creates new form MainJFrame
     */
    private VitalSignHistory vsh;

    public MainJFrame() {
        initComponents();
        vsh = new VitalSignHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        displayJPanel = new javax.swing.JPanel();
        controlJpanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        abnormalBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        maxBpTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        maxBpTxtField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        splitPanel.setPreferredSize(new java.awt.Dimension(1000, 800));

        displayJPanel.setPreferredSize(new java.awt.Dimension(850, 800));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(displayJPanel);

        controlJpanel.setPreferredSize(new java.awt.Dimension(150, 800));

        createBtn.setLabel("Create Vital Sign");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setLabel("View Vital Sign");
        viewBtn.setMaximumSize(new java.awt.Dimension(70, 29));
        viewBtn.setMinimumSize(new java.awt.Dimension(70, 29));
        viewBtn.setPreferredSize(new java.awt.Dimension(70, 29));
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        abnormalBtn.setText("Abnormal");
        abnormalBtn.setMaximumSize(new java.awt.Dimension(70, 29));
        abnormalBtn.setMinimumSize(new java.awt.Dimension(70, 29));
        abnormalBtn.setPreferredSize(new java.awt.Dimension(70, 29));
        abnormalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abnormalBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("MAX_BP:");

        jLabel2.setText("MIN_BP:");

        javax.swing.GroupLayout controlJpanelLayout = new javax.swing.GroupLayout(controlJpanel);
        controlJpanel.setLayout(controlJpanelLayout);
        controlJpanelLayout.setHorizontalGroup(
            controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJpanelLayout.createSequentialGroup()
                        .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(viewBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlJpanelLayout.createSequentialGroup()
                        .addComponent(abnormalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maxBpTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maxBpTxtField1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(48, 48, 48))))
        );
        controlJpanelLayout.setVerticalGroup(
            controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(createBtn)
                .addGap(27, 27, 27)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maxBpTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(maxBpTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abnormalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(controlJpanel);

        getContentPane().add(splitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        ViewVitalJPanel viewPanel = new ViewVitalJPanel(vsh);
        splitPanel.setRightComponent(viewPanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        CreateVitalJPanel createPanel = new CreateVitalJPanel(vsh);
        splitPanel.setRightComponent(createPanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void abnormalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abnormalBtnActionPerformed
        // TODO add your handling code here:
        AbnormalJPanel abnormalPanel = new AbnormalJPanel();
        splitPanel.setRightComponent(abnormalPanel);
    }//GEN-LAST:event_abnormalBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abnormalBtn;
    private javax.swing.JPanel controlJpanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField maxBpTxtField;
    private javax.swing.JTextField maxBpTxtField1;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
