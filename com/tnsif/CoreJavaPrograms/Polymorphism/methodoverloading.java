package com.tnsif.CoreJavaPrograms.Polymorphism;

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    
    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

}

public class methodoverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(7.5,7.8));
        System.out.println(c.add(5,8));
        System.out.println(c.add(3,6,9));
    }
}
