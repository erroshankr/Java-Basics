package com.java;

import java.util.Arrays;

public class ListDemo {

    // Array: size defined, homogenous
    // List : size not defined, dynamically adjustable, homogenous : internally uses array;
    // add(data), remove(data), isEmpty(), size(), contains(data)
        int capacity = 5;
        int[] arr; // 2,2,4,5,6,7,8,9,9,2,0,0,0,0,0,0,0,0,0,0

        public ListDemo() {
            arr = new int[capacity];
        }

        public int size(){
            int len = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0){
                    return len;
                }else{
                    len++;
                }
            }
            return len;
        }

        public void add(int x){
            if(this.contains(x)){
                System.out.println("data already present");
                return;
            }
            growIfReqd();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0){
                    arr[i]= x;
                    break;
                }
            }
        }

    private void growIfReqd() {
        int remainingSpace = this.capacity - this.size();
        if(remainingSpace <= 0){
            int[] newArr = new int[2*capacity];
            newArr = Arrays.copyOf(arr,newArr.length);
            this.arr = newArr;
        }
    }

    public boolean isEmpty(){
            if(this.size() == 0){
                return true;
            }
            return false;
        }

        public int get(int index) {

            if(isEmpty()){
                System.out.println("list is empty");
            }
            if(index >= this.size()){
                System.out.println("Index doesn't exist");

            }
            return  this.arr[index];
        }

        public boolean contains(int data){
            for (int i = 0; i < this.size(); i++) {
                if(this.arr[i]==data){
                    return true;
                }
            }
            return false;
        }

        public void remove(int data) {  // 2,3,4,5,6 --> 2,3,5,6,0
            int[] ar = this.arr;
            for (int i = 0; i < this.size(); i++) {
                if(ar[i]==data){
                    for (int j = i; j < this.size()-1; j++) {
                        ar[j]=ar[j+1];
                    }
                    ar[this.size()-1]=0;
                    this.arr = ar;
                    System.out.println("Data deleted");
                    break;
                }
            }
       }

       public void print(){
           for (int i =0; i < this.size() ; i++) {
               System.out.print(this.arr[i] + " ");
           }
           System.out.println();
       }

    public static void main(String[] args) {
        ListDemo li= new ListDemo();
        li.add(2);
        li.add(4);
        li.add(5);
        li.print();
        System.out.println(li.isEmpty());
        System.out.println(li.size());
        System.out.println(li.contains(8));
        li.remove(4);
        li.add(14);
        li.add(50);
        li.add(43);
        li.add(54);
        li.print();
        System.out.println(li.contains(50));
        System.out.println(li.get(2));
        li.add(50);
        li.print();
    }
}
