package task10;

public class CircleQ3 {

	int radius=2;
	double pi=22.7;
	int result;
	public static void main(String[] args) {
		
		
		//CircleQ3 s=new CircleQ3();
		CircleQ3 s1=new CircleQ3();
		
		 s1.getter(2,22.7);
		
	}

	
	public CircleQ3() 
	
	{
		System.out.println("circumference is");
		
	}
	
	public CircleQ3(int a,double b ) 
	
	{
		radius=a;
		pi=b;
		//result=(int) (a*b);

	}
	
	public void getter(int a,double b )
	{
		result=(int) (a*b);
		System.out.println(result);
    }
	
	
	
}
	
