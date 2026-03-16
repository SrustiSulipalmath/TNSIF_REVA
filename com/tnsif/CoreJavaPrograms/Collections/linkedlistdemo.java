package com.tnsif.CoreJavaPrograms.Collections;

import java.util.LinkedList;
import java.util.List;

public class linkedlistdemo {
    public static void main(String[] args) {
        List<Integer> number = new LinkedList<>();
        number.add(34);
        number.add(34);
        number.add(5);
        number.add(9);

        System.out.println(number);
        number.set(4,2);
        System.out.println(number);
        number.remove(2);
        System.out.println(number);
        System.out.println(number.size());
        number.clear();
        System.out.println(number.contains(10));
    }
}
