/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarAttributes;
import Business.CarFleet;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ketanmalik
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private JPanel displayPanel;
    private CarFleet carFleet;

    public ViewJPanel(JPanel displayPanel, CarFleet carFleet) {
        initComponents();
        this.displayPanel = displayPanel;
        this.carFleet = carFleet;
        populateTable();
        enableFields(false);
        confirmBtn.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCar = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        detailsBtn = new javax.swing.JButton();
        serialNoTxtField = new javax.swing.JTextField();
        manufacturerLabel = new javax.swing.JLabel();
        manufacturerTxtField = new javax.swing.JTextField();
        yomLabel = new javax.swing.JLabel();
        yomTxtField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        modeLabel = new javax.swing.JLabel();
        modelTxtField = new javax.swing.JTextField();
        serialNoLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        availabilityCheckBox = new javax.swing.JCheckBox();
        maintenanceLabel = new javax.swing.JLabel();
        maintenanceCheckBox = new javax.swing.JCheckBox();
        seatingCapacityLabel = new javax.swing.JLabel();
        seatingCapacityTxtField = new javax.swing.JTextField();
        colorLabel = new javax.swing.JLabel();
        colorTxtField = new javax.swing.JTextField();
        dateAddedLabel = new javax.swing.JLabel();
        dateAddedTxtField = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        cityLabel = new javax.swing.JLabel();
        cityTxtField = new javax.swing.JTextField();
        availTimeLabel = new javax.swing.JLabel();
        availTimeTxtBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLabel.setText("View Cars in Uber fleet");

        tblCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer", "Name", "Model Number", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCar);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/backIcon.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/deleteIcon.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/updateIcon.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        detailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/detailsIcon.png"))); // NOI18N
        detailsBtn.setText("Details");
        detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBtnActionPerformed(evt);
            }
        });

        manufacturerLabel.setText("Manufacturer:");

        yomLabel.setText("Year of Manufacture:");

        nameLabel.setText("Name:");

        modeLabel.setText("Model:");

        serialNoLabel.setText("Serial Number:");

        availabilityLabel.setText("Availability:");

        availabilityCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availabilityCheckBoxMouseClicked(evt);
            }
        });

        maintenanceLabel.setText("Maintenance Certificate:");

        seatingCapacityLabel.setText("Seating Capacity:");

        colorLabel.setText("Color:");

        dateAddedLabel.setText("Car added on:");

        dateAddedTxtField.setEnabled(false);

        confirmBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/confirmIcon.png"))); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        cityLabel.setText("City");

        availTimeLabel.setText("Available in:");

        availTimeTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availTimeTxtBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("(minutes)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serialNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manufacturerLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yomLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNoTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturerTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yomTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(availabilityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maintenanceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatingCapacityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(colorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateAddedLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colorTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seatingCapacityTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateAddedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availTimeTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(maintenanceCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameLabel)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(modeLabel)
                                    .addComponent(modelTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seatingCapacityLabel)
                                    .addComponent(seatingCapacityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(colorLabel)
                                    .addComponent(colorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailsBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(confirmBtn)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNoLabel)
                            .addComponent(serialNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manufacturerLabel)
                            .addComponent(manufacturerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yomLabel)
                            .addComponent(yomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateAddedLabel)
                            .addComponent(dateAddedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availabilityLabel)
                            .addComponent(availabilityCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availTimeLabel)
                            .addComponent(availTimeTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cityLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(maintenanceLabel)
                        .addComponent(maintenanceCheckBox)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        confirmBtn.setEnabled(false);
        int selectedRow = tblCar.getSelectedRow();
        if (selectedRow >= 0) {
            CarAttributes ca = (CarAttributes) tblCar.getValueAt(selectedRow, 0);
            carFleet.deleteCar(ca);
            populateTable();
            updateTextFields(ca, "delete");
        } else {
            showErrorMessage("delete");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCar.getSelectedRow();
        if (selectedRow >= 0) {
            CarAttributes ca = (CarAttributes) tblCar.getValueAt(selectedRow, 0);
            updateTextFields(ca, "update");
            enableFields(true);
            availTimeTxtBox.setEnabled(availabilityCheckBox.isSelected());
            confirmBtn.setEnabled(true);

        } else {
            showErrorMessage("update");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCar.getSelectedRow();
        if (selectedRow >= 0) {
            CarAttributes ca = (CarAttributes) tblCar.getValueAt(selectedRow, 0);
            updateTextFields(ca, "update");
        } else {
            showErrorMessage("view details");
        }
    }//GEN-LAST:event_detailsBtnActionPerformed

    private void tblCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarMouseClicked
        // TODO add your handling code here:
        updatePage();
    }//GEN-LAST:event_tblCarMouseClicked

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCar.getSelectedRow();
        CarAttributes ca = (CarAttributes) tblCar.getValueAt(selectedRow, 0);

        String name = nameTxtField.getText();
        if (name == null || name.equals("")) {
            showErrorMessage1("Name");
            return;
        } else {
            ca.setName(name);
        }
        String modelNo = modelTxtField.getText();
        if (modelNo == null || modelNo.equals("")) {
            showErrorMessage1("Model Number");
            return;
        } else {
            ca.setModelNo(modelNo);
        }
        try {
            ca.setSerialNo(Integer.parseInt(serialNoTxtField.getText()));

        } catch (NumberFormatException e) {
            showErrorMessage1("Serial Number");
            return;
        }
        String manufacturer = manufacturerTxtField.getText();
        if (manufacturer == null || manufacturer.equals("")) {
            showErrorMessage1("Manufacturer");
            return;
        } else {
            ca.setManufacturer(manufacturer);
        }
        try {
            ca.setYearOfManufacture(Integer.parseInt(yomTxtField.getText()));
        } catch (NumberFormatException e) {
            showErrorMessage1("Year of Manufacture");
            return;
        }
        try {
            ca.setCapacity(Integer.parseInt(seatingCapacityTxtField.getText()));
        } catch (Exception e) {
            showErrorMessage1("Seating Capacity");
            return;
        }
        String color = colorTxtField.getText();
        if (color == null || colorTxtField.getText().equals("")) {
            showErrorMessage1("Color");
            return;
        } else {
            ca.setColor(color);
        }
        if (availTimeTxtBox.isEnabled()) {
            try {
                ca.setAvailableMin(Integer.parseInt(availTimeTxtBox.getText()));
            } catch (NumberFormatException e) {
                showErrorMessage1("time");
                return;
            }
        } else {
            ca.setAvailableMin(0);
        }
        String city = cityTxtField.getText();
        if (city == null || cityTxtField.getText().equals("")) {
            showErrorMessage1("City");
            return;
        } else {
            ca.setCity(city);
        }
        ca.setAvailability(availabilityCheckBox.isSelected());
        ca.setMaintenanceCertificate(maintenanceCheckBox.isSelected());
        populateTable();
        updatePage();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void availTimeTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availTimeTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availTimeTxtBoxActionPerformed

    private void availabilityCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availabilityCheckBoxMouseClicked
        // TODO add your handling code here:
        availTimeTxtBox.setEnabled(availabilityCheckBox.isSelected());
//        availTimeTxtBox.setText("");
    }//GEN-LAST:event_availabilityCheckBoxMouseClicked

    private void updatePage() {
        enableFields(false);
        confirmBtn.setEnabled(false);
        nameTxtField.setText("");
        modelTxtField.setText("");
        serialNoTxtField.setText("");
        manufacturerTxtField.setText("");
        yomTxtField.setText("");
        seatingCapacityTxtField.setText("");
        colorTxtField.setText("");
        dateAddedTxtField.setText("");
        cityTxtField.setText("");
        availTimeTxtBox.setText("");
        availTimeTxtBox.setEnabled(false);
        availabilityCheckBox.setSelected(false);
        maintenanceCheckBox.setSelected(false);
    }

    private void showErrorMessage(String error) {
        JOptionPane.showMessageDialog(null, "Please select a car to " + error, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }

    private void showErrorMessage1(String error) {
        JOptionPane.showMessageDialog(null, "Please enter valid " + error, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCar.getModel();
        dtm.setRowCount(0);

        for (CarAttributes e : carFleet.getCarFleet()) {
            Object row[] = new Object[4];
            row[0] = e;
            row[1] = e.getName();
            row[2] = e.getModelNo();
            row[3] = e.isAvailability() ? "Yes" : "No";
            dtm.addRow(row);
        }
    }

    private void updateTextFields(CarAttributes cs, String mode) {
        if (mode.equals("update")) {
            nameTxtField.setText(cs.getName());
            modelTxtField.setText(cs.getModelNo() + "");
            serialNoTxtField.setText(cs.getSerialNo() + "");
            manufacturerTxtField.setText(cs.getManufacturer());
            yomTxtField.setText(cs.getYearOfManufacture() + "");
            seatingCapacityTxtField.setText(cs.getCapacity() + "");
            colorTxtField.setText(cs.getColor());
            dateAddedTxtField.setText(cs.getDateOfCreation());
            cityTxtField.setText(cs.getCity());
            availabilityCheckBox.setSelected(cs.isAvailability());
            maintenanceCheckBox.setSelected(cs.isMaintenanceCertificate());
            if ((cs.getAvailableMin() + "").equals("0") || (cs.getAvailableMin()+"").equals("100")) {
                availTimeTxtBox.setText("");
            } else {
                availTimeTxtBox.setText(cs.getAvailableMin() + "");
            }

        } else {
            nameTxtField.setText("");
            modelTxtField.setText("");
            serialNoTxtField.setText("");
            manufacturerTxtField.setText("");
            yomTxtField.setText("");
            seatingCapacityTxtField.setText("");
            colorTxtField.setText("");
            dateAddedTxtField.setText("");
            cityTxtField.setText("");
            availTimeTxtBox.setText("");
            availTimeTxtBox.setEnabled(false);
            availabilityCheckBox.setSelected(false);
            maintenanceCheckBox.setSelected(false);
        }
    }

    private void enableFields(boolean b) {
        nameTxtField.setEnabled(b);
        modelTxtField.setEnabled(b);
        serialNoTxtField.setEnabled(b);
        manufacturerTxtField.setEnabled(b);
        yomTxtField.setEnabled(b);
        seatingCapacityTxtField.setEnabled(b);
        colorTxtField.setEnabled(b);
        availabilityCheckBox.setEnabled(b);
        maintenanceCheckBox.setEnabled(b);
        cityTxtField.setEnabled(b);
        availTimeTxtBox.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availTimeLabel;
    private javax.swing.JTextField availTimeTxtBox;
    private javax.swing.JCheckBox availabilityCheckBox;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField colorTxtField;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel dateAddedLabel;
    private javax.swing.JTextField dateAddedTxtField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton detailsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox maintenanceCheckBox;
    private javax.swing.JLabel maintenanceLabel;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JTextField manufacturerTxtField;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JTextField modelTxtField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel seatingCapacityLabel;
    private javax.swing.JTextField seatingCapacityTxtField;
    private javax.swing.JLabel serialNoLabel;
    private javax.swing.JTextField serialNoTxtField;
    private javax.swing.JTable tblCar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel yomLabel;
    private javax.swing.JTextField yomTxtField;
    // End of variables declaration//GEN-END:variables
}
