class SubractionOf2Matrix
{
	public static void main(String args[])
	{
		int firstArray[][] = {{3, 4, 5},{12, 5, 8},{7, 9, 4}};
		int secondArray[][] = {{4, 2, 1},{3, 4, 6},{5, 6, 3}};
		int newArray[][] = new int[firstArray.length][secondArray.length];
		
		if(firstArray.length == secondArray.length && firstArray[0].length == secondArray[0].length){
			for(int i=0;i<firstArray.length;i++)
			{
				for(int j=0;j<firstArray[i].length;j++)
				{
					newArray[i][j]= firstArray[i][j]-secondArray[i][j];
				}
			}
			
			for(int i=0;i<newArray.length;i++)
			{
				for(int j=0;j<newArray[i].length;j++)
				{
					System.out.print(newArray[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("2 Array does not have equal numbers of Rows and Column to Subract");
		}
	}
}