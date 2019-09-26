class Schedule{
	
	/**
	 * @start keep track of the position in the old array
	 * @end the length of the old array , to make sure there's no exceptionOutOfBounds
	 * @index to keep track of elements entered inside the new array
	 * @newArray
	 * @oldArray
	 * @2 number combination, to get  TeamA vs TeamB,
	 *  
	 */
	 static void printSchedule(int start, int end, int index, String newArray[],String oldArray[]) {
		
		 
		 if(index == 2){

			Database.save(newArray, 2);
			return;
		}
		
		for(int i=start; i <= end && end-i+1 >= 2 - index; i++){
			
			newArray[index] = oldArray[i];
			
			printSchedule(i+1,end,index+1,newArray,oldArray);
			
		}
		
		
		
	}
	
	/**
	 * @data all Teams in the league
	 */
	static void ScheduleFinder(String data[]) {
		String comboFound[] = new String[2];
		
		int size = data.length -1;
		
		printSchedule(0, size,0,comboFound,data);
	}
	
	
	
}