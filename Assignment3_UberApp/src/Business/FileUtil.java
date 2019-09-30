/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ketanmalik
 */
public class FileUtil {

    private CarFleet carFleet;
    private CarAttributes ca;
    private String directory = System.getProperty("user.home");
    String fileName = "UberCarFleet";
    private String path = this.directory + File.separator + this.fileName;

    public void writeToFile(CarAttributes ca) {
        this.ca = ca;
        try {
            File file = new File(path);
            if (!(file.exists())) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            ca.setMode("writeToFile");
            bw.write(ca.toString());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(CarFleet carFleet) {
        try {
            this.carFleet = carFleet;
            File file = new File(path);
            if (!(file.exists())) {
                return;
            }

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                CarAttributes carObj = carFleet.addCar();
                carObj.setName(fields[0]);
                carObj.setModelNo(fields[1]);
                carObj.setSerialNo(new Integer(fields[2]));
                carObj.setManufacturer(fields[3]);
                carObj.setYearOfManufacture(new Integer(fields[4]));
                carObj.setCapacity(new Integer(fields[5]));
                carObj.setColor(fields[6]);
                carObj.setDateAdded(fields[7]);

                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
