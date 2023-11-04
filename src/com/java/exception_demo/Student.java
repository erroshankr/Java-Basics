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
        try { // to trace vulnerable code
            throw new DemoException("Incorrect input , please provide correct inout");
    //        throw new NullPointerException(); // throw--> used to forcefully create exception.
    //        System.out.println("Length of name" + name.length());
    //        System.out.println("display details called"); // skipped in case of exception
        }catch (NullPointerException e1){  // to handle exception --> In case of exception, JVM creates/throws an object of specified exception class and then looks for its reference
        //    NullPointerException obj = new NullPointerException();  --> JVM maps this reference internally
            System.out.println("Invalid Input");
        }catch (DemoException e2) {
            System.out.println("Demo Exception occurred");
            try {
                throw new DemoException("See I told u i m interesting");
            } catch (DemoException e) {
             //   System.out.println("Length of name" + name.length());
                try {
                    throw new RuntimeException(e);
                }catch (Exception e3){
                    System.out.println("Looks like I'm handled properly");
                }
            }
        }finally {
            System.out.println("I am in finally block");
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