class LesserThanEqualtoOperatorDemo
{
	public static void main(String args[]){
		int a = 29, b = 45, x=10 , y = 10;
		boolean res = a<=b;
		boolean res1 = x<=y;
		boolean res2 = b<=a;
		System.out.println(a+"<="+b+"=>"+res);
		System.out.println(b+"<="+a+"=>"+res2);
		System.out.println(x+"<="+y+"=>"+res1);
	}
}