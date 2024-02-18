package org.tcs;

public class MidCharacter {
	
	public static void main(String[] args) {
		
	
	
	String s1="wellcome";
	
	int length = s1.length();
	
	int mid=length/2;
	
	System.out.println(s1.charAt(mid));
	
	
	String s2="Welcome";
	String s3="java";
	
//	System.out.println(s2);
//	System.out.println(s3);
	
	
	
	s2=s2+s3;
//	System.out.println(s2);
	s3=s2.substring(0,s2.length()-4);
	s2=s2.substring(7,s2.length());
	System.out.println(s2);
	System.out.println(s3);
	

	
	
	
	
	}
	
	

}
