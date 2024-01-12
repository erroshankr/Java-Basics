package com.java.type_conversion;

public class TypeConversion {
    public static void main(String[] args) {
      /*  char ch = 'g';
        // toString()
        Character chr = Character.valueOf(ch);
        String res = chr.toString();
        System.out.println(res);

        String str1 = String.valueOf(ch);
        System.out.println(str1);

        System.out.println(res.toUpperCase());
        System.out.println(str1.toUpperCase());*/

        int m = 567890348;
/*        System.out.println((m/1000)%10);

        System.out.println(String.valueOf(m).charAt(4));
*/
        String input = String.valueOf(m); // "567890348" --> '5','6'

        //1st
        char[] chArr = input.toCharArray();
        String result = "";
        for (int i = input.length()-1; i >= 0; i--) {
            result = result + chArr[i];
        }
        System.out.println(result);

        //2nd
        String str = "";
        for (int i = input.length()-1; i >=0; i--) {
            str = str + input.charAt(i);
        }
        System.out.println(str);

        //3rd
     //   StringBuilder sb = new StringBuilder(input); // converts string to string-builder
     //   System.out.println(sb.reverse());

        System.out.println(new StringBuilder(String.valueOf(m)).reverse());

        StringBuilder sb = new StringBuilder(String.valueOf(m)).delete(2,4);  // 5690348 && 5690348
        String s1 = new String(sb);
        System.out.println(s1);
    }

    public int reverseInteger(int input){
        StringBuilder sb =  new StringBuilder(String.valueOf(input)).reverse();
        // stringBuilder --> string --> int
        String str2 = new String(sb); // // converts string-builder to string
        return Integer.parseInt(str2);
      //  return Integer.parseInt(new String(new StringBuilder(String.valueOf(input)).reverse()));

    }

    // String, String Builder & String Buffer : difference
}
