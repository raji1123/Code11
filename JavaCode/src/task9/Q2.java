package task9;

import java.util.Scanner;

public class Q2 {//convert the string into reversed string

	public static void main(String[] args) {
	
			Scanner s = new Scanner(System.in);
		    System.out.println("enter the string name");
	         String s1=s.nextLine();

		    String reverse=" ";
		    int length=s1.length();
		    for (int i=length-1;i>=0;i--)
		    {
		    reverse=reverse+s1.charAt(i);
		    }
	        System.out.println(reverse);
	        
	        
	        
	       
		
		
	}

}
