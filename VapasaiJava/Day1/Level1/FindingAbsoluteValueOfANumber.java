package ConditionalStatements;

import java.util.Scanner;

public class FindingAbsoluteValueOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, Enter the number:");
		int number = scanner.nextInt();
		int abs = Math.abs(number);
		System.out.println("Absolute value of a number is:" +abs);

	}

}
