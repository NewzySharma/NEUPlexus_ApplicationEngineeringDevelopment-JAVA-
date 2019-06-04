/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.accomodation.Address;
import business.dataoperations.DataStore;
import business.role.Role;
import business.userAccount.UserDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Apurva
 */
public abstract class UserOrganization {
    private String name;
    private UserDirectory userDirectory;
    private int organizationID;
    private int counter=0;
    Random r = new Random();
    
    public enum Type{
        Admin("Admin Organization"), CurrentStudent("Current Student Organization"), IncomingStudent("Incoming Student Organization") ,Alumni("Alumni Organization"),Manager("Manager Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public UserOrganization(String name) {
        this.name = name;
       userDirectory = new UserDirectory();
        organizationID = r.nextInt(1000);
        counter = r.nextInt(1000);
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserDirectory getUserAccountDirectory() {
        return userDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
