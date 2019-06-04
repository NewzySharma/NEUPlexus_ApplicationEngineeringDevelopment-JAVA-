/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.dataoperations.DataStore;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.UserOrganization;
import business.userAccount.User;
import java.util.List;
import javax.swing.JPanel;
import neuplexus.NEUPlexus;
import userInterface.QnAPortal.QnAMainWorkArea;
import userInterface.accomodation.AccomodationMainWorkArea;
import userInterface.carPool.CarPoolWorkArea;
import userInterface.homeSceen.NeuPlexusHome;
import userInterface.management.ManagementWorkArea;

/**
 *
 * @author Apurva
 */
public class CurrentStudentRole extends Role{
   public JPanel createWorkArea(JPanel panelRight, User account, UserOrganization organization, Enterprise enterprise, NEUPlexus business,int portalid) {
     Network userNetwork = null;
       for(Network n:business.getNetworkList()){
           if(n.getName().equals(NeuPlexusHome.useraccount.getNetwork())){
               userNetwork=n;
           }
       }
       List<Enterprise> entList=userNetwork.getEnterpriseDirectory().getEnterpriseList();
        DataStore dataStore =null;
        for(Enterprise e:entList){
           if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.QnAPortal) && portalid == 1)
                return new QnAMainWorkArea(panelRight, enterprise,e.getDatastore());
            else if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.AccomodationPortal) && portalid == 3)
                return new AccomodationMainWorkArea(panelRight, enterprise,e.getDatastore());
            else if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.CarPool) && portalid == 2)
                return new CarPoolWorkArea(panelRight, enterprise,e.getDatastore());
          
        }
        return null;
   }
}
