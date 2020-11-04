/*
 * 
 */

public class JavaOperators {

	public static void main(String[] args) {
		
		
		// number holds value .....
		int number;
		
		/*
			line1
			line2
			line3
		*/
		number = 10;
		number = 77;
		
		float floatNumber = 3.14f;
		double number3 = 3.14;
		
		char ch1 = '^';
		String str1 = "12345";
		
		boolean bl = true;
		bl = false;
		
		
		int a = 11, b = 4, intRes;
		
		intRes = a + b;
		intRes = a - b;
		intRes = a * b;
		intRes = a / b;
		intRes = a % b;
		
		System.out.println(" a + b = " + intRes);
		
		/*
		if( a % 2 == 0 ) { 
			number3 = 1.2345;
			System.out.println(" a is even ");
		}
		else {
			number3 = 4.567;
			System.out.println(" a is odd ");
		}
		*/
		
		System.out.println( a % 2 == 0 ? " a is even " : " a is odd ");
		
		
		int uo = 5;
		
		// uo = -uo;
		// uo++; ++uo;
		// uo--; --uo;
		
		System.out.println(" uo is " + --uo);
		System.out.println(" uo is " + uo);
		System.out.println(" uo is " + uo);
		System.out.println(" uo is " + uo);
		
	}
}
