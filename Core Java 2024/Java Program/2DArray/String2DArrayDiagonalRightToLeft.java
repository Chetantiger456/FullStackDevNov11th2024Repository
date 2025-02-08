class String2DArrayDiagonalRightToLeft
{
	public static void main(String args[])
	{
		String strArray[][]={{"Hi","How", "Hello"},{"Developer", "Designer", "Tester"},{"Blue","Green","Red"}};
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=0;j<strArray[i].length;j++)
			{
				if(i+j==strArray.length-1)
				{
					System.out.print(strArray[i][j]+" ");
				}else{
					System.out.print("      ");
				}
			}
			System.out.println();
		}
	}
}