Didiastatos pinakas

typos [][]onoma=new typos[plithos grammwn][plithos sthlwn];

p.x int [][]matrix=new int[5][7];

enallaktika int matrix[][]=new int[5][7];

Prospelash stoixeiou 

matrix[0][2]=45;

Ana grammh


public static void main(String []args)
{
 Scanner input=new Scanner(System.in);
 int [][]matrix=new int[5][7];
 for(int i=0;i<5;i++)
 {
   for(int j=0;j<7;j++)
  {
     matrix[i][j]=input.nextInt();
  }
 }
}



Ana sthlh

public static void main(String []args)
{
 Scanner input=new Scanner(System.in);
 int [][]matrix=new int[5][7];
 for(int j=0;j<7;j++)
 {
   for(int i=0;i<5;i++)
  {
     matrix[i][j]=input.nextInt();
  }
 }
}

Diagwnia prospelash


public static void main(String []args)
{
 
 int [][]matrix=new int[5][5];
 for(int i=0;i<5;i++)
 {
   for(int j=0;j<5;j++)
  {
     if(i==j) System.out.println(matrix[i][j]);
  }
 }
}

Eite (veltisth prospelash)

for(int i=0,j=0;i<5;i++,j++)
{
   System.out.println(matrix[i][j]);
}

Eite (veltisth prospelash)

for(int i=0;i<5;i++)
{
   System.out.println(matrix[i][i]);
}

Meta thn kataskeyh tou pinaka:

matrix.length=plithos grammwn

matrix[arithmosgrammhs].length= plithos sthlwn grammhs

public static void main(String []args)
{
 Scanner input=new Scanner(System.in);
 int [][]matrix=new int[5][7];
 for(int i=0;i<matrix.length;i++)
 {
   for(int j=0;j<matrix[i].length;j++)
  {
     matrix[i][j]=input.nextInt();
  }
 }
}


Ana sthlh

public static void main(String []args)
{
 Scanner input=new Scanner(System.in);
 int [][]matrix=new int[5][7];
 for(int j=0;j<matrix[0].length;j++)
 {
   for(int i=0;i<matrix.length;i++)
  {
     matrix[i][j]=input.nextInt();
  }
 }
}


Perasma pinakwn ws parametroi se function


Oloi oi pinakes pernoun me ANAFORA

Perasma monodiastatou

import java.util.Scanner;
public class MatrixExample
{

  public static void reading(int []pinakas)
  {
       Scanner input=new Scanner(System.in);
       for(int i=0;i<pinakas.length;i++)
            pinakas[i]=input.nextInt();
       
  }

  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    int plithos;
    System.out.println("Enter number of elements:");
    plithos=input.nextInt();
     int []pin=new int[plithos];
     reading(pin);
     for(int i=0;i<pinakas.length;i++)
            System.out.println(pinakas[i]);
  }
}

Example 2

public class MatrixExample
{

  public static void funct(int []pinakas)
  {
       Scanner input=new Scanner(System.in);
       int []copy=new int[pinakas.length];
       for(int i=0;i<pinakas.length;i++)
            copy[i]=pinakas[i];
       for(int i=0;i<copy.length;i++) copy[i]*=2;
      for(int i=0;i<copy.length;i++) System.out.println(copy[i]);
  }

  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    int plithos;
    System.out.println("Enter number of elements:");
    plithos=input.nextInt();
     int []pin=new int[plithos];
    for(int i=0;i<pin.length;i++)
            pin[i]=input.nextInt();
     funct(pin);
     for(int i=0;i<pin.length;i++)
            System.out.println(pin[i]);
  }
}



Perasma didiastatou

import java.util.Scanner;
public class MatrixExample2
{

  public static void reading2D(int [][]matrix)
  {
       Scanner input=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[i].length;j++)
          {
             matrix[i][j]=input.nextInt();
          }
        }
   }
       

  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    int lines,cols;
    System.out.println("Enter number of lines:");
    lines=input.nextInt();
    System.out.println("Enter number of columns:");
    cols=input.nextInt();
     int [][]pin=new int[lines][cols];
     reading2D(pin);
     for(int i=0;i<pin.length;i++)
        for(int j=0;j<pin[i].length;j++)
            System.out.println(pin[i][j]);
  }
}

Anafora pinaka monodiastatou --> dieythinsi prwtou stoixeiou pinaka kai meso prosvashs


int []a=new int[5];
int []b=new int[7];
a=b;--> a deixnei ston idio pinaka me to b
a[0]=5; --> einai idio me to b[0]
a[6]=10; --> egkyro

p.x int []a;
...
...
..
a=new int[7];


p.x ...
...
new int[7]; --> syllogh garbage collector



String --Symvoloseires


Kataskeyh String

String s1="Hello"; --> antikeimeno klashs String --> s1 anafora sto antikeimeno
String s3="Hello";
String s2=new String("Hello");
String s4=new String("Hello");

s1==s3 --> true
s1==s2 --> false
s2==s4 --> false

Synenwsh String: +

String a="Hello";
a=a+" World";

1)Diavasma apo ton xrhsth mesw Scanner
O xrhsths dinei: Good morning Athens
String l=input.next(); --> Good
l=l+" "+input.next();
l=l+" "+input.next();
System.out.println(l); -->  Good morning Athens

String l=input.nextLine(); --> Good morning Athens

Apagoreyetai l[0]...

2)Prosvash se sygkekrimenh thesh String 

String l=input.next(); --> Good
char a=l.charAt(0); --> a='G'

Diavasma enos xarakthra apo pliktrologio

System.out.println("Enter a character:");
String l=input.next();
char ch=l.charAt(0);

3)Mhkos symvoloseiras

String l=input.nextLine();
int lg=l.length(); --> plithos xarakthrwn l
int counter=0;
for(int i=0;i<l.length();i++)
{
   char ch=l.charAt(i);
   if(ch=='a') counter++;
}

4)Sygkrisi symvoloseirwn

- equals
 String l1=input.next();
 String l2=input.next();
 boolean t=l1.equals(l2);
 if(t) System.out.println("Same content!");
 else System.out.println("Not Same content!");

- compareTo

int c=l1.compareTo(l2); --> c=0 an l1 idio me l2
                            c>0 an l1>l2
                            c<0 an l1<l2




















