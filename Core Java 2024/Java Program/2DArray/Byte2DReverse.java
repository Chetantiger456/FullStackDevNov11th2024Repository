class Byte2DReverse
{
	public static void main(String args[])
	{
		byte b2DArray[][] = {{1, 3, 5}, {2, 4, 6}, {7, 9, 8}};
		
		for(int i=b2DArray.length-1;i>=0;i--)
		{
			for(int j=b2DArray[i].length-1;j>=0;j--)
			{
				System.out.print(b2DArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}