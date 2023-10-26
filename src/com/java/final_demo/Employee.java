package com.java.final_demo;

//behaviour of class: method
// extend: to change the behaviour of class.
public final class Employee {

    // final keyword is used to create constant value.
    // final variables can not be edited after 1st initialization.
    // We can not create/write setter method or any kind of method to alter its value.
    // Even through inheritance, final variables cant be modified.
    // final can be used with : variables, method, class, parameter, object
    // final methods can never be overridden.
    // final classes can never be extended.(can not create its sub-class)

    public final String companyName = "Wipro";

    public final void getCompanyName() {
        System.out.println("Inside Employee, companyName: " + companyName);
    }

    public void displayDetails(final int empID){ // final parameters of a method can not be changed.
     //   empID = 234;
        System.out.println("EmpID: " + empID);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(); // emp1
        e1.displayDetails(1234);

        final Employee e2 = new Employee();  //emp2
        e2.displayDetails(234);

     //   e2 = e1; // final reference can not hold different object, can not point to different object.
        e1 = e2;

    }

}
