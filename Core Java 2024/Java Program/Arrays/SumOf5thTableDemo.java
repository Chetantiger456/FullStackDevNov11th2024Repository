class SumOf5thTableArrayDemo
{
	public static void main(String args[]){
		int newArray[] = new int[10];
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			newArray[i-1] = 5*i;
		}
		
		for(int i=0;i<newArray.length;i++)
		{
			sum+=newArray[i];
		}
		
		System.out.println("Sum of 5th Table: "+ sum);
	}
}