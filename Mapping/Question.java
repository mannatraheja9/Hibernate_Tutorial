//_________ONE TO ONE MAPPING__________
//
//package com.entities;
//
//import javax.persistence.*;
//
//@Entity
//public class Question {
//
//    @Id
//    @Column(name = "qid")
//    private int qid;
//
//    @Column
//    private String question;
//
//    @OneToOne
//    @JoinColumn(name = "answer_id")
//    private Answer answer;
//
//    public Question() {
//        super();
//    }
//
//    public Question(int qid, String question) {
//        this.qid = qid;
//        this.question = question;
//    }
//
//    public int getQid() {
//        return qid;
//    }
//
//    public void setQid(int qid) {
//        this.qid = qid;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public Answer getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(Answer answer) {
//        this.answer = answer;
//    }
//}








//________ONE TO MANY/MANY TO ONE_________

//
//package com.entities;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Question {
//
//    @Id
//    @Column(name = "qid")
//    private int qid;
//
//    @Column
//    private String question;
//
//    @OneToMany
//    private List<Answer> answers;
//
//    public Question() {
//        super();
//    }
//
//    public Question(int qid, String question) {
//        this.qid = qid;
//        this.question = question;
//    }
//
//    public int getQid() {
//        return qid;
//    }
//
//    public void setQid(int qid) {
//        this.qid = qid;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public List<Answer> getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(List<Answer> answers) {
//        this.answers = answers;
//    }
//}







