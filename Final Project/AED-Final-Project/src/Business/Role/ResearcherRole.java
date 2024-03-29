/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.EnterpriseDirectory.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.CPResearcherRole.ResearcherWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public class ResearcherRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel displayPanel, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        return new ResearcherWorkAreaJPanel(displayPanel, userAccount, enterprise, organization, ecoSystem);
    }

    @Override
    public String toString() {
        return "ResearcherRole";
    }
}
