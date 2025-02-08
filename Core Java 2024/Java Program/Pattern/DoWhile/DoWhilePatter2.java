class DoWhilePatter2
{
	public static void main(String args[])
	{
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print(2+" ");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}