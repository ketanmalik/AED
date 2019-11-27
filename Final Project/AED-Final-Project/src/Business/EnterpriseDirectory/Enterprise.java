/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDirectory;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author ketanmalik
 */
public class Enterprise extends Organization {

    private String type;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name) {
        super(name);
        organizationDirectory = new OrganizationDirectory();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
