class DoWhileEvenDemo
{
	public static void main(String args[]){
		System.out.println("Even numbers:");
		int i=80;
		do
		{
			if(i%2==0){
				System.out.println(i);
			}
			i--;	
		}while(i>=60);
	}
}