/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdvertisingSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class AdvertisingOrganization extends Organization {

    public AdvertisingOrganization() {
        super(Organization.Type.Advertising.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdvertisingSupervisorRole());
        return roles;
    }
}
