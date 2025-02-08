class DoWhileConcatinateStringArrayDemo
{
	public static void main(String args[])
	{
		String []strArray = {"$Don", "%Queen", "@King"};
		String conStr = "";
		
		int i=0;
		do
		{
			conStr+=strArray[i];
			i++;
		}while(i<strArray.length);
		System.out.println("Concatinated String: "+conStr);
	}
}