package com.tnsif.CoreJavaPrograms.exceptionhandling;

public class ArrayIdexOutOfBound {

    public static void main(String[] args) {
        int arr[] = new int[4];
        try{
            int i =arr[6];
            System.out.println(i);
        }catch(ArrayIndexOutOfBoundsException r){
            System.out.println(r);
        }
    }
}
