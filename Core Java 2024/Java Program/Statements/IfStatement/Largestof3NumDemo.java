class Largestof3NumDemo{
	public static void main(String args[]){
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		
		if((x==y) && (y==z)){
			System.out.println("All 3 values are equal");
		}
		else{
			if((x>=y) && (x>=z)){
				System.out.println(x+" is Largest");
			}else if((y>=x) && (y>=z)){
				System.out.println(y+" is Largest");
			}else if((z>=x) && (z>=y)){
				System.out.println(z+" is Largest");
			}
		}
	}
}