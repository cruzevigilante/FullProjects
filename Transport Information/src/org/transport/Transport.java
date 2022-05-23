package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void transportForm() {
		System.out.println("Various Forms of transports are as follows");
      }
	public static void main(String[] args) {
		Transport t = new Transport();
		t.transportForm();
		Road r = new Road();
		r.bike();
		r.bus();
		r.car();
		r.cycle();
		Air a = new Air();
		a.aeroPlane();
		a.heliCopter();
		Water w = new Water();
		w.boat();
		w.ship();
		
	}
}
