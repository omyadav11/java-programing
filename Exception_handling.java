class Exception_handling{
	public static void main(String[] args){
		System.out.println("Program is started");
		int a=10,b=0,c;
		
		try{
			c=a/b;
			System.out.println(c);
		}
		
		catch(Exception e){
			System.out.println("mathamatical exception is occured");
		}

		System.out.println("program is over");
	}
}