class WhileCharArrayFirstHalf
{
	public static void main(String args[])
	{
		char ch[] ={'e', 'r', 'l', 'w', 'y', 'p'};
		
		int i=0;
		while(i<ch.length/2)
		{
			System.out.println(ch[i]);
			i++;
		}
	}
}