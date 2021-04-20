public class Subject {

	private String title;
	private Teacher teacher;
	private int credits;
	
	public Subject(String title, Teacher teacher, int credits) {
		super();
		this.title = title;
		this.teacher = teacher;
		this.credits = credits;
	}
	
	public Subject(String title, String name, int age, String speciality, int credits) {
		this.title=title;
		teacher=new Teacher(name,age,speciality);
		this.credits=credits;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(String name, int age, String speciality) {
		teacher.setName(name);
		teacher.setAge(age);
		teacher.setSpeciality(speciality);
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String toString() {
		return "Subject [title=" + title + ", teacher=" + teacher + ", credits=" + credits + "]";
	}
	
	
}
