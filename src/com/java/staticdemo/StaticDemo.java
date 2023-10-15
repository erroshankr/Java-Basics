package com.java.staticdemo;

public class StaticDemo { // outer class can not be declared as 'static' but inner class can be static.

    static int salary = 100000;// copyByReference --> only one copy is created for static variable
    //Enhanced Encapsulation
    public static class StaticDemoJunior{
        public void displayName(){
            System.out.println("Inside inner class StaticDemoJunior");
        }
         public static class StaticDemoJuniorAgain {
             public void displayName() {
                 System.out.println("Inside inner class StaticDemoJuniorAgain");
             }
         }

    }

    public static void main(String[] args) {  // main method is invoked by JVM using main class name

        //public: can be accessed from anywhere
        //static : so that we don't need object to call
        //void : returns nothing
        //args: String array


        //1. By creating obj
   /*     StaticVariable_method s1 = new StaticVariable_method();
        s1.displayName();
        s1.displayBranch();*/

        // We dont need object to call a static method of another class, we can call by classname using syntax
        // classname.methodname
   //     String res = StaticVariable_method.displayAnotherDetail();
  //      System.out.println(res);

    //   StaticDemo.StaticDemoJunior.StaticDemoJuniorAgain s1 = new StaticDemo.StaticDemoJunior.StaticDemoJuniorAgain();
    //   s1.displayName();
    //    System.out.println(s1.salary);
    //    StaticDemo.StaticDemoJunior s2 = new StaticDemo.StaticDemoJunior();
    //    s2.displayName();

        StaticDemo s1 = new StaticDemo();
    //    System.out.println(s1.salary);
        StaticDemo s2 = new StaticDemo();
        s2.salary = 1000;
        System.out.println(s1.salary); // 10000
        System.out.println(s2.salary); // 1000

    }
}
