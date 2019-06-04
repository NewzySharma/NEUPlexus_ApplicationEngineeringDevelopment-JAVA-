/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.carpool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Apurva
 */
public class CarInfo {
    private int listingNo;
    private String carName;

   
    private String carModel;
    private String carType;
    private String carColor;
    private Date fromDate;
    private Date toDate;
    private String fromTime;
    private String toTime;
    private String startPoint;
    private String dropOffPoint;
    private int occupancy;
    private float pickupTillFlexDist;
    private String postingUserName;
    private List<BookingDetails> bookingUserNames;
    private boolean booked=false;
    //private boolean promote;

    public CarInfo() {
        bookingUserNames = new ArrayList<BookingDetails>(); 
    }
     public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    
    public int getListingNo() {
        return listingNo;
    }

    public void setListingNo(int listingNo) {
        Random r = new Random();
        this.listingNo = r.nextInt(1000000);
    }
   

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDropOffPoint() {
        return dropOffPoint;
    }

    public void setDropOffPoint(String dropOffPoint) {
        this.dropOffPoint = dropOffPoint;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public float getPickupTillFlexDist() {
        return pickupTillFlexDist;
    }

    public void setPickupTillFlexDist(float pickupTillFlexDist) {
        this.pickupTillFlexDist = pickupTillFlexDist;
    }

    public String getPostingUserName() {
        return postingUserName;
    }

    public void setPostingUserName(String postingUserName) {
        this.postingUserName = postingUserName;
    }

    public List<BookingDetails> getBookingUserNames() {
        return bookingUserNames;
    }

   
     @Override
    public String toString(){
        return String.valueOf(this.listingNo);
    }
    
}
