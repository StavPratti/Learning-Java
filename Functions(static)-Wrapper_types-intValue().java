Functions

Pass by value
public class Example
{
  public static int addition(int a,int b)--> Oloi oi prwtogeneis typoi pernoun ws orismata me timh
  {
    int sum;
    a++;
    sum=a+b;
    return sum;
  }
  public static void main(String[] args)
 {
   int s,x=5,y=2;
   s=addition(x,y);
   //an den yphrxe to static sthn addition tha ginotan
   //Example ex=new Example();
   //s=ex.addition(x,y);
   System.out.println("Sum is "+s);
 }
}

s=Example.addition(x,y); // klhsh ths addition ektos Example (se allh klash)


Pinakes kai antikeimena klasewn ws orismata pernoun me anafora

Float f=new Float(3.2);
f=new Float(4.5);

Pass by reference mesw Wrapper class

public class Example
{
  public static Integer addition(Integer a,Integer b)
  {
    Integer sum;
    a=new Integer(a.intValue()+1); 
    sum=new Integer(a.intValue()+b.intValue());
    return sum;
  }
  public static void main(String[] args)
 {
   int x=5,y=2;
  Integer x1,y1,s;
  x1=new Integer(x);
  y1=new Integer(y);
   s=addition(x1,y1); 
   System.out.println("Sum is "+s.intValue());
   System.out.println("New x1 "+x1.intValue());
 }
}


Pinakes

Monodiastatoi pinakes

typos[] onoma=new typos[plithos stoixeiwn];

p.x  int[] pin=new int[10];

p.x int plithos=10;
    int[] pin=new int[plithos];
Enallaktika
   int pin[]=new int[10];


Diavasma stoixeiwn pinaka

import java.util.Scanner;

public class Example2
{
 
  public static void main(String[] args)
 {
   Scanner input=new Scanner(System.in);
   int plithos=input.nextInt();
   int[] pin=new int[plithos];
   for(int i=0;i<plithos;i++)
   {
     pin[i]=input.nextInt();
   }
   int sum=0;
   for(int i=0;i<plithos;i++)
   {
     sum+=pin[i];
   }
   double avg=(double)sum/plithos;
   //Enallaktika
   for(int i=0;i<pin.length;i++) ---> onomapinaka.length=> plithos stoixeiwn pinaka
   {
     pin[i]=input.nextInt();
   }
 }
}