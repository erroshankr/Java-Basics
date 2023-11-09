package com.java.wrapper_primitive;

public class WrapperDemo {






    // primitive data types: datatype in java: boolean(false), String, double(0), char(''), long(0.0), short, float, int
    public static void main(String[] args) {
        int[] arr = new int[5];
        String s = "747655r76566fhfdhgfgnfjfjjvnhfvn6!@#$(0-";
        String a = "5"; // primitive type
        Integer i =  Integer.valueOf(a); // wrapper class
        String result = String.valueOf(i.intValue());
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


        int m = 10;
        float f = m;
        float f1 = (int)5.234f;
        System.out.println(f1);
        int m1 = (int) f1;  // typecasting
        System.out.println(m1);
        double d1 = f1;
        System.out.println(d1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
