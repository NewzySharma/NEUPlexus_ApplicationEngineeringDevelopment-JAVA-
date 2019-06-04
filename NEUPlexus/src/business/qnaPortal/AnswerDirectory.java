package business.qnaPortal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import business.qnaPortal.Answer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apurva
 */
public class AnswerDirectory {
    private List<Answer> AnswerList;

    public AnswerDirectory() {
        AnswerList = new ArrayList<Answer>();
    }

    public List<Answer> getAnswerList() {
        return AnswerList;
    }

    public void setAnswerList(List<Answer> AnswerList) {
        this.AnswerList = AnswerList;
    }
    
    
}
