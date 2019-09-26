import java.io.*;
import java.util.Scanner; 
  
class Testing { 
  
    /* arr[]  ---> Input Array 
    data[] ---> Temporary array to store current combination 
    start & end ---> Staring and Ending indexes in arr[] 
    index  ---> Current index in data[] 
    r ---> Size of a combination to be printed */
	
	
static void count() {
	 		File file = new File("testout.txt"); 
		    Scanner sc;
		    int count = 0;
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) { 
						count++;
						System.out.println("");
						System.out.println("Count: " + count);
						System.out.println(sc.nextLine());}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		  
		    
} 
	
    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) 
    {
    	
        // Current combination is ready to be printed, print it 
       if (index == r) 
        { 
    	   
        	
            //for (int j=0; j<r; j++) {
            	
                try{    
                	FileWriter fw=new FileWriter("testout2.txt",true); 
                    PrintWriter printWriter = new PrintWriter(fw);
                    
                    for (int j=0; j<r; j++) {
                    
                    if(data[j] == 1 && data[j + 1] == 2)
            			//System.out.print("--( X )--" );
                    	printWriter.print("--( X )--" );
            		if(data[j] == 3 && data[j + 1] == 4)
            			//System.out.print("--( X )--" );
                		printWriter.print("--( X )--" );
            		if(data[j] == 5 && data[j + 1] == 6)
            			//System.out.print("--( X )--" );
                		printWriter.print("--( X )--" );
            		if(data[j] == 12 && data[j] - data[j - 1] == 1) 
            			//System.out.print("--( X )--" );
                		printWriter.print("--( X )--" );         		
            		if(data[j] == 10 && data[j] - data[j - 1] == 1) 
            			//System.out.print("--( X )--" );
                		printWriter.print("--( X )--" );
            		if(data[j] == 8 && data[j] - data[j - 1] == 1) 
            			//System.out.print("--( X )--" );
                		printWriter.print("--( X )--" ); 

            		 
            		else
            			//System.out.print( data[j]+" " ); 
                        printWriter.print(" " + data[j]+" ");
                         
                    }
                    System.out.println(" ");  
                    
                    //fw.close();
                    printWriter.println( "");
                    printWriter.close(); 
                        
                   }catch(Exception e){System.out.println(e);}    
                   System.out.println("Success...");   
                   


            		
            	
            	
            	//System.out.print(data[j]+" " );
         //   }
           // System.out.println(" ");        
        
            return; 
        } 
  
        // replace index with all possible elements. The condition 
        // "end-i+1 >= r-index" makes sure that including one element 
        // at index will make a combination with remaining elements 
        // at remaining positions 
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
 
                data[index] = arr[i]; 
                combinationUtil(arr, data, i+1, end, index+1, r);        		
 
        	
        } 
        
    } 
  
    // The main function that prints all combinations of size r 
    // in arr[] of size n. This function mainly uses combinationUtil() 
    static void printCombination(int arr[], int n, int r) 
    { 
        // A temporary array to store all combination one by one 
        int data[]=new int[r]; 
  
        // Print all combination using temprary array 'data[]' 
        combinationUtil(arr, data, 0, n-1, 0, r); 
    } 
  

} 