package com.Xworkz.java.practice.Arrays;

public class ArrayPalindromeOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};

        int first=0;
        int last=arr.length-1;
        boolean flag=true;
        while (first<last){
            if(arr[first]==arr[last]){
                first++;
                last--;
            }
            else {
                flag=false;
                break;
            }
        }
         if(flag==true){
             System.out.println("Palindrome");
         }
         else{
             System.out.println("Not Palindrome");
         }
        }
    }



