public class Student {


	private String name;	
	private int age;
	private int year;
	private double mo;
	
	public Student(String name, int age, int year, double mo) {
		this.name = name;
		this.age = age;
		this.year = year;
		this.mo = mo;
	}
	public Student(){
		name=null;
		age=0;
		year=0;
		mo=0.0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMo() {
		return mo;
	}
	public void setMo(double mo) {
		this.mo = mo;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", year=" + year + ", mo=" + mo + "]";
	}
	 public void compute(double grade) {
	    mo=(mo+grade)/2;
	  }
}
