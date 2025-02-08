class ConcatenateCharArray
{
	public static void main(String args[])
	{
		char chArray[] = {'S', 'H', 'A', 'S', 'I'};
		String strChar = "";
		for(int i=chArray.length-1;i>=0;i--)
		{
			strChar+=chArray[i];
		}
		System.out.println("Concatinated array value: "+strChar);
	}
}