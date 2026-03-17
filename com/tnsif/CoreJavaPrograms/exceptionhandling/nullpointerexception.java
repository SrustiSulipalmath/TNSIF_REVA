package com.tnsif.CoreJavaPrograms.exceptionhandling;

public class nullpointerexception {
    public static void main(String[] args) {
        String str = null;
        //System.out.println(str.length());
        try{
            System.out.println(str.length());
        }catch(NullPointerException n){
            System.out.println("hello exception");
        }catch(Exception e){
            System.out.println("hello java");
        }
        System.out.println("helloworld");
    }
}
