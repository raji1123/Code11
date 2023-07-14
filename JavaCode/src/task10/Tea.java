package task10;

public class Tea {

	public static void main(String[] args) {
		// Q5 create the 3 method
		Tea s=new Tea();
		s.addmilk();
		s.addSugar();
		s.prepareTea("blacktea","ginger and water");
		s.prepareTea("green tea"," green leaves and water");
		s.prepareTea(" herbaltea "," herbal and water");

	}

	public void prepareTea(String name,String ingredients) {
	
		System.out.println(name+ " ingredients are"+ " "+ingredients);
		
		if(name!="blacktea")
		{
		addmilk();
				}
		if(name!="green tea") 
		{
		addSugar();
		}
	}
	
	
	public void addmilk() {
		System.out.println("milk");
	}
	public void addSugar() {
		System.out.println("sugar");
		
	}
	
}
