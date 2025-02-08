class SumOfbyteSquareAndby2
{
	public static void main(String args[])
	{
		byte []bArray = {2,4,6,7,9,3};
		int sum = 0, square = 0;
		double squareby2 = 0.0 ;
		for(int i=0;i<bArray.length;i++)
		{
			sum+= bArray[i];
		}
		
		square =  (sum*sum);
		squareby2 = (double)square/2;	
		System.out.println("Sum of array, square the result and divide by 2: "+squareby2);
	}
}