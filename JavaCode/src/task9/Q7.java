package task9;

public class Q7 {

	public static void main(String[] args) {
		// GRADING SYSTEM
		int mark;
		mark=80;
		
		
		if(mark==100) {
			System.out.println("Grade S");
		}
		
		if(mark>=90&&mark<=99){
			System.out.println("Grade A");
			
		}
		if(mark>=80&&mark<=89) {
			System.out.println("Grade B");
		
	      }
		if(mark>=70&&mark<=79) {
			System.out.println("Grade C");
		
	      }
		if(mark>=60&&mark<=69) {
			System.out.println("Grade D");
		
	      }
		if(mark>=50&&mark<=59) {
			System.out.println("Grade E");}
			
			else
				if(mark<50) {
				System.out.println("Grade F and need to improve");
	      }

	}

}
