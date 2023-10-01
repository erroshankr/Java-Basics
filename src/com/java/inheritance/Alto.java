package com.java.inheritance;

//
public class Alto extends Car{

    String name ; // data type + name
    String color ;
    long engineID ;

    @Override
    public void printDetails(){   // Method Overriding
       /* Car c1 = new Car();
        c1.printDetails();*/
        super.printDetails();  // super: it is used to refer immediate parent's method,constructors or member variables , object of immediate parent
        System.out.println("name:" + super.name + ", color:" + super.color + ", engineID:" + super.engineID);
        System.out.println("name:" + name + ", color:" + color + ", engineID:" + engineID);
        System.out.println("Inside printDetails of Alto class");
    }

    public Alto(){
        super();
        System.out.println("Inside 0 arg constructor of Alto");
    }
    public Alto(String name){
        super(name);
        System.out.println("Inside 1 argument constructor of Alto");
    }

    public Alto(String nm, String clr){
        super(nm,clr);
        System.out.println("Inside 2 arg constructor of Alto");
    }
    public Alto(String nm, String clr, long id){
        super(nm,clr,id);
        System.out.println("Inside 3 arg constructor of Alto");

    }
}
