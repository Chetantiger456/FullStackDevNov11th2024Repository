class WhileDoubleSecondHalfArray
{
	public static void main(String args[])
	{
		double doubleArray[] = {13.443, 34.898, 78.676, 98.90, 78.90};
		
		int i= doubleArray.length/2;
		while(i<doubleArray.length)
		{
			System.out.println(doubleArray[i]);
			i++;
		}
	}
}