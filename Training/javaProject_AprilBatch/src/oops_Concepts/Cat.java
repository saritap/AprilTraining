package oops_Concepts;

public class Cat extends Animal {

	public void eat()
	{
		System.out.println(" cat is eating ");
	}
	
	
	
	
	public static void main(String[] args) {
		Cat c=new Cat();
		c.drink();
		c.eat();

	}

}
