package com.training;

import java.util.Scanner;

public class Day2_IfElse {

	public static void main(String[] args) {
	//int a=5;
		// taking value from the user 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a = ");
	int a=sc.nextInt();
	System.out.println("Enter value of b =");
	int b=sc.nextInt();
	
	
	System.out.println("value of a= "+a+" value of b ="+b);
	
	// if else condition 
	
	// && - and , || - or operator 
/*	
	if(a==5||a<3)
	{
		System.out.println("a is greater then 1");
	}
	else if (a==0)
	{
		System.out.println("a is less then 1");
		
	}
	
*/
	if(a>0)
	{
		
		
		if(a<50)
		{
			System.out.println("number is less then 50 ");
		}
		
	}
	else if (a<0)
	{
		System.out.println("number is negative");
	}
	else 
	{
		System.out.println("number is zero ");
	}
	
System.out.println("done ");	

	}

}
