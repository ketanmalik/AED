/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class UserAccountDirectory {

    private List<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public List<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(List<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public UserAccount createUserAccount(String name, String username, String password, Employee employee, Role role, String identifier) {
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setIdentifier(identifier);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount authenticateUser(String userName, String password) {
        UserAccount userFound = null;
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equalsIgnoreCase(userName) && ua.getPassword().equals(password)) {
                userFound = ua;
                return ua;
            }
        }
        return userFound;
    }
}
