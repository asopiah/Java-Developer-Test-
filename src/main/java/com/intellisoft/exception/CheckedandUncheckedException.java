package com.intellisoft.exception;

import java.io.IOException;

/*
* class to show checked and unchecked exception
* */

public class CheckedandUncheckedException {

    //unchecked exception example code
    public void uncheckedException() {
        String exceptionArr[] = { "Exception", "checked", "unchecked", "throws", "notfound" };
        try {
            String myString = exceptionArr[7]; // This throws ArrayIndexOutOfBoundException
            System.out.println(myString);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException appears here. Better handle it in code above :)" + e);
        }
    }

    //checked exception
    public void checkException (int number) throws IOException {
        try {
            if (number < 0) {
                throw new IOException("value cannot be negative");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
