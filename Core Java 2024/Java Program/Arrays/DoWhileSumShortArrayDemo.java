class DoWhileSumShortArrayDemo
{
	public static void main(String args[])
	{
		short shArray[] = {12,45,65,76,35};
		short sum = 0;
		int i=0;
		do
		{
			sum+=shArray[i];
			i++;
		}while(i<shArray.length);
		System.out.println("Sum of short array: "+sum);
	}
}