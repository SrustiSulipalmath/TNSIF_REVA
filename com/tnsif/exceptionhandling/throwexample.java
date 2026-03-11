package com.tnsif.exceptionhandling;

public class throwexample {
    public static void main(String[] args) {
        int age = 15;
        if(age<18){
            throw new ArithmeticException("you are not eligible to vote");
        }else{
            System.out.println("you are eligible to vote");
        }
    }
}
