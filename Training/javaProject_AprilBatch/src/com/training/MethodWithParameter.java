package com.training;

public class MethodWithParameter {

	public  static int  add( int a,int b)
	{
		int sum =a+b;
		return sum;
	}
	public  static int  sub( int a,int b)//a=11,b=33
	{
		int sub =a-b;
		return sub;
	}
	
	
	public static void main(String[] args) {
		
System.out.println(add(1,3));
System.out.println(sub(11,33));
	}

}
