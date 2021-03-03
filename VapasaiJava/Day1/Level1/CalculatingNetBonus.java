package ConditionalStatements;

import java.util.Scanner;

public class CalculatingNetBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, Enter your salary and years of service:");
		double salary = scanner.nextDouble();
		double yearsOfService = scanner.nextDouble();
		double bonus;
		if(yearsOfService>5) {
			bonus = salary * 0.05;
			System.out.println("Total bonus is:" +bonus);
					
		}else
			System.out.println("No bonus");

	}

}
