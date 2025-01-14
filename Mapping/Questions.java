//________  HQL JOIN (ONE TO MANY/MANY TO ONE)_________

package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Questions {

    @Id
    @Column(name = "qid")
    private int qid;

    @Column
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answers> answers;

    public Questions() {
        super();
    }

    public Questions(int qid, String question) {
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

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}