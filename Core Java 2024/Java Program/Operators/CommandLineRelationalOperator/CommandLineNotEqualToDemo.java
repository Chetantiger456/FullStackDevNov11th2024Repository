class CommandLineNotEqualToDemo
{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		boolean result = (x!=y);
		System.out.println(x+"!="+y+"=>"+result);
	}
}