Klash me melos pinaka

class GradeBook
{
  private String title;
  private String professor;
  private float [] grades;



  public GradeBook(String title,String professor,int elements)
  {
     this.title=title;
     this.professor=professor;
      grades=new float[elements];
  }


  public GradeBook(String title,String professor,float []gr)
  {
     this.title=title;
     this.professor=professor;
      grades=new float[gr.length];
      for(int i=0;i<gr.length;i++)
      {
         grades[i]=gr[i];
      }
  }


  public void setvalue(int index,float value)
  {
     if(index>=0 && index<grades.length)
     {
         grades[index]=value;
     }
     else System.out.println("Index out of bounds");
  }



   public float getvalue(int index)
  {
     if(index>=0 && index<grades.length)
     {
         return grades[index];
     }
     else {  System.out.println("Index out of bounds"); return -1;}
  }



  public float[] getgrades() { 
    return grades;
 }




  public void setgrades(float []array){

  grades=new float[array.length];
   for(int i=0;i<grades.length;i++)
      {
         grades[i]=array[i];
      }
  }


  private .... set kai get gia title & professor


  public String toString()
  {
     String msg="Professor:"+professor+" Title: "+title+" Grades:";
     for(int i=0;i<grades.length;i++)
      {
         msg=msg+" "+grades[i];
      }
     return msg;
  }


  public float average()
  {
     float sum=0,avg;
     for(int i=0;i<grades.length;i++)
      {
         sum=sum+grades[i];
      }
      avg=sum/grades.length;
      return avg;
   }

}


public class Example
{
   public static void main(String[] args)
   {

       GradeBook grb=new GradeBook("Papadopoulos","Introduction to Programming",50);
       Scanner input=new Scanner(System.in);
        for(int i=0;i<50;i++)
        {
           float f=input.nextFloat();
           grb.setvalue(i,f);
         }
        //Enallaktika
        float []ar=grb.getgrades();
        for(int i=0;i<50;i++)
        {
           ar[i]=input.nextFloat();
         }
        System.out.println(grb);
        float[] pin=new float[10];
        for(int i=0;i<10;i++)
        {
           pin[i]=input.nextFloat();
         }
         grb.setgrades(pin);
        GradeBook grb2=new GradeBook("Papas","Introduction to Programming II",pin);
        for(int i=0;i<pin.length;i++)
        {
           float f=input.nextFloat();
           grb2.setvalue(i,f);
         }
   }
}

Pinakes antikeimenwn

public class Student
{ 
   private int AM;
   private String name;
   private int age;
   public Student(int AM,int age,String name){....}
   public Student(){ .....}
   toString,set,get.....
  
 
}

class Example
{
     public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
         Student[] array=new Student[5]; //pinakas anaforwn
        for(int i=0;i<5;i++)
        {
           array[i]=new Student(input.nextInt(),input.nextInt(),input.nextLine());
        }
        for(int i=0;i<5;i++)  System.out.println(array[i]);
        int ilikia=array[2].getAge();
     }
}

 
Klironomikothta


   Ergazomenos --> yperklash/genikeysh
   |   |
   |   Dioikitikos symvoulos --> ekseidikeysh/ypoklash
  Pliforikarios --> ekseidikeysh/ypoklash

class Employee
{ ....
}

class Consultant extends Employee
{
}

class Developper extends Employee
{
...
}
      
