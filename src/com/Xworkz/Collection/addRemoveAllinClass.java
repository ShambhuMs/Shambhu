package com.Xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class addRemoveAllinClass {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(34);
        collection.add(37);
        collection.add(23);
        collection.add(90);
        collection.add(45);

        Collection<Integer> collection1=new ArrayList<>();
        collection1.add(100);
        collection1.add(105);
        collection1.add(600);
        collection1.add(45);
        collection1.add(23);


        System.out.println("addAll: "+collection.addAll(collection1));
        System.out.println(collection);
        System.out.println("=====================");
        System.out.println("removeAll: "+collection.removeAll(collection1)); // removes the matched elements in 2 ref-collection and shows only the 1st ref values which are unique.
        System.out.println("collection: "+collection);
        System.out.println("===================");

    }
}
