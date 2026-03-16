package com.tnsif.CoreJavaPrograms.Collections;

import java.util.Collections;
import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);

        System.out.println(v);
        v.insertElementAt(67,4);
        System.out.println(v);
        v.removeElementAt(2);
        System.out.println(v);

        Collections.reverse(v);
        System.out.println(v);
        System.out.println(v.indexOf(30));
    }
}
