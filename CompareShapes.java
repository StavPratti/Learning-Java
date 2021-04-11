import java.util.Scanner;

public class CompareShapes {

	private String name;
	private String color;
	private float area;
	
	 public void setName(String name)
	  {
	    this.name=name;
	  }
	 
	 public String getName()
	  {
	    return name;
	  }
	 
	 public void setColor(String color)
	  {
	    this.color=color;
	  }
	 
	 public String getColor()
	  {
	    return color;
	  }
	 
	 public void setArea(float area)
	  {
	    this.area=area;
	  }
	 
	 public float getArea()
	  {
	    return area;
	  }
	 
	 public CompareShape(String name,String color,float area)
	  {
	    this.name=name;
	    this.color=color;
	    this.area=area;
	  }
	  public CompareShape()
	  {
	    name=null;
	    color=null;
	    area=0;
	  }
	  public String toString()
	  {
	    return "Name:"+name+",Color:"+color;
	  }
	  
	  public String compare(CompareShape compshape)
	  {
		  if(area>compshape.area)
			  return "Name:"+name+" Colour:"+color;
		  else
			  return "Name:"+compshape.name+" Colour:"+compshape.color;
	  }
	 
}

class MainProgram{
	
	 public static void main(String []args)
	  {
		 CompareShape compshape= new CompareShape("triangle","red",5);
		 CompareShape compshape2= new CompareShape("circle","green",4);
		 String msg=compshape.compare(compshape2);
		 
	  }
}