package com.training;

public class NestedClass {

	public static void main(String[] args) {
		
		
		
	}
	
	

}
class OUterClass
{
	public void print()
	{
		System.out.println("inside inner class");
	}
	
	class InnerClass{
		
		public static void main(String[] args) {
			
			OUterClass o1=new OUterClass();
			o1.print();
			
		}
		
	
		
	}
}

