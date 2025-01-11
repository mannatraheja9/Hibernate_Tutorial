// ------------------------------------------
// -------FOR  CRUD -------------------------

//package com.main;
//
//import com.entities.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main( String[] args ) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();


        //   INSERT OPERATION
//        User user1 = new User();
//        user1.setName("Deepak");
//        user1.setEmail("deepak@gmail.com");
//        user1.setPassword("deepak123");
//        user1.setGender("Male");
//        user1.setCity("Sonipat");
//
//        try {
//            session.save(user1);
//            transaction.commit();
//            System.out.println("Data added successfully!");
//        }catch (Exception e){
//            transaction.rollback();
//            e.printStackTrace();
//            System.out.println("Data not added.");
//        }




        //   SELECT OPERATION
//        try{
//              User user = session.get(User.class, 2);
//            if(user != null){
//                System.out.println(user.getId());
//                System.out.println(user.getName());
//                System.out.println(user.getEmail());
//                System.out.println(user.getPassword());
//                System.out.println(user.getGender());
//                System.out.println(user.getCity());
//            }else{
//                System.out.println("User not found");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }


        //    UPDATE OPERATION

//        try{
//            User user = session.get(User.class, 1);
//            user.setCity("Gurugram");
//
//            session.saveOrUpdate(user);
//            transaction.commit();
//            System.out.println("Updated successfully!");
//        }catch(Exception e){
//            transaction.rollback();
//            e.printStackTrace();
//            System.out.println("Details not updated.");
//        }


        //    DELETE OPERATION
//        try{
//            User user = new User();
//            user.setId(1);
//
//            session.delete(user);
//            transaction.commit();
//            System.out.println("Deleted successfully!");
//        }catch(Exception e){
//            transaction.rollback();
//            e.printStackTrace();
//            System.out.println("Data not deleted.");
//        }
//
//    }
//}




//  ---------------------------------------
//  ---------FOR EMBEDDABLE AND EMBEDDED CONCEPT--------

//package com.main;
//
//import com.entities.Certificate;
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Student student = new Student();
//        student.setSid(1);
//        student.setName("Alisha");
//
//        Certificate certificate = new Certificate();
//        certificate.setCid(1);
//        certificate.setCourse("Hibernate");
//
//        student.setCerti(certificate);   //passing object as reference
//
//        try {
//            session.save(student);
//            transaction.commit();
//            System.out.println("Data saved successfully");
//        }catch(Exception e){
//            e.printStackTrace();
//            System.out.println("Data not saved.");
//        }finally {
//            session.close();
//            sessionFactory.close();
//        }
//    }
//}






//_____________ONE TO ONE MAPPING_____________________

//package com.main;
//
//import com.entities.Answer;
//import com.entities.Question;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Question q1 = new Question();
//        q1.setQid(1);
//        q1.setQuestion("What is Java?");
//
//        Answer a1 = new Answer();
//        a1.setAid(01);
//        a1.setAnswer("Java is a programming language");
//
//        q1.setAnswer(a1);
//
//        session.save(q1);
//        session.save(a1);
//
//        transaction.commit();
//        session.close();
//
//    }
//}






//___________ONE TO MANY/ MANY TO ONE MAPPING__________
//package com.main;
//
//import com.entities.Answer;
//import com.entities.Question;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Question q1 = new Question();
//        q1.setQid(1);
//        q1.setQuestion("MCQ Question");
//
//        Answer a1 = new Answer();
//        a1.setAid(11);
//        a1.setAnswer("Option 1");
//        a1.setQuestion(q1);
//
//        Answer a2 = new Answer();
//        a2.setAid(12);
//        a2.setAnswer("Option 2");
//        a2.setQuestion(q1);
//
//        Answer a3 = new Answer();
//        a3.setAid(13);
//        a3.setAnswer("Option 3");
//        a3.setQuestion(q1);
//
//        List<Answer> answers = new ArrayList<>();
//        answers.add(a1);
//        answers.add(a2);
//        answers.add(a3);
//
//        q1.setAnswers(answers);
//
//        session.save(q1);
//        session.save(a1);
//        session.save(a2);
//        session.save(a3);
//
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
//
//    }
//}





//__________ MANY TO MANY MAPPING____________________

//package com.main;
//
//import com.entities.Employee;
//import com.entities.Project;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class App{
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Employee emp1 = new Employee();
//        emp1.setEmpId(1);
//        emp1.setEmpName("Alisha");
//
//        Employee emp2 = new Employee();
//        emp2.setEmpId(2);
//        emp2.setEmpName("Ahana");
//
//        Project proj1 = new Project();
//        proj1.setProjectId(101);
//        proj1.setProjectName("Hibernate");
//
//        Project proj2 = new Project();
//        proj2.setProjectId(102);
//        proj2.setProjectName("SpringBoot");
//
//        List<Employee> empList = new ArrayList<>();
//        List<Project> projList = new ArrayList<>();
//
//        empList.add(emp1);
//        empList.add(emp2);
//
//        projList.add(proj1);
//        projList.add(proj2);
//
//        emp1.setProjects(projList);
//        emp2.setProjects(projList);
//
//        proj1.setEmployees(empList);
//        proj2.setEmployees(empList);
//
//        session.save(emp1);
//        session.save(emp2);
//        session.save(proj1);
//        session.save(proj2);
//
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
//    }
//}







//____________HQL_(INSERTING DATA FIRST)___________________
//package com.main;
//
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Student s1 = new Student();
//        s1.setSid(1);
//        s1.setName("Deepak");
//
//        try {
//            session.save(s1);
//            transaction.commit();
//            System.out.println("Data added successfully!");
//        } catch (Exception e) {
//            transaction.rollback();
//            e.printStackTrace();
//            System.out.println("Data not added.");
//        }
//    }
//}





//________HQL (GETTING DATA)____________

//package com.main;
//
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        String query = "from Student";   //write query
//        Query<Student> q = session.createQuery(query, Student.class);   //execute it
//        List<Student> list = q.list();    //store results
//        for(Student s : list){            //use results
//            System.out.println(s.getName());
//        }
//
//        session.close();
//        sessionFactory.close();
//    }
//}






//__________HQL SELECT _________


//package com.main;
//
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        String query = "from Student where name = :x";   //write query
//        Query<Student> q = session.createQuery(query, Student.class);   //execute it
//        q.setParameter("x", "Pankaj");
//
//        List<Student> list = q.list();    //store results
//        for(Student s : list){            //use results
//            System.out.println(s.getSid() + " : " + s.getName());
//        }
//
//        session.close();
//        sessionFactory.close();
//    }
//}








//__________HQL UPDATE_________

//package com.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Query query = session.createQuery("update Student set name = :n where sid = :i");
//        query.setParameter("n", "Dheeraj");
//        query.setParameter("i", 3);
//
//        int rowsAffected = query.executeUpdate();
//
//        if(rowsAffected ==1){
//            System.out.println("Update successful!");
//            transaction.commit();
//        }
//        session.close();
//        sessionFactory.close();
//    }
//}







//__________HQL DELETE_________

//package com.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Query query = session.createQuery("DELETE FROM Student WHERE sid = :i");
//        query.setParameter("i", 6);
//
//        int rowsAffected = query.executeUpdate();
//
//        if(rowsAffected ==1){
//            System.out.println("Update successful!");
//            transaction.commit();
//        }
//        session.close();
//        sessionFactory.close();
//    }
//}










//__________HQL JOIN  (entering data in one to many and many to one type tables - Questions, Answers_________

//package com.main;
//
//import com.entities.Answers;
//import com.entities.Questions;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Questions q1 = new Questions();
//        q1.setQid(1);
//        q1.setQuestion("MCQ Question");
//
//        Answers a1 = new Answers();
//        a1.setAid(11);
//        a1.setAnswer("Option 1");
//        a1.setQuestion(q1);
//
//        Answers a2 = new Answers();
//        a2.setAid(12);
//        a2.setAnswer("Option 2");
//        a2.setQuestion(q1);
//
//        Answers a3 = new Answers();
//        a3.setAid(13);
//        a3.setAnswer("Option 3");
//        a3.setQuestion(q1);
//
//        List<Answers> answers = new ArrayList<>();
//        answers.add(a1);
//        answers.add(a2);
//        answers.add(a3);
//
//        q1.setAnswers(answers);
//
//        session.save(q1);
//        session.save(a1);
//        session.save(a2);
//        session.save(a3);
//
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
//
//    }
//}







// _____USING THE HQL JOIN_____________________

//package com.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        Query<Object []> query = session.createQuery("select q.qid, q.question, a.answer from Questions as q  INNER JOIN q.answers as a", Object[].class);
//        List<Object []> list  = query.list();
//
//        for(Object[] arr : list){
//            System.out.println(Arrays.toString(arr));
//        }
//
//        session.close();
//        sessionFactory.close();
//
//    }
//}






// _____HQL PAGINATION___________

//package com.main;
//
//import com.entities.Answers;
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        Query<Student> query = session.createQuery("FROM Student", Student.class);
//        query.setFirstResult(2);    //skips 2 rows
//        query.setMaxResults(3);     //returns 3 rows
//        List<Student> list = query.list();
//        for(Student s : list){
//            System.out.println("ID: " + s.getSid() + " ,  NAME: " + s.getName());
//        }
//
//        session.close();
//        sessionFactory.close();
//
//    }
//}





//// _____________NATIVE SQL____________
//
//package com.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.NativeQuery;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        NativeQuery<Object[]> query = session.createNativeQuery("select * from student");
//
//        List<Object []> students = query.list();
//
//        for (Object [] student : students) {
//            System.out.println(student[0] + " - " + student[1]);   //printing columns
//            System.out.println(Arrays.toString(student));          //printing rows
//        }
//
//        session.close();
//        sessionFactory.close();
//    }
//}
//




//____________CASCADE________________

//package com.main;
//
//import com.entities.AnswerCascade;
//import com.entities.QuestionCascade;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        QuestionCascade q1 = new QuestionCascade();
//        q1.setQid(101);
//        q1.setQuestion("Animals");
//
//        AnswerCascade a1 = new AnswerCascade();
//        AnswerCascade a2 = new AnswerCascade();
//        AnswerCascade a3 = new AnswerCascade();
//
//        a1.setAid(201);
//        a1.setAnswer("Dog");
//        a1.setQuestion(q1);
//        a2.setAid(202);
//        a2.setAnswer("Cat");
//        a2.setQuestion(q1);
//        a3.setAid(203);
//        a3.setAnswer("Horse");
//        a3.setQuestion(q1);
//
//        List<AnswerCascade> list = new ArrayList<>();
//        list.add(a1);
//        list.add(a2);
//        list.add(a3);
//
//        q1.setAnswers(list);
//
//        Transaction transaction = session.beginTransaction();
//        session.save(q1);
//        transaction.commit();
//
//        session.close();
//        sessionFactory.close();
//    }
//}








// _________FIRST LEVEL CACHE_________________

//package com.main;
//
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        Student student = session.get(Student.class, 1);
//        System.out.println(student.getName());
//
//        System.out.println("Getting the object again. There will be no select query below.");
//
//        Student student1 = session.get(Student.class, 1);
//        System.out.println(student1.getName());
//
//        session.close();
//        sessionFactory.close();
//    }
//}




//__________SECOND LEVEL CACHE____________


//package com.main;
//
//import com.entities.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Student student = session1.get(Student.class, 1);
//        System.out.println(student.getName());
//        session1.close();
//
//        Session session2 = sessionFactory.openSession();
//        Student student1 = session2.get(Student.class, 1);
//        System.out.println(student1.getName());
//        session2.close();
//
//        sessionFactory.close();
//    }
//}







//___________CRITERIA API___________
//
//package com.main;
//
//import com.entities.Student;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class App {
//    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        Criteria c = session.createCriteria()
//
//        sessionFactory.close();
//    }
//}
