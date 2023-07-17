package task10;
/*Create three subclasses of the Tea class: BlackTea, GreenTea, and HerbalTea. Each 
subclass should override the prepareTea() method to prepare the specific type of tea 
(black tea, green tea, or herbal tea) with appropriate ingredients and brewing times. */

public class GreenTea extends BlackTea{

	public static void main(String[] args) {
	
		
	System.out.println("---- ");
	
	
	BlackTea s2=new GreenTea ();
	s2.color();

	s2.preparetea();
	s2.ingredients();
		
	}

	
	void preparetea (){
		System.out.println(" Green tea ");
	}
	
	void ingredients () {
		System.out.println(" green leafs and sugar-brewing time-10 minutes ");
		
	}
    
	
	
	
	
	
}