/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class QnAEnterprise extends Enterprise {
    
    public QnAEnterprise(String name){
        super(name,EnterpriseType.QnAPortal);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
