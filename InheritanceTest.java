import java.util.*;

class Person{
	String name;
	int bday;
	int bmonth;
	int byear;
	int height;
	int weight;
	
	void calculateAge(int cday,int cmonth,int cyear){
	     int calculated_date = cday - bday; 
             int calculated_month = cmonth - bmonth; 
             int calculated_year = cyear - byear; 
		System.out.println("Present Age"); 
       		 System.out.println("Years: " + calculated_year + " Months: " +calculated_month + " Days: " + calculated_date);
		System.out.println(); 
              
	}
}

class Student extends Person{
	String roll_no;
	int marks[]=new int[10];
	Scanner sc= new Scanner(System.in);	
	int sum;	
	
	void calculateAvg(){
		for(int i=1;i<=6;i++){
		System.out.println("Enter your marks of subject" +i+ " :");
		marks[i]=sc.nextInt();
		sum=sum+marks[i];
		}
		int avg=sum/6;
		System.out.println("Average marks :"+avg);
		
		
	
	}
}

class Employee extends Person{
	String empid;
	int salary;
	
	
	void calculateTax(){
		float tax = (salary * 14)/100;
		System.out.println("calculated tax= "+tax);
	
	}
}

class InheritanceTest{
	public static void main(String args[]){
	Employee E1=new Employee();
	E1.empid="22Uai134";
	E1.salary=600000;
	E1.calculateTax();
	E1.bday=13;
	E1.bmonth=6;
	E1.byear=5;
	E1.calculateAge(21,8,24);
	Student S1=new Student();
	S1.roll_no="22uai126";
	S1.calculateAvg();
	S1.height=6;
	S1.weight=60;
	System.out.println(" student height= "+S1.height);
	System.out.println(" student weight= "+S1.weight);

	}
}
	
	
	
	

 
	