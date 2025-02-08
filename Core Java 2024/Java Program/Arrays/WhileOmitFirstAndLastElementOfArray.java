class WhileOmitFirstAndLastElementOfArray
{
	public static void main(String args[])
	{
		int intArray[] = {10, 20, 40, 90, 120, 100};
		int i=1;
		while(i<intArray.length-1)
		{
			System.out.println(intArray[i]);
			i++;
		}
	}
}