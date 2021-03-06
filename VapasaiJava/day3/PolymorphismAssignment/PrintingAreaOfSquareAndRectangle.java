package day3.polymorphism;

public class PrintingAreaOfSquareAndRectangle {
	public void area(int a) {
		System.out.println("Area of a square:"+(a*a));
	}
	public void area(int a, int b) {
		System.out.println("Area of a rectangle:"+(a*b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingAreaOfSquareAndRectangle pn = new PrintingAreaOfSquareAndRectangle();
		pn.area(3);
		pn.area(3*7);
	}
}
