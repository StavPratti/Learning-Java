
public class WorkingStudent extends Student  {

	private String work;
	private double payment;
	private float workHours;
	
	public WorkingStudent(String name, int age, int year, double mo, String work, double payment, float workHours) {
		super(name, age, year, mo);
		this.work = work;
		this.payment = payment;
		this.workHours = workHours;
	}
	
	public WorkingStudent() {
		super();
		work=null;
		payment=0.0;
		workHours=0;
	}
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public float getWorkHours() {
		return workHours;
	}
	public void setWorkHours(float workHours) {
		this.workHours = workHours;
	}

	public String toString() {
		
		return "WorkingStudent [" + super.toString() +"work=" + work + ", payment=" + payment + ", workHours=" + workHours + "]";
		
	}
	
	public double extraPayment(float standardHours, double extraMoney) {
		if(workHours>standardHours) {
			return (workHours-standardHours)*extraMoney+standardHours*payment;
		}else
			return workHours*payment;
	}
}
