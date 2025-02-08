class Table4Pattron{
	public static void main(String args[]){
		int num =1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num*4+" ");
				num++;
				
			}
			System.out.println();
		}
	}
}