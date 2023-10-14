package com.java.encapsulation_1;

// It is achieved with help of Access specifiers: private, default, protected,  public
 public class Student {

    private String name;// private: can be accessed within a class only
    int age; // default: same package.
    protected String gender; // protected: default + class that extends any class from teh package where it is defined.
    public int id; // public: can be accessed anywhere


    public Student(){

    }

    public Student(String name, int ID, int age, String gender) {
        this.name = name;
        this.id = ID;
        this.age = age;
        this.gender = gender;
      //  System.out.println("within constructor : name = " + this.name);
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }


}
