class DoWhilePatternAlphabets
{
	public static void main(String args[])
	{
		int num=65;
		char ch = 'A';
		int asciiNum = 65;
		int i=1;
		do
		{
			int j=1;
			do{
				System.out.print(ch++ +" ");
				//OR
				//System.out.print((char)asciiNum+" ");
				//asciiNum+=1;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}