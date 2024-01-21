package com.java.string_array_set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {

    public static String mergeAlternately(String word1, String word2) {
        // s1 = abcd , 4:  0,1,2,3
        // s2 = pqr, 3 : 0,1,
        // find length of 2 strings and store in l1,l2
        // iterate over a loop with max(l1,l2) and append in result if index < length



        int l1 = word1.length();
        int l2= word2.length();
        String result = "";
        for (int i = 0; i < 1000; i++) {
          //  result = result + word1.charAt(i) + word2.charAt(i);
            if(i < l1){
               result = result + word1.charAt(i);
            }
            if(i < l2){
                result = result + word2.charAt(i);
            }
        }
        return result;
    }

    public int[] swapIndex(int[] arr, int x, int y){ // 1,3,5,7 : x= 1,y= 3 -> 1,7,5,3
      if(x <0 || y < 0){
          return null;
      }
      /*int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
      return arr;*/
      Collections.swap(Arrays.asList(arr),x,y);
      return arr;

    }

    public static int[] rotateArray(int[] arr, int n) { // 1,3,5,7 : x= 1,y= 3 -> 1,7,5,3 : RR: 5,7,1,3
        int[] inp = arr;
        int len = arr.length;
        for (int i = 0; i < inp.length; i++) {
          /*  1st way
          int shiftedIndex = -1;
           if(len - (i + n) < 0){
            //   shiftedIndex = Math.abs(len - (i+n))-1;
           }*/
            /* 2nd way
               index = (i+n)%len;
             */
           /*//3rd way
            int remainingSpace = len -1 - i; //1
            int shiftedIndex = n-1 - remainingSpace;



        }
        return inp;*/
        }

        //4th way
        List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.rotate(li, n);
        return li.stream().mapToInt(m -> m.intValue()).toArray();
    }

    public boolean checkIfCommonElePresent(int[] a1,int[] a2){
       return Collections.disjoint(Arrays.asList(a1),Arrays.asList(a2)); // true -> if no common element: commonElements:-> retainAll
    }

    public static int findNoOfOccurance(int[] ar, int n){
        // find how many times n is present in the array
        List<Integer> li = Arrays.stream(ar).boxed().collect(Collectors.toList());
       return Collections.frequency(li,n);
    }

    public static void main(String[] args) {
       // System.out.println(mergeAlternately("vaibhav","anupam")); // vaaniubphaamv
        int[] arr = {2,3,4,5,5};
       /* int[] res = rotateArray(arr,-2);
        for (int re : res) {
            System.out.print(re+ ",");
        }*/
        System.out.println(findNoOfOccurance(arr,9));
    }

    // Collections.shuffle(li);
    // Collections.Max(li);
    // Collections.Min(li);

    //Q1.   input-> array, index1 & index2 --> return array with swapped value of given indices
    //Q2.   rotate given array by n units towards right : 1,3,5,7 -> 7135--> 5713
    //Q3. Find out if there exists any common element in 2 given arrays.
}
