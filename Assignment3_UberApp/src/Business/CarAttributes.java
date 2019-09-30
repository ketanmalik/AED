/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ketanmalik
 */
public class CarAttributes {

    private String name;
    private String modelNo;
    private int serialNo;
    private String manufacturer;
    private int yearOfManufacture;
    private int capacity;
    private boolean availability;
    private String color;
    private Date dateOfCreation;
    private boolean maintenanceCertificate;
    private String mode = "";
    private String dateAdded;

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        System.out.println(mode);
        this.mode = mode;
        System.out.println(this.mode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public boolean isMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(boolean maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }

    @Override
    public String toString() {
        String s = "";
        System.out.println(this.mode);
        if (getMode().equals("writeToFile")) {
            s = this.name + "," + this.modelNo + "," + this.serialNo + "," + this.manufacturer + "," + this.yearOfManufacture + "," + this.capacity + "," + this.color + "," + this.dateAdded;
        } else {
            s = this.manufacturer;
        }
        this.mode = "";
        return s;
    }
}
