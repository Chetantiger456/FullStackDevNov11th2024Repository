class WhileOddDemo
{
	public static void main(String args[])
	{
		System.out.println("Odd numbers between 9 to 131");
		int i=9;
		while(i<=131)
		{
			if(i%2==1){
				System.out.println(i);
			}
			i++;
		}
	}
}