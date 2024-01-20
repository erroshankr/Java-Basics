package com.java.string_array_questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArraySet2 {

    //Q1. "hello" : [1,4] --> [4,1]
     //    holle
    // anupam : [0,2,4] -> [4,2,0]
    // anupam
    // sneha [2,4] -> [4,2]--> snahe
    // tushar [1,4] -> [4,1] -> tashur
    // vaibhav [1,2,5] -> [5,2,1] -> vaibhav
    // shekhar [2,5] -> [5,2] -> shakher
    // logic --> Algorithm --> code
    /*
      1. create a list and store index of vowels in it: 2,5 --> l1
      2. reverse the list -> l2 ; 5,2
      3. l1:0, l2=4
     */

    public static void reverseVowels(String input){  // find vowels in a string + change vowel position
        List<Integer> l1 = new ArrayList<>();
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        char[] arr = input.toCharArray(); // s  n e h a
        for (int i = 0; i < arr.length; i++) {
            if(vowels.contains(arr[i])){
                l1.add(i);
            }
        }
        List<Integer> l2 = l1.reversed();
        int size = l1.size();
        StringBuilder sb = new StringBuilder(input);
        String res="";
        for (int i = 0; i < size; i++) {
            int index = l1.get(i);//4
            int targetIndex = l2.get(i);//2
            sb.replace(index,index+1,String.valueOf(input.charAt(targetIndex)));
        //     res = input.substring(0,index) + input.charAt(targetIndex) + input.substring(index+1);// sneh + e + ""
            input=res;
        }
        System.out.println(res);

    }

    public static void reverseWords(String s){
       String[] arr = s.split(" ");
       List<String> li = Arrays.asList(arr);
        System.out.println(li.reversed());
    }



    public static void main(String[] args) {
        //reverseVowels("sneha");//hnesa
        reverseWords("this is my lapy");
    }
}
