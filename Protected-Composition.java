Oratothta protected (melh orata apo ypoklaseis kai apo klaseis pou vriskontai sto idio package)

class Employee
{
   protected String name;
   protected int age;
   protected double hours;

   public Employee(String name,int age,double hours)
   {
     this.name=name;
     this.age=age;
     this.hours=hours;
   }
   public Employee()
   {
     name=null;
     age=0;
     hours=0;
   }
   public void setname(String name)
   {
     this.name=name;
   }
   public void setage(int age)
   {
     this.age=age;
   }
   public void sethours(double hours)
   {
     this.hours=hours;
   }
   
   public String getname()
   {
     return name;
   }
    public double gethours()
   {
     return hours;
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

   public double calculateamoivh(double wromisthio)
   {
      return hours*wromisthio;
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
      this.name=name;//setname(name); //super.setname(name);
      this.project=project;
   }

   public void growup()
   {
     int a=age;//getage();
     a++;
     age=a;//setage(a);
     //or age++

   }
   @override
   public void printing()
   {
     //System.out.println("Name :"+name+" "+age+" Project:"+project);
     super.printing();
     System.out.println(" Project:"+project);
   }

   public float getsalary()
   {
      return salary;
   }
}

class Developper extends Employee
{
...
}


public class Inheritance
{
   //without polymorfism
   public static void printdetails(Employee em)
   {
      em.printing();
   }


   public static void printdetails(Consultant em)
   {
      em.printing();
   }

    //Polymorfism
    public static void printdetails2(Employee em)
   {
      em.printing();
   }


   public static void getamoivh(Employee em)
   {
     if(em instanceof Consultant)
     {
        System.out.println(((Consultant)em).getsalary());
     }
     else
     {
          System.out.println(em.calculateamoivh(20));
     }
   }

   public static void main(String []args)
   {
     Employee emp=new Employee("Maria",45);
     emp.name="George"; //logw protected an h Inheritance einai sto idio package
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
      printdetails(emp);
      printdetails(cons);
      printdetails2(emp);
      printdetails2(cons);
      
     
   }
}

Composition

class Date
{
   private int day,month,year;

   public Date(int day,int month,int year)
   {
      this.day=day;
      this.month=month;
      this.year=year;
   }
   public String toString()
   {
   	return day+"-"+month+"-"+year;  
   }
   //set and get for all members
}


class Student
{
    private String am;
    private Date registration;
   
    public Student(String am,Date reg)
    {
       this.am=am;
       registration=reg;
    }
     public Student(String am,int day,int month,int year)
    {
       this.am=am;
       registration=new Date(day,month,year);
    }

    public String toString()
    {
      return "AM:"+am+" "+registration;
    }

    public void setRegistration(int day,int month,int year)
    {
      registration.setDay(day);
      registration.setMonth(month);
      registration.setYear(year);
    }

    public Date getRegistration()
    {
        return registration;
    }
    
}

public class Composition
{
    public static void main(String []args)
   {
      Date d=new Date(12,2,2000);
      Student stud=new Student("CS1234",d);
      System.out.println(stud); //AM:CS1234 12-2-2000
      d.setDay(15);
      System.out.println(stud); //AM:CS1234 15-2-2000
      Student stud2=new Student("CS1567",20,5,2001);
      stud2.setRegistration(4,7,2002);
      Date newd=stud2.getRegistration();
      System.out.println(newd); //20-5-2001
      newd.setDay(3);
      System.out.println(stud2);/AM:CS1567 3-5-2001
      
   }
}