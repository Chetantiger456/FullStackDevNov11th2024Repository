class ReverseArrayInEvenNumbers
{
	public static void main(String args[])
	{
		int count = 0;
		for(int i=20;i<40;i++)
		{
			if(i%2==0){
				count++;
			}
		}
		System.out.println("# of the Even Numbers:"+count);
		int newArray[] = new int[count];
		int k = 0;
		for(int j=20;j<40;j++)
		{
			if(j%2==0){
				
				newArray[k] = j;
				k++;
			}
		}
		for(int m=.newArray.length-1;m>=0;m--)
		{
			System.out.println(newArray[m]);
		}
	}
}