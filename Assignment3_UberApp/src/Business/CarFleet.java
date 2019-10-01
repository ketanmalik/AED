/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ketanmalik
 */
public class CarFleet {

    public List<CarAttributes> carFleet;

    public CarFleet() {
        carFleet = new ArrayList<>();
        CarAttributes ca1 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca2 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca3 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca4 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca5 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca6 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca7 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca8 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca9 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);
        CarAttributes ca10 = new CarAttributes("1", "1", 0, "1", 1, 1, "1", "1", "1", 0);

        carFleet.add(ca1);
        carFleet.add(ca2);
        carFleet.add(ca3);
        carFleet.add(ca4);
        carFleet.add(ca5);
        carFleet.add(ca6);
        carFleet.add(ca7);
        carFleet.add(ca8);
        carFleet.add(ca9);
        carFleet.add(ca10);

    }

    public List<CarAttributes> getCarFleet() {
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
