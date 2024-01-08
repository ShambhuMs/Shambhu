package com.xworkz.Revision;

public interface Inter {
    void shambhu();
    public static void main(String[] args) {
        Inter i=new Inter() {
            @Override
            public void shambhu() {
                System.out.println("Hello Asis");
            }
        };
    }
}
