package task10;

public class AccountQ4 {

  double withdraw;
  double deposit;
double bankbalance=1000;
		
		public static void main(String[] args) {
			AccountQ4 Ac1=new AccountQ4();
			AccountQ4 Ac2=new AccountQ4(200);
			System.out.println("After withdrawal"  +" "+Ac1.withdraw());
			System.out.println("After deposit"+" "+ Ac1.deposit(900));
			//System.out.println(Ac2.withdraw());
			
			/*System.out.println(Ac1.deposit(200, 800));
			System.out.println(Ac2.deposit(500, 800))*/;
			
	
		}

		
		public AccountQ4() {
			withdraw=100;
			deposit=1000;
		}
		
		
        public AccountQ4(double withdraw) {
			
        	this.withdraw=withdraw;
        	
        	
		}
		
        public double withdraw() {
        	
        double afterwithdrawal=	bankbalance-withdraw;
        
        	return afterwithdrawal;
        	
        	
        }
      
        
        
        
        public double deposit(double afterwithdrawal) {
        	
            double afterdeposit=	afterwithdrawal+deposit;
            
            	return afterdeposit;
            	
            	
            }
        
        
        
}	
