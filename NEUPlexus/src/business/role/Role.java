/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;


import business.dataoperations.DataStore;
import business.enterprise.Enterprise;
import business.organization.UserOrganization;
import business.userAccount.User;
import javax.swing.JPanel;
import neuplexus.NEUPlexus;
import userInterface.homeSceen.NeuPlexusHome;

/**
 *
 * @author Apurva
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        CurrentStudent("Current Student"),
        IncomingStudent("Incoming Student"),
        Alumni("Alumni"), 
        SystemAdmin("System Admin"),
        Manager("Manager");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User account, 
            UserOrganization organization,
            Enterprise enterprise, 
            NEUPlexus business,int portalid);

    @Override
    public String toString() {
        String[] fullName=this.getClass().getName().split("\\.");
        return fullName[2] ;
    }
        
}