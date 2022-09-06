//  Berenice Gonzalez - Salary Calculator Assignment
//	The purpose of this file is to run a salary calculator program. It will take inputs of 3 employees' hours worked and the hourly rate and then output the gross pay for each.
//	CSIS 212 - B04 202240
//	References
//		Mkyong. (2021, October 29). Java - display double in 2 decimal places. Mkyong.com. 
//		Retrieved September 5, 2022, from https://mkyong.com/java/java-display-double-in-2-decimal-points/");

package salaryCalculator;

import java.util.Scanner;
import java.text.DecimalFormat;


public class salaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Berenice Gonzalez - Assignment #2\n");
		
		final DecimalFormat df = new DecimalFormat("0.00"); //turns final output into decimal with two places
		
		Scanner input = new Scanner(System.in); //allows input into the console (external to internal)
		int counter = 1; //setting the variable
		
		while (counter <= 3) {
			System.out.println("\nEnter the hourly rate:"); //prompts this in the console
			int rate = input.nextInt(); //tells it to move on to the next part of the code
			
			System.out.println("Enter hours worked");
			int hours = input.nextInt();
			
				if (hours > 40) {
					int over40hours = hours - 40; //getting the difference of hours over 40
					
					double overPay = (rate * hours) + (rate * 1.5 * over40hours);
					System.out.printf("Pay for Employee %d is $" + df.format(overPay), counter, overPay); //outputs the pay with two decimal places and then goes to counter
//					int employee = input.nextInt();
//					System.out.printf("Pay for Employee %d is $%f%n", counter, overPay);
				}
					//calculates for hours under 40
					else { //getting the pay under 40 hours
						if (hours <= 40) {
							double pay = rate * hours;
							System.out.printf("Pay for Employee %d is $" + df.format(pay), counter, pay); //outputs the pay with two decimal places and then goes to counter
//							System.out.printf("Employee %d pay is $%f%n", counter, pay);
						}
					}
			
		//terminates the loop when the counter reaches 3 if not it will keep going infinitely.
		counter = counter + 1;

		} //closes while loop
	} //closes main class
} //closes class body