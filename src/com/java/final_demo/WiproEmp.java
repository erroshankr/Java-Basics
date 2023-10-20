package com.java.final_demo;

public class WiproEmp {

    String name;
    static int empID ;
    static final int salary = 10000;

    WiproEmp(String name, int empID){
        this.name= name;
        this.empID= empID;
      //  this.salary = 10000;  --> final variables can not be reassigned again even with same value.
    }

    void displayDetails(){
        System.out.println("Name: " + this.name + " , empID: " + empID + " , salary: " + this.salary);
    }

    public static void main(String[] args) {
        WiproEmp e1 = new WiproEmp("Rakesh",123);
        e1.displayDetails();
        WiproEmp e2 = new WiproEmp("Rekha",234);
        e2.displayDetails();

        e1.displayDetails();

    }
}
