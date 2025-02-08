class FindNumberOfElementsWithOutLengthMethod
{
	public static void main(String args[])
	{
		int intArray[][] = {{3, 4, 5},{2, 5, 8},{4, 9, 7}};
		int count = 0;
		for(int array1D[]: intArray)
		{
			for(int element: array1D)
			{
				count++;
			}
		}
		System.out.println("Number of Elements in 2D Array is: "+count);
	}
}