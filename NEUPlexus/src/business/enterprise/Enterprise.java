 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.dataoperations.DataStore;
import business.organization.UserOrganization;
import business.organization.OrganizationDirectory;
import business.userAccount.UserDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends UserOrganization{
    
    private EnterpriseType enterpriseType;
    private DataStore datastore;
    private OrganizationDirectory organizationDirectory;
    private UserDirectory entUserDirectory;
   

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
     public UserDirectory getEntUserDirectory() {
        return entUserDirectory;
    }
    
    public enum EnterpriseType{
        QnAPortal("QnAPortal"),
        AccomodationPortal("AccomodationPortal"),
        CarPool("CarPool"),
        Management("Management");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public DataStore getDatastore() {
        return datastore;
    }

    public void setDatastore(DataStore datastore) {
        this.datastore = datastore;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        datastore = new DataStore();
        entUserDirectory = new UserDirectory();
    }
}
