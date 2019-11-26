/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ketanmalik
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

//        Create a network
//        create an enterprise
//        initialize some organizations
//        have some employees 
//        create user account
//        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        // 1. Creating EcoSystem Admin Account
        UserAccount ecoSysAdmin = system.getUaDirectory().createUserAccount();
        ecoSysAdmin.setUsername("a");
        ecoSysAdmin.setPassword("a");
        ecoSysAdmin.setRole("ecoSysAdmin");

        //2. Creating new Network under EcoSystem Admin
        Network network = new Network();
        network.setName("Network - 1");
        network.setLocation("Boston");
        network.setCreatedBy(ecoSysAdmin);
        network.setCreatedOn(getDate("11/26/2019"));
        network.setLastUpdatedOn(getDate("11/26/2019"));
        system.getNetworkList().add(network);

        return system;
    }

    public static Date getDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = sdf.parse(dateString);
            System.out.println(date);
            return date;
        } catch (Exception e) {

        }
        return null;
    }
}
