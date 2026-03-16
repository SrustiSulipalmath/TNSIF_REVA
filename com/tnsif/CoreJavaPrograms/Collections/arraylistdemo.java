package com.tnsif.CoreJavaPrograms.Collections;

import java.util.ArrayList;

public class arraylistdemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Dragon fruit");
        al.add("Mango"); 

        System.out.println(al);
        System.out.println(al.get(2));

        al.set(1,"banana");
        System.out.println(al);

        if(al.contains("Apple")){
            System.out.println("apple is present");
        }
        System.out.println(al);

        for(String fruits:al){
            System.out.println(fruits);
        }


    }
}
