package task10;

public class BlackTea {/*Q6Create three subclasses of the Tea class: BlackTea, GreenTea, and HerbalTea. Each 
	subclass should override the prepareTea() method to prepare the specific type of tea 
	(black tea, green tea, or herbal tea) with appropriate ingredients and brewing times. */



	public static void main(String[] args) {
		BlackTea s=new BlackTea();
		s.preparetea();
		s.ingredients();
		s.color();
		
	}

	
	void preparetea (){
		System.out.println(" black tea ");
	}
	
	void ingredients () {
		System.out.println(" water and sugar-brewing time-15 minutes ");
		
	}
	void color() {
		
		
		System.out.println(" blackcolor ");
	}
	
	
	
	
	
	
}
