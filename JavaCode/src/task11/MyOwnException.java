package task11;

public class MyOwnException extends Exception{

	public MyOwnException (String s){
		super(s);
		System.out.println("Own Exception");	
	}

}
