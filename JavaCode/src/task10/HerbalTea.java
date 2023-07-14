package task10;

public class HerbalTea extends GreenTea{
	/*Create three subclasses of the Tea class: BlackTea, GreenTea, and HerbalTea. Each 
	subclass should override the prepareTea() method to prepare the specific type of tea 
	(black tea, green tea, or herbal tea) with appropriate ingredients and brewing times. */

	
	public static void main(String[] args) {
		HerbalTea s1=new HerbalTea();
		s1.ingredients();
		s1.preparetea();
		System.out.println("---- ");
		GreenTea s2=new HerbalTea ();
		s2.preparetea();
		
	}
	
	
	void preparetea (){
		System.out.println(" Herbal tea ");
	}
	
	void ingredients () {
		System.out.println(" Herbal leafs and sugar-brewing time-10 minutes ");
		
	}

}
