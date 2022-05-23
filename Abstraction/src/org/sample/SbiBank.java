package org.sample;

public interface SbiBank {
	default void savings() {
		System.out.println("SbiBank savings is : 8%");
	}
	default void deposit() {
		System.out.println("SbiBank deposit is : 9%");
	}

}
