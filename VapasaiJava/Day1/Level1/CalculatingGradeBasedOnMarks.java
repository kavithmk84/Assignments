package ConditionalStatements;

import java.util.Scanner;

public class CalculatingGradeBasedOnMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, Enter your marks:");
		int marks = scanner.nextInt();
		if(marks<25)
			System.out.println("Your Grade is F");
		else if(marks>=25 && marks<=45)
			System.out.println("Your Grade is E");
		else if(marks>=45 && marks<=50)
			System.out.println("Your Grade is D");
		else if(marks>=50 && marks<=60)
			System.out.println("Your Grade is C");
		else if(marks>=60 && marks<=80)
			System.out.println("Your Grade is B");
		else if(marks>80)
			System.out.println("Your Grade is A");
	}

}
