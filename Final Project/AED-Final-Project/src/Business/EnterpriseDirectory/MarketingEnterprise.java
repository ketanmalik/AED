/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDirectory;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class MarketingEnterprise extends Enterprise {

    public MarketingEnterprise(String name) {
        super(name, EnterpriseType.Management);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
