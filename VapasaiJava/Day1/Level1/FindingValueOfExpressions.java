package ConditionalStatements;

public class FindingValueOfExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		int z = 0;
		System.out.println("Value of x==2:"+(x==2));
		System.out.println("Value of x!=5:"+(x!=5));
		System.out.println("Value of (x!=5 && y>=5):"+(x!=5 && y>=5));
		System.out.println("Value of (z!=0 || x==2):"+(z!=0 || x==2));
		System.out.println("Value of !(y<10):"+!(y<10));
	}

}
