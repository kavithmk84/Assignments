package ConditionalStatements;

import java.util.Scanner;

public class CheckingForSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		double length = scanner.nextDouble();
		double breadth = scanner.nextDouble();
		if (length==breadth) 
			System.out.println("Its a square");
		else
			System.out.println("Its a rectangle");
		
	}

}
