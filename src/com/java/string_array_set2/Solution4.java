package com.java.string_array_set2;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    // 5*4 = 20
    // 6*4 = 24
    public String gcdOfStrings(String str1, String str2) {
        String result = "";
        int index = str1.indexOf(str2); // Roshankumar:6 , shan :4:, index = 2
        if(index == -1){
            return result;
        }

        result = result.substring(0,index) + result.substring(index+str2.length());
        return result;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) { // 100, 1
        int len = flowerbed.length;
        int count = 0;
        // [0,1,0,0,1], n = 1
       for(int i =0; i < len ; i++){
           if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1] ==0)){
             flowerbed[i]=1;
             count++;
           }

           if(count >= n){
               return true;
           }
       }
       return count >=n;
    }

    public static int compress(String[] chars) { // a:1, b:2 : ab2
        Map<String,Integer> m1 = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(!m1.containsKey(chars[i])){
                m1.put(chars[i],1);
            }else{
                int val = m1.get(chars[i]);
                m1.put(chars[i],val+1);
            }
        }
        String res = "";
        for (Map.Entry e: m1.entrySet()) {
            Integer val = (Integer) e.getValue();
            res = res + e.getKey() + ((val == 1) ? "" : val);
        }
        System.out.println(res);
        return res.length();
    }

    public static void main(String[] args) {
        String[] ar = {"a","b","b","b","b","b","b","b","b","b","b","b","b"};
        System.out.println(compress(ar));
    }


}
