package task11;

import java.util.Scanner;

public class Q6 {

	public void m1() throws MyOwnException {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the password");
	 String input=s.nextLine();
		
	
		
		String password="raji@1123";
		if(!password.equals(input)) {
			throw new MyOwnException("password mismatch");
			
		}
		
		System.out.println("allowed");
		
	}
	
	
	
	public static void main(String[] args) throws Exception  {
	
		Q6 s1=new Q6 ();
		s1.m1();

	}

}
