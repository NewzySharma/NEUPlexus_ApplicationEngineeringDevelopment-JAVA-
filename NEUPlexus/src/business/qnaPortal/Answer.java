/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.qnaPortal;

import java.util.Random;

/**
 *
 * @author Apurva
 */
public class Answer {
    private int answerId ;
    private String answerText;
    private String answeredByUserId;
    private long forQuestionId;
    private int answerRating;
    private String answeredTime;
    Random r = new Random();

    public Answer() {
    }

    public Answer(String answerText, String answeredByUserId, long forQuestionId) {
        this.answerId=r.nextInt(1000000);
        this.answerText = answerText;
        this.answeredByUserId = answeredByUserId;
        this.forQuestionId = forQuestionId;
    }

    public String getAnsweredTime() {
        return answeredTime;
    }

    public void setAnsweredTime(String answeredTime) {
        this.answeredTime = answeredTime;
    }

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public String getAnsweredByUserId() {
        return answeredByUserId;
    }

    public void setAnsweredByUserId(String answeredByUserId) {
        this.answeredByUserId = answeredByUserId;
    }

    public long getForQuestionId() {
        return forQuestionId;
    }

    public void setForQuestionId(long forQuestionId) {
        this.forQuestionId = forQuestionId;
    }

    public int getAnswerRating() {
        return answerRating;
    }

    public void setAnswerRating(int answerRating) {
        this.answerRating = answerRating;
    }
    
    
}
