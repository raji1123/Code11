package task10;

public class AccountQ4 {

	
		int balance;
		int withdrwal;
		int deposit;
		
		public static void main(String[] args) {
			
			
			//CircleQ3 s=new CircleQ3();
			AccountQ4 s1=new AccountQ4();
			
			s1.withdraw(1000,500);
			s1.deposit(500);
			
		}

		
		public AccountQ4()
		
		{
			System.out.println("balance amount is");
		
			
			
		}
		
		public AccountQ4(int a,int b,int d)
		{
			balance=a;
			withdrwal=b;
			deposit=d;

		}
		
		public void withdraw(int a,int b)
		{
		int result=a-b;
		System.out.println("After withdrawal "+result);
		
	    }
		
		public void deposit(int d) {
			
	        int result = 0;
			deposit= result+d;
			System.out.println("After deposit "+deposit);
		
	}

}
