package task10;
/*Create three subclasses of the Tea class: BlackTea, GreenTea, and HerbalTea. Each 
subclass should override the prepareTea() method to prepare the specific type of tea 
(black tea, green tea, or herbal tea) with appropriate ingredients and brewing times. */

public class GreenTea extends BlackTea{

	public static void main(String[] args) {
	GreenTea s=new GreenTea ();
	s.preparetea();
	s.ingredients();
		
	System.out.println("---- ");
	
	
	BlackTea s2=new GreenTea ();
	
	
	
	s2.preparetea();
	
		
	}

	
	void preparetea (){
		System.out.println(" Green tea ");
	}
	
	void ingredients () {
		System.out.println(" green leafs and sugar-brewing time-10 minutes ");
		
	}
void color() {
		
		
		System.out.println(" greencolor ");
	}
	
	
	
	
	
}