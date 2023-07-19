package task11;

public class Q5 {

	public void m1() {
		
		int a[]=new int[2];
		try	
		{
		a[0]=1;
		a[1]=1;
		a[2]=1;
	
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	
	}
	
	public void m2() {
		String s="abi";
		try {
		s.charAt(4);
		String substring=s.substring(0, 3);
		
		System.out.println(substring);
		}catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
		
	}
	
	
	
	public static void main(String[] args) {
	
		 Q5 s=new  Q5();
		s.m1();
		 s.m2();
	}

}
