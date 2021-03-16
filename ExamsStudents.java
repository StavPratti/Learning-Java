import java.util.Scanner;

public class ExamsStudents {
	
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	float grade=0;
	float average=0;
	int counterPass=0;
	int sum=0;
	
	System.out.println("How many students does the classsrom have? ");
	int n = input.nextInt();
	
	System.out.println("How many lessons did the students have in their exams? ");
	int m = input.nextInt();
	
	for(int i=0; i < n; i++) {
		for(int j=0; j < m; j++) {
			System.out.printf("Student %d give grade for lesson %d: ",i+1, j+1);
			grade = input.nextInt();
			if(grade >= 5) {
			    counterPass+=1;
				sum+=grade;	
			}
				
		}
		if(counterPass==0) {
			System.out.println("You didnt pass any lessons, no average! ");
		} else {
		average = (float)(sum)/(float)counterPass;
		System.out.printf("For student %d average is %.2f\n",i+1,average);
		
	}		
	average=0;
	grade=0;
	counterPass=0;
	sum=0;
	}

}
	
}
