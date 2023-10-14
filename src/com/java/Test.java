package com.java;

//Abstraction: exposing only the interface
//Encapsulation : Data Hiding --> Hiding the implementation level details
 class Demo {

     // JDK = JVM + JRE + JIT(Just-in-time compiler)
    // JVM is installed on hardware
    String name;
  //  int num = "roshan";

    // number of .class files will be equal to number of class tags used in .java file.
    class EmcapDemo {    // .class file will be of same name which is used after 'class' tag
    }
   /* public static void main(String[] args) {
        System.out.println("Am i running ?");
    }*/
    class AnotherClass {

        class InnerClass {

        }

    }
}

//Demo.class, Demo$EncapDemo.class, Demo$AnotherClass.class, Demo$AnotherClass$InnerClass.class

// 1. Compilation --> .class --> Execution(Main)
//  Test.java --> Test.class ( 1.8)
//  1.20 : Test.class : ---> Platform Independent
// Backward compatibility
// data type: String, int, float, double, char, long,short,boolean
