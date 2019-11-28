/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecoSystemObj = null;
    private NetworkDirectory networkDirectory;

    private EcoSystem() {
        super("Ecosystem");
        networkDirectory = new NetworkDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
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

    public Network addNetwork() {
        Network network = new Network();
        networkDirectory.getNetworkList().add(network);
        return network;
    }
}
