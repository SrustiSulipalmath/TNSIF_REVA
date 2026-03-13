package com.tnsif.statics;

class student{
    int rollno;
    String name;
    static String collegename = "ITI";

    static void change(){
        collegename = "Reva";
    }

    student(int r,String s){
        rollno = r;
        name =s;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+collegename);
    }
}

public class staticmethod {

    public static void main(String[] args) {
        student s1 = new student(1,"rash");
        student s2 = new student(6,"sash");
        student s3 = new student(9,"usha");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(student.collegename);
    }
	
}
