package com.java.streamAPi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

   /* public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);

        int[] arr = new int[3];
        arr[0]=4;
        arr[1]=5;
        arr[2]=6;

        System.out.println(arr[1]);


      //  input.stream().filter(x -> x%2==0).forEach(System.out::print);

        int sum = input.stream().filter(z -> z%2==0).mapToInt(Integer::intValue).sum(); // Method Referencing
     //   System.out.println(sum);

        //2345 --? 2+3+4+5=14, 2*3*4*5=120
     //   String.valueOf(input).toCharArray()



      *//*  List<Integer> updatedList = modifyList(input);
        int sum = 0;
        for (Integer x: updatedList) {
            sum = sum + x;
        }
        System.out.println(sum);*//*
        splitStr("I love my india");  // "aidni ym evol I" --> I evol ym aidni  -> I evol my aidni

    }*/

   /* public static List<Integer> modifyList(List<Integer> input){
        List<Integer> res  = new ArrayList<>();
        for (Integer a: input) {
            if (a%2 == 0){
                res.add(a*2);
            }else{
                res.add(a*3);
            }
        }
        return res;
    }*/
    // split = returns a string array having defined sequence

    public static void splitStr(String a){ // I love my India -> J lpvf my Jndjb : char ch= 'A', ch++ --> B
        List<Character> vowelsList = new ArrayList<>();
        vowelsList.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String res = "";
        for (char ch: a.toCharArray()) {
            if (vowelsList.contains(ch)){
                ch++;
            }
            res = res + ch;
        }
        System.out.println(res.trim());
    }

    // IlovemyIndia -->i_love_my_india: str.replace(' ','')

}
