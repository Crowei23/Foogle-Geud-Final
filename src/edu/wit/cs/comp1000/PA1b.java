package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number of inches: ");
			int inches= input.nextInt();
		
			int Yards = (inches/36); // 50/36 = 1 yard
		System.out.println("Yards:"+ Yards);
			inches = (inches%36);
			
			int Feet = (Yards%36);
		System.out.println("Feet: "+ Feet);
			inches = (inches%12);
		
			System.out.println("Inches: "+ inches);
		
		
	
			
			
			
		
		
	
	}

}
