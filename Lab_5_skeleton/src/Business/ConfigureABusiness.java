/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
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
        DoctorOrganization doctorOrganization = new DoctorOrganization();

        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);

        Employee employee = new Employee();
        employee.setName("Abc Xyz");
        Employee employee1 = new Employee();
        employee1.setName("Ben");
        Employee employee2 = new Employee();
        employee2.setName("Jackie");

        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        UserAccount account1 = new UserAccount();
        account1.setUsername("lab");
        account1.setPassword("lab");
        account1.setRole("Lab");
        UserAccount account2 = new UserAccount();
        account2.setUsername("doctor");
        account2.setPassword("doctor");
        account2.setRole("Doctor");

        account.setEmployee(employee);
        account1.setEmployee(employee1);
        account2.setEmployee(employee2);

        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        labOrganization.getEmployeeDirectory().getEmployeeList().add(employee1);
        doctorOrganization.getEmployeeDirectory().getEmployeeList().add(employee2);

        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        labOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account2);

        return business;
    }

}
