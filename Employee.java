import java.util.*;
class Emp_info{
	String name[]=new String[5];
	String id[]=new String[5];
	int salary[]=new int[5];
	Scanner sc=new Scanner(System.in);

	void get_info(){
		
		for(int i=0;i<5;i++){
			System.out.println("Enter your name : ");
			name[i]=sc.next();
			System.out.println("Enter your employee id : ");
			id[i]=sc.next();
			System.out.println("Enter your salary : ");
			salary[i]=sc.nextInt();
		}
		
	}
		
	void show_info(){
		
		for(int i=1;i<=5;i++){
			System.out.print("Information of employee "+i);
			System.out.println(" :");
			System.out.println(name[i]);
			System.out.println(id[i]);
			System.out.println(salary[i]);
		}
	}
}
class Employee{
	public static void main(String[] args){
		Emp_info E=new Emp_info();
		E.get_info();
		E.show_info();
	}
}