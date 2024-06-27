package com.Xworkz.serialization;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        //serialization........
        try {
            Fan fan=new Fan(1000,"Haveals");
            FileOutputStream fileOutputStream=new FileOutputStream("Object.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(fan);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println("Object has been serialized...........");
        }catch (Exception e) {
            System.out.println(e);
        }


    }
}
