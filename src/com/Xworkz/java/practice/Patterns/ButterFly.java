package com.Xworkz.java.practice.Patterns;

public class ButterFly {
    public static void main(String[] args) {
      int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            int space = 2*(n-i);
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }

            for (int j =1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            int space = (n * 2) - i;
            for (int j = i+1; j <=space ; j++) {
                System.out.print(" ");
            }

            for (int j =(n*2)-i; j <=(n*2)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
