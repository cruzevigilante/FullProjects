package dataprovider;

import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	private void tc0() {

		System.out.println("hii");
		//int a =(int) Thread.currentThread().getId();
		System.out.println(Thread.currentThread().getId());
		
	}

}
