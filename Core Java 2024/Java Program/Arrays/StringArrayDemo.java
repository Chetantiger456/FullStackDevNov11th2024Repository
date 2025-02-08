class StringArrayDemo
{
	public static void main(String args[])
	{
		String s[] = {"Veera", "Mani", "Kanta", "Ayappa"};
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
			
			System.out.println("\nReverse Order:");
			for(int i=s.length-1;i>=0;i--){
				System.out.println(s[i]);
			}
			
			System.out.println("\nFor Each loop");
			for(String strVal:s){
				System.out.println(strVal);
			}
	}
}