class Short2DArray3rdRow
{
	public static void main(String args[])
	{
		short shortArray[][] = {{2,4,6},{7,1,9},{3,5,8}};
		
		System.out.println("Third row of 2D array:");
		for(int i=0;i<shortArray[2].length;i++)
		{
			System.out.print(shortArray[2][i]+" ");
		}
	}
}