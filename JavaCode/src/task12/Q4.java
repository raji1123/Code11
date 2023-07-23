package task12;

import java.util.ArrayList;
import java.util.List;

public class Q4 {//converting list into array

	
	public void m1() {
		
		

		List <Object>obj=new ArrayList<Object>();
		
	
		
		obj.add("Name:raji");
		obj.add("Name:deepi");
		obj.add("Name:vani");
		obj.add("Name:madhu");
		
		int size=obj.size();
	//	System.out.println(obj.size());
		/*for(Object a:obj) {
			System.out.println(a);
			
		}*/
	
	String[] st=new String[size];//sorting it inside the arraylist
	
	for(int i=0;i<size;i++) {//get the list 
	
	   st[i]=(String) obj.get(i);
	}
	
	for(String X:st) {
		System.out.print(X + " ");
	}
	
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Q4 obj1=new Q4();
		obj1.m1();
	}

}
