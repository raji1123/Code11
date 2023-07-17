package task10;

public class BlacteasubclassQ7 {
/*7. Implement polymorphism in your program by creating an array of Tea objects that 
	includes instances of the Tea class and its subclasses. */
	
		public static void main(String[] args) {//overridding method
			BlacteasubclassQ7 s=new BlacteasubclassQ7();
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


