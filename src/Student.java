
public class Student implements Person {

	private int am;
	private String firstName;
	private String lastName;
	private int age;
	
	public Student(int am, String firstName, String lastName, int age) {
		this.am=am;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}

	public int getAm() {
		return am;
	}

	public void setAm(int am) {
		this.am = am;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() { //interface completed
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return firstName + " " + lastName; //like toString
	}

	@Override
	public String toString() {
		return "Student [am=" + am + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
