package task12;

import java.util.Map;
import java.util.TreeMap;

public class Q3 {

	public void m1() {
	
		Map<Integer,Object> m=new TreeMap<Integer,Object>();
	
		m.put(1, "id=001 employee name:abi ");
		m.put(2, "id =002 employee name:deepi" );
		m.put(3, "id =004 employee name:raji");
		m.put(4, "id =004 employee name:vani");
		
	
		for(Map.Entry<Integer,Object> r:m.entrySet()){
			System.out.print(r);
		}

	
	}
	public static void main(String[] args) {
		
		Q3 obj1=new Q3();
		obj1.m1();
	}

}
