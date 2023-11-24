package com.java;

public class StringDemo {

    //String: set of characters--> "roshan" --> 'r' 'o' 's' 'h' 'a' 'n' : group of characters --> Immutable: once created, it cant be changed;
    // 'r'   "r"
    // String :-> Final
    public static void main(String[] args) {
        String s1 = "roshasnss";

        String s2 = new String("roshan");

        char[] ch = {'r','o','s','h','a','n'};
        String s3 = new String(ch);

        String s4 = String.valueOf("1234");
        System.out.println(s4);

        String s5 = new String("1234");

        // utility function
        System.out.println(s1.length()); // length of string
        System.out.println( s1 + s2); // concatenation
        System.out.println("My name is " + "Roshan " + "kumar " + "jha");

        System.out.println(40 + 20 + s1 + true);

     //   System.out.println(true + 40 + 20 + s1);
        System.out.println("test" + 40 + 20 + s1 + 'R' +  true + 10 + 20);

        char c = s1.charAt(2);
        System.out.println(c);

        System.out.println(s1.indexOf('s'));

        System.out.println(s1.lastIndexOf('s'));

        System.out.println(s1.startsWith("has"));
        System.out.println(s1.contains("has"));
        System.out.println(s1.endsWith("nss"));

    }
}
