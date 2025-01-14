// ___________HQL JOIN(ONE TO MANY/MANY TO ONE)
package com.entities;

import javax.persistence.*;

@Entity
public class Answers {

    @Id
    @Column
    private int aid;

    @Column
    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Questions question;
    public Answers() {
        super();
    }

    public Answers(int aid, String answer) {
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

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }
}
