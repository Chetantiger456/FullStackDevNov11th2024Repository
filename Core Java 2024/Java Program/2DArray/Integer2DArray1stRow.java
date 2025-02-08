class Integer2DArray1stRow
{
	public static void main(String args[])
	{
		int intArray[][]= {{4,1,9},{7,8,2},{3,5,6}};
		
		System.out.println("First row of 2D Array:");
		for(int i=0;i<intArray[0].length;i++)
		{
			System.out.print(intArray[0][i]+" ");
		}
	}
}