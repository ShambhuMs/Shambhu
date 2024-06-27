package com.Xworkz.java.practice.Recursion.rough;

import lombok.ToString;

@ToString
public class CloningA implements Cloneable{
    int no;
    String name;

    public CloningA(int no,String name){
        this.no=no;
        this.name=name;
        System.out.println("No: "+no+","+"Name: "+name);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Runner{
    public static void main(String[] args) throws CloneNotSupportedException {
  CloningA cloningA=new CloningA(10,"shambhu");

  CloningA cloningA2=(CloningA) cloningA.clone();
        System.out.println(cloningA2);

    }
}