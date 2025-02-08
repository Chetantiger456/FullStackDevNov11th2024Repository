class DivisibleBy9
{
    public static void main(String args[]){
		int i = Integer.parseInt(args[0]);
		if(i%9 == 0){
			System.out.println(i+" is divisible by 9");
		}else{
			System.out.println(i+" is not divisible by 9");
		}
	}
}