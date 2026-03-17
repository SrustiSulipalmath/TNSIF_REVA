package com.tnsif.CoreJavaPrograms.exceptionhandling;

public class finallydemo {
    public static void main(String[] args) {
        //without exception
        
        try{
            System.out.println("hello java");
        }catch(Exception e){
            System.out.println("hi");
        }finally{
            System.out.println("hello java");
        }

        //with exception
        
        try{

            int a = 10/0;
            System.out.println("hello java");
        }catch(Exception e){
            System.out.println("hi");
        }finally{
            System.out.println("hello java");
        }

        //withput catch
        try{
            int a=9/0;

        }finally{
             System.out.println("hello world");
        }
    }
}
