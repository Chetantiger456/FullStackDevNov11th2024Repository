class WhileSumShortArrayDemo
{
	public static void main(String args[])
	{
		short shortArray[] = {45,34,56,89,59};
		short sum = 0;
		int i=0;
		while(i<shortArray.length)
		{
			sum+=shortArray[i];
			i++;
		}
		System.out.println("Sum of short array: "+ sum);
	}
}