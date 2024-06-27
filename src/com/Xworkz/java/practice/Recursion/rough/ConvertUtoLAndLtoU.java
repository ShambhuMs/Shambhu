package com.Xworkz.java.practice.Recursion.rough;

public class ConvertUtoLAndLtoU {
    public static void main(String[] args) {
        String s="ShaMBhu";
        char[] news=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c>='A'&& c<='Z'){
                news[i]=(char) (news[i]-'A'+'a');
            }else {
                news[i]=(char) (news[i]-'a'+'A');
            }
        }
        System.out.println(news);
    }
}
