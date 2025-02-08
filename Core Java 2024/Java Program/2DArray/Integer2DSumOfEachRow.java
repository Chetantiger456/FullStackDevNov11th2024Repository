class Integer2DSumOfEachRow
{
	public static void main(String args[])
	{
		int intArray[][] = {{3, 4, 5},{2, 5, 8},{4, 9, 7}};
		int int1D[] = new int[intArray.length];
		
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=0;j<intArray[i].length;j++)
			{
				int1D[i]+=intArray[i][j];
			}
		}
		for(int i=0;i<int1D.length;i++)
		{
			System.out.println("Sum of "+(i+1)+" row: "+int1D[i]);
		}
	}
}