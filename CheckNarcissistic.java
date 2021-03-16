import java.util.Scanner;

public class CheckNarcissistic {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 int a = 0;
		 int b = 0;
		 
		 do{
			 
			 System.out.print("Press 0 to test if an integer is narcissistic or press -1 to exit: ");		
			 a = input.nextInt(); 
			
			 if(a == 0) {
				 System.out.print("Now give an integer: ");
				 b = input.nextInt();		
                 
				
				
				 int pil,ypol,dig,sum,power;
				 dig=0;
				 pil=b;
				
				while(pil!=0)
				 {
					 pil=pil/10;
					 dig++;
				 }
				  sum=0;
				  pil=b; 
				  
				 while(pil!=0)
				 {
					 ypol=pil%10;
					 power=1;
					 for(int i=1;i<=dig;i++){
					    power=power*ypol;
					 }
					sum=sum+power;
					pil=pil/10;
					 
				 }
				 
				 if(sum==b) System.out.println(b+" is narcissistic!");
				 else  System.out.println(b+" is not narcissistic!");
				 
				 
				 
			 }
			 
	     else if(a==-1) {
		 System.out.println("Thank you! ");
		 break;
	 } 
	
	else {
		 System.out.print("Try again! ");
	 }	
	 

         } while(true);

}
	
}