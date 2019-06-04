/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.carpool;
import business.qnaPortal.Question;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shardul Pathak
 */
public class CarDirectory {
   private List<CarInfo> carList; 
   
   public CarDirectory() {
    carList = new ArrayList<CarInfo>();
    }

    public List<CarInfo> getCarList() {
        return carList;
    }

    public void setCarList(List<CarInfo> carList) {
        this.carList = carList;
    }
}
