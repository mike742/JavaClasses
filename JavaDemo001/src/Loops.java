import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		int i = 0; // 0 to 10
		
		/*
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		/*
		char ans = 'n';
		
		while(ans != 'n') {
			System.out.println("Line 1");
			System.out.println("Line 2");
			System.out.println("Line 3");
			
			System.out.print("Continue? (y/n) ");
			ans = sc.next().charAt(0); // 'n' or 'no' or 'ne' none
		}
		*/
		
		char ans;
		
		do {
			System.out.println("Line 1");
			System.out.println("Line 2");
			System.out.println("Line 3");
			
			System.out.print("Continue? (y/n) ");
			ans = sc.next().charAt(0);
		}
		while(ans != 'n');
		
		System.out.println("Done!");
			 
	}

}
