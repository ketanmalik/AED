/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.Date;

/**
 *
 * @author ketanmalik
 */
public class CarFleet {

    public List<CarAttributes> carFleet;
    private String dateTimeOfUpdate;

    public String getDateTimeOfUpdate() {
        return dateTimeOfUpdate;
    }

    public void setDateTimeOfUpdate(String dateTimeOfUpdate) {
        this.dateTimeOfUpdate = dateTimeOfUpdate;
    }

    public CarFleet() {
        carFleet = new ArrayList<>();
        CarAttributes ca1 = new CarAttributes("CX-5", "Sport", 100, "Mazda", 2015, 4, "Grey", "Boston");
        CarAttributes ca2 = new CarAttributes("Estima", "G 3.5L", 101, "Toyota", 2012, 7, "White", "Florida");
        CarAttributes ca3 = new CarAttributes("Territory", "Titanium", 102, "Ford", 2015, 7, "Black", "Saint Louis");
        CarAttributes ca4 = new CarAttributes("Rav4", "AWD", 103, "Toyota", 2016, 4, "Black", "Chicago");
        CarAttributes ca5 = new CarAttributes("ATS", "AWD", 104, "Cadillac", 2017, 4, "Grey", "Boston");
        CarAttributes ca6 = new CarAttributes("Tucson", "GLS", 105, "Hyundai", 2011, 4, "White", "Chicago");
        CarAttributes ca7 = new CarAttributes("Armada", "RWD", 106, "Nissan", 2017, 7, "Blue", "Chicago");
        CarAttributes ca8 = new CarAttributes("Terrain", "SLE1", 107, "GMC", 2011, 7, "Violet", "Florida");
        CarAttributes ca9 = new CarAttributes("Optima", "FWD", 108, "Kia", 2019, 4, "Silver", "Saint Louis");
        CarAttributes ca10 = new CarAttributes("Cherokee", "4WD", 109, "Jeep", 2017, 4, "Silver", "Boston");

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

        RandomDataGeneration random = new RandomDataGeneration();
        this.dateTimeOfUpdate = random.randomDateGeneration() + " at "+ random.randomTimeGeneration();
        System.out.println(dateTimeOfUpdate);
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

    public int firstAvailableCar() {
        List<Integer> list = new ArrayList<>();
        for (CarAttributes e : carFleet) {
            list.add(e.getAvailableMin());
        }
        int res = Collections.min(list);
        int index = list.indexOf(res);
        return index;
    }
}
