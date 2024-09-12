import java.io.*;
	
class BufferRead{
	public static void main(String[] args){
		File f=new File("D:\\22Uai134\\Buffered_reader.txt");
		
		try{
			if(f.createNewFile()){
				System.out.println("File created successfully");
			}
			else{
				System.out.println("File already exists");
			}
			
			
			 FileReader fr=new FileReader("Buffered_reader.txt");
			  BufferedReader br=new BufferedReader(fr); 
			 int i;    
        		  while((i=br.read())!=-1){  
         		 System.out.print((char)i);  
         		 }  
        		  br.close();    
         		 fr.close();       
		}
		
		catch(IOException e){
				System.out.println("Exception occured");
		}
	}
}