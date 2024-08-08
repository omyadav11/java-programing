import java.util.*;

class Employee{
	private String Id;
	private String name;
	private double salary;
	
	Employee(String Id,String name,double salary){
		this.Id=Id;
		this.name=name;
		this.salary=salary;
	}

	void raise_sal(){
		
		salary=salary*1.10;
	}
	String getId(){
		return Id;
	}
	String getName(){
		return name;
	}
	double getsalary(){
		return salary;
	}
}

class Constructor_c{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String Id;
		String name;
		double salary;
		System.out.println("Enter the ID of Employee :  ");
		Id=sc.nextLine();
		System.out.println("Enter name of Employee : ");
		name=sc.nextLine();
		System.out.println("Enter Salary of Employee : ");
		salary=sc.nextDouble();

		Employee E1=new Employee(Id,name,salary);
		System.out.println("ID : "+E1.getId());
		System.out.println("Name : "+E1.getName());
		System.out.println("Salary : "+E1.getsalary());
		
		E1.raise_sal();
		System.out.println("Raised Salary : "+E1.getsalary());	
		}
}	
		
		