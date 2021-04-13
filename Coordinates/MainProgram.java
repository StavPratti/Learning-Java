import java.util.Scanner;

public class MainProgram {
	
	public static void main(String[] args)
    {
		 System.out.println("How many points do you want?");
		 Scanner input=new Scanner(System.in); 	
		 int z=input.nextInt();
		 EykleidiaApostash [] shmeio= new EykleidiaApostash[z];
		 System.out.println("Please fill the points");
		 for(int i=0; i<z; i++)
	        {
	           shmeio[i]=new EykleidiaApostash(input.nextFloat(),input.nextFloat());
	        }
	      
		/* for(int i=0;i<z;i++) {
			System.out.println(shmeio[i]);
	     } */
		
		 System.out.println("Give a distance");
		 float d=input.nextFloat();
		 
		 float max=d;
		 for(int i=0; i<z-1; i++) {
		    for(int j=i+1; j<z; j++) {
			 if(shmeio[i].calculateDistance(shmeio[j]) < max) {
			 System.out.printf("%f\t%f points have smaller distance!",shmeio[i],(shmeio[j]));
			 }
		 }
		 
		 }	 
    }
		 
}
