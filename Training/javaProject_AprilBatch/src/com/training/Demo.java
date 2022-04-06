package com.training;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String status=(n==5)?"true":"false";
		System.out.println((n==5)?"true":"false");
		//System.out.println(status);
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		

	}

}
