/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.accomodation.Address;
import business.dataoperations.DataStore;
import business.role.Role;
import java.util.Date;

/**
 *
 * @author Apurva
 */
public class User {
    protected String userName;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String contactNumber;
    protected String campusName;
    protected String password;
    protected Date dateOfBirth;
    protected String photo;
    protected String major;
    protected Date dateOFGraduation;
    protected Address userAddress;
    protected Role role;
    protected long NUID;
    protected String network;
  //  protected DataStore datastore;
        
    public User(){
        userAddress = new Address();
        //datastore = new DataStore();
    }


    public long getNUID() {
        return NUID;
    }

    /*  public DataStore getDatastore() {
    return datastore;
    }
    public void setDatastore(DataStore datastore) {
    this.datastore = datastore;
    }*/
    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
     public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getDateOFGraduation() {
        return dateOFGraduation;
    }

    public void setDateOFGraduation(Date dateOFGraduation) {
        this.dateOFGraduation = dateOFGraduation;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }
    
     @Override
    public String toString() {
        return userName;
    }
   
}
