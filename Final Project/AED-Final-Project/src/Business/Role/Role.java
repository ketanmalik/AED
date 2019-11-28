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
import javax.swing.JPanel;

/**
 *
 * @author ketanmalik
 */
public abstract class Role {

    public enum RoleType {
        ADMIN("Admin"), DOCTOR("DOCTOR"), PATIENT("Patient");
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public abstract JPanel createWorkArea(JPanel displayPanel,
            UserAccount userAccount,
            Enterprise enterprise,
            Organization organization,
            EcoSystem ecoSystem);
}
