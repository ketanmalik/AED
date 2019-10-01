/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ketanmalik
 */
public class CarAttributes {

    RandomDataGeneration randomData = new RandomDataGeneration();
    private String name;
    private String modelNo;
    private int serialNo;
    private String manufacturer;
    private int yearOfManufacture;
    private int capacity;
    private boolean availability;
    private String color;
    private String dateOfCreation;
    private boolean maintenanceCertificate;
    private String dateAdded;
    private String city;
    private int availableMin;

    public CarAttributes() {
    }

    public CarAttributes(String name, String modelNo, int serialNo, String manufacturer, int yearOfManufacture, int capacity, String color, String city) {
        this.name = name;
        this.modelNo = modelNo;
        this.serialNo = serialNo;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.capacity = capacity;
        this.availability = randomData.randomAvailabilityGeneration();
        this.color = color;
        this.dateOfCreation = randomData.randomDateGeneration();
        this.maintenanceCertificate = randomData.randomMaintenanceGeneration();
        this.city = city;
        this.availableMin = randomData.randomAvailMinutesGeneration(this.availability);
    }

    public int getAvailableMin() {
        return availableMin;
    }

    public void setAvailableMin(int availableMin) {
        this.availableMin = availableMin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
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

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
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

        return this.manufacturer;
    }
}
