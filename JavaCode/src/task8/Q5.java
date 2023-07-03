package task8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		{
			//Write a program to check if a number is prime or not. 
			   Scanner s = new Scanner(System.in);
	      	  System.out.println("enter the number");
	      	   int num=s.nextInt();
	      	   int count = 0;
	      	 //  num=20;
	      	   if(num>1) {
	      		   for(int i=1;i<=num;i++) {
	      			   if(num%i==0) 
	      				   count++;
	      				   
	      			   }
	      			   if(count==2)
	      			   {
	      				   System.out.println("prime number");
	      				  
	      			   }
	      			   else
	      			 {
	      				   System.out.println("Not aprime number");
	      				   
	      			   }
	}}}

	}


