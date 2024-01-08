package com.xworkz.Exception;

import java.awt.print.PrinterException;

public class LaptopException extends Exception {
    public LaptopException() throws LaptopException {
        System.out.println("constructor");
        throw new RuntimeException();
    }

    public static void main(String[] args) throws LaptopException {
         new LaptopException();

    }
}
