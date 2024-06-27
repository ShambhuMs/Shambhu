package com.Xworkz.java.practice.String;

import java.util.Arrays;

public class RiversWords {
    public static void main(String[] args) {
        String s="MY NAME IS SHAMBHU";
        String[] words=s.split(" ");

        String result="";
        for (String word:words  ) {
            char[] chars=word.toCharArray();
            int start=0;
            int end=chars.length-1;
            while (start<end){
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
            }
            String reversed1= new String(chars);
            result=result+reversed1+" ";
        }

        System.out.println(result);
    }


}
