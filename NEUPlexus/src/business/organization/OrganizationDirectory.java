/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.enterprise.ManagementEnterprise;
import business.organization.UserOrganization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<UserOrganization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<UserOrganization> getOrganizationList() {
        return organizationList;
    }
    
    public UserOrganization createOrganization(Type type){
        UserOrganization organization = null;
        if (type.getValue().equals(Type.CurrentStudent.getValue())){
            organization = new CurrentStudentOrganization();
            if(organizationList.contains(organization))
                return null;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.IncomingStudent.getValue())){
            organization = new IncomingStudentOrganization();
            if(organizationList.contains(organization))
                return null;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Alumni.getValue())){
            organization = new AlumniOrganization();
            if(organizationList.contains(organization))
                return null;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            if(organizationList.contains(organization))
                return null;
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
            if(organizationList.contains(organization))
                return null;
            organizationList.add(organization);
        }
        return organization;
    }
}