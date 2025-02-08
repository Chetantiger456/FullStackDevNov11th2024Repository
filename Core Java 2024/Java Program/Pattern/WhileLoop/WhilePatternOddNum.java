class WhilePatternOddNum
{
	public static void main(String args[])
	{
		int num=1;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(num+" ");
				num+=2;
				j++;
			}	
			System.out.println();
			i++;
		}
	}
}