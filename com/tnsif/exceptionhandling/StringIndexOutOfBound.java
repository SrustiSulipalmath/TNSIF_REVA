package com.tnsif.exceptionhandling;

public class StringIndexOutOfBound {
    String str ="REVA_TNS";
    try{
        char ch = str.charAt(10);
        System.out.println(ch);
    }catch(Exception e){
        System.out.println(e);
    }
    
}
