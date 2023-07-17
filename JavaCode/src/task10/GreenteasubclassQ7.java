package task10;
/*7. Implement polymorphism in your program by creating an array of Tea objects that 
includes instances of the Tea class and its subclasses. */
public class GreenteasubclassQ7 extends BlacteasubclassQ7{

	
		public static void main(String[] args) {
			BlacteasubclassQ7 s=new GreenteasubclassQ7() ;
				
			System.out.println("---- ");
			
			
			s.ingredients();
			s.color();
			s.preparetea();
			
			
			
				
			}

			
			void preparetea (){
				System.out.println(" Green tea ");
			}
			
			
			
			
			
	}


