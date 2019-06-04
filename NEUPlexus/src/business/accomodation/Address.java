/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.accomodation;

/**
 *
 * @author Apurva
 */
public class Address {
    protected String Line1;
    protected String Line2;
    protected String ZipCode;
    protected String State;
    protected String City;

    public Address() {
    }

    public Address(String Line1, String Line2, String ZipCode, String State, String City) {
        this.Line1 = Line1;
        this.Line2 = Line2;
        this.ZipCode = ZipCode;
        this.State = State;
        this.City = City;
    }

    public String getLine1() {
        return Line1;
    }

    public void setLine1(String Line1) {
        this.Line1 = Line1;
    }

    public String getLine2() {
        return Line2;
    }

    public void setLine2(String Line2) {
        this.Line2 = Line2;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
}
