/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.dataoperations;

import business.accomodation.Address;
import business.enterprise.Enterprise;
import business.organization.OrganizationDirectory;
import business.organization.UserOrganization;
import business.role.AdminRole;
import business.role.AlumniRole;
import business.role.CurrentStudentRole;
import business.role.IncomingStudentRole;
import business.userAccount.User;
import business.userAccount.UserDirectory;
import java.io.IOException;
import java.util.Date;
import org.apache.log4j.Logger;
import utils.Constants;
import java.text.SimpleDateFormat;
import java.util.List;
import neuplexus.NEUPlexus;

/**
 *
 * @author Apurva
 */
public class DataProcessor {

    final static Logger logger = Logger.getLogger(DataProcessor.class.getName());
    NEUPlexus system = NEUPlexus.getInstance();
    String filepath = "";
    public DataProcessor(String filepath) {
        
        this.filepath=filepath;
       
    }
    
     public void readData(Enterprise en,String filename){
        String[] row;
        UserDirectory udir = en.getEntUserDirectory();
       try{
       DataReader userReader = new DataReader(filename);
        //adding same users for each alumni,currstd,inc organization in each qna,acco,car enterprise
        while((row = userReader.getNextRow()) != null ){
            User u = generateUser(row);
            udir.getUserDir().add(u); //reterive a list and add user
        }
         }catch(Exception e){
           e.printStackTrace();
           logger.error("Error occured while reading from user catalogue file",e.fillInStackTrace());
        }
        logger.debug("User catalogue read successfully");
    }
     
    private User generateUser(String[] row) {
       User u = new User();
        try {
            u.setUserName(row[0]);
            u.setFirstName(row[1]);
            u.setLastName(row[2]);
            u.setMiddleName(row[3]);
            u.setContactNumber(row[4]);
            u.setCampusName(row[5]);
            u.setPassword(row[6]);
            u.setNUID(Long.parseLong(row[17]));
            //set role
            switch(row[7]){
                case "Admin": u.setRole(new AdminRole());
                                break;
                case "Incoming Student":u.setRole(new IncomingStudentRole());
                                        break;
                case "Current Student":u.setRole(new CurrentStudentRole());
                                        break;
                case "Alumni":u.setRole(new AlumniRole());
                                break;
            }
            Date date = new SimpleDateFormat("MM/dd/yyyy").parse(row[8]);            
            u.setDateOfBirth(date);
            u.setPhoto(row[9]);
            u.setMajor(row[10]);
            date = new SimpleDateFormat("MM/dd/yyyy").parse(row[11]);
            u.setDateOFGraduation(date);
            Address a = new Address();
            a.setLine1(row[12]);
            a.setLine2(row[13]);
            a.setZipCode(row[14]);
            a.setState(row[15]);
            a.setCity(row[16]);
            u.setUserAddress(a);
        } catch (Exception e) {
            logger.error("Error while parsing" + e.fillInStackTrace());
        }
        return u;
    }
}
