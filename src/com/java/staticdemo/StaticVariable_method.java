package com.java.staticdemo;

public class StaticVariable_method {

    //Static : Vegetarian
    //Non-Static : Non-vegetarian

    String name = "Rakesh";
    static String branch = "ECE";

    public void displayBranch(){
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        displayName();
        displayAnotherDetail();
    }

    public void displayName(){
        System.out.println("Name: " + name);
    }

    public static String displayAnotherDetail(){
        return "Inside displayAnotherDetail";
    }

    public static void main(String[] args) { // static method can access only static variables & can call only static method (without object)
       // System.out.println("name: " + name);
      //  displayDetail();
        displayAnotherDetail();
        System.out.println("branch: " + branch);
        StaticVariable_method s1 = new StaticVariable_method();
        s1.displayName();
        s1.displayAnotherDetail();
    }

}
