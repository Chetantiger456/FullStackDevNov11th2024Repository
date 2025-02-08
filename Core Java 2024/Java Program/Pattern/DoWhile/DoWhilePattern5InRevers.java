class DoWhilePattern5InRevers
{
	public static void main(String args[])
	{
		int i = 1;
		do{
			int j = 5;
			do
			{
				System.out.print(5+" ");
				j--;
			}while(j>=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}