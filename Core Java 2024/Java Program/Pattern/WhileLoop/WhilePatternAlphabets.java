class WhilePatternAlphabets
{
	public static void main(String args[])
	{
		int i=1;
		char ch = 'A';
		int asciiNum = 65;
		while(i<=5){
			int j=1;
			while(j<=i)
			{
				// System.out.print(ch++ +" ");
				//OR
				System.out.print((char)asciiNum+" ");
				asciiNum+=1;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}