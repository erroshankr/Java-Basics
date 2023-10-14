package com.java.encapsulation_1;

public class ItStudent {

    ItStudent(String name, int ID, int age, String gender){
        Student s1 = new Student(name,ID,age, gender);
      //  System.out.println(s1.name); // private
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.gender);
    }
}
