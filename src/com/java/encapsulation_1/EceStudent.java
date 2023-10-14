package com.java.encapsulation_1;

public class EceStudent extends Student{

    public EceStudent(String name, int ID, int age, String gender) {
        super();
        Student s1  = new Student(name,ID, age, gender);
    //    System.out.println(s1.name);
      /*  System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.gender);*/
    }

    // Classes in same package can access all variables + methods except those with 'private' access specifier
}
