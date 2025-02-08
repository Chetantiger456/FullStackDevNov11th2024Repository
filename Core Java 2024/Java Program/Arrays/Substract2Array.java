class Substract2Array
{
	public static void main(String args[])
	{
		int firstArray[]= {50,40,30,20,10};
		int secondArray[]= {5,4,3,2,1};
		int subArray[]=new int [firstArray.length];
		
		for(int i=0;i<firstArray.length;i++){
			subArray[i] = firstArray[i]-secondArray[i];
		}
		
		
		for(int i=0;i<subArray.length;i++)
		{
			System.out.println(subArray[i]);
		}
	}
}