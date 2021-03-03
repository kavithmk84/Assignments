package ConditionalStatements;

import java.util.Scanner;

public class StudentAllowanceToExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, Enter number of classes held:");
		int classesHeld = scanner.nextInt();
		System.out.println("Hi, Enter number of classes attended:");
		int classesAttended = scanner.nextInt();
		System.out.println("Hi, Do you have medical cause: Say yes or no");
		String str = scanner.next();
		int attendancePerc = (100 * classesAttended)/classesHeld;
		System.out.println("Your attendance percentage is:"+attendancePerc);
		if(attendancePerc>75)
			System.out.println("You are allowed to sit in exam");
		else if(attendancePerc<75 && str.equals("yes"))
			System.out.println("You are allowed to sit in exam as you have medical cause");
		else if(attendancePerc<75 && str.equals("no"))
			System.out.println("You are not allowed to sit in exam");
	}

}
