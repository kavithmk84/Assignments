package ConditionalStatements;

import java.util.Scanner;

public class TotalCostOfQuantity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, How much unit you want to purchase:");
		double unitFromUser = scanner.nextDouble();
		double cost = unitFromUser * 100;
		System.out.println("Cost is:" +cost);
		double discount;
		if(cost>1000) {
			discount = cost * 0.1;
			cost = cost - discount;
			System.out.println("Total discount is:" +discount);
			System.out.println("Total cost is:" +cost);
			
		}else
			System.out.println("Total cost is:" +cost);

	}

}
