/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {

    public static Business configure() {
        // Three roles: LabAssistant, Doctor, Admin

        Business business = Business.getInstance();

        AdminOrganization adminOrganization = new AdminOrganization();
        LabOrganization labOrganization = new LabOrganization();

        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);

        Employee employee = new Employee();
        employee.setName("Abc Xyz");
        Employee employee1 = new Employee();
        employee1.setName("Ben");

        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        UserAccount account1 = new UserAccount();
        account1.setUsername("lab");
        account1.setPassword("lab");
        account1.setRole("Lab");

        account.setEmployee(employee);
        account1.setEmployee(employee1);

        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        labOrganization.getEmployeeDirectory().getEmployeeList().add(employee1);

        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        labOrganization.getUserAccountDirectory().getUserAccountList().add(account1);

        return business;
    }

}
