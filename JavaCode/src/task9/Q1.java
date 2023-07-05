package task9;

public class Q1 {

	public static void main(String[] args) {
		String s1="true";
	    String reverse="";
	    int length=s1.length();
	    for (int i=length-1;i>=0;i--)
	    {
	    reverse=reverse+s1.charAt(i);
	    }
	    System.out.println(reverse);
        
        if(s1.equalsIgnoreCase(reverse)) {
        	
        System.out.println("palindrom");
        }
        
        else
        	  System.out.println("Not a palindrom");
}

	}


