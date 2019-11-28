/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Employee.Employee;
import Business.EnterpriseDirectory.Enterprise;
import Business.Network.Network;
import Business.Role.CPAdmin;
import Business.Role.MktAdmin;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;
import Business.util.DateUtil;

/**
 *
 * @author ketanmalik
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        // 1. Creating EcoSystem Admin Employee & User Account
        Employee employee = system.getEmployeeDirectory().createEmployee("Ecosystem Admin");
//        UserAccount sysAdmin = system.getUserAccountDirectory().createUserAccount("a", "a", employee, "sysAdmin");
        UserAccount sysAdmin = system.getUserAccountDirectory().createUserAccount(employee.getName(), "a", "a", employee, new SysAdminRole(), "sysAdmin");

        // 2. Creating Boston Network under EcoSystem Admin
        Network network = system.addNetwork();
        network.setName("Boston");
        network.setLocation("MA, USA");
        network.setCreatedBy(sysAdmin);
        network.setCreatedOn(DateUtil.getStringToDate("11/25/2019"));
        network.setLastUpdatedOn(DateUtil.getStringToDate("11/25/2019"));

        // 3. Creating Compound Pharmacy Enterprise under Boston
        Enterprise compoundEnterprise = null;
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            if (n.getName().equals("Boston")) {
                compoundEnterprise = n.getEnterpriseDirectory().createEnterprise("Compound Pharmacy");
                break;
            }
        }
        compoundEnterprise.setType("Pharmaceutical");

        // 4. Creating Marketing Enterprise under Boston
        Enterprise marketingEnterprise = null;
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            if (n.getName().equals("Boston")) {
                marketingEnterprise = n.getEnterpriseDirectory().createEnterprise("Marketing");
                break;
            }
        }
        marketingEnterprise.setType("Management");

        // 5. Creating CP Admin Employee & User Account
        Employee cpEmployee = compoundEnterprise.getEmployeeDirectory().createEmployee("Compound Pharmacy Admin");
//        UserAccount cpAdmin = compoundEnterprise.getUserAccountDirectory().createUserAccount("cpAdmin", "cpAdmin", cpEmployee, "entAdmin");
        UserAccount cpAdmin = compoundEnterprise.getUserAccountDirectory().createUserAccount(cpEmployee.getName(), "cp", "cp", cpEmployee, new CPAdmin(), "cpAdmin");

        // 6. Creating mktAdmin for Marketing
        Employee mktEmployee = marketingEnterprise.getEmployeeDirectory().createEmployee("Marketing Admin");
//        UserAccount mktAdmin = marketingEnterprise.getUserAccountDirectory().createUserAccount("mktAdmin", "mktAdmin", mktEmployee, "mktAdmin");
        UserAccount mktAdmin = marketingEnterprise.getUserAccountDirectory().createUserAccount(mktEmployee.getName(), "mk", "mk", mktEmployee, new MktAdmin(), "mktAdmin");

        return system;
    }
}
