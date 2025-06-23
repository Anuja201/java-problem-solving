package day2.question;

import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.print("Enter first double value: ");
	        if (!sc.hasNextDouble()) {
	            System.out.println("Error: Not a double value");
	            return;
	        }
	        double a = sc.nextDouble();

	        // Check second number
	        System.out.print("Enter second double value: ");
	        if (!sc.hasNextDouble()) {
	            System.out.println("Error: Not a double value");
	            return;
	        }
	        double b = sc.nextDouble();

	        // Print average
	        System.out.println("Average: " + (a + b) / 2);

	}

}
