package com.java.exception_demo;

// Exception: It's an event that , when occurred, disrupts the normal flow of execution.
// Exception Handling: Ability of a program to intercept run-time error & take corrective measures and then continue execution.
//      1. Intercept run-time error
//      2. take corrective measures
//      3. continue execution
// try, catch, finally, throws, throw
// marker interface: interface having no method defined in it
// If a class is defined as 'abstract' --> it may or may not have 'abstract' methods, but if a class has even one abstract method, then class has to marked as
// 'abstract' class.
// 2 types: Checked & Unchecked
// Checked Exception: which compiler forces a programmer to handle
// Unchecked Exception: which occurs/ may occur during runtime.
public class TestException {

    // 0/2 -> 0
    // 2/0 -> Infinite/Undefined
    // 0/0 -> Indeterminate
    // infinity/infinity : Indeterminate
    // infinity ^ infinity : Indeterminate

    public static void main(String[] args) {

            int x = 15;
            int y = 0;
        try {  // vulnerable code
            int res = x / y;
            System.out.println(res);
        }catch (Exception e){
            System.out.println("Exception occurred, invalid input"); // corrective measures
        }

        System.out.println("Out of vulnerable code"); // continue execution
    }
}
