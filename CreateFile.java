import java.io.*;
import java.util.Scanner;  

class CreateFile{
	public static void main(String[] args){
		File f=new File("D:\\22Uai134\\File_handling.txt");

		try{
			if(f.createNewFile()){
				System.out.println("File is created");
			}
			else{
				System.out.println("File already exists");
			}
			 FileWriter fw = new FileWriter("File_handling.txt");  
			fw.write("HELLO I AM MIGHTY RAJUUU");
			fw.close();

			 Scanner dataReader = new Scanner(f);  
            		while (dataReader.hasNextLine()) {  
               		 String fileData = dataReader.nextLine();  
                	System.out.println(fileData);  
            }  
            dataReader.close(); 
		}

		catch(IOException e){
			System.out.println("Exception occured");
		}
	}
}
			
		