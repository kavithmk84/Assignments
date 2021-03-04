package day2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UniqueCarDigitGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of car numbers to be generated:");
		Scanner scanner = new Scanner(System.in);
		int numberOfCar = scanner.nextInt();
	    Random random = new Random();
	    for (int i=0; i<numberOfCar; i++){
	        int value = (int)(Math.random() * ((10000 - 1000) + 1)) + 1000;
	        String CarNo = "MH"+value;
	        System.out.println(CarNo);
	    }

    }
}


