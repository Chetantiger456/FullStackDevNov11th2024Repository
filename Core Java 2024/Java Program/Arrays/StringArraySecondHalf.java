class StringArraySecondHalf
{
	public static void main(String args[])
	{
		String strArray[] = {"Hello", "World", "Object", "class", "Interface", "static"};
		String strNewArray[] = new String[strArray.length/2];
		
		int k=0;
		for(int i=strArray.length/2; i<strArray.length;i++)
		{
			strNewArray[k] = strArray[i];
			k++;
		}
		
		System.out.println("Second half of the Array:");
		for(int i=0;i<strNewArray.length;i++)
		{
			System.out.println(strNewArray[i]);
		}
	}
}