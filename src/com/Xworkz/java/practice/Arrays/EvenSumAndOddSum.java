package com.Xworkz.java.practice.Arrays;

public class EvenSumAndOddSum {
    public static void main(String[] args) {
        int[] arr={3,2,7,5,8};
        int esum=0;
        int osum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                esum=esum+arr[i];
            }
            else{
                osum=osum+arr[i];
            }
        }

        System.out.println("even number sum: "+esum);
        System.out.println("Odd number sum: "+osum);
    }
}
