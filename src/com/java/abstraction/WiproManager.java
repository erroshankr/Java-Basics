package com.java.abstraction;

public class WiproManager extends Manager{
  /*  @Override
    void displayData() {

    }*/

  /*  @Override
    void displayEmpID() {

    }*/
  void displayData(String x) {
      System.out.println("I'm a manager");
  }

    @Override
    void displayData() {
        System.out.println("I'm a manager");
    }

    @Override
    void fetchMyCompany() {
        System.out.println("I'm Wipro's manager");
    }

    public static void main(String[] args) {
        Employee e1 = new WiproManager();
        e1.displayData();
        e1.displayDetails();

    }
}
