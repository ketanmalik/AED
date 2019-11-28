/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseDirectory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class EnterpriseDirectory {

    private List<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Pharmaceutical) {
            enterprise = new CompoundPharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Management) {
            enterprise = new MarketingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
