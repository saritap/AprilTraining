package com.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileReader;

public class Day5_ExceptionHandling {
public final int s1=34;
	public static void main(String[] args) throws FileNotFoundException  {
try {		
int s=10/0;// unchecked exception  -arithmetic exception


}
catch(Exception e){
	System.out.println(" arithmetic exception");
	
}

int []a=new int[5];
String s1=null;

String s="java session";
System.out.println(s.charAt(12));//StringIndexOutOfBoundException
System.out.println(a[6]);// unchecked exception(Array indexOutofBoundException)

// checked exception -are checked at compile time 

FileReader r1=new FileReader("sarite.txt");
		try {
			FileReader r=new FileReader("sarite.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// important code 
			// close file , close database connect 
		}


	System.out.println("done");
		
/*	statement1();	
	statement2();	
	statement13();//	
	statement4();	
	statement5();	
	statement6();	
	*/	
	}

}
