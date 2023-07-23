package task10;

public class CircleQ3 {

	double radius;
	final double pi=3.14159;
	
	public static void main(String[] args) {
	
		
		CircleQ3 c1=new CircleQ3();
		CircleQ3 c2=new CircleQ3(3.5);
		
		System.out.println("area of the circle with circle one "+c1.getarea());
		System.out.println("area of the circle with circle two "+c2.getarea());
		c2.setradius(1.5);
		System.out.println("area of the circle with circle two "+c2.getarea());
	}

	
	public CircleQ3() 
	
	{
		radius=0.0;
		
	}
	
	public CircleQ3( double radius) 
	
	{
		this. radius=radius;
	}
	
	public void setradius(double radius) {
		
		this. radius=radius;
	}
	
   public double getradius() {
		return radius;
		
	}
	
     public double getarea() {
	  
	  return pi*radius*radius;
     }
	
}
	
