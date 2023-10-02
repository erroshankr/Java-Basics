package com.java.inheritance;

//Inheritance : to inherit from something
//Parent class --> child class : behaviour of parent class will be reflected in child class if allowed.
// Class behaviour: Variables(optional) + Methods(optional)
// object : remote control of class


// 'class' + Caps(name)
// all sud be small case
 public class Car extends Vehicle{  //alto, bmw, mercedez

    String name ; // data type + name
    String color ;
    long engineID ;

   // return-type + method-name(arguments.....) : arguements can be zero or more
    @Override
    public void printDetails(){
        super.printDetails();  // super: it is used to refer immediate parent's method,constructors or member variables
        System.out.println("name:" + super.name + ", color:" + super.color + ", engineID:" + super.engineID);
        System.out.println("name:" + name + ", color:" + color + ", engineID:" + engineID);
        System.out.println("Inside printDetails of Car class");
    }

    @Override
    public void findSpeed(String name, int speed){  // Method Overriding : Method signature -> return type, name of method, no of parameters, parameters seq
        System.out.println("Inside findSpeed method of Car class");
        System.out.println("Speed of " + name + " is : " + speed);
    }


    public void findSpeed(int speed, String name){  // Method overloading -> return type , name
        System.out.println("Inside findSpeed method of Car class");
        System.out.println("Speed of " + name + " is : " + speed);
    }

    public void findSpeed(int speed, String name, long id){  // Method overloading -> return type , name
        System.out.println("Inside findSpeed method of Car class");
        System.out.println("Speed of " + name + " with engineID: " + engineID + "is : " + speed);
    }

    public Car() {
        super();
        System.out.println("Inside 0 arg constructor of Car");
    }

    public Car(String name) {
        super(name);
        this.name = name;
        System.out.println("Inside 1 arg constructor of Car");

    }

    public Car(String name, String color) {
        super(name,color);
        this.name = name;
        this.color = color;
        System.out.println("Inside 2 arg constructor of Car");

    }

    public Car(String name, String color, long engineID) {
        super(name,color,engineID);
        this.name = name;
        this.color = color;
        this.engineID = engineID;
        System.out.println("Inside 3 arg constructor of Car");
        super.printDetails();
        this.printDetails();
        printDetails();
    }

    public void totalDistanceCovered(int speed){
        System.out.println("Total distance travelled by Car is : " + speed);
    }
}
