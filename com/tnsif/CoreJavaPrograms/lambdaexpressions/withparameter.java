package com.tnsif.CoreJavaPrograms.lambdaexpressions;

@FunctionalInterface
interface Cube{
    int calculate(int a);
}

public class withparameter {
    public static void main(String[] args) {
        Cube c =(a) ->{return (a*a*a);};
        System.out.println(c.calculate(2));
    }
}
