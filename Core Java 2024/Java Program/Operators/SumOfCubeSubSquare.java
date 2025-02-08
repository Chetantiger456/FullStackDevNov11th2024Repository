class SumOfCubeSubSquare
{
	public static void main(String args[]){
		int sum, cube, square;
		sum=cube=square=0;
		for(int i=20;i>=1;i--){
			cube = (i*i*i);
			square = (i*i);
			sum+= (cube-square);	
		}
		System.out.println("Sum of cube-square: "+sum);
	}
}