package com.Xworkz.java.practice.Patterns;

public class MiddleLine {
    public static void main(String[] args) {
        int m=5;
        for (int i = 1; i <=m ; i++) {
            if(m%2==0){
                for (int j = 1; j <=m ; j++) {
                    if (j==(m/2) || i==(m/2)){
                        System.out.print("*  ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }else{
                for (int j = 1; j <=m ; j++) {
                    if (j==(m/2)+1 || i==(m/2)+1){
                        System.out.print("*  ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
