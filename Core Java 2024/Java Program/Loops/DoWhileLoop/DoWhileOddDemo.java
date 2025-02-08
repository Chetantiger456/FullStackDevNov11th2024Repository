class DoWhileOddDemo
{
	public static void main(String args[]){
		System.out.println("Odd Numbers:");
		int i = 9;
		do
		{
			if(i%2==1){
				System.out.println(i);
			}
			i++;
		}while(i<=131);
	}
}