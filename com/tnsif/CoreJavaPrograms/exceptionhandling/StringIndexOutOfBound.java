package com.tnsif.exceptionhandling;

public class StringIndexOutOfBound {

    public static void main(String[] args) {
        String str ="REVA_TNS";
    try{
        char ch = str.charAt(10);
        System.out.println(ch);
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
