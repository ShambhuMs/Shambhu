package com.Xworkz.serialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Runner1 {
    public static void main(String[] args) {
        //deserialization....................
        try{
            FileInputStream fileInputStream=new FileInputStream("Object.ser");
            ObjectInput objectInput=new ObjectInputStream(fileInputStream);
            System.out.println(objectInput.readObject());
            fileInputStream.close();
            objectInput.close();
            System.out.println("Object has been deserilazed.........");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
