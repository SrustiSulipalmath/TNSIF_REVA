package com.tnsif.CoreJavaPrograms.stringsdemo;
// demo for == operator 
public class Equaloperator {
	public static void main(String[] args) {
		String s1 = "sachin";
		String s2 = "sachin";
		System.out.println(s1==s2);
		
		String s3 = new String("sachin");
		String s4 = s3;
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s1==s4);

	

	}
}
