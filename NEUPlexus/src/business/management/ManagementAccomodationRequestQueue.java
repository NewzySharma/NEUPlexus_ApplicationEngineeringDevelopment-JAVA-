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
public class ManagementAccomodationRequestQueue {
     public List<AccomodationListRequest> requests;

    public ManagementAccomodationRequestQueue() {
        this.requests = new ArrayList<AccomodationListRequest>();
    }

    public List<AccomodationListRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<AccomodationListRequest> requests) {
        this.requests = requests;
    }
    
    
}
