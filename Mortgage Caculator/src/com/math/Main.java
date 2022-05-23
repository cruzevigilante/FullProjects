package com.math;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		final byte MONTHS_IN_YEARS = 12;
		final byte PERCENT = 100;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Principal :");
		
		int principal = scanner.nextInt();
		
		System.out.println("Annual Interest Rate :");
		
		float annualInterest = scanner.nextFloat();
		
		float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEARS;
		
		System.out.println("Period (years) :");
		byte years = scanner.nextByte();
		
		int numOfPayments = years *MONTHS_IN_YEARS;
		
		double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest,numOfPayments))/(Math.pow(1+monthlyInterest, numOfPayments)-1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage :"+mortgageFormatted);
		}

}
