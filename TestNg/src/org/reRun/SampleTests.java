package org.reRun;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SampleTests {
	@Test
	private void tc0() {
		System.out.println("Method 0");

	}
	@Test
    private void tc1() {
		Assert.assertTrue(false);
		System.out.println("Method 1");


	}

	@Test
	private void tc2() {
		System.out.println("Method 2");


	}
	@Test
	private void tc3() {
		System.out.println("Method 3");

	}
	
	@Test
	private void tc4() {
		System.out.println("Method 4");

	}
	@Test
	private void tc5() {
		System.out.println("Method 5");
	
	}

}
