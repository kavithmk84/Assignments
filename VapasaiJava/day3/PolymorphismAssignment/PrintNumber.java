package day3.polymorphism;

public class PrintNumber {
	
	public void printNumber(int a) {
		System.out.println("Printing int:"+a);
	}
	public void printNumber(double a) {
		System.out.println("Printing double:"+a);
	}
	public void printNumber(float a) {
		System.out.println("Printing float:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber pn = new PrintNumber();
		pn.printNumber(3);
		pn.printNumber(3.5);
		pn.printNumber(12.5f);

	}

}
