package com.tnsif.CoreJavaPrograms.lambdaexpressions;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class spcdemo {
    //supplier:no input,return value
    public static void main(String[] args) {
        Supplier<String> s = () -> "hello from supplier";
        String suppliervalue = s.get();
        System.out.println(suppliervalue);

        //predicate : takes one iput,returns a boolean value

        Predicate<Integer> iseven = number ->number%2==0;
        int testnumber = 10;
        if(iseven.test(testnumber)){
            System.out.println(testnumber +"is even");
        }else{
            System.out.println(testnumber+"is odd");
        }

        //consumer : Takes one input and returns nothing

        Consumer<String> c = message ->System.out.println("consumer recieved "+message);
        c.accept("this is a test message");
        System.out.println(c);
    }
    
}
