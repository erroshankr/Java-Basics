package com.java.collection_api;

import java.util.*;

//List, Set & Map
public class CollectionDemo {

    public static void main(String[] args) {

        Integer[] b = new Integer[5]; // 5 memory allocation reserved with default value 'null'
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        int[] a = new int[5]; // 5 memory locations reserved with default value 0 -> It is initialized with no of elements that cant be changed

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < a.length; i++) {  // i=0,1,2,3,4
            a[i] = i*2;
            System.out.print(a[i] + " ");  // 0,2,4,6,8
          //  a[15] = 60;
        }
        //     System.out.println(a[3]);

        //    System.out.println(a[5]); // Unchecked Exception
        System.out.println();
        // 0 1 5 2 3 4

        System.out.println("********-------LIST------**********");

        // ArrayList
        List<Integer> l1 = new ArrayList<>();  // always stores object of some class, maintains the order of insertion
        for (int i = 0; i < a.length; i++) {
             l1.add(i*2); // 0,2,4,6,8
        }

        for (int i = 0; i < l1.size(); i++) {   // size -> returns no of elements in list
            System.out.print(l1.get(i) + " ");
        }

        // a = 0,2,4,6,8

        for (int i = 0; i < a.length; i++) {
            if(a[i]==5){
                System.out.println("Contain data");
                return;
            }
        }
        System.out.println("data not found");

        boolean res = l1.contains(4);  // to check presence of a data
        System.out.println(res);

        System.out.println(!l1.isEmpty());  // to check for empty list
        System.out.println(l1.get(3));  // fetch data from an index

        l1.add(10);  // adds an element in the end

        for (int i = 0; i < l1.size(); i++) {   // size -> returns no of elements in list
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        System.out.println("******************");
        List<String> l2 = new ArrayList<>();
        l2.add("Roshan");
       /* if (!l2.contains("Roshan")) {
            l2.add("Roshan");
        }*/
        l2.add("Roshan");
        System.out.println(l2.size());

        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i));
        }

        System.out.println("********-------SET------**********");
        Set<String> s1 = new HashSet<>(); // stores unique elements only --> duplication not allowed --> does not maintain order of insertion
        s1.add("Roshan"); // index 0
        s1.add("Rohit"); // index 1
        s1.add("Roshan"); // index 2

        System.out.println(s1.size());
        /*for (int i = 0; i < s1.size(); i++) {
            System.out.println(s1.get); // get(index) method doesn't work bcoz it doesn't maintain insertion order
        }*/

        System.out.println("********---------Map------**********"); // used to store key-value pair
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("Roshan",12323455); // to add key-val pair in map
        m1.put("Rakesh",757858587);
        System.out.println(m1.size());

        System.out.println(m1.get("Roshan"));

        for (Map.Entry e : m1.entrySet()){
            System.out.println("Key: "+ e.getKey() + " , value: "+ e.getValue() );
        }

        Map<String,List<Integer>> m2 = new HashMap<>();
        List<Integer> l3 = new ArrayList<>();
        l3.add(121212);
        l3.add(343434);
        l3.add(454544);

        m2.put("Rakesh",l3);  // to add key-value pair

        System.out.println(m2.size());  // to find size

        System.out.println(m2.containsKey("Rohit"));  // checks for a key

        // iterate over a map

    }
}
