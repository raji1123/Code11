package task10;

public class Q7Polymorphism {//method overloading is acheived through polymorphism


	
	void preparetea(String n,String ig,int bt) {
		
		System.out.println("black tea is prepared using ginger and water with 10-15 mintutes");
		
	}
	
	
	void preparetea(int bt,String n,String ig) {
		
		System.out.println("green tea  is prepared using green leaf and water with 10-15 mintutes");
	}
	
	
	
	public static void main(String[] args) {
		
		Q7Polymorphism s= new Q7Polymorphism();
		s.preparetea("blacktea", "ginger" ,10);
		s.preparetea(10-15,"greentea", " greenleaf");

	}

}
