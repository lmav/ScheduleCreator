import java.io.*;
public class Database {
	
	/**
	 * 
	 * @data teams
	 * @size limit 
	 */
	static void save(String data[], int size) {
		
        	
            try{    
            	FileWriter fw=new FileWriter("schedule.txt",true); 
                PrintWriter printWriter = new PrintWriter(fw);
                
                for (int j=0; j<size; j++) 
                    printWriter.print(" " + data[j]+" ");
                     
                System.out.println(" ");  
                printWriter.close(); 
                    
            }
            catch(Exception e){
            	System.out.println(e);
            }    
                System.out.println("Success...");

	}

}
