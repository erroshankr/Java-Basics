package com.java.encapsulation_2;

import com.java.encapsulation_1.EceStudent;
import com.java.encapsulation_1.Student;

public class CseStudent extends Student {

    public CseStudent(String name, int ID, int age, String gender) {
     /*   EceStudent e1  = new EceStudent(name,ID, age, gender);
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.age);
        System.out.println(e1.gender);*/
        // EceStudent object is created outside the package com.java.encapsulation_1, so cant access anything except public access specifier

     /*   Student s1  = new Student(name,ID, age, gender);
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.gender);*/

        // EceStudent object is created outside the package com.java.encapsulation_1, so cant access anything except public access specifier

    //    CseStudent c1  = new CseStudent(name,ID, age, gender);
    //    System.out.println(c1.name); // private : so cant access
    //    System.out.println(c1.id); // public
    //    System.out.println(c1.age); // default: outside package -> so cant access
    //    System.out.println(c1.gender); same package + another package but extending class from that package where it is defined.

        // CseStudent object is created outside com.java.encapsulation_1 but extends a class Student which is in com.java.encapsulation_1, so it
        // can access private, public & protected access specifiers but cant access default access specifier.
    }

    // visibilty seq: private -> default -> protected -> public
/*    @Override
    public void displayDetails(){    // cant even be accessed bcoz being tried outside package
        Student s1 = new Student("Rekha",1234,23,"F");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.id);
    }*/


    public static void main(String[] args) {
        String[] test = new String[4];
        System.out.println("inside CseStudent Main");
    }
}
