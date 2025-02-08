class Char2DArrayConcatStoreIn1D
{
	public static void main(String args[])
	{
		char chArray[][] = {{'c', 'g', 't'}, {'q', 'f', 'l'}, {'a', 'w', 'r'}};
		String strArray[] = new String[chArray.length];
		
		for(int i=0;i<chArray.length;i++)
		{
			String strConcat = "";
			for(int j=0;j<chArray[i].length;j++)
			{
				strConcat+= chArray[i][j];
			}
			strArray[i] = strConcat;
		}
		
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]);
		}
	}
}