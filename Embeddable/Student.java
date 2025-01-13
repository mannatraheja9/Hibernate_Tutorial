// -----FOR EMBEDDABLE AND EMBEDDED CONCEPT-------

//package com.entities;
//
//import javax.persistence.*;
//
//@Entity
//public class Student {
//    //fields
//    @Column
//    @Id
//    private int sid;
//
//    @Column
//    private String name;
//
//    @Embedded
//    private Certificate certi;
//
//    //constructors (parametrised and non - parametrised)
//    public Student() {
//        super();
//    }
//
//    public Student(int sid, String name) {
//        this.sid = sid;
//        this.name = name;
//    }
//
//    // getters and setters
//
//    public int getSid() {
//        return sid;
//    }
//
//    public void setSid(int sid) {
//        this.sid = sid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Certificate getCerti() {
//        return certi;
//    }
//
//    public void setCerti(Certificate certi) {
//        this.certi = certi;
//    }
//}






// ______HQL SELECT, UPDATE, DELETE, PAGINATION, NATIVE SQL QUERY__________________

////  _____________ FIRST LEVEL CACHE____________
// ____________CRITERIA API______________


package com.entities;

import javax.persistence.*;

@Entity
public class Student {
    //fields
    @Column
    @Id
    private int sid;

    @Column
    private String name;

    //constructors (parametrised and non - parametrised)
    public Student() {
        super();
    }

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    // getters and setters

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


//  _____________ SECOND LEVEL CACHE____________
//package com.entities;
//
//import javax.persistence.*;
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//
//@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
//public class Student {
//    //fields
//    @Column
//    @Id
//    private int sid;
//
//    @Column
//    private String name;
//
//    //constructors (parametrised and non - parametrised)
//    public Student() {
//        super();
//    }
//
//    public Student(int sid, String name) {
//        this.sid = sid;
//        this.name = name;
//    }
//
//    // getters and setters
//
//    public int getSid() {
//        return sid;
//    }
//
//    public void setSid(int sid) {
//        this.sid = sid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}