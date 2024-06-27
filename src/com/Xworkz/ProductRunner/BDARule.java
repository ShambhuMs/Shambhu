package com.Xworkz.ProductRunner;

public interface BDARule extends GovtRule {
    void isDeveloping();
   public abstract long population();

    static int shambhu(int no) {
        System.out.println("Running static method in interface: "+no);

        return 1;
    }
}
