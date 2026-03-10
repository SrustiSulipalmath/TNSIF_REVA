package com.tnsif.stringsdemo;

public class Testimmutable {
	public static void main(String[] args) {
String s="sachin";
System.out.println(s);
s=s.concat("tendulkar");
System.out.println(s);
System.out.println(s.length());

System.out.println(s.charAt(3));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.lastIndexOf(s, 0));
}
}
package com.tnsif.stringsdemo;
// demo for equals method
public class Equaldemio {
	public static void main(String[] args) {
		
	String s1="rashmi";
	String s2="Rashmi";
	
	String s3=new String("rashmi");
	String s4="rahul";
	
//	System.out.println(s1.equals(s4));
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.equals(s3));
	
	System.out.println(s1.equalsIgnoreCase(s4));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equalsIgnoreCase(s3));
	
	}	

}

