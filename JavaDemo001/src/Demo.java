import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Eclipse");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String userName = sc.nextLine();
		
		// userName = "John Smith";
		// userName = "";
		
		System.out.println("Hello " + userName);
	}

}
