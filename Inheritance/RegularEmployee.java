//SINGLE TABLE INHERITANCE

//package com.inheritance;
//
//import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//
//@Entity
//@DiscriminatorValue(value = "Regular Employee")
//public class RegularEmployee extends Employee{
//
//    @Column
//    private int salary;
//
//    @Column
//    private int bonus;
//
//    public RegularEmployee() {
//    }
//
//    public RegularEmployee(int salary, int bonus) {
//        this.salary = salary;
//        this.bonus = bonus;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getBonus() {
//        return bonus;
//    }
//
//    public void setBonus(int bonus) {
//        this.bonus = bonus;
//    }
//}








//TABLE PER CLASS INHERITANCE

//package com.inheritance;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "regular_employee")
//@AttributeOverrides({
//        @AttributeOverride(name = "name", column = @Column(name = "reg_name"))
//})
//public class RegularEmployee extends Employee{
//
//    @Column
//    private int salary;
//
//    @Column
//    private int bonus;
//
//    public RegularEmployee() {
//    }
//
//    public RegularEmployee(int salary, int bonus) {
//        this.salary = salary;
//        this.bonus = bonus;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getBonus() {
//        return bonus;
//    }
//
//    public void setBonus(int bonus) {
//        this.bonus = bonus;
//    }
//}








// TABLE PER SUBCLASS INHERITANCE__________________________

package com.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "regular_employee_joined")
public class RegularEmployee extends Employee{

    @Column
    private int salary;

    @Column
    private int bonus;

    public RegularEmployee() {
    }

    public RegularEmployee(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
