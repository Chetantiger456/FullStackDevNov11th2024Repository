class DoWhilePatternSumOfNum
{
	public static void main(String args[]){
		int num=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(num+" ");
				num+=1;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}