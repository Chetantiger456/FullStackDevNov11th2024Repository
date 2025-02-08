class DivisibleBy8
{
	public static void main(String args[])
	{
		int count = 0;
		for(int i=100;i<=200;i++)
		{
			if(i%8==0){
				count++;
			}
		}
		System.out.println("Divisible by 8:"+count);
		int newArray[] = new int[count];
		int k=0;
		for(int i=100;i<=200;i++)
		{
			if(i%8==0){
				newArray[k] = i;
				k++;
			}
		}
		System.out.println("Divisible by 8:");
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
	}
}