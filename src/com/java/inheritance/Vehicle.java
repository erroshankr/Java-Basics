package com.java.inheritance;

public class Vehicle {

    // default value of string = null, long = 0, int = 0, double = 0.0, boolean = false
    String name ; // data type + name
    String color ;
    long engineID ;

    // return-type + method-name(arguments.....) : arguements can be zero or more
    public void printDetails(){
        System.out.println("Inside printDetails of Vehicle class");
    }
}
