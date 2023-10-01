package com.java.inheritance;

public class Vehicle {  // If a class doesn't explicitely extends any class, it by-default extends Object class
    // Zero Argument constructor: Every class in Java expects its parent's class to have a zero arg constructor

    // default value of string = null, long = 0, int = 0, double = 0.0, boolean = false
    String name ; // data type + name
    String color ;
    long engineID ;

    // return-type + method-name(arguments.....) : arguements can be zero or more
    public void printDetails(){ //signature: return type, access specifier, no of parameter, parameter sequence
        System.out.println("Inside printDetails of Vehicle class");
    }

    public void findSpeed(String name, int speed){
        System.out.println("Inside findSpeed method of Vehicle class");
        System.out.println("Speed of " + name + " is : " + speed);
    }

   public Vehicle(){  // Zero Argument constructor or Default Constructor
        System.out.println("Inside 0 argument constructor of vehicle");
    }

    public Vehicle(String nm){  // Zero Argument constructor or Default Constructor
       this.name = nm;
        System.out.println("Inside 1 arg constructor of vehicle");
    }

   public Vehicle(String nm, String clr){  // Zero Argument constructor or Default Constructor
       this.name = nm;
       this.color =clr;
       System.out.println("Inside 2 arg constructor of vehicle");

   }

   //"BMW", "Black", 232323
    public Vehicle(String name, String color, long engineID){  // Zero Argument constructor or Default Constructor
        System.out.println("Inside 3 arg constructor of vehicle");
        System.out.println("name: " + name + ", color: " + color + " , engineID: " + engineID);
        this.name = name;
        this.color =color;
        this.engineID = engineID;
        System.out.println("name: " + name + ", color: " + color + " , engineID: " + engineID);


    }

    // this: refers to object of current class, used to access or refer variables, methods & constructors of current class.
}
