package com.java;

import java.util.Scanner;

public class InputDemo {
    /*4
      2
      ab
      3
      bcd
      2
      at
      4
      qwer
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
            int len = sc.nextInt();
            sc.nextLine();
            String input = sc.nextLine();
            display(input);
        }

    }

    public static void display(String input){
        System.out.println("Given input is: " + input);
    }
}
