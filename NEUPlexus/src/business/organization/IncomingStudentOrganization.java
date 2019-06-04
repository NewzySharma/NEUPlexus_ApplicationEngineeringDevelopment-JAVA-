/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Apurva
 */
public class IncomingStudentOrganization extends UserOrganization{
     public IncomingStudentOrganization() {
        super(UserOrganization.Type.IncomingStudent.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
}
