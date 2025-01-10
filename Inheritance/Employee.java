// SINGLE TABLE INHERITANCE

//package com.inheritance;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "employee_single_table")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type" , discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "Employee")
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private int id;
//
//    @Column
//    private String name;
//
//    public Employee(){
//        super();
//    }
//
//    public Employee(int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}








// TABLE PER CLASS INHERITANCE

//package com.inheritance;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "employee_table_per_class")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column
//    private int id;
//
//    @Column
//    private String name;
//
//    public Employee(){
//        super();
//    }
//
//    public Employee(int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}




// TABLE PER SUBCLASS (JOINED TABLE) INHERITANCE

package com.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "employee_joined_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;

    public Employee(){
        super();
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}