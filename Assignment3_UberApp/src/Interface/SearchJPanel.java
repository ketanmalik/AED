/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarAttributes;
import Business.CarFleet;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    private JPanel displayPanel;
    private CarFleet carFleet;
    private List<String> manuf;

    public SearchJPanel(JPanel displayPanel, CarFleet carFleet) {
        initComponents();
        this.displayPanel = displayPanel;
        this.carFleet = carFleet;
        handleFieldsVisibility();
        manuf = new ArrayList<>();
        manuf.add("Mazda");
        manuf.add("Toyota");
        manuf.add("Ford");
        manuf.add("Cadillac");
        manuf.add("Hyundai");
        manuf.add("Nissan");
        manuf.add("GMC");
        manuf.add("Kia");
        manuf.add("Jeep");
        for (CarAttributes e : carFleet.getCarFleet()) {
            if (!(manuf.contains(e.getManufacturer()))) {
                manufacturerDropdown.addItem(e.getManufacturer());
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        titleLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        searchDropdown = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        firstAvailCarTxtField = new javax.swing.JTextField();
        availCarsLabel = new javax.swing.JLabel();
        unavailCarsLabel = new javax.swing.JLabel();
        availCarsTxtField = new javax.swing.JTextField();
        unavailCarsTxtField = new javax.swing.JTextField();
        manufacturerDropdown = new javax.swing.JComboBox<>();
        manuFacturerListScrollPane = new javax.swing.JScrollPane();
        manufacturerSearchResult = new javax.swing.JList<>();
        yomTxtField = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(204, 204, 204));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLabel.setText("Search Cars in Uber fleet");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/backIcon.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        searchLabel.setText("Search by:");

        searchDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First available car", "Total available/unavailable cars", "Manufacturer", "Year of Manufacture", "Car capacity", "Serial number", "Model number", "Available cars in a city", "Cars which are due maintenance" }));
        searchDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchDropdownMouseClicked(evt);
            }
        });

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/searchIcon.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        firstAvailCarTxtField.setEnabled(false);
        firstAvailCarTxtField.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                firstAvailCarTxtFieldComponentHidden(evt);
            }
        });

        availCarsLabel.setText("Available Cars:");

        unavailCarsLabel.setText("Unavailable Cars:");

        availCarsTxtField.setEnabled(false);

        unavailCarsTxtField.setEnabled(false);

        manufacturerDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mazda", "Toyota", "Ford", "Cadillac", "Hyundai", "Nissan", "GMC", "Kia", "Jeep" }));

        manufacturerSearchResult.setEnabled(false);
        manuFacturerListScrollPane.setViewportView(manufacturerSearchResult);

        yomTxtField.setEnabled(false);
        yomTxtField.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                yomTxtFieldComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(manufacturerDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(firstAvailCarTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availCarsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(unavailCarsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(availCarsTxtField)
                            .addComponent(unavailCarsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(manuFacturerListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(yomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(searchLabel)
                    .addComponent(searchDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(45, 45, 45)
                .addComponent(yomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstAvailCarTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(manuFacturerListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availCarsLabel)
                            .addComponent(availCarsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unavailCarsLabel)
                            .addComponent(unavailCarsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchTerm = String.valueOf(searchDropdown.getSelectedItem());
        switch (searchTerm) {
            case "First available car":
                handleFieldsVisibility();
                int index = carFleet.firstAvailableCar();
                CarAttributes ca = carFleet.getCarFleet().get(index);
                String car = ca.getManufacturer() + " " + ca.getName();
                if (index == 100) {
                    JOptionPane.showMessageDialog(null, "No cars available at the moment");
                } else {
                    firstAvailCarTxtField.setVisible(true);
                    firstAvailCarTxtField.getParent().validate();
                    firstAvailCarTxtField.setText(car);
                }
                break;
            case "Total available/unavailable cars":
                handleFieldsVisibility();
                int avail = 0;
                for (CarAttributes e : carFleet.getCarFleet()) {
                    if (e.isAvailability()) {
                        avail += 1;
                    }
                }
                int unavail = carFleet.getCarFleet().size() - avail;
                availCarsLabel.setVisible(true);
                availCarsTxtField.setVisible(true);
                unavailCarsLabel.setVisible(true);
                unavailCarsTxtField.setVisible(true);
                availCarsTxtField.setText(avail + "");
                unavailCarsTxtField.setText(unavail + "");
                break;

            case "Manufacturer":
                if (manufacturerDropdown.isVisible()) {
                    findByManufacturer();
                } else {
                    handleFieldsVisibility();
                    manufacturerDropdown.setVisible(true);
                }
                break;
            case "Year of Manufacture":
                if (yomTxtField.isVisible()) {
                    findByYom();
                } else {
                    handleFieldsVisibility();
                    yomTxtField.setVisible(true);
                }

        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void findByYom() {
        handleFieldsVisibility();
        yomTxtField.setVisible(true);
//        System.out.println(yomTxtField.isVisible());
//        try {
//            int yom = Integer.parseInt((yomTxtField.getText()));
//            DefaultListModel<String> yomList = new DefaultListModel<>();
//            for (CarAttributes e : carFleet.getCarFleet()) {
//                if (e.getYearOfManufacture() == yom) {
//                    yomList.addElement(e.getManufacturer() + " " + e.getName());
//                }
//            }
//            manufacturerSearchResult.setModel(yomList);
//            manuFacturerListScrollPane.setVisible(true);
//            manufacturerSearchResult.setVisible(true);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Please enter valid Year of Manufacture");
//        }
//        System.out.println("Interface.SearchJPanel.findByYom()");
    }

    private void findByManufacturer() {
        handleFieldsVisibility();
        manufacturerDropdown.setVisible(true);
        DefaultListModel<String> manufacturerList = new DefaultListModel<>();
        String manufacturer = String.valueOf(manufacturerDropdown.getSelectedItem());
        for (CarAttributes e : carFleet.getCarFleet()) {
            if (e.getManufacturer().equals(manufacturer)) {
                manufacturerList.addElement(e.getName());
            }
        }
        manufacturerSearchResult.setModel(manufacturerList);
        manuFacturerListScrollPane.setVisible(true);
        manufacturerSearchResult.setVisible(true);
    }
    private void firstAvailCarTxtFieldComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_firstAvailCarTxtFieldComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_firstAvailCarTxtFieldComponentHidden

    private void searchDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchDropdownMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDropdownMouseClicked

    private void yomTxtFieldComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_yomTxtFieldComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_yomTxtFieldComponentHidden
    private void handleFieldsVisibility() {
        firstAvailCarTxtField.setVisible(false);
        availCarsTxtField.setVisible(false);
        availCarsLabel.setVisible(false);
        unavailCarsTxtField.setVisible(false);
        unavailCarsLabel.setVisible(false);
        manufacturerDropdown.setVisible(false);
        manufacturerSearchResult.setVisible(false);
        manuFacturerListScrollPane.setVisible(false);
        yomTxtField.setVisible(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availCarsLabel;
    private javax.swing.JTextField availCarsTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField firstAvailCarTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane manuFacturerListScrollPane;
    private javax.swing.JComboBox<String> manufacturerDropdown;
    private javax.swing.JList<String> manufacturerSearchResult;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchDropdown;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel unavailCarsLabel;
    private javax.swing.JTextField unavailCarsTxtField;
    private javax.swing.JTextField yomTxtField;
    // End of variables declaration//GEN-END:variables
}
