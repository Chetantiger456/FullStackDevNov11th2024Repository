class CharArrayDouble
{
	public static void main(String args[])
	{
		
		char ch[] = {'e', 'q', 't', 'y', 'z', 'm'};
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("\n Reverse the Char:");
		for(int i=ch.length-1;i>=0;i--){
			System.out.println(ch[i]);
		}
		System.out.println("\nFor Each Loop");
		for(char chVal:ch){
			System.out.println(chVal);
		}
	}
}