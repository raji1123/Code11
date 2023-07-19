package task11;

import java.util.Scanner;

public class Q7 {

	public void m1() throws MyOwnException {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the age");
	     int age=s.nextInt();
	     if(age<18) {
	    	 throw new MyOwnException(" age should greater then 18");
	    	 
	     }
	     
	    // Thread.sleep(2000);
		System.out.println(age);
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
	
		Q7 s1=new Q7 ();
		s1.m1();

	}

}
