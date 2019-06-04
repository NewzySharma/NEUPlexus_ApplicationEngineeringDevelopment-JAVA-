/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.QnAPortal){
            enterprise=new QnAEnterprise(name);
                    if(enterpriseList.contains(enterprise)){
                        return null;
                    }
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.AccomodationPortal){
            enterprise=new AccomodationEnterprise(name);
              if(enterpriseList.contains(enterprise)){
                        return null;
                    }
            enterpriseList.add(enterprise);
        }
         else if(type==Enterprise.EnterpriseType.CarPool){
            enterprise=new CarpoolEnterprise(name);
              if(enterpriseList.contains(enterprise)){
                        return null;
                    }
            enterpriseList.add(enterprise);
        }
         else if(type==Enterprise.EnterpriseType.Management){
            enterprise=new ManagementEnterprise(name);
              if(enterpriseList.contains(enterprise)){
                        return null;
                    }
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
