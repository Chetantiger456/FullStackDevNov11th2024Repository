class LogicalNotOperatorDemo
{
	public static void main(String args[])
	{
		int a = 29, b = 45;
		boolean res = (!(a!=b) || (a>b));
		boolean res1 = (!(a==b) && (a<b));


		System.out.println("!"+a+"!="+b+" || "+a+">"+b+"=>"+res);
		System.out.println("!"+a+"=="+b+" && "+a+"<"+b+"=>"+res1);
	}
}