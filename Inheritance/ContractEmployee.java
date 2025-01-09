//SINGLE TABLE INHERITANCE

package com.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Contract Employee")
public class ContractEmployee extends Employee {
    @Column
    private int payPerHour;

    @Column
    private String duration;

    public ContractEmployee(){
        super();
    }

    public ContractEmployee(int payPerHour, String duration) {
        this.payPerHour = payPerHour;
        this.duration = duration;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
