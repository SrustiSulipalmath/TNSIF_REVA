package com.tnsif.CoreJavaPrograms.stringsdemo;

public class equalsdemo {
    public static void main(String[] args) {
        String s1 = "rashmi";
        String s2 = "rashmi";

        String s3 = new String("rashmi");
        String s4 = "rahul";
        String s5 = "Rashmi";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));


    }
}
