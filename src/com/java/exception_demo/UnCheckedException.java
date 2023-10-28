package com.java.exception_demo;

// which could have been avoided by programmer.
// These Exceptions are subclasses of RuntimeException
// NullPointerException, Arithmetic Ex, ArrayIndexOutofBound, ClassCast Ex,Illegal argument Ex, NumberFormat Exception
public class UnCheckedException {  // SQL Exception
    public static void main(String[] args) {
        String subject = "English";
    //    System.out.println(subject.length());

        subject = null; // null
        try {
            System.out.println(subject.length());  // Null pointer exception
        }catch (Exception e){
            System.out.println("Invalid Input");
        }

        System.out.println("Normal execution starts from here");
    }
}
