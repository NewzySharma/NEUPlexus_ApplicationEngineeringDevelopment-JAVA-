/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.carpool;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Apurva
 */
public class BookingDetails {
    private int bookingId;
    private String userID;
    private String date;
    private String time;

   public BookingDetails(String userID, String date, String time) {
        this.userID = userID;
        this.date = date;
        this.time = time;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId() {
        Random r = new Random();
        this.bookingId = r.nextInt(1000000);
    }

    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return userID; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
