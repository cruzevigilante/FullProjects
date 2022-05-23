package org.base;

public interface KotakBank{
	default void savings() {
		System.out.println("Kotakbank savings is :12%");
		
	}
	default void deposit() {
		System.out.println("Kotakbank deposit is : 5%");
	}
	default void fixed() {
		System.out.println("Kotakbank fixed is : 7%");
	}
}
