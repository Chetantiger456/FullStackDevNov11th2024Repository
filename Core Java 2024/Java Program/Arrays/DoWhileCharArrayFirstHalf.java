class DoWhileCharArrayFirstHalf
{
	public static void main(String args[])
	{	
		char ch[] ={'e', 'r', 'l', 'w', 'y', 'p'};
		
		int i=0;
		do{
			System.out.println(ch[i]);
			i++;
		}while(i<ch.length/2);
	}
}