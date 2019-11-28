/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class OrganizationDirectory {

    private List<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(List<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Manufacture.getValue())) {
            organization = new ManufactureOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Research.getValue())) {
            organization = new ResearchOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Inspection.getValue())) {
            organization = new InspectionOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Delivery.getValue())) {
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Advertising.getValue())) {
            organization = new AdvertisingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
