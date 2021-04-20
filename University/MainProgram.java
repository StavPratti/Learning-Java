import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		//a small database
//		Teacher teacher1= new Teacher("Nikolas Adam", 45, "Informatics");
//		Teacher teacher2= new Teacher("Panagiotis Prattis", 30, "Mathematics");
//		Teacher teacher3= new Teacher("Anna Papa", 56, "Software Engineering");
//		Teacher teacher4= new Teacher("Maria Petrou", 37, "Software Engineering");

		
		
		System.out.println("How many subjects to insert?");
		Scanner input=new Scanner(System.in);
		//int n=input.nextInt();
		Subject [] sub= new Subject[input.nextInt()];
		
		for(int i=0; i<sub.length; i++) {
			
			System.out.println("Give the subjects name of the title, teachers (name, age, speciality) and the value of the credits by this order!");
			String t=input.nextLine();
			String n=input.nextLine(); //its not working!
			input.nextLine(); //must write 
			int a=input.nextInt();
			String s=input.next();
			//Teacher teacher1=new Teacher(n,a,s);
			int c=input.nextInt();
			//sub[i]=new Subject(t,teacher1,c); 
			sub[i]=new Subject(t,n,a,s,c);
		}
			for(int i=0; i<sub.length; i++) {
			if(sub[i].getTeacher().getSpeciality().equals("Software Engineering")) {
			//if(sub[i].getTeacher().getSpeciality()==teacher3.getSpeciality() || sub[i].getTeacher().getSpeciality()==teacher4.getSpeciality()) {
				System.out.println("The details of the lesson with a software engineer as teacher\n" +sub[i]);
		 
			}
	}
			
//			for(int i=0; i<sub.length; i++) {
//				Teacher teacher2=sub[i].getTeacher();
//				
//			}
//
			
  }
}