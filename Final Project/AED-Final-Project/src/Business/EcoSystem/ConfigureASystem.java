/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.EnterpriseDirectory.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.util.DateUtil;

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

        // 2. Creating Network-1 under EcoSystem Admin
        Network network = new Network();
        network.setName("Network-1");
        network.setLocation("Boston");
        network.setCreatedBy(ecoSysAdmin);
        network.setCreatedOn(DateUtil.getStringToDate("11/25/2019"));
        network.setLastUpdatedOn(DateUtil.getStringToDate("11/25/2019"));

        // 3. Creating Compound Pharmacy Enterprise under Network-1
        Enterprise compoundEnterprise = new Enterprise();
        compoundEnterprise.setName("Compound Enterprise");
        compoundEnterprise.setType("Pharmaceutical");
        compoundEnterprise.setNetwork(network);
        network.getEnterpriseDirectory().getEnterpriseList().add(compoundEnterprise);
        system.getNetworkDirectory().getNetworkList().add(network);
        return system;
    }
}
