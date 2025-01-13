// -----FOR EMBEDDABLE AND EMBEDDED CONCEPT-------

package com.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    //fields
    private int cid;
    private String course;

    //constructors


    public Certificate() {
        super();
    }

    public Certificate(int cid, String course) {
        this.cid = cid;
        this.course = course;
    }

    //getters and setters

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
