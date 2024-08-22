import java.util.*;
class sc{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
	 	int a,b,sum,mul;
		System.out.println("Enter first element : ");
		a=sc.nextInt();
		System.out.println("Enter second element : ");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum : "+sum);
		mul=a*b;
		System.out.println("Multiplication : "+mul);
		int sub=a-b;
		System.out.println("Substraction : "+sub);
		float div=a/b;
		System.out.println("Division : "+div);
	}
}
		