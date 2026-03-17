package com.tnsif.CoreJavaPrograms.accessmodifierprograms;
public class Publicdemo{
    int a = 9;
    private String f = "Rahul";
    protected int d = 9;

    public void display(){
        System.out.println("Welcome to java");
    }

    public static void main(String[] args){
        Publicdemo b = new Publicdemo();

        System.out.println(b.a);
        System.out.println(b.d);
        System.out.println(b.f);

    }
}