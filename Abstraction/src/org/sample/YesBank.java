
package org.sample;

public interface YesBank {
	
	default void savings() {
		System.out.println("YesBank savings is : 4%");
	}
	default void deposit() {
		System.out.println("YesBank deposit is : 5%");
	}

}
