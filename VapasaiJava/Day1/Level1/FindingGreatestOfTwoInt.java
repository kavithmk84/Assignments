package ConditionalStatements;

import java.util.Scanner;

public class FindingGreatestOfTwoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if(num1>num2)
			System.out.println("Num1 is greatest");
		else
			System.out.println("Num2 is greatest");
	}

}
