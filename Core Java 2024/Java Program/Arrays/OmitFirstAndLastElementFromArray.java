class OmitFirstAndLastElementFromArray
{
	public static void main(String args[])
	{
		int intArray[] = {20,40,60,80,100,120};
		for(int i=1;i<intArray.length-1;i++)
		{
			System.out.println(intArray[i]);
		}
	}
}