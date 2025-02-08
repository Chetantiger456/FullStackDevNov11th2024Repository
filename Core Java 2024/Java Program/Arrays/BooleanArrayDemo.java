class BooleanArrayDemo
{
	public static void main(String args[])
	{
		boolean boolArray[] = {true, false, false, true, true};
		
		for(int i=0;i<boolArray.length;i++){
			System.out.println(boolArray[i]);
		}
		
		System.out.println("\nReverse Order:");
		for(int i=boolArray.length-1;i>=0;i--){
			System.out.println(boolArray[i]);
		}
	}
}