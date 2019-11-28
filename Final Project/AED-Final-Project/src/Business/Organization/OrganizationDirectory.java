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
        if (type.getValue().equals(Organization.Type.ADMIN.getValue())) {
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.MANUFACTURE.getValue())) {
            organization = new ManufactureOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.INSPECTION.getValue())) {
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.DELIVERY.getValue())) {
            organizationList.add(organization);
        }
        return organization;
    }
}
