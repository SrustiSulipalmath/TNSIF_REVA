package com.tnsif.exceptionhandling;

public class throwsexample {
    public static void main(String[] args) {
        divide(0,0);
    }

    static void divide(int a ,int b)throws ArithmeticException{
        int result = a/b;
        System.out.println(result);
    }
}
