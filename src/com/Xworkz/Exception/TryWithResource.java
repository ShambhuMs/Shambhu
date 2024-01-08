package com.Xworkz.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new File("g.txt"))){
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
