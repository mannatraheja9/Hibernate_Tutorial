package com.entities;

import javax.persistence.*;

@Entity
public class AnswerCascade{

    @Id
    @Column
    private int aid;

    @Column
    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionCascade question;
    public AnswerCascade() {
        super();
    }

    public AnswerCascade(int aid, String answer) {
        this.aid = aid;
        this.answer = answer;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionCascade getQuestion() {
        return question;
    }

    public void setQuestion(QuestionCascade question) {
        this.question = question;
    }
}