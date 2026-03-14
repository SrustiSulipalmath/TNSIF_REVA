package com.tnsif.CoreJavaPrograms.Polymorphism;


class Student{
    String name;
    int age;
    Student(){
        System.out.println("default constructor");
    }

    Student(String name){
        this.name=name;
        System.out.println(name);
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
public class constructoroverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Srusti");
        Student s3 = new Student("Srusti",12);
    }
}
