package org.base;

public class StaticVar {
	String name;
	String address;
	static String city="Chennai";
	
	StaticVar(String name, String address)
	{
		this.name=name;
		this.address=address;
		
	}
	public void getAddress() {
		System.out.println(address+" "+city);
	
	}
	public static void getCity() {
		
		System.out.println(city);
	}
	public static void main(String[] args) {
		StaticVar obj = new StaticVar("bob","Adyar");
		StaticVar obj1 = new StaticVar("ram","TNagar");

		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		
	}

}
