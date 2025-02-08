class DoWhileDivisibleBy
{
	public static void main(String args[]){
		int i=1;
		int sum3, sum6, sum9;
		sum3=sum6=sum9=0;
		do
		{
			if(i%3==0){
				sum3+=i;
			}
			if(i%6==0){
				sum6+=i;
			}
			if(i%9==0){
				sum9+=i;
			}
			i++;
		}while(i<=100);
			System.out.println("Sum of divisible by 3:"+sum3);
		    System.out.println("Sum of divisible by 6:"+sum6);
			System.out.println("Sum of divisible by 9:"+sum9);
	}
}