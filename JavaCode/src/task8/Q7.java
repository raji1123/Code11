package task8;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// Write a program to print the length of the given string . 

		Scanner s = new Scanner(System.in);      	  
		System.out.println("enter the string");
String name=s.next();
String op="";
int result;
for(int i=1;i<=name.length();i++) {
	char ch=name.charAt(i);
	

if(!Character.isWhitespace(ch)) {
   op +=  ch;
   

	}}
System.out.println(op);

}}
