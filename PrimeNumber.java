import java.util.Scanner;

public class PrimeNumber {
	
	 public static void main(String[] args)
	  {
        
		 Scanner input = new Scanner(System.in);
		 int a=0;
		 
         System.out.print("Enter a number greater than 1 or else to exit: ");		
	     a = input.nextInt(); 
		 
	  while(a>1)
	  {
		  if(a==2)
		  {
			  System.out.print(a + " is a prime number! ");
		  }
		  else
		  {
			  int i;
			  for(i=2;i<a;i++)
			  {
				  if(a%i==0) break;
			  }
			  if(i<a) System.out.println(a+" is not prime!");
			  else System.out.println(a+" is prime!");
			  /*
			    int i,flag;
				flag=1;
			  for(i=2;i<a;i++)
			  {
				  if(a%i==0){
					  flag=0;
					  break;
				  }
			  }
			  if(flag==0) System.out.println(a+" is not prime!");
			  else System.out.println(a+" is prime!");
			  
			  */
		  }
		  System.out.print("Enter a number greater than 1 or else to exit: ");		
	      a = input.nextInt(); 
	  }
				 
	  }  

}
