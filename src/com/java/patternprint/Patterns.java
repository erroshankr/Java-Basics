package com.java.patternprint;

//
public class Patterns {
    /*Q1. *****
          *****
          *****
          *****
     */
    /*Q2.
     ****
     *  *
     *  *
     ****
     */
    /*Q3.
****
 ****  // i==1, j==1
  ****
   ****
     */
    /*Q4.
*
**
***
****

     */
    /*Q5 (4,7) : col-row-i
   *
  ***
 *****
*******
     */
    public static void printFigure3(int row, int col) {
        for (int i = 0; i < row; i++) {
            int count = 1;
            for (int j = 0; j < col; j++) {
                if(j >=i && count <=4) {
                    System.out.print("*");
                    count++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
      //  printFigure3(3,6);
        printFigure5(4,7);
    }

    public static void printFigure4(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*Q5 (4,7) : col-row-i = 2
   *
  ***
 *****
*******
     */
    public static void printFigure5(int row, int col) {
        for (int i = 0; i < row; i++) {
            int index = col-row-i; // 2
            for (int j = 0; j < col; j++) {
                if(j < index){
                    System.out.print(" ");
                }else if(j < col-index){
                    System.out.print("*"); //x=column - index
                }
            }
            System.out.println();
        }
    }

}
