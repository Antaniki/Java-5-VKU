package ex5_2;

public class Cylinder { 
	   private double height;  
	   private Circle base;
	   
	   // Constructor
	   public Cylinder() {
	      base = new Circle();      
	      height = 1.0; 
	   }
	   
	   public Cylinder(double height) {
	      base = new Circle();    
	      this.height = height;
	   }
	   
	   public Cylinder(double radius, double height) {
	      base = new Circle(radius);
	      this.height = height;
	   }
	   
	   // A public method for retrieving the height
	   public double getHeight() {
	      return height; 
	   }
	  
	   // A public method for computing the volume of cylinder
	   //  use superclass method getArea() to get the base area
	   public double getVolume() {
	      return base.getArea()*height; 
	   }
	   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cylnder[base-radius="+base.getRadius()+", heigth="+height+"]";
	}
	}