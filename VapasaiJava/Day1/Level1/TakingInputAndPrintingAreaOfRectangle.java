package mar1.examples.Operators;

import java.util.Scanner;

public class TakingInputAndPrintingAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		double length = scanner.nextDouble();
		double breadth = scanner.nextDouble();
		double areaOfRectangle = length * breadth;
		System.out.println("Area of a rectangle in double:"+areaOfRectangle);
		int intArea = (int)areaOfRectangle;
		System.out.println("Area of a rectangle converted to int:"+intArea);

	}

}
