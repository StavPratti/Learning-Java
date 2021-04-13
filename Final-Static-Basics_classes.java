final

- final metavlhth

p.x final int X=10; ->stathera

APAGOREYETAI:

X=17;-->ERROR

- final + function (teliki morfh ths function)

final int add(int a,int b)
{ .....}

- final class(teliki morfh ths klashs kai de mporei na ekseidikeytei, na klhronomhsei)

Static

-static kai topiki metavlhth

p.x class Example
{
  public static void f()
  {
    static int i=0;
    i++;
    System.out.println(i);
  }
  public static void main(String []args)
  {
     f(); -> 1
     f(); -> 2
     f(); -> 3
  }
}

- static se melos klashs


p.x 

class A
{
  private int a;
  public void setvalue(int x)
  {
    a=x;
  }
}

class Use
{
   public static void main(String []args)
  {
     A u=new A();
     A u1=new A();
     u.setvalue(5);
     u1.setvalue(7);
     
  }
}

class A
{
  private static int a; --> To  a einai koinoxrhsto gia ola ta antikeimena ths klashs
  public static void setvalue(int x) --> h methodos pou xeirizetai static melos prepei na einai static
  {
    a=x;
  }
}

class Use
{
   public static void main(String []args)
  {
     A u=new A();
     A u1=new A();
     u.setvalue(5);
     u1.setvalue(7);
     
  }
}

Klaseis

class Student
{
  String name;
  int age;
  double mo;
  public void printing()
  {
     System.out.println("Name:"+name+" "+age+" "+mo);
  }
}

class MainProgram
{
   public static void main(String []args)
  {
    Student stud1=new Student(); --> constructor(default)
    stud1.name="Papadopoulos";
    stud1.mo=8.9;
    stud1.age=20;
    stud1.printing();
    
  }
}

Apokrypsh plhroforias

class Student
{
  private String name;
  private int age;
  private double mo;
  public void printing()
  {
     System.out.println("Name:"+name+" "+age+" "+mo);
  }
  public void setName(String n)
  {
    name=n;
  }
  public void setAge(int a)
  {
    age=a;
  }
  public void setMo(double m)
  {
    mo=m;
  }
  public String getName()
  {
    return name;
  }
  public int getAge()
  {
    return age;
  }
  public double getMo()
  {
    return mo;
  }
}

class MainProgram
{
   public static void main(String []args)
  {
    Student stud1=new Student(); --> constructor(default)
    stud1.setName("Papadopoulos");
    stud1.setMo(8.9);
    stud1.setAge(20);
    stud1.printing();
    double avg=stud1.getMo();
    if(avg>9) System.out.println("Student "+stud1.getName()+" has average grade greater than 9");

    
  }
}

Constructors

class Student
{
  private String name;
  private int age;
  private double mo;
  public void printing()
  {
     System.out.println("Name:"+name+" "+age+" "+mo);
  }
  public void setName(String n)
  {
    name=n;
  }
  public void setAge(int a)
  {
    age=a;
  }
  public void setMo(double m)
  {
    mo=m;
  }
  public String getName()
  {
    return name;
  }
  public int getAge()
  {
    return age;
  }
  public double getMo()
  {
    return mo;
  }
  public Student(String n,int a,double avg)
  {
    name=n;
    age=a;
    mo=avg;
  }
  public Student(String n,int a,double avg)
  {
    name=n;
    age=a;
    mo=avg;
  }
  public Student()
  {
    name=null;
    age=0;
    mo=0.0;
  }
  public String toString()
  {
    return "Name:"+name+",Age:"+age+",Average:"+mo;
  }
  public void compute(double grade)
  {
    mo=(mo+grade)/2;
  }
  //sygkrinoume 2 foithtes ws pros to mo (0 an idioi oi mo alliws epistrefei th diafora tous)
  public double compareStudent(Student stud)
  {
    double dif=mo-stud.mo;
    return dif;
  } 
}
import java.util.Scanner;
class MainProgram
{
   public static void main(String []args)
  {
   
    Student stud1=new Student("Papas",19,6.7);
    Scanner input=new Scanner(System.in);
    System.out.println("Enter student's name:");
    String name=input.next();
    System.out.println("Enter student's age:");
    int age=input.nextInt();
    System.out.println("Enter student's average grade:");
    double m=input.nextDouble();
    Student stud2=new Student(name,age,m);
    stud2.printing();
    Student stud3=new Student();
    stud3.setName("Papadopoulos");
    stud3.setMo(8.9);
    stud3.setAge(20);
    stud1.printing();
    double avg=stud1.getMo();
    if(avg>9) System.out.println("Student "+stud1.getName()+" has average grade greater than 9");
    System.out.println(stud1); --> Den emfanizei tpt an den yparxei toString()
    System.out.println(stud1.getName()+" "+stud1.getMo()+" "+stud1.getAge());
    System.out.println(stud1); -->Name:Papas,Age:19,Average:6.7
    System.out.println(stud1.toString());-->To idio me prin
    String message="Hello:"+stud1;
    stud1.compute(7.8); --> epanaypologizei to mo tou stud1
    double check=stud1.compareStudent(stud2);
  }
}

