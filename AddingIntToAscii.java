package mar1.examples;

public class AddingIntToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'd';
		int ascii = c;
		int addedAscii = c + 3;
		char d = (char)addedAscii;
		System.out.println("Printing Ascii value of d:"+ascii);
		System.out.println("Printing Ascii value of d + 3:"+addedAscii);
		System.out.println("Printing Equivalent Ascii value of int:"+d);
	}

}
