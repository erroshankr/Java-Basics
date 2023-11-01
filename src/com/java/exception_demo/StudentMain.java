package com.java.exception_demo;

public class StudentMain {
    public static void main(String[] args) {
        EceStudent e2 = new EceStudent();
        e2.setStudentID(234);
       // e2.setName("Rekha");
        try {
            e2.displayDetails();
        }catch (NullPointerException e){
            System.out.println("");
        }
    }
}

