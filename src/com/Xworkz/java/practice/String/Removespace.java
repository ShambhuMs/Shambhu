package com.Xworkz.java.practice.String;

public class Removespace {
    public static void main(String[] args) {
        String s="hello java world";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                System.out.print(s.charAt(i));
            }
        }
    }
}
