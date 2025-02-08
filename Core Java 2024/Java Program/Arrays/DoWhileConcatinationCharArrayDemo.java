class DoWhileConcatinationCharArrayDemo
{
	public static void main(String args[])
	{
		char chArray[] = {'k', 'l', 't', 'o', 'f'};
		String strCh = "";
		int i=chArray.length-1;
		do
		{
			strCh+=chArray[i];
			i--;
		}while(i>=0);
		System.out.println(strCh);
	}
}