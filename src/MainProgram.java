import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		System.out.println("How many students do you want?");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Student[] stud= new Student[n];
		
		System.out.println("Press simple for s student or working for w student");
	
		for(int i=0; i<n; i++) {
			String c=input.next();
			//char c1=c.charAt(0);
			if(c.equals("s")) {
				System.out.println("We have a simple student!");
				System.out.println("Give name age year and mo by this order:");
				String m=input.nextLine();
				int a=input.nextInt();
				int y=input.nextInt();
				double o=input.nextDouble();
				stud[i]=new Student(m,a,y,o);

			}else if(c.equals("w")) { //or else
				System.out.println("We have a working student!");
				System.out.println("Give name age year and mo, work, payment and hours of work by this order:");
				String m=input.nextLine();
				int a=input.nextInt();
				int y=input.nextInt();
				double o=input.nextDouble();
				String w=input.nextLine();
				double p=input.nextDouble();
				float h=input.nextFloat();
				stud[i]=new WorkingStudent(m,a,y,o,w,p,h);
          } 
			else {
				System.out.println("Type again:");
				i--; 
			} 
		}
		
		for(int i=0; i<n; i++) {
			if(stud[i] instanceof WorkingStudent) {
				System.out.println("Give the amount of hours of work and the worth of money:");
				float j=input.nextFloat();
				double z=input.nextDouble();
				double u=((WorkingStudent)stud[i]).extraPayment(j,z);	
				System.out.println("Your total money is:"+u);
		}
		    else if(stud[i] instanceof Student) {
				System.out.println("Give the new grade:");
				double g=input.nextDouble();
				stud[i].compute(g);	
			}
	}

}
}
