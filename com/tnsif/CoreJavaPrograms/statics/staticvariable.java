package com.tnsif.CoreJavaPrograms.statics;

class User{
    String name;
    int EID;
    static String collegename = "REVA";

    User(String n,int e){
        name =n;
        EID = e;
    }

    void display(){
        System.out.println(name+" "+EID+" "+collegename);
    }
}

public class staticvariable {
    public static void main(String[] args) {
        User u1 = new User("S", 10);
        User u2 = new User("R", 01);
        User u3 = new User("U", 05);

        u1.display();
        u2.display();
        u3.display();
    }
}
