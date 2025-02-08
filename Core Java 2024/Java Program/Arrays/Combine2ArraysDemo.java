class Combine2ArraysDemo
{
	public static void main(String args[])
	{
		int firstArray[] = {12, 13, 14, 15, 16, 17};
		int secondArray[] ={10, 20, 30, 40, 50};
		
		int combinedArray[] = new int[firstArray.length+secondArray.length];
		
		// combinedArray[0] = firstArray[0];
		// combinedArray[1] = firstArray[1];
		// combinedArray[2] = firstArray[2];
		// combinedArray[3] = firstArray[3];
		// combinedArray[4] = firstArray[4];
		// combinedArray[5] = secondArray[5];
		
		// combinedArray[6] = secondArray[0];
		// combinedArray[7] = secondArray[1];
		// combinedArray[8] = secondArray[2];
		// combinedArray[9] = secondArray[3];
		// combinedArray[10] = secondArray[4];
		
		for(int i=0;i<firstArray.length;i++){
			combinedArray[i] = firstArray[i];
		}
		
		for(int i=0;i<secondArray.length;i++){
			combinedArray[firstArray.length+i] = secondArray[i];
		}
		
		for(int i=0;i<combinedArray.length;i++){
			System.out.println(combinedArray[i]);
		}
	}
}