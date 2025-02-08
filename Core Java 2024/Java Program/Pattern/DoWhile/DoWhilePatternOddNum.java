class DoWhilePatternOddNum
{
	public static void main(String args[])
	{
		int num=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(num+" ");
				num+=2;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}