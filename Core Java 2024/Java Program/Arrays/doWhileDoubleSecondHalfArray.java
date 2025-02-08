class doWhileDoubleSecondHalfArray
{
	public static void main(String args[])
	{
		double doubleArray[] = {12.78, 89.67, 32.89, 78.32, 56.90};
		int i =doubleArray.length/2;
		do
		{
			System.out.println(doubleArray[i]);
			i++;
		}while(i<doubleArray.length);
	}
}