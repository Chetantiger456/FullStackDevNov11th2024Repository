class SumOfSquareAndSecondHalf
{
	public static void main(String args[])
	{
		int count=0;
		for(int i=20;i>=10;i--)
		{
			count++;
		}
		
		int newArray[] = new int[count];
		int k = 0;
		for(int i=20;i>=10;i--)
		{
			newArray[k] = i*i;
			k++;
		}
		System.out.println("Second half of Square Array:");
		for(int i=newArray.length/2;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
	}
}