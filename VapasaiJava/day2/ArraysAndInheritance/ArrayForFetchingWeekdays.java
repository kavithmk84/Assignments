package day2.arrays;

import java.util.Scanner;

public class ArrayForFetchingWeekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 7 to print corresponding day:");
		int day = scanner.nextInt();
		System.out.println("Corresponding weekday is:"+weekDays[day-1]);
	}

}
