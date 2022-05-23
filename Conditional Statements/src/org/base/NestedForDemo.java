package org.base;

public class NestedForDemo {
	
	private void ascendingOrder() {
		
		//int k=1;
		
		
		for (int i = 3; i <6; i++) {
			
			for (int j = 3; j <=i; j++) {
				
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println("");
		}

	}
	
public static void main(String[] args) {

	int k =1;
	
	for (int i = 0; i <4; i++) {
		
		for (int j = 1; j <= 4-i; j++) {
			System.out.print(k);
			System.out.print("\t");
			k++;
			
		}
		System.out.println("");
		
	}
	System.out.println("================================");
	
	NestedForDemo n = new NestedForDemo();
	n.ascendingOrder();
	
		

}
}
