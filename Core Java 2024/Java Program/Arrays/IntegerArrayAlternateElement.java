class IntegerArrayAlternateElement
{
	public static void main(String args[])
	{
		int iArray[] = {10,20,30,40,50,60,70};
		int count = 0;
		for(int i=0;i<iArray.length;i++)
		{
			if(i%2==0){
				count++;
			}
		}
		int nArray[] = new int[count];
		int k=0;
		for(int i=0;i<iArray.length;i++)
		{
			if(i%2==0){
				nArray[k] = iArray[i];
				k++;
			}
		}
		
		for(int i=0;i<nArray.length;i++)
		{
			System.out.println(nArray[i]);
		}
	}
}