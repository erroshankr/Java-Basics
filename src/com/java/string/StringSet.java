package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSet {

    public static void main(String[] args) {
        minDelReqd("ABC","CAB");
    }

    public static long modified(String a){
        //aabb +'d'  +bcca : 8, 0-7  --> aabbdbcca ; aabbdbbdbbcca
        // 1st apporoach
        char[] arr = a.toCharArray();
        long res = 0;
        int count = 1;
        for (int i =0; i < arr.length-1;i++) {
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                count = 1;
            }
            if (count == 3){
                res++;
                count = 1;
            }
        }
        return res;
     }

     public static String printString(String input, char ch, int count){

     int index = -1; // 13
     int noOfAppr = 0; //3
      char[] arr =   input.toCharArray();
         for (int i = 0; i < arr.length; i++) {  // S = "Thisisdemostring", ch = 'i', count = 3 Output: ng
             if(arr[i]==ch){
                 noOfAppr++;
                 index = i;
             }

             if (noOfAppr == count){
                 break;
             }
         }
         if (index != -1) {
             return input.substring(index + 1);
         }else{
             return "";
         }

     }

     public static int sameChar(String a, String b){

        if((a == null || b== null) || (a.length()!= b.length())){
            return 0;
        }
        int res = 0;
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
         for (int i = 0; i < a.length(); i++) {
             if(String.valueOf(cha[i]).equalsIgnoreCase(String.valueOf(chb[i]))){  // str1 == str2, str1.equals(str2), str1.equalsIgnoreCase(str2) ; apple, aPple
                 res++;
             }
         }
          return res;
     }

    public static boolean nonRepetitive(String s) {

        // convert string into array
        // check 1st & 3rs elements are equal or not
        // if they are equal and is not equal to 2nd element --> true else false


        char[] arr = s.toCharArray(); // ABA
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void printMinMax(String input){
        // split string based on space
        // iterate over the returned array and track length in 2 variables, min & max having index respectively. Input : "This is a test string"
        String[] arr = input.split(" ");
        String  maxLenStr="";
        String minLenStr="";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > maxLenStr.length()){
                maxLenStr = arr[i]; // this
            }
            if(arr[0].length() < minLenStr.length()){
                minLenStr = arr[i];
            }
        }
    }

    public static void minDelReqd(String a, String b){  // abca, cab : Map<Character,Integer>

         // list1.retainAll(list2)
        List<Character> ch1 = new ArrayList<>();
        List<Character> ch2 = new ArrayList<>();
        char[] chArr1 = a.toCharArray();
        char[] chArr2 = b.toCharArray();
        for (int i = 0; i < chArr1.length; i++) {
            ch1.add(chArr1[i]);
        }
        for (int i = 0; i < chArr2.length; i++) {
            ch2.add(chArr2[i]);
        }

        List<Character> li = new ArrayList<>();
        if(ch1.size() > ch2.size()){
            li= ch2;
        }else{
            li= ch1;
        }
        li.retainAll((ch1.size()>ch2.size() ? ch1 : ch2));
        for (char c:li) {
            System.out.println(c);
        }
        int commonLen = li.size();
        int len1 = a.length();
        int len2 = b.length();

        int minDeletion = (len1-commonLen) + (len2- commonLen); // ABCA, CDE --> commonLen = 1
        System.out.println(minDeletion);


    }

    // 56587jhgfjhvmvm678o7: Character.isDigit()  // Math.min


}
