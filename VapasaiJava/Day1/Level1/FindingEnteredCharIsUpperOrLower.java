package ConditionalStatements;

import java.util.Scanner;

public class FindingEnteredCharIsUpperOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = scanner.next().charAt(0);
		
		if((ch>='A')&&(ch<='Z'))
			System.out.println("Entered character is uppercase");
		else if((ch>='a')&&(ch<='z'))
			System.out.println("Entered character is lowercase");
		else
			System.out.println("Entered is not a character");
	}

}
