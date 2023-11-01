package com.java.exception_demo;

public class Student {

    private String name;

    public String fetchName(){
        return this.name;
    }

    public void assignname(String name){
        this.name = name;
        // Student s1 == new Student()
        // s1.displayDetails();
        this.displayDetails(); // this == s1
        new Student();
    }

    private int studentID;

    public Student(){
        System.out.println("inside zero arg constructor");
    }
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    
    public void displayDetails() {
        try {
            System.out.println("Length of name" + name.length());
            System.out.println("display details called"); // skipped in case of exception
        }catch (NullPointerException e){
            System.out.println("Invalid Input");
        }
        System.out.println("I m normal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}


// SOLID :