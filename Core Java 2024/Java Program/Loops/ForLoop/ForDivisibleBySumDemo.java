class ForDivisibleBySumDemo
{
	public static void main(String args[])
	{
		int sum3, sum6, sum9;
		sum3=sum6=sum9=0;
		for(int i=1;i<=100;i++){
			if(i%3==0){
				sum3+=i;
			}
			if(i%6==0){
				sum6+=i;
			}
			if(i%9==0){
				sum9+=i;
			}
		}
		System.out.println("Sum of divisible by 3: "+sum3);
		System.out.println("Sum of divisible by 6: "+sum6);
		System.out.println("Sum of divisible by 9: "+sum9);
	}
}