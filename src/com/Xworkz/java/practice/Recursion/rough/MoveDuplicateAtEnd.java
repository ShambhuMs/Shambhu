package com.Xworkz.java.practice.Recursion.rough;

public class MoveDuplicateAtEnd {
    public static void main(String[] args) {
        String string="xxAsxixsx";
        String string1="";
        int count=0;
        for (int i = 0; i < string.length(); i++) {

            char c=string.charAt(i);
            if(c=='x'){
                count++;
            }
            else{
                string1=string1+c;
            }
        }
        for (int i = 0; i < count; i++) {
            string1=string1+'x';
        }

        System.out.println(string1);
    }
}
