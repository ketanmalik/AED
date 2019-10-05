/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author ketanmalik
 */
public class RandomDataGeneration {

    Random random = new Random();

    public String randomDateGeneration() {
        int min = (int) LocalDate.of(2018, 1, 1).toEpochDay();
        int max = (int) LocalDate.now().toEpochDay();
        long rand = min + random.nextInt(max - min);

        LocalDate d = LocalDate.ofEpochDay(rand);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String date = d.format(f);
        return date;
    }

    public String randomTimeGeneration() {
        LocalTime t = LocalTime.of(random.nextInt(24), random.nextInt(60));
        String time = String.valueOf(t);
        return time;
    }

    public boolean randomAvailabilityGeneration() {
        return random.nextBoolean();
    }

    public boolean randomMaintenanceGeneration() {
        return random.nextBoolean();
    }

    public int randomAvailMinutesGeneration(boolean availability) {
        if (availability) {
            int res = random.nextInt(16);
            return (res + 1);
        } else {
            return 100;
        }
    }

}
