package task10;

public class EmployeeQ2 {
  
	int id;
	String name;
	int salary;
	int anualsalary;
	int raisesalary;
	
	public void employedetails(int a,String b, int c,int d,int f) {
		
		int id=a;
		String name=b;
		int salary=c;
        int anualsalary=d;
        int raisesalary=f;
	}
	public int getid(int a) {
		int id=a;
		return id;
		
	}
	
	public String getname(String b) {
	
		String name=b;
		
		return name;
	}
	
	
	public void setsalary(int c) {
		int salary=c;

	}
	
	
	
	public int getsalary(int c) {
		salary= c;
		return salary;
		
	}
	
	public int anualsalary(int d) {
		int anualsalary=d;
		int result=salary*12;
		return result;
		
	}
	
	public int raisesalary(int f) {
		int raisesalary =f;
		int result=(salary*20/100);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		
		EmployeeQ2 s=new EmployeeQ2 ();
		System.out.println("EMPLOYEE DETAIL-1");
		System.out.println(s.getid(11));
		System.out.println(s.getname("raji"));
		System.out.println(s.getsalary(25000));
		System.out.println(s.anualsalary(120000));
		System.out.println(s.raisesalary(25000));
		

	}

}
