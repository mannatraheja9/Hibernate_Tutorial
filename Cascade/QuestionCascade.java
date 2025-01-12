package com.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class QuestionCascade {

    @Id
    @Column(name = "qid")
    private int qid;

    @Column
    private String question;

    @OneToMany(mappedBy = "question" , cascade = CascadeType.ALL) //cascade
    private List<AnswerCascade> answers;

    public QuestionCascade() {
        super();
    }

    public QuestionCascade(int qid, String question) {
        this.qid = qid;
        this.question = question;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerCascade> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerCascade> answers) {
        this.answers = answers;
    }
}
