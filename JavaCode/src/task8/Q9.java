package task8;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// Write a program to check whether the person is a senior citizen or not. 

		Scanner s = new Scanner(System.in);      	  
		System.out.println("enter the number");
   	   int a=s.nextInt();
   	   if(a>60) {
   		System.out.println("senior citizen");
   	   }
   	   else
   		System.out.println("Not a senior citizen");
	}

	}


