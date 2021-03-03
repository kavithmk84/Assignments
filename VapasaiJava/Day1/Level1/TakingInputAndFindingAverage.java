package loopsExample;

import java.util.Scanner;

public class TakingInputAndFindingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n=0,s=0;
		double avg;
		System.out.println("Input 10 numbers:");
		for(i=0;i<10;i++) {
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
			s+=n;
		}
		avg = s/10;
		System.out.println("Average of 10 numbers is:"+avg);
	}

}
