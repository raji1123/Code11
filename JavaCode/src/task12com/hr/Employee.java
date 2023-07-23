package task12com.hr;

public class Employee {
	double salary;
	String name;
	
	public Employee(double salary,String name){
		 this.salary=salary;
		this.name=name;
	}
	

	
	public void printname() 
	{
		
		System.out.println(name);
		
	}
	
	
	
    public void printsalary() 
    {
    	System.out.println(salary);
	}
	

}



