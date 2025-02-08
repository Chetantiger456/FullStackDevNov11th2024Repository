class WhilePattern5InReverse
{
	public static void main(String args[])
	{
		int i=1;
		while(i<=5)
		{
			int j=5;
			while(j>=i)
			{
				System.out.print(5+" ");
				j--;
			}
			System.out.println();
			i++;
		}
		
		//or
		
		//int i=5;
		
	//	while(i>=1)
	//	{
	//		int j=1;
	//		while(j<=i)
	//		{
	//			System.out.print(5+" ");
	//			j++;
	//		}
	//		System.out.println();
	//		i--;
	//	}
	}
}