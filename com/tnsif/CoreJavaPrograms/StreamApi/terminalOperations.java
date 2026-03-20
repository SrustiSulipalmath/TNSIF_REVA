package com.tnsif.CoreJavaPrograms.StreamApi;

import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class terminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //foreach - print each number

        numbers.stream().forEach(n->System.out.println(n+" "));

        //toArray - convert stream to array

        Integer[] array = numbers.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

        //reduce - sum of all numbers

        int sum1 = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum1);

        //max()

        Optional<Integer> max1 = numbers.stream().max(Integer::compareTo);
        max1.ifPresent(value->System.out.println(value));

        //min()

        Optional<Integer> min1 = numbers.stream().min(Integer::compareTo);
        min1.ifPresent(value->System.out.println(value));
    }
}
//imp