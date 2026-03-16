package com.tnsif.CoreJavaPrograms.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> //generics pass userdefined data type
{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void displayinfo(){
        System.out.println(name+age);
    }

    @Override
    public int compareTo(Person o){
        return this.name.compareTo(o.name);
    }
}

public class comparabledemo {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("John",30));
        p.add(new Person("Anil",20));
        p.add(new Person("Bhasker",10));
        p.add(new Person("Naresh",90));

        Collections.sort(p);
        for(Person p1:p){
            p1.displayinfo();
        }
    }
}
