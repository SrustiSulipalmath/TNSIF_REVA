package com.tnsif.CoreJavaPrograms.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name =name;
        this.age = age;
    }

    void displayinfo(){
        System.out.println(name+" "+age);
    }


}

class Namecomparator implements Comparator<Person>{
    @Override
    public int compare(Person o1,Person o2){
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1 ,Person o2){
        return Integer.compare(o1.age,o2.age);
    }
}

public class comparatordemo {
    public static void main(String[] args) {
        List<Person> p = new ArrayList<>();
        p.add(new Person("John",30));
        p.add(new Person("Anil",20));
        p.add(new Person("Bhasker",10));
        p.add(new Person("Naresh",90));

        Collections.sort(p,new Namecomparator());
        System.out.println("Sorted by name");
        for(Person f :p){
            f.displayinfo();
        }

        Collections.sort(p, new AgeComparator());
        System.out.println("sorted by age");
        for(Person f:p){
            f.displayinfo();
        }
    }
}
