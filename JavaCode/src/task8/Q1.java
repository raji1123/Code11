package task8;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*Write a Java program that declares four integer variables: a, b, c, and d. Then, write an if 
			statement that checks whether the sum of a and b is greater than the sum of c and d. If the 
			condition is tme, the program should output a message indicating that the sum of a and b 
			is greater than the sum of c and d.*/

			 {
				   Scanner s = new Scanner(System.in);
		           System.out.println("enter a,b,c and d");
		           int a=s.nextInt();
		           int b=s.nextInt();
		           int c=s.nextInt();
		           int d=s.nextInt();

		           int sum1=a+b;
		           int sum2=c+d;
		           if(sum1>sum2)
		           {  System.out.println("sum of a and b is greater than the sum of c and d. ");
		           
		           }
		           if(sum1<sum2)
		{  System.out.println("sum of c and d is greater than the sum of a and b. ");
		           
		           }
		
	}

}
