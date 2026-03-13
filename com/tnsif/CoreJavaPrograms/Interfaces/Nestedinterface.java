package com.tnsif.Interfaces;

public class Nestedinterface implements Myinterface.Myinnerinterface {
    @Override
    public void print(){
        System.out.println("nested interface");
    }

    public static void main(String[] args) {
        Nestedinterface n = new Nestedinterface();
        n.print();
        System.out.println(Nestedinterface.id);
    }
}
