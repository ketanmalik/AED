/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Network.Network;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class EcoSystem {

    private static EcoSystem ecoSystemObj = null;
    private List<Network> networkList;
    private UserAccountDirectory uaDirectory;

    private EcoSystem() {
        networkList = new ArrayList<>();
        uaDirectory = new UserAccountDirectory();
    }

    public static EcoSystem getInstance() {
        if (ecoSystemObj == null) {
            ecoSystemObj = new EcoSystem();
        }
        return ecoSystemObj;
    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<Network> networkList) {
        this.networkList = networkList;
    }

    public UserAccountDirectory getUaDirectory() {
        return uaDirectory;
    }

    public void setUaDirectory(UserAccountDirectory uaDirectory) {
        this.uaDirectory = uaDirectory;
    }
}
