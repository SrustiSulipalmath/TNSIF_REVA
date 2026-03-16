package com.tnsif.CoreJavaPrograms.Collections;

import java.util.Stack;

public class stackdemo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("A");
        s.push("A");
        s.push("A");
        s.push("A");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.search(:"8"));

        while(!s.empty()){
            System.out.println(s.pop());
        }
        System.out.println("stack after removing all"+s);


        
    }
}
