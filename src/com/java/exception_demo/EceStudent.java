package com.java.exception_demo;

public class EceStudent extends Student{

    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("My name is Roshan");
//        System.out.println("Length of name: " + getName().length());
       /* System.out.println("mgjhgjhghmgjhg");
        System.out.println(2+3);
        System.out.println(true);
        System.out.println();*/
      /*  String res = "Rakesh";
        System.out.printf("%s", res);*/
    }

    // static
    // inheritance : incorrect

    public static void main(String[] args) {
        EceStudent e1 = new EceStudent();
        e1.setStudentID(123);
      //  e1.setName("Roshan");
        e1.displayDetails();
        System.out.println("Normal execution begins");
    }
}
