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

        // 1. Creating EcoSystem Admin Account
        UserAccount ecoSysAdmin = system.getUaDirectory().createUserAccount();
        ecoSysAdmin.setUsername("a");
        ecoSysAdmin.setPassword("a");
        ecoSysAdmin.setRole("ecoSysAdmin");

        // 2. Creating Boston under EcoSystem Admin
        Network network = new Network();
        network.setName("Boston");
        network.setLocation("MA, USA");
        network.setCreatedBy(ecoSysAdmin);
        network.setCreatedOn(DateUtil.getStringToDate("11/25/2019"));
        network.setLastUpdatedOn(DateUtil.getStringToDate("11/25/2019"));

        // 3. Creating Compound Pharmacy Enterprise under Boston
        Enterprise compoundEnterprise = new Enterprise();
        compoundEnterprise.setName("Compound Pharmacy");
        compoundEnterprise.setType("Pharmaceutical");
        compoundEnterprise.setNetwork(network);
        network.getEnterpriseDirectory().getEnterpriseList().add(compoundEnterprise);

        // 4. Creating Marketing Enterprise under Boston
        Enterprise marketingEnterprise = new Enterprise();
        marketingEnterprise.setName("Marketing");
        marketingEnterprise.setType("Management");
        marketingEnterprise.setNetwork(network);
        network.getEnterpriseDirectory().getEnterpriseList().add(marketingEnterprise);

        system.getNetworkDirectory().getNetworkList().add(network);
        return system;
    }
}
