class DivisibleBy6
{
	public static void main(String args[]){
	int count = 0;
	int i=75;
		do
		{
			if(i%6==0){
				count++;
			}
			i++;
		}while(i<=150);
		System.out.println("Count:"+count);
	}
}