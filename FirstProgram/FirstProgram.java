import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("How many students to store?");
		int num=input.nextInt();
		
		if(num <= 0) {
			System.err.println("Wrong number of students!");
			System.exit(-1);
		}
		
		Student [] allStudents =  new Student[num];
		
		for(int i=0; i < allStudents.length; i++) {
			System.out.println("Give AM of student" + i + ":");
			int am=input.nextInt();
			
			System.out.println("Give age of student" + i + ":");
			int age=input.nextInt();
			
			System.out.println("Give first name of student" + i + ":");
			String firstName=input.next();
			
			System.out.println("Give last name of student" + i + ":");
			String lastName=input.next();
			
			Student s = new Student(am, firstName, lastName, age);
			
			allStudents[i]=s; //or allStudents[i]= new Student(am, firstName, lastName, age);
		}
		
		System.out.println("All students:");
		
		//for(Student student: allStudents){
		//student.getName();
		//or System.out.println(student); //toString method
		for(int i=0; i < allStudents.length; i++) {
			System.out.println("Student:" + allStudents[i].getName());
		}

		Student s1=new Student(1,"Kostas","Adam" , 20);
		//Person s1=new Student(1,"Kostas","Adam" , 20);
		System.out.println("Student:" + s1.getAm() + ","  + s1.getFirstName() + "," + s1.getLastName());
	
		Student s2=new Student(1,"Nikos","Adam" ,20);
		System.out.println("Student:" + s2.getAm() + ","  + s2.getFirstName() + "," + s2.getLastName());
		
	}

}
