class WhilePattern2Demo
{
	public static void main(String args[])
	{
		int i = 1;
		while(i<=5){
			
			int j = 1;
			while(j<=i){
				System.out.print(2+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}