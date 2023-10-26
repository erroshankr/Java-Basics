package com.java.exception_demo;

public class TestException {

    // 0/2 -> 0
    // 2/0 -> Infinite/Undefined
    // 0/0 -> Indeterminate
    // infinity/infinity : Indeterminate
    // infinity ^ infinity : Indeterminate

    public static void main(String[] args) {
        try {
            int x = 15;
            int y = 0;

            int res = x / y;
            System.out.println(res);
        }catch (Exception e){
            System.out.println("Exception occurred");
        }

        System.out.println("Out of vulnerable code");
    }
}
