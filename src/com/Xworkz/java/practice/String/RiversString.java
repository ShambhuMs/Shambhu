package com.Xworkz.java.practice.String;

public class RiversString {
    public static void main(String[] args) {
        String s="HELLO";
        String newString="";
        for (int i =s.length()-1 ; i >=0 ; i--) {
            newString=newString+s.charAt(i);
        }
        System.out.println(newString);

    }
}
