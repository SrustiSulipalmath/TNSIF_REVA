package com.tnsif.lambdaexpressions;

@FunctionalInterface
    interface Sayable{
        public String say();
    }

public class lambdademo {
    public static void main(String[] args) {
        Sayable s2 = ()->{return "I have nothing to say.";};
        System.out.println(s2.say());
    }
}
