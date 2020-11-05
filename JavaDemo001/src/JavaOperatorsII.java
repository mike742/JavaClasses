import java.util.Scanner;

public class JavaOperatorsII {

	public static void main(String[] args) {
		
		int n = 8;
		
		// n = 7 + 5;
		// n += 5;  // n = n + 5;
		// n -= 5; 	// n = n - 5;
		// n *= 5;
		// n /= 2; // 3
		n %= 2;		// n = n % 2;
		
		
		System.out.println("n = " + n);
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter int number: ");
		//int input = sc.nextInt();
		//System.out.println( "input  = " +  input );
		
		//System.out.println("Enter a float number: ");
		//float f = sc.nextFloat();
		//System.out.println("f =  " + f);
		
		String str = "Hello String";

		System.out.println( "Length  = " +  str.length() );
		
		
		// == 
		// !=
		// > 
		// <
		// >=
		// <=
		int a = 4, b = 7;
		
		if(a >= b) {
			System.out.println( " TRUE " );
		} 
		else {
			System.out.println( " FALSE " );
		}	
		
		// && 'and' false && true => false;  f && f => f;  t && t => t
		// || 'or'  false || true => true;   t || f => t;  f || f => f
		// ! 'not'  !false => true; !true => false
		if( !(b < 10) ) {
			System.out.println( " TRUE " );
		} 
		else {
			System.out.println( " FALSE " );
		}		
		
		int abs1 = Math.abs(-20);
		System.out.println( abs1 );
		
		double d = Math.ceil(3.14);
		System.out.println( d );
		
		d = Math.floor(3.14);
		System.out.println( d );
		
		d = Math.pow(3, 8);
		System.out.println( d );
		
		d = Math.sqrt(36);
		System.out.println( d );
		
		System.out.println( "HELLO STRINGS METHODS".toLowerCase() );
		
		String hello = "Hello ";
		String userName = "Mark";
		System.out.println( "Hello " + userName );
		
		System.out.println( hello.concat(userName) );
		
		
		System.out.println( "\tHELLO\t'hello'\t\"STRINGS METHODS\"" );
		System.out.print( "\tHELLO\t'hello'\t\"STRINGS METHODS\"\n" );
		System.out.print( "\tHELLO" );
		
		
		int day = 4;
		
		if(day == 1) {
			System.out.print( "Monday" );
		}
	}

}
