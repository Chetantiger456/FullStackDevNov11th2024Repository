class OddNumbersArraySecondHalf
{
	public static void main(String args[]){
		int count= 0;
		for(int i=600;i>=300;i--)
		{
			if(i%2!=0 || i%2==1){
				count++;
			}
		}
		
		int newArray[] = new int[count];
		int k = 0;
		for(int i=600;i>=300;i--)
		{
			if(i%2!=0 || i%2==1)
			{
				newArray[k] = i;
				k++;
			}
		}
		
		System.out.println("Second Half of the Odd Array:");
		for(int i=(newArray.length)/2;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
		
	}
}