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
        CarAttributes ca9 = new CarAttributes("Optima", "FWD", 108, "Kia", 2018, 4, "Silver", "Saint Louis");
        CarAttributes ca10 = new CarAttributes("Compass", "4WD", 109, "Jeep", 2017, 4, "Silver", "Boston");
        CarAttributes ca11 = new CarAttributes("CX-9", "Sport", 110, "Mazda", 2015, 4, "Red", "Boston");
        CarAttributes ca12 = new CarAttributes("Innova", "G 3.5L", 111, "Toyota", 2012, 7, "White", "Florida");
        CarAttributes ca13 = new CarAttributes("Endeavour", "Titanium", 112, "Ford", 2015, 7, "Black", "Boston");
        CarAttributes ca14 = new CarAttributes("Fortuner", "4WD", 113, "Toyota", 2016, 7, "Black", "Chicago");
        CarAttributes ca15 = new CarAttributes("Atlanta", "AWD", 114, "Cadillac", 2017, 4, "Grey", "Boston");
        CarAttributes ca16 = new CarAttributes("Sonata", "Sport", 115, "Hyundai", 2011, 4, "White", "Chicago");
        CarAttributes ca17 = new CarAttributes("Sunny", "RWD", 116, "Nissan", 2017, 7, "Blue", "Chicago");
        CarAttributes ca18 = new CarAttributes("Yukoma", "RWD", 117, "GMC", 2011, 7, "Violet", "Florida");
        CarAttributes ca19 = new CarAttributes("Sportage", "FWD", 118, "Kia", 2018, 4, "Silver", "Saint Louis");
        CarAttributes ca20 = new CarAttributes("Wrangler", "4WD", 119, "Jeep", 2017, 4, "Silver", "Boston");

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
        carFleet.add(ca11);
        carFleet.add(ca12);
        carFleet.add(ca13);
        carFleet.add(ca14);
        carFleet.add(ca15);
        carFleet.add(ca16);
        carFleet.add(ca17);
        carFleet.add(ca18);
        carFleet.add(ca19);
        carFleet.add(ca20);

        RandomDataGeneration random = new RandomDataGeneration();
        this.dateTimeOfUpdate = random.randomDateGeneration() + " at " + random.randomTimeGeneration();
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
