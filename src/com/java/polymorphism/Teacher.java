package com.java.polymorphism;

public class Teacher extends Employee{

    @Override
    void displayDetails(){
        System.out.println("inside displayDetails method with 0 parameter in Teacher class");
    }

    void displayDetails(String parameter){
        System.out.println("inside displayDetails method with 1 parameter in Teacher class");
    }

    void displayDetails(String name, int empID){
        System.out.println("inside displayDetails method with 2 parameter(String, int) in Teacher class");
    }

    void displayDetails(int empID, String name){
        System.out.println("inside displayDetails method with 2 parameter (int, String) in Teacher class");
    }

}
