package task8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Write a program to print the factorial of a given number. 

				Scanner s = new Scanner(System.in);      	  
				System.out.println("enter the number");
		   	   int n=s.nextInt();
		   	   int fac=1;
		for(int i=1;i<=n;i++) {
			
			fac=fac*i;//1=1*1/2*1/3*2/6*4
			
			
			
		}
		System.out.println(fac);

			}

		

	}


