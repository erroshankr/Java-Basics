package com.java.encapsulation_1;

public class ItStudent extends Student{

    ItStudent(String name, int ID, int age, String gender){
        Student s1 = new Student(name,ID,age, gender);
      //  System.out.println(s1.name); // private
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.gender);
    }

    @Override
    public void displayDetails(){
        Student s1 = new Student("Rekha",1234,23,"F");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.id);
    }

}
