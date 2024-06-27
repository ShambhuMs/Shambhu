package com.Xworkz.java.practice.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,1,2,3,2,1,5,5,5};
        for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        a[j]=-1;
                    }
                }

        }
        for (int i = 0; i < a.length; i++) {
           if(a[i]!=-1) {
                System.out.println(a[i]);
           }
        }
    }
}
