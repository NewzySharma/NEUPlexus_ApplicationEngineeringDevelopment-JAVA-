/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.management;

import business.accomodation.Accomodation;
import business.carpool.CarInfo;
import java.util.Random;

/**
 *
 * @author Apurva
 */
public class AccomodationListRequest {
     private int requestNumber=0;
    private String status;
    private Accomodation accomodation;
    private String documentPath;
     private String documentType;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber() {
        Random r = new Random();
        requestNumber=r.nextInt(100000);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Accomodation getAccomodation() {
        return accomodation;
    }

    public void setAccinfo(Accomodation accomodation) {
        this.accomodation = accomodation;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }
    
     @Override
    public String toString() {
        return this.status;
    }
    
}
