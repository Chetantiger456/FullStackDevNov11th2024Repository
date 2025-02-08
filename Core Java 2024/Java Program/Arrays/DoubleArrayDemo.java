class DoubleArrayDemo{
	public static void main(String args[])
	{
		double d[] = new double[4];
		d[0] = 10.32;
		d[1] = 23.45;
		d[2] = 15.90;
		d[3] = 89.23;
		System.out.println("Double data type array:");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		System.out.println("Reverse the Double data type array:");
		double db[] = {34.45, 65.90, 90.32, 78.90};
		for(int i=db.length-1;i>=0;i--)
		{
			System.out.println(db[i]);
		}
	}
}