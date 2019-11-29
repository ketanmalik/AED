/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InspectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class InspectionOrganization extends Organization{
        public InspectionOrganization() {
        super(Organization.Type.Inspection.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InspectorRole());
        return roles;
    }
}
