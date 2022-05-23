package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("Wifi Name is : Dare2Touch");

	}
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		Lan l = new Lan();
		l.lanName();
		Wireless i = new Wireless();
		i.modemName();
		MobileData m = new MobileData();
		m.dataName();
	}

}
