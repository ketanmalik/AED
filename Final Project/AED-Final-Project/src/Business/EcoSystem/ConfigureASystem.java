/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Employee.Employee;
import Business.EnterpriseDirectory.Enterprise;
import Business.MedicineList.Medicine;
import Business.Network.Network;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Delivery;
import static Business.Organization.Organization.Type.Inspection;
import static Business.Organization.Organization.Type.Manufacture;
import static Business.Organization.Organization.Type.Research;
import static Business.Organization.Organization.Type.Advertising;
import static Business.Organization.Organization.Type.Doctor;
import static Business.Organization.Organization.Type.Patient;
import Business.Role.CPEntpAdmin;
import Business.Role.MktEntpAdmin;
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
        UserAccount sysAdmin = system.getUserAccountDirectory().createUserAccount(employee.getName(), "ecosysadmin", "Gmail@123", employee, new SysAdminRole(), "sysAdmin");

        // 2. Creating Boston Network under EcoSystem Admin
        Network network = system.addNetwork();
        network.setName("Boston");
        network.setLocation("MA USA");
        network.setCreatedBy(sysAdmin);
        network.setCreatedOn(DateUtil.getStringToDate("11/25/2019"));
        network.setLastUpdatedOn(DateUtil.getStringToDate("11/25/2019"));

        // 3. Creating Compound Pharmacy Enterprise under Boston
        Enterprise compoundEnterprise = null;
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            if (n.getName().equals("Boston")) {
                compoundEnterprise = n.getEnterpriseDirectory().createEnterprise("Compound Pharmacy", Enterprise.EnterpriseType.Pharmaceutical);
                break;
            }
        }

        // 4. Creating Marketing Enterprise under Boston
        Enterprise marketingEnterprise = null;
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            if (n.getName().equals("Boston")) {
                marketingEnterprise = n.getEnterpriseDirectory().createEnterprise("Marketing", Enterprise.EnterpriseType.Management);
                break;
            }
        }

        // 5. Creating CP Admin Employee & User Account
        Employee cpEmployee = compoundEnterprise.getEmployeeDirectory().createEmployee("Compound Pharmacy Admin");
        UserAccount cpAdmin = compoundEnterprise.getUserAccountDirectory().createUserAccount(cpEmployee.getName(), "cpadmin", "Gmail@123", cpEmployee, new CPEntpAdmin(), "cpAdmin");

        // 6. Creating mktAdmin for Marketing
        Employee mktEmployee = marketingEnterprise.getEmployeeDirectory().createEmployee("Marketing Admin");
        UserAccount mktAdmin = marketingEnterprise.getUserAccountDirectory().createUserAccount(mktEmployee.getName(), "mkadmin", "Gmail@123", mktEmployee, new MktEntpAdmin(), "mktAdmin");

        // 7. Creating Organizations under CP Enterprise
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase("compound pharmacy")) {
                    e.getOrganizationDirectory().createOrganization(Manufacture);
                    e.getOrganizationDirectory().createOrganization(Research);
                    e.getOrganizationDirectory().createOrganization(Inspection);
                    e.getOrganizationDirectory().createOrganization(Delivery);
                    break;
                }
            }
        }

        // 8. Creating Organizations under MKT Enterprise
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase("marketing")) {
                    e.getOrganizationDirectory().createOrganization(Advertising);
                    e.getOrganizationDirectory().createOrganization(Doctor);
                    e.getOrganizationDirectory().createOrganization(Patient);

                    break;
                }
            }
        }

        // 9. Create Employees & User Accounts under CP & MKT Enterprise for all organizations
        Employee tempEmp = null;
        for (Network n : system.getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getName().equals("Manufacturing Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Manufacturer-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "cpmadmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "cm");
                    } else if (o.getName().equals("Research Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Researcher-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "cpradmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "cr");
                    } else if (o.getName().equals("Inspection Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Inspector-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "cpiadmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "ci");
                    } else if (o.getName().equals("Delivery Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Delivery-Manager-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "cpdadmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "cd");
                    } else if (o.getName().equals("Advertising Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Advertising-Supervisor-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "mkaadmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "ma");
                    } else if (o.getName().equals("Doctor Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Doctor-HR-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "mkdadmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "md");
                        System.out.println("role:" + o.getSupportedRole().get(0));
                    } else if (o.getName().equals("Patient Organization")) {
                        tempEmp = o.getEmployeeDirectory().createEmployee("Patient-HR-1");
                        o.getUserAccountDirectory().createUserAccount(tempEmp.getName(), "mkpadmin", "Gmail@123", tempEmp, o.getSupportedRole().get(0), "mp");
                    }
                }
            }
        }

        // 10. Create Medicine List
        system.getMedicineList().add(new Medicine("Albendazole", 200, "Anti-worm Medication", 0.3, 1.1, 30, "Benzimidazoles", "Tablet", "sub1", "sub2", 2, 1));
        system.getMedicineList().add(new Medicine("Bosentan", 125, "Pulmonary artery hypertension", 1.5, 5, 25, "phenylalanine", "Tablet", "sub1", "sub2", 2, 1));
        system.getMedicineList().add(new Medicine("Delsym", 100, "Cough & sour throat", 2, 18, 6, "Dextromethorphan Polistirex", "Syrup", "sub1", "sub2", 2, 1));
        system.getMedicineList().add(new Medicine("Syprine", 250, "Wilson's deisease", 177.6, 222, 10, "Trientine hydrochloride", "Capsule", "sub1", "sub2", 2, 1));

        system.setId(1);
        return system;
    }

}
