package com.Xworkz.java.practice.doubts;

public class FootwearRunner {
    public static void main(String[] args) {
//        Footwear footwear=new Footwear();
////        footwear.show(10);
//        footwear.info();
//        Animal animal=new Animal();
//        animal.run();
        Dog animal=new Dog();
//       animal.run();


        String re="1234567890";
        int count=0;
        char[] array= re.toCharArray();
        for (int i=0;i<array.length;i++) {
            if (array[i]>='0' && array[i]<='9') {
                count++;
            }
        }
        System.out.println(count);
    }
}
