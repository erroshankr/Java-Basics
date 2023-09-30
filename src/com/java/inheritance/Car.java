package com.java.inheritance;

//Inheritance : to inherit from something
//Parent class --> child class : behaviour of parent class will be reflected in child class if allowed.
// Class behaviour: Variables(optional) + Methods(optional)
// object : remote control of class


// 'class' + Caps(name)
// all sud be small case
 public class Car extends Vehicle{  //alto, bmw, mercedez

    String name = "Generic-car"; // data type + name
    String color = "Green";
    long engineID = 678668768;

   // return-type + method-name(arguments.....) : arguements can be zero or more
    public void printDetails(){
        super.printDetails();  // super: it is used to refer immediate parent's method,constructors or member variables
        System.out.println("name:" + super.name + ", color:" + super.color + ", engineID:" + super.engineID);
        System.out.println("name:" + name + ", color:" + color + ", engineID:" + engineID);
        System.out.println("Inside printDetails of Car class");
    }
}
