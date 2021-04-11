import java.util.Scanner;

public class CapitalAndLowercase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//String s = "quit";
		
		
		do {
			
			System.out.println("Give a string so i can count how many letters are capital and how many others lowercase:");
			String st = input.nextLine();
			int stri=st.length();
			char str;
			int countCapitals=0;
			int countLowercase=0;
			
			
			for (int i=0; i<stri; i++) {
				 str=st.charAt(i);
				 
				 if(str>='A' && str<='Z') {
					 ++countCapitals;
				 }
				 
				 else if(str>='a' && str<='z') {
					 ++countLowercase;
				 }
				 
			}
			
			System.out.printf("The capital letters are: %d and the lowercase: %d", countCapitals,countLowercase);

			
		}while( input.next() != "quit");
		
		System.out.println("Thank you!");
		
	}

}
