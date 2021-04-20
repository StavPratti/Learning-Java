public class Teacher {
	
	private String name;
	private int age;
	private String speciality;
	
	public Teacher(String name, int age, String speciality) {
		this.name = name;
		this.age = age;
		this.speciality = speciality;
	}
	
	/*public Teacher() {
		name=null;
		age=0;
		speciality=null;
	} */

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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", speciality=" + speciality + "]";
	}

	
}
