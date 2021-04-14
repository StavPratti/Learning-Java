class Employee
{ 
   private String name;
   private int age;
   public Employee(String name,int age)
   {
     this.name=name;
     this.age=age;
   }
   public Employee()
   {
     name=null;
     age=0;
   }
   public void setname(String name)
   {
     this.name=name;
   }
   public void setage(int age)
   {
     this.age=age;
   }
   public String getname()
   {
     return name;
   }
   public int getage()
   {
     return age;
   }
   public String toString()
   {
      return " "+name+" "+age;
   }
   public void printing()
   {
     System.out.println("Name :"+name+" "+age);
   }
}

class Consultant extends Employee
{
  private String project;
  private float salary;
  public Consultant(String name,int age,String project,float salary)
 {
   super(name,age);
   this.project=project;
   this.salary=salary;
 }
 public Consultant(String name,String project,float salary)
 {
   super(name,0);
   this.project=project;
   this.salary=salary;
 }
 public Consultant()
 {
   super(); //super(null,0);
   project=null;
   salary=0;
 }
   public String toString()
   {
      return  super+" "+project+" "+salary; //return  super.toString()+" "+project+" "+salary;
   }
   public void setdetails(String name,String project)
   {
      setname(name); //super.setname(name);
      this.project=project;
   }
   public void growup()
   {
     int a=getage();
     a++;
     setage(a);
   }
   @override
   public void printing()
   {
     //System.out.println("Name :"+getname()+" "+getage()+" Project:"+project);
     super.printing();
     System.out.println(" Project:"+project);
   }
}

class Developper extends Employee
{
...
}


public class Inheritance
{
   public static void main(String []args)
   {
     Employee emp=new Employee("Maria",45);
     Consultant cons=new Consultant("George",34,"Security",2000);
     System.out.println(cons);
     cons.printing(); //printing ths Consultant
      Employee emp2=emp;
      System.out.println(emp2); --> Name:Maria 45
      //Polymorfismos
      Employee emp3=(Employee)cons;//anafora yperklashs se antikeimeno ypoklashs
      int ilikia=emp3.getage(); --> ilikia=34 --> orismenh sthn yperklash
      emp3.printing(); --> printing ths Consultant
      emp3.growup();--> ERROR --> growup einai orismenh mono mesa sthn Consultant
      ((Consultant)emp3).growup(); --> ok
       Employee[] emppin=new Employee[5];
       emppin[0]=new Consultant();
       emppin[1]=new Developper();
       emppin[2]=new Employee();
       .
       .
       for(int i=0;i<5;i++) emppin[i].printing();
        for(int i=0;i<5;i++)
        {
            if(emppin[i] instanceof Consultant) ((Consultant)emppin[i]).growup();
            
        }
      
   }
}