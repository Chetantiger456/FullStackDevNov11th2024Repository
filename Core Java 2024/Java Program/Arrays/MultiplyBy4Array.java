class MultiplyBy4Array
{
	public static void main(String args[])
	{
		int arrA[] = {45, 55, 65, 75, 85};
		int newArray[] = new int[arrA.length];
		
		for(int i=0;i<arrA.length;i++)
		{
			newArray[i] = arrA[i]*4;
		}
		
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
	}
}