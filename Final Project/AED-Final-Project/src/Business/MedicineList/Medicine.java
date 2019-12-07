/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicineList;

/**
 *
 * @author ketanmalik
 */
public class Medicine {

    private String name;
    private int strength;
    private String description;
    private double price;
    private double marketPrice;
    private int quantity;
    private String activeIngredient;
    private String type;
    private String s1;
    private String s2;
    private int r1;
    private int r2;

    public Medicine(String name, int strength, String description, double price, double marketPrice, int quantity, String activeIngredient, String type, String s1, String s2, int r1, int r2) {
        this.name = name;
        this.strength = strength;
        this.description = description;
        this.price = price;
        this.marketPrice = marketPrice;
        this.quantity = quantity;
        this.activeIngredient = activeIngredient;
        this.type = type;
        this.s1 = s1;
        this.s2 = s2;
        this.r1 = r1;
        this.r2 = r2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
