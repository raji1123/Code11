package task9;

import java.util.Scanner;

public class Q6 {//use switch statement

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("enter the month ,days and rent");
        int month =s.nextInt();
        int days =s.nextInt();
		float rent=s.nextFloat();
		
		
		
		switch(month) {
		case 1: System.out.println(rent=rent*days);
			break;
			
		case 2:  System.out.println(rent=rent*days);
			break;
	
        case 3: 
		    
			System.out.println(rent=rent*days);
		break;
		
		case 5:
			System.out.println(rent=(rent+300)*days);
		break;
		
		case 6:
			System.out.println(rent=(rent+300)*days);
		break;
		
		case 7:
			System.out.println(rent=rent*days);
		break;
		case 8:
			System.out.println(rent=rent*days);
		break;
		case 9:
			System.out.println(rent=rent*days);
		break;
		
		case 10:
			System.out.println((rent=rent*days));
		break;
		
		
		case 11:
			System.out.println(rent=(rent+300)*days);
		break;
		
		case 12:
			System.out.println(rent=(rent+300)*days);
		break;

		default:
		    System.out.println("Looking forward to the Weekend");

	}

}}
