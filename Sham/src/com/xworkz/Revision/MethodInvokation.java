package com.xworkz.Revision;

public class MethodInvokation {
    int no;
    String name;
    long salary;

  static  String firstMeth(String name){
        System.out.println(name);
        return name;
    }
   static int secMeth(int no){
        System.out.println(no);
        return no;
    }

    long thirdMeth(long salary){
        System.out.println(salary);
        return salary;
    }


}
