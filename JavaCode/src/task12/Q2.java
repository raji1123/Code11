package task12;

import java.util.*;
import java.util.List;

public class Q2 {

	
	public void m1() {
		
		

		List <String>obj=new ArrayList<String> ();
		
		obj.add("Name:Abi");
		
		obj.add("Name:raji");
		obj.add("Name:deepi");
		obj.add("Name:vani");
		obj.add("Name:madhu");
		
		obj.removeAll(obj);
		
		for(String a:obj) {
			System.out.println(a);
			
		}
		
	
		

		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Q2 obj1=new Q2();
		obj1.m1();
		

	

}
}