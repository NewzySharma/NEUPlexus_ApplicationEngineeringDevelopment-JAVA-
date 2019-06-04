/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuplexus;

import business.network.Network;
import business.organization.UserOrganization;
import business.role.AdminRole;
import business.role.CurrentStudentRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shardul Pathak
 */
public class NEUPlexus extends UserOrganization{

    private static NEUPlexus business;
    private ArrayList<Network> networkList;
    public static NEUPlexus getInstance(){
        if(business==null){
            business=new NEUPlexus();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        roleList.add(new CurrentStudentRole());
        //TODO
        return roleList;
    }
    public NEUPlexus(){
          super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
 /*   public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }*/


}
