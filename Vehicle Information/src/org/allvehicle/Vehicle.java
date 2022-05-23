package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void vehicleNeccesary() {
		System.out.println("These are the neccesary vehicles");
		}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.vehicleNeccesary();
		TwoWheeler o = new TwoWheeler();
		o.bike();
		o.cycle();
		ThreeWheeler r = new ThreeWheeler();
		r.auto();
		FourWheeler u = new FourWheeler();
		u.bus();
		u.car();
		u.lorry();
		}

}
