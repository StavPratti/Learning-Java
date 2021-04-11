import java.util.Scanner;

public class CalculateAverage {
	

    public static float reading2D (int [][] array)
	  {     
    	    int sum=0;
    	    float avg=0;
	        for(int i=0;i<array.length;i++)
	        {
	        	for(int j=0;j<array[i].length;j++)
	            {
	          int min= array[i][0];
	          if(array[i][j]<min) {
	        	  array[i][j]=min;
	          }
	          sum+=min;          
	            }
	        	
	        }
	        
	        avg=(float)sum/array.length;
	        return  avg;
	   }

	public static void main(String[] args) {

		    Scanner input=new Scanner(System.in);
		    int lines,cols;
		    System.out.println("Enter number of lines:");
		    lines=input.nextInt();
		    System.out.println("Enter number of columns:");
		    cols=input.nextInt();
		     int [][]array=new int[lines][cols];
		     System.out.println("Fill the array:");
		     for(int i=0;i<array.length;i++) {
		        for(int j=0;j<array[i].length;j++) {
		        	array[i][j]=input.nextInt(); 
		        }
		     }
		     //double res= reading2D(array);
		     System.out.printf("The average of the array is:%f\n",reading2D(array));
 }
}