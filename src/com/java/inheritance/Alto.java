package com.java.inheritance;

//
public class Alto extends Car{

    String name = "Alto"; // data type + name
    String color = "Red";
    long engineID = 4564546;

    public void printDetails(){
       /* Car c1 = new Car();
        c1.printDetails();*/
        super.printDetails();  // super: it is used to refer immediate parent's method,constructors or member variables
        System.out.println("name:" + super.name + ", color:" + super.color + ", engineID:" + super.engineID);
        System.out.println("name:" + name + ", color:" + color + ", engineID:" + engineID);
        System.out.println("Inside printDetails of Alto class");
    }
}
