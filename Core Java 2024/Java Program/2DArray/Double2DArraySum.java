class Double2DArraySum
{
	public static void main(String args[])
	{
		double dArray[][] = {{23.78, 78.332, 89.23},{21.43, 56.778, 43.23},{83.83, 37.78, 45.28}};
		double doubleSum=0.0;
		
		for(int i=0;i<dArray.length;i++)
		{
			for(int j=0;j<dArray[i].length;j++)
			{
				doubleSum+=dArray[i][j];
			}
		}
		System.out.println("Sum of double 2D Array: "+doubleSum);
	}
}