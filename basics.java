Eyrytero pros to stenotero

double>float>long>int>short>=char>byte


Ektypwsh sthn othonh

1)System.out.printf("Hello World\n");

int x=5;

System.out.printf("Value is %d\n",x);

2)System.out.println("Value is "+x); --> Othonh: Value is 5

p.x String s="Hello";

System.out.println(s+" World");
System.out.printf("%s World\n",s);

p.x2 int x=5,y=2;

System.out.printf("Sum is %d\n",x+y); --> Othonh: Sum is 7

System.out.println("Sum is"+x+y); --> Othonh: Sum is 52

System.out.println("Sum is"+(x+y)); --> Othonh: Sum is 7


3)System.out.print("Hello World\n");

java.lang -> apeutheias diathesimo sto programma
Vasiko programma

public class FirstProgram
{
  public static void main(String[] args)
  {
     int x=5,y=2;
     int sum;
     sum=x+y;
     System.out.println("Sum: "+sum);
  }
  
}

Diavasma apo ton xrhsth(Scanner)

import java.util.Scanner; //pio genika import java.util.*;

public class Reading
{
   public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter a number:");
    int x=input.nextInt();
    double x1=input.nextDouble();
    float z=input.nextFloat();
    //Den yparxei nextChar
    //Gia xarakthres
   String l=input.next(); --> An dwsei o xrhsths Hello World to l="Hello"
   String line=input.nextLine(); --> diavazei ta panta mexri allagh grammhs
   System.out.println("User entered: "+line);
   //enallaktika gia th String
   String l=new String(input.next()); --> An dwsei o xrhsths Hello World to l="Hello"
   String line=new String(input.nextLine()); --> diavazei ta panta mexri allagh grammhs
   System.out.println("User entered: "+line);
  }
}