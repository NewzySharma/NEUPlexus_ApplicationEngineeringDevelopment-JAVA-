/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.management;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apurva
 */
public class ManagementCarRequestQueue {
    public List<CarListingRequest> requests;

    public ManagementCarRequestQueue() {
        this.requests = new ArrayList<CarListingRequest>();
    }

    public List<CarListingRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<CarListingRequest> requests) {
        this.requests = requests;
    }
    
    
    
}
