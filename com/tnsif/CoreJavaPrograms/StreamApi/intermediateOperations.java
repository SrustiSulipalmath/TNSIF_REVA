package com.tnsif.CoreJavaPrograms.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> d = numbers.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(d);

        //distinct

        List<Integer> e = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(e);

        //sorted

        List<Integer> s = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(e);

        //limit - take only first 5 elements

        List<Integer> l =  numbers.stream().limit(5).collect(Collectors.toList());
        System.out.println(l);

        //skip

        List<Integer> sk = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(sk); 
    }
}
