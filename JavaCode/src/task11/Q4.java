package task11;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		{
			if(b==0) {
				throw new MyOwnException(" zero is not applicable for dividing the number");
		}
		int c;
		
		c=a/b;
		System.out.println(c);
		
		

	}

}}
