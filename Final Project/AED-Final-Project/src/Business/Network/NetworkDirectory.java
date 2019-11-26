/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketanmalik
 */
public class NetworkDirectory {

    private List<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<Network> networkList) {
        this.networkList = networkList;
    }

    public Network addNetwork() {
        Network n = new Network();
        networkList.add(n);
        return n;
    }
}
