class SumOfShotArrayDemo
{
	public static void main(String args[])
	{
		short []shortArray = {23,45,89,90,56};
		short sum = 0;
		for(int i=0;i<shortArray.length;i++)
		{
			sum+=shortArray[i];
		}
		System.out.println("Sum of Short Array: "+sum);
	}
}