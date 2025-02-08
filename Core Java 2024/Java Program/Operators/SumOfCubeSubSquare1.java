class SumOfCubeSubSquare1
{
	public static void main(String args[]){
		
		int sum=0;
		for(int i=20;i>=1;i--){
			int cube,square;
			cube=square=0;
			
			cube = (i*i*i);
			square = (i*i);
			sum+= (cube-square);	
		}
		System.out.println("Sum of cube-square1: "+sum);
	}
}