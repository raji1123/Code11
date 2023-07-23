package task10;

public class PersonQ1 {


String name;
int age;
	public static void main(String[] args) {
		
		PersonQ1 s=new PersonQ1("abi",23);
		s.main();
		PersonQ1 s1=new PersonQ1("deepi",23);
		s1.main();
		
	}

	public PersonQ1(String s,int i ) {
		//System.out.println("St");//setter
		
		name=s;
		age=i;
		
		
	}
	public void main() {///getter
		
		System.out.println(name);
		System.out.println(age);
	
}
}