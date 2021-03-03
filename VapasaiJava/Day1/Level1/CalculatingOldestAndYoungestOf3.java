package ConditionalStatements;

import java.util.Scanner;

public class CalculatingOldestAndYoungestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, Enter your age:");
		int agePpl1 = scanner.nextInt();
		int agePpl2 = scanner.nextInt();
		int agePpl3 = scanner.nextInt();
		System.out.println("Calculating oldest of people:");
		if((agePpl1>agePpl2) && (agePpl1>agePpl3)) 
			System.out.println("People1 is oldest");
		else if ((agePpl2>agePpl1) && (agePpl2>agePpl3))
			System.out.println("People2 is oldest");
		else if ((agePpl3>agePpl1) && (agePpl3>agePpl1))
			System.out.println("People3 is oldest");
		
		System.out.println("Calculating youngest of people:");
		if((agePpl1<agePpl2) && (agePpl1<agePpl3)) 
			System.out.println("People1 is youngest");
		else if ((agePpl2<agePpl1) && (agePpl2<agePpl3))
			System.out.println("People2 is youngest");
		else if ((agePpl3<agePpl1) && (agePpl3<agePpl1))
			System.out.println("People3 is youngest");
		
	}

}
