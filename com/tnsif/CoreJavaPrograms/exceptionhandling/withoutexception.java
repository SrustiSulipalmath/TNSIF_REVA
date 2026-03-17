package com.tnsif.CoreJavaPrograms.exceptionhandling;

public class withoutexception {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //int c= a/0;

        try{
            int c = a/0;
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Welcome to java");
    }
}
