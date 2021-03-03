package mar1.examples.Operators;

import java.util.Scanner;

public class TakingInputsAndPrintingSumAndProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("Sum of numbers:"+(num1+num2));
		System.out.println("Product of numbers:"+(num1*num2));
	}

}
