package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number of yards: ");
			int yard = input.nextInt();
			int result = yard*3*12;
		System.out.print("Enter number of feet: ");
			int feet = input.nextInt();
			int result1 = feet*12;
		System.out.print("Enter number of inches: ");
			int inches = input.nextInt();
			int result2 = result+result1+inches;
		System.out.println("Total number of inches: " + result2);
		

	}

}
