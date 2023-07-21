package task11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q8 {

	public void m1() {
		
		String input=System.getProperty("user.dir")+"/Testing.xlsx";;
		System.out.println(input);
		try {
			FileInputStream stream=new FileInputStream(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Q8 scan=new Q8();
		scan.m1();

	}

}
