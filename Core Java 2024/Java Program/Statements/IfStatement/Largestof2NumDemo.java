class Largestof2NumDemo
{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		if(x==y){
			System.out.println("Both the number are equal");
		}else{
			if(x>y){
				System.out.println(x+" is highest number");
			}else if(y>x){
				System.out.println(y+" is highest number");
			}
		}
			
		
	}
}