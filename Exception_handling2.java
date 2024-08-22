import java.util.*;
class Exception_handling2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program is started");
		int arr[]=new int[10];
		int b,c;
		System.out.println("Enter the elements");
		for(int i=1;i<=5;i++){
			
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the divisor: ");
		b=sc.nextInt();
		System.out.println();
		for(int i=1;i<=5;i++){
			try{
				c=arr[i]/b;
				System.out.println("Answer= "+c);
			}	
			catch(Exception e){
				System.out.println("mathematical exception occured");
			}
		}
		System.out.println("program is completed");		
}
}