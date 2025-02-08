class ForPatternAlphabets
{
	public static void main(String args[])
	{
		char ch = 'A';
		int asciiNum = 65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				// System.out.print(ch++ +" ");
				// OR
				System.out.print((char)asciiNum+" ");
				asciiNum+=1;
			}
			System.out.println();
		}
	}
}