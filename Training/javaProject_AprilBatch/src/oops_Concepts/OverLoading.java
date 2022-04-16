package oops_Concepts;

public class OverLoading {

	public void m1()
	{
		System.out.println(" without parameter");
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	public void m1(int a,int b)
	{
		System.out.println(a);
	}
	public void m1(String  a)
	{
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		
		OverLoading o=new OverLoading();
		o.m1(3);
	}

}
