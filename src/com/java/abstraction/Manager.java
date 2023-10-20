package com.java.abstraction;

public abstract class Manager extends Employee{

    @Override
    void displayData() {
        System.out.println("I'm a manager");
    }

    @Override
    void displayEmpID() {
        System.out.println("Manager's EmpID is 1001");
    }

    abstract void fetchMyCompany();
}
