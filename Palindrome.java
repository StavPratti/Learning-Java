import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give a string with only capital letters or only lowercase letters:");
		
		do {
			
			String s=input.next();
			char st;
			char st1;
			int palindrome = 1;
			int str=s.length();

			for (int j = 0; j < str / 2 ; j++) {
				st= s.charAt(j);
				st1= s.charAt(str - 1 - j);
				if (st != st1) {
					palindrome = 0;
					break;
				}
			}

			if (palindrome==1) {
				System.out.println("YES");
			}
			  else {
				System.out.println("NO");
			}

		
		}while( input.next() != "quit");
		
		System.out.println("Thank you!");
		
		
		
		
	}

}
