class DoWhileOmitFirstAndLastArrayDemo
{
	public static void main(String args[])
	{
		int intArray[] = {20, 49, 59, 10, 39, 89};
		
		int i=1;
		do
		{
			System.out.println(intArray[i]);
			i++;
		}while(i<intArray.length-1);
	}
}