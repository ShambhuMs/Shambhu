package com.xworkz.Revision;

public class Shambhu {

    void shambhuString(String nam){
        MethodInvokation.firstMeth(nam);
    }
    void shambhuIntMeth(int no){
        MethodInvokation.secMeth(no);
    }
    void shambhuLong(long sal){
        MethodInvokation methodInvokation=new MethodInvokation();
        methodInvokation.thirdMeth(sal);
    }

}
class Nitin{
    public static void main(String[] args) {
        Shambhu s=new Shambhu();
        s.shambhuIntMeth(10);
        s.shambhuString("Asis");
        s.shambhuLong(10000);
    }
}
