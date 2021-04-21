Abstract class

abstract class Shape
{
  protected String name;
  protected double area;
  public Shape(String name){ this.name=name;}
  //set&get
  public void bla()
  {
     System.out.println("Bla bla");
  }
  public abstract void calculatearea();
}

public class Square extends Shape
{
   private double side;
   public Square(double side)
  {
     super("square");
     this.side=side;
  }
  //set&get
  public void calculatearea(){
   area=side*side;
 }
}

public class ColouredSquare extends Square
{
   private String color;
   public ColouredSquare(double side, String color)
  {
     super(side);
     this.color=color;
  }
  //set&get
  public void calculatearea(){ ///thn ylopoiw proairetika
   area=side*side;
 }
}


public class Rectangle extends Shape
{
   private double mikos,platos;
   public Rectangle(double mikos,double platos)
  {
     super("rectangle");
     this.mikos=mikos;
     this.platos=platos;
  }
  //set&get
  public void calculatearea(){
   area=mikos*platos;
 }
}
