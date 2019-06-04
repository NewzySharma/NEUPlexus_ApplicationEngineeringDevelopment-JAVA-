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
public class Question {
    private int questionId=0;
    private String questionType;
    private String questionText;
    private AnswerDirectory answers;
    private String intendedFor;
    private String askedBy;
    private String askedByEmailId;
private String datePosted;

    public Question() {
        Random r =new Random();
        questionId=r.nextInt(10000000);
        answers = new AnswerDirectory();
    }

    public String getIntendedFor() {
        return intendedFor;
    }

    public void setIntendedFor(String intendedFor) {
        this.intendedFor = intendedFor;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getAskedByEmailId() {
        return askedByEmailId;
    }

    public void setAskedByEmailId(String askedByEmailId) {
        this.askedByEmailId = askedByEmailId;
    }
  
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getNumberOfAnswers() {
        return answers.getAnswerList().size();
    }

    public AnswerDirectory getAnswers() {
        return answers;
    }

    public void setAnswers(AnswerDirectory answers) {
        this.answers = answers;
    }

    public String getAskedBy() {
        return askedBy;
    }

    public void setAskedBy(String askedBy) {
        this.askedBy = askedBy;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.getQuestionId());
    }
}
