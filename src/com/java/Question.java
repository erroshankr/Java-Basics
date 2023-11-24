package com.java;

// Ramesh is given a box of chocolates with their respective weights mentioned on them. He is celebrating his b'day.
// Few children in his bday atte,pt to eat the chocolate bit one person can eat only half of the total weight of chocolate at once. Find out minimum possible
// sum of weights of chocolates after nth child eats it.

// [30,20,25] -> [15,20,25] -> [15,10,25] -> [15,10,13] -> [15,5,13]: 33

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// n=1
//
public class Question {

    public static void main(String[] args) {
        List<Integer> weights = new ArrayList<>();
        weights.add(30);
        weights.add(20);
        weights.add(25);
        findMinSum(weights, 4);

        String test = "Roshan";
        char[] c1 = test.toCharArray();

    }

    public static int findMinSum(List<Integer> weight, int n){
        // 30,20,25
        //n=1--> 15,20,25=60, 30,10,25=65, 30,20,13=63  --> 15,20,25
        //n=2--> 8,20,25=53, 15,10,25=50, 15,20,13=48  : Res = 48
        for (int i = 1; i <= n; i++) { // n^2
            int maxVal = Collections.max(weight); // 30  O(n)
            int index = weight.indexOf(maxVal); // 0   O(n)
            weight.set(index,maxVal - maxVal/2);// O(1)
        }

        int sum = 0;
        for (Integer x:weight) {
            sum = sum + x;
        }

        return sum;
    }
    // reverse a name: ROSHAN -> NAHSOR
}

