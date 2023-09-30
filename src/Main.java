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
        // 1.using 'new' keyword
        // 2. using constructors

       /* Car c1 = new Car();
        c1.printDetails();*/

       /* Alto a1 = new Alto();
        a1.printDetails();*/

     //   Alto a2 = new Car();

        Vehicle c2 = new Car(); // Runtime polymorphism
        Vehicle c3 = new Alto();
        c2.printDetails();

        // 2. using constructors

        //Constructor : a way of object initialization

    }

}