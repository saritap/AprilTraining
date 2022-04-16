package com.training;

public class Constructor1 {
public  static int age;
public static String name;

public   Constructor1 (int age1,String name1)
{
	age=age1;
	name=name1;

	
}

	public static void main(String[] args) {
		
Constructor1 c1=new Constructor1 (12,"sarita");

System.err.println(c1.age+" "+c1.name);
Constructor1 c2=new Constructor1 (15,"sarita2");

System.err.println(c2.age+" "+c2.name);

	}

}
