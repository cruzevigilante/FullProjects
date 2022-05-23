package org.cars;

public class ChevroletCar extends TeslaCar {

	@Override
	public void teslaPrice() {
		System.out.println("Tesla model S price is : $30,000");
		
	}

	@Override
	public void teslaMileage() {
		System.out.println("Tesla mileage is : 200 miles");
		
	}
	
	@Override
	public void hondaPrice() {
		System.out.println("Hondacar price is : $25,000");
		
	}

	@Override
	public void hondaMileage() {
		System.out.println("Honda mileage is : 100 miles");
		
	}
	@Override
	public void fordPrice() {
		System.out.println("Ford price is :$35,000");
		
	}

	@Override
	public void fordMileage() {
		System.out.println("Ford Mileage is : 150 miles");
		
	}

	public static void main(String[] args) {
		ChevroletCar c = new ChevroletCar();
		c.teslaPrice();
		c.teslaMileage();
		c.hondaPrice();
		c.hondaMileage();
		c.fordPrice();
		c.fordPrice();
    }

	}
