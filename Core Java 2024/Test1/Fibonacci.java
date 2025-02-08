class Fibonacci{
	public static void main(String args[]){
		int m =0;
		int n =1;
		int sum = 0+1;
		System.out.print(m+","+n);
		for(int i=2;i<=8;i++){
			int tn = m+n;
			m=n;
			n=tn;
			System.out.print(","+tn);
			sum+=tn;
		}
		System.out.println("\n"+sum);
	}
}