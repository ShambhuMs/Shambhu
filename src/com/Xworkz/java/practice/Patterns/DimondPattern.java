package com.Xworkz.java.practice.Patterns;

public class DimondPattern {
    public static void main(String[] args) {
        int m=4;
        for (int i = 1; i <=m ; i++) {
            for (int j = i; j<m ; j++) {
                System.out.print(" ");
            }

            for (int j =1; j<=i ; j++) {
                System.out.print("1");
            }

            for (int j =1; j<i ; j++) {
                System.out.print("1");
            }
         System.out.println();

        }
        for (int i = 1; i<=m ; i++) {
            for (int j = 1; j<i ; j++) {
                System.out.print(" ");
            }

            for (int j =i; j<=m ; j++) {
                System.out.print("1");
            }

            for (int j =i; j<m ; j++) {
                System.out.print("1");
            }
            System.out.println();

        }



    }
}
