package com.java;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {  // List, Set,Map, array
        //key value data structure
        Map<Integer, String> m1 = new HashMap<>(); // Hashing function + linked-list , key duplication not allowed but value duplication allowed
        //add data to map
        m1.put(21, "Atul");
        m1.put(31,"Anupam");
        m1.put(21,"Roshan");
        m1.put(22,"Roshan");

        System.out.println(m1.size());
        System.out.println(m1.containsKey(21));
        System.out.println(m1.containsValue("Atul"));
        m1.remove(21);
        System.out.println(m1.size());
      //  m1.clear();
      //  System.out.println(m1.size());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.get(31));

        Map<Integer,String> m2 = new HashMap<>();
        m2.putAll(m1);

        m2.putIfAbsent(30,"Sneha");
      //  System.out.println(m2.values());
        m2.putIfAbsent(30,"Rajesh");
        System.out.println(m2.values());

        // Ways of iteration through map
        // 1st way: using entry-set having key in getKey() and value in getValue() method respectively.
        for (Map.Entry<Integer,String> e: m2.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // 2nd way: using key-set and fetching values through respective using get(key) method.
        for (Integer x: m2.keySet()) {
            System.out.println(x + " " + m2.get(x));
        }

        // This is just to iterate through values, we can't get key from values uniqueness is not maintained in values.
        for (String s:m2.values()) {
            System.out.println(s);
        }

        // 3rd way : using lambda function
        m2.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

        Map<Integer, List<String>> m3 = new HashMap<>();
        Map<Integer,Map<String,List<Integer>>> m4 = new HashMap<>();

    }
}
