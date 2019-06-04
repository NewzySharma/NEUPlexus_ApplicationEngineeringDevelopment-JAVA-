/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.dataoperations;

import business.accomodation.AccomodationDirectory;
import business.carpool.CarDirectory;
import business.management.ManagementAccomodationRequestQueue;
import business.management.ManagementCarRequestQueue;
import business.qnaPortal.AnswerDirectory;
import business.qnaPortal.QuestionDirectory;

/**
 *
 * @author Apurva
 */
public class DataStore {
    public AnswerDirectory ansdir;
    public QuestionDirectory quesdir;
    public ManagementCarRequestQueue carmngmntrqstqueue;
    public CarDirectory approvedcardir;
    public AccomodationDirectory approvedaccdir;
    private ManagementAccomodationRequestQueue accmngmntrqstqueue;
    
      
    public DataStore(){
        ansdir = new AnswerDirectory();
        quesdir= new QuestionDirectory();
        approvedcardir= new CarDirectory();
        carmngmntrqstqueue=new ManagementCarRequestQueue();
        accmngmntrqstqueue = new ManagementAccomodationRequestQueue();
        approvedaccdir = new AccomodationDirectory();
    }

    public AccomodationDirectory getApprovedaccdir() {
        return approvedaccdir;
    }

    public void setApprovedaccdir(AccomodationDirectory approvedaccdir) {
        this.approvedaccdir = approvedaccdir;
    }

    public ManagementAccomodationRequestQueue getAccmngmntrqstqueue() {
        return accmngmntrqstqueue;
    }

    public void setAccmngmntrqstqueue(ManagementAccomodationRequestQueue accmngmntrqstqueue) {
        this.accmngmntrqstqueue = accmngmntrqstqueue;
    }
 
    public ManagementCarRequestQueue getCarmngmntrqstqueue() {
        return carmngmntrqstqueue;
    }

    public void setCarmngmntrqstqueue(ManagementCarRequestQueue carmngmntrqstqueue) {
        this.carmngmntrqstqueue = carmngmntrqstqueue;
    }

    public CarDirectory getCardir() {
        return approvedcardir;
    }

    public void setCardir(CarDirectory cardir) {
        this.approvedcardir = cardir;
    }
  

   

    public AnswerDirectory getAnsdir() {
        return ansdir;
    }

    public void setAnsdir(AnswerDirectory ansdir) {
        this.ansdir = ansdir;
    }

    public QuestionDirectory getQuesdir() {
        return quesdir;
    }

    public void setQuesdir(QuestionDirectory quesdir) {
        this.quesdir = quesdir;
    }
    
}
