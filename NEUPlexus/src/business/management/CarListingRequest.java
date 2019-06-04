/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.management;

import business.carpool.CarInfo;

/**
 *
 * @author Apurva
 */
public class CarListingRequest {
    private int requestNumber=0;
    private String status;
    private CarInfo carinfo;
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
        requestNumber++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CarInfo getCarinfo() {
        return carinfo;
    }

    public void setCarinfo(CarInfo carinfo) {
        this.carinfo = carinfo;
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
