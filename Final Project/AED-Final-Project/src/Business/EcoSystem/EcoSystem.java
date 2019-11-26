/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Network.NetworkDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author ketanmalik
 */
public class EcoSystem {

    private static EcoSystem ecoSystemObj = null;
    private NetworkDirectory networkDirectory;
    private UserAccountDirectory uaDirectory;

    private EcoSystem() {
        networkDirectory = new NetworkDirectory();
        uaDirectory = new UserAccountDirectory();
    }

    public static EcoSystem getInstance() {
        if (ecoSystemObj == null) {
            ecoSystemObj = new EcoSystem();
        }
        return ecoSystemObj;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public UserAccountDirectory getUaDirectory() {
        return uaDirectory;
    }

    public void setUaDirectory(UserAccountDirectory uaDirectory) {
        this.uaDirectory = uaDirectory;
    }
}
