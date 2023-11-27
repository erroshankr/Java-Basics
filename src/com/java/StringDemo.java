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


        System.out.println("**********************----------------******************");
        String x = "            TajMahal             ";
        try {
            try {
         //       System.out.println(x.charAt(8));
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Exception occurred");
            }

            char[] charAr = x.toCharArray();

            for (int i = 0; i < charAr.length; i++) {
                System.out.print(charAr[i] + ",");
            }

            System.out.println();
            System.out.println(charAr.length);
        //    System.out.println(charAr[8]);

            System.out.println(x.toLowerCase());
            System.out.println(x.toUpperCase());

            System.out.println(x.trim()); // it removes leading & lagging spaces from the given string

            System.out.println(x);

            String x1 = "Tajmahal";
            String y = "Victoria";
            String z = "VictoriA";
            System.out.println(z.equals(y));  // just checks the value
            System.out.println(z.equalsIgnoreCase(y)); // ignores uppercase/ lowercase

            System.out.println(y.compareTo(z) + "*******");
            System.out.println(x1.compareTo(y));
            System.out.println(y.compareTo(x1));

            System.out.println('A' == 65);
            System.out.println(Integer.toBinaryString(65));


        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception occured while fetching character from String");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred while fetching unknown index from array");
        }




    }
}
