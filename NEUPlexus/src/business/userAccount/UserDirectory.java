/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.role.Role;
import java.awt.CardLayout;
import java.util.ArrayList;
import userInterface.authentication.UserLogin;
import static userInterface.homeSceen.NeuPlexusHome.useraccount;
import utils.DB4Outil;

/**
 *
 * @author Apurva
 */
public class UserDirectory {
    private ArrayList<User> userDir;
    
    public UserDirectory() {
        userDir = new ArrayList();
    }

    public ArrayList<User> getUserDir() {
        return userDir;
    }

    public void setUserDir(ArrayList<User> userDir) {
        this.userDir = userDir;
    }
    
    public User authenticate(String username, String password){
        for (User u : userDir)
            if (u.getUserName().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        return null;
    }
    
     public User createUserAccount(String username, String password,String contact, String campus,String name, Role role){
        User userAccount = new User();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setCampusName(campus);
        userAccount.setFirstName(name);
        userAccount.setContactNumber(contact);
        userDir.add(userAccount);
        return userAccount;
    }
    public void logout(){
      
         
    }
    
}
