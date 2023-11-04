package com.java.collectionsapi;

public class DemoCollection {

    // primitive data types: datatype in java: boolean(false), String, double(0), char(''), long(0.0), short, float, int
    public static void main(String[] args) {
        int[] arr = new int[5];

        int a = 5; // primitive type
        Integer i =  Integer.valueOf(5); // wrapper class
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toHexString(15));
        boolean flag = false;
        Boolean b =  Boolean.valueOf("roshan");
        System.out.println(b.booleanValue());

       // int num = null;
        Integer num = null;
        Boolean res = null;
        Double d = null;

       // wrapper to primitive
        Integer n = Integer.valueOf(5);
        System.out.println(n.getClass());
        System.out.println(n.intValue()); // returns primitive type
        int p = n.intValue();

        // primitive to wrapper
        int x = 5;  // primitive types are values
        Integer y = Integer.valueOf(x);  // wrapper types are normal java class
        System.out.println(y.getClass());

    }
}
