package org.base;

public class ConstructorDemo {
	public ConstructorDemo()
	{
		System.out.println("Default");
	}
	public ConstructorDemo(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("Parameterized");
	}
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}


	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo();
		
		ConstructorDemo cd = new ConstructorDemo(4,5);

		ConstructorDemo ctd = new ConstructorDemo("hello");

		
	}

}
