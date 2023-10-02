package com.java.polymorphism;



public class Employee {

    String name;
    int empID;

    public Employee(){

    }

    public Employee(String name, int empID){
        this.name = name;
        this.empID = empID;
    }

    void displayDetails(){
        System.out.println("inside displayDetails method with 0 parameter in Employee class");

    }
}
