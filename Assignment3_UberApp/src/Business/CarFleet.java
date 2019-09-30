/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class CarFleet {

    private ArrayList<CarAttributes> carFleet;

    public CarFleet() {
        carFleet = new ArrayList<CarAttributes>();
    }

    public ArrayList<CarAttributes> getCarFleet() {
        return carFleet;
    }

    public void setCarFleet(ArrayList<CarAttributes> carFleet) {
        this.carFleet = carFleet;
    }

    public CarAttributes addCar() {
        CarAttributes carObject = new CarAttributes();
        carFleet.add(carObject);
        return carObject;
    }

    public void deleteCar(CarAttributes car) {
        carFleet.remove(car);
    }
}
