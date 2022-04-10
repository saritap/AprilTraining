package com.training;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//Ternary operator ?
		//String status=(n==5)?"true":"false";
		System.out.println((n==5)?"true":"false");
		//System.out.println(status);
		
		// increments by 10 
		for(int i=0;i<100;i=i+10)
		{
			System.out.println(i);
		}
		
		
	// String 
		String s="priya is a nice girl";
		String s2="Vijay";
		String []sp=s.split(" ");
		for(String i:sp)
		{
			
		}
		
	}

}
