import java.util.*;
class Matrix{
	
		int A[][]=new int[2][2];
		int B[][]=new int[2][2];
		Scanner sc= new Scanner(System.in);

		void getarray(){
			System.out.println("enter the array elements");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					
					A[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter the array2 elements");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					
					B[i][j]=sc.nextInt();
				}
			}
			System.out.println("the array1 elements");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					System.out.print(A[i][j]+" ");
					
				}
				System.out.println();
			}
			System.out.println("the array2 elements");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					System.out.print(B[i][j]+" ");
					
				}
				System.out.println();
			}
		}

		void add(){
			System.out.println("addition : ");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					int c=A[i][j]+B[i][j];
					System.out.print(c+"  ");
					

				}
				System.out.println();
			}
		}

		void sub(){
			System.out.println("substraction : ");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					int d=A[i][j]-B[i][j];
					
					System.out.print(d+" ");
					

				}
				System.out.println();
			}
		}

		void mul(){
			int C[][]=new int[2][2];
			System.out.println("multiplition : ");
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					for(int k=0;k<2;k++){
						C[i][j]+=A[i][k]*B[k][j];
					}
					System.out.print(C[i][j]+" ");
					
					
				}
				System.out.println();
				
			}
		}
}

class Matrix1{
	public static void main(String[] args){
		Matrix M=new Matrix();
		M.getarray();
		M.add();
		M.sub();
		M.mul();
}
}

			