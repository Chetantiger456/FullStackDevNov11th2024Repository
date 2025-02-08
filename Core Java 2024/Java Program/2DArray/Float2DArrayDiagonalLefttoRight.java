class Float2DArrayDiagonalLefttoRight
{
	public static void main(String args[])
	{
		float fArray[][] = {{12.23f, 42.33f, 67.32f}, {90.32f, 76.32f, 45.12f}, {56.32f,34.78f,63.34f}};
		
		for(int i=0;i<fArray.length;i++){
			for(int j=0;j<fArray[i].length;j++)
			{
				if(i==j)
				{
					System.out.print(fArray[i][j]+" ");
				}else{
					System.out.print("      ");
				}
			}
			System.out.println();
		}
	}
}