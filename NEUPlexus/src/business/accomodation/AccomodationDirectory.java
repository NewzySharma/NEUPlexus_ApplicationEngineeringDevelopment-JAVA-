/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.accomodation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apurva
 */
public class AccomodationDirectory {
     private List<Accomodation> accList; 
   
   public AccomodationDirectory() {
    accList = new ArrayList<Accomodation>();
    }

    public List<Accomodation> getAccList() {
        return accList;
    }

    public void setAccList(List<Accomodation> accList) {
        this.accList = accList;
    }
   
}
