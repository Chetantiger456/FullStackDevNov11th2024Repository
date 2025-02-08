class WhileConcatinationCharArrayDemo
{
	public static void main(String args[])
	{
		String strChar = "";
		char chArray[] = {'r', 't', 'i', 'l', 'k'};
		
		int i=chArray.length-1;
		while(i>=0)
		{
			strChar+=chArray[i];
			i--;
		}
		System.out.println(strChar);
	}
}