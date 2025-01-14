//___________ONE TO ONE MAPPING________


//package com.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Answer {
//
//    @Id
//    @Column
//    private int aid;
//
//    @Column
//    private String answer;
//
//    public Answer() {
//        super();
//    }
//
//    public Answer(int aid, String answer) {
//        this.aid = aid;
//        this.answer = answer;
//    }
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
//}







//__________ONE TO MANY/MANY TO ONE___________
//package com.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Answer {
//
//    @Id
//    @Column
//    private int aid;
//
//    @Column
//    private String answer;
//
//    @ManyToOne
//    private Question question;
//    public Answer() {
//        super();
//    }
//
//    public Answer(int aid, String answer) {
//        this.aid = aid;
//        this.answer = answer;
//    }
//
//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
//
//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//}







