/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.dataoperations.DataStore;
import business.enterprise.EnterpriseDirectory;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
   // private DataStore datastore;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
      //  datastore = new DataStore();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

   /* public DataStore getDatastore() {
        return datastore;
    }

    public void setDatastore(DataStore datastore) {
        this.datastore = datastore;
    }*/
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
