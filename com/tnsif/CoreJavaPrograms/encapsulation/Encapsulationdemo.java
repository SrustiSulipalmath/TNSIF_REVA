package com.tnsif.CoreJavaPrograms.encapsulation;

public class Encapsulationdemo {
    int serialnumber;
    String name;
    int age;

    void show(){
        System.out.println(serialnumber + " "+name+" "+age);
    }

    public static void main(String[] args){
        Encapsulationdemo e = new Encapsulationdemo();
        e.serialnumber=1;
        e.name = "rashmi";
        e.age = 25;

        e.show();
    }
}
