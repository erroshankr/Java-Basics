package com.java.abstraction;

//Abstraction : Steering of car
//Encapsulation: hidden Internal functionality of Steering

//Abstract class & Interface
//abstract class :
//1. 'abstract' keyword used before class keyword
//7: Abstract class must have 'abstract' keyword used before class keyword.
//8. Abstract class may or may not have abstract method(s).
//5: Abstract Class can have both abstract & non-abstract methods.
//3: Abstract class can not be instantiated -> we can not make object of abstract class
//4: All abstract methods in abstract class have to be implemented by its derivative/child class by extending abstract class.
//6: abstract method: 'abstract' keyword in method, method without body , just having defination.
//9: abstract class can not have non abstract method without body.


public abstract class Employee {  // POJO: Plain Old Java Object, bean, Model

    private String name;
    private int empID;

    //public void displaySalary();

    public void displayDetails(){  // non abstract method
        System.out.println(this.empID + " & " + this.name);
    }

    abstract void displayData();  // abstract methods
    abstract void displayEmpID();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }


}
