package com.java.staticdemo;

public class Employee {

    String name;


    static {  // static variables, methods & blocks are invoked/initializes during class-loading step.
        System.out.println("inside 1st static block");
    }
    public static void main(String[] args) {
        System.out.println("Inside Employee main");
    }

    static {
        System.out.println("inside 2nd static block");
    }

    static {
        System.out.println("inside 3rd static block");
    }

    static {
        System.out.println("inside 4th static block");
    }
}
