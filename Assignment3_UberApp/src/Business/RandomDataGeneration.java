/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author ketanmalik
 */
public class RandomDataGeneration {

    public String randomDateGeneration() {
        Random random = new Random();
        int min = (int) LocalDate.of(2019, 1, 1).toEpochDay();
        int max = (int) LocalDate.now().toEpochDay();
        long rand = min + random.nextInt(max - min);

        LocalDate d = LocalDate.ofEpochDay(rand);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String date = d.format(f);
        return date;
    }

    public boolean randomAvailabilityGeneration() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean randomMaintenanceGeneration() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public int randomAvailMinutesGeneration(boolean availability) {
        if (availability) {
            Random random = new Random();
            int res = random.nextInt(16);
            return (res + 1);
        } else {
            return 100;
        }
    }

}
