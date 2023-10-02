import com.java.inheritance.Alto;
import com.java.inheritance.Car;
import com.java.inheritance.Vehicle;

public class Main {
     //OOP: --> Abstraction, Encapsulation, Polymorphism, Inheritance
    // Abstraction  : simplifying complex systems by hiding the un-necessary details.
    // Encapsulation : Data hiding
    // object : remote control of a class

//Inheritance: Java doesn't support multiple inheritance, but supports multi-level inheritance
// Interface :


    //Entry point
    public static void main(String[] args) {

       //create an object
        // 1.using 'new' keyword without parameter
        // 2. using constructors

       /* Car c1 = new Car();
        c1.printDetails();*/

       /* Alto a1 = new Alto();
        a1.printDetails();*/

     //   Alto a2 = new Car();

       /* Vehicle c2 = new Car(); // Runtime polymorphism
        Vehicle c3 = new Alto();
        c2.printDetails();
*/
        // 2. using constructors

        //Constructor : a way of object initialization
      /*  Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Truck");
        Vehicle v3 = new Vehicle("Truck","Black");
        Vehicle v4 = new Vehicle("Truck", "red");
        Vehicle v5 = new Vehicle("Tractor","Green",12345);*/
       // Vehicle v6 = new Vehicle("Tractor","Green",12345, null);
     //   Alto a1 = new Alto();

     //   Vehicle v1 = new Car("BMW", "Black");
     /*   Vehicle v2 = new Vehicle("BMW", "Black", 232323);
        Car c1 = new Car();
        c1.printDetails();*/

        /*Vehicle v1 = new Vehicle();
        v1.findSpeed("truck", 10);*/

      /*  Alto a1 = new Alto();
        a1.findSpeed("Alto-k10", 5);
        a1.findSpeed(10,"alto-vx");*/

        // instanceOf  : to check if an object is instance of a particular class
/*

        Alto a1 = new Alto();
        Car c1 = new Alto();
        Vehicle v1 = new Alto();
        Vehicle v2 = new Car();
*/

        // Alto extends CAR
        // Car extends Vehicle
        // Alto extends Vehicle also
    //    boolean res = v1 instanceof Car;
    //    boolean res = v2 instanceof Car;
   /*     boolean res = v2 instanceof Alto;
        System.out.println(res);*/

       /* Object[] arr = {a1,c1,v1,v2};
        for (Object obj: arr) {
            if (obj instanceof Alto){
                System.out.println(true);
            }else{
                System.out.println("not an instance");
            }
        }*/

      /* Vehicle v1 = new Vehicle();
       v1.totalDistanceCovered(5);*/

 //     Vehicle v1 = new Car(); // variables/methods invoked with the reference must be accessible from the reference Class
//    v1.totalDistanceCovered(5); // Invalid operation-> Vehicle doesnt contain totalDistanceCovered() method
/*
      Car c1 = new Alto();
      c1.totalDistanceCovered(10); // Valid bcoz Car contains totalDistanceCovered() method.

       Vehicle v2 = new Alto();
    //   v2.totalDistanceCovered();  // Invalid becoz reference class vehicle doesnt contain totalDistanceCovered() method.

       Alto a1 = new Alto();
       a1.totalDistanceCovered(15); // Valid bcoz although totalDistanceCovered method is not directly present in Alto class but present in its parent
                                           // class and hence is accessible for Alto class
 */

      Car c1   = new Alto();  // Car is superclass of Alto, Vehicle si superclass of Car.
      c1.printDetails();  // calls printDetails method of Alto class : Run time Polymorphism --> bcoz actual method call is decided during runtime.

      Vehicle v1 = new Car();
      Vehicle v2 = new Alto();

      v2.printDetails(); // Runtime Polymorphism.--> calls printDetails method of alto class.
      v1.printDetails(); // Runtime Polymorphism.--> calls printDetails method of car class.
    }

}