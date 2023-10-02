package com.java.polymorphism;

//Polymorphism : It allows objects of different classes to be treated as objects of common super class
//               and actual method execution is decided during runtime.

// 2 types : Runtime Polymorphism, Dynamic Polymorphism, Dynamic Method Dispatch
// Compile-time Polymorphism/ Static Polymorphism :
public class Main {

    public static void main(String[] args) {

        Employee e1 = new Teacher();
        e1.displayDetails();   // Runtime Polymorphism --> During compilation, compiler assumes the call going to Employee class
                               // but it actually goe sto Teacher class which is child class of Employee.
       // e1.displayDetails("test");  --> Invalid bcoz displayDetails(String) not present in reference class
        Teacher t1 = new Teacher();

        //Method Overloading: // Static/Compile-time Polymorphism
        t1.displayDetails();
        t1.displayDetails("test");
        t1.displayDetails(12,"Rakesh");
        t1.displayDetails("Rakesh",12);

        // Method overriding is a subset of method overloading ===>
    }
}
