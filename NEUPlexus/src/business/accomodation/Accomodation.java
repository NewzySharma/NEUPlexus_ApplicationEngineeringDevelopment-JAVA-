/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.accomodation;

import business.carpool.BookingDetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *  
 * @author Apurva
 */
public class Accomodation {
    private int accListNo;
    private String typeOfAccomodation;
    private float rent;
    private String ownerUserName;
    private String ownerDocumantsPath;
    private boolean verified;
    private String facilities;
    private float distanceFromUni;
    private Date listedFromDate;
    private Date listedToDate;
    private Date avlFromDate;
    private Date avlToDate;
    private BookingDetails bookingUserDetail;
    private Address addressOfApartment;
    private Boolean booked=false;

    public Accomodation() {
       
    }


    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }

    public int getAccListNo() {
        return accListNo;
    }

    public void setAccListNo(int accListNo) {
          Random r = new Random();
        this.accListNo = r.nextInt(1000000);
    }
    

    public String getTypeOfAccomodation() {
        return typeOfAccomodation;
    }

    public void setTypeOfAccomodation(String typeOfAccomodation) {
        this.typeOfAccomodation = typeOfAccomodation;
    }

    public float getRent() {
        return rent;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }

    public String getOwnerUserName() {
        return ownerUserName;
    }

    public void setOwnerUserName(String ownerUserName) {
        this.ownerUserName = ownerUserName;
    }

    public String getOwnerDocumantsPath() {
        return ownerDocumantsPath;
    }

    public void setOwnerDocumantsPath(String ownerDocumantsPath) {
        this.ownerDocumantsPath = ownerDocumantsPath;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public float getDistanceFromUni() {
        return distanceFromUni;
    }

    public void setDistanceFromUni(float distanceFromUni) {
        this.distanceFromUni = distanceFromUni;
    }

    public Date getListedFromDate() {
        return listedFromDate;
    }

    public void setListedFromDate(Date listedFromDate) {
        this.listedFromDate = listedFromDate;
    }

    public Date getListedToDate() {
        return listedToDate;
    }

    public void setListedToDate(Date listedToDate) {
        this.listedToDate = listedToDate;
    }

    public Date getAvlFromDate() {
        return avlFromDate;
    }

    public void setAvlFromDate(Date avlFromDate) {
        this.avlFromDate = avlFromDate;
    }

    public Date getAvlToDate() {
        return avlToDate;
    }

    public void setAvlToDate(Date avlToDate) {
        this.avlToDate = avlToDate;
    }

    public BookingDetails getBookingUserNames() {
        return bookingUserDetail;
    }

    public void setBookingUserNames(BookingDetails bookingUserNames) {
        this.bookingUserDetail = bookingUserNames;
    }

    public Address getAddressOfApartment() {
        return addressOfApartment;
    }

    public void setAddressOfApartment(Address addressOfApartment) {
        this.addressOfApartment = addressOfApartment;
    }
    
      @Override
    public String toString(){
        return String.valueOf(this.accListNo);
    }
    
}
