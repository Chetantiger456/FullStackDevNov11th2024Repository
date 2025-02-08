class ReverseArrayElement
{
	public static void main(String args[])
	{
		int intArray[] = {10, 20, 30, 40, 50};
		int reverseArr[] = new int[intArray.length];
		
		for(int i=intArray.length-1;i>=0;i--){
			//System.out.println(intArray[i]);
			reverseArr[intArray.length-1-i] = intArray[i];
		}
		
		for(int i=0;i<reverseArr.length;i++){
			System.out.println(reverseArr[i]);
		}
	}
}