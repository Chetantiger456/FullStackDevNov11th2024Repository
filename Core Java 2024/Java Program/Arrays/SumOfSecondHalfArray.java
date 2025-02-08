class SumOfSecondHalfArray
{
	public static void main(String args[])
	{
		double dArray[] = {23.43, 89.32, 90.43,78.32,89.12,67.78,54.89};
		double dsum = 0.0;
		
		for(int i=dArray.length/2;i<dArray.length;i++)
		{
			dsum+= dArray[i];
		}
		System.out.println("Sum of Second half of the array is:"+dsum);
	}
}