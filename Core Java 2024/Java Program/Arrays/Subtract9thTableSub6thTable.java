class Subtract9thTableSub6thTable
{
	public static void main(String args[])
	{
		int subractedArray[] = new int[10];
		int table9, table6;
		table9=table6=0;
		
		for(int i=1;i<=10;i++){
			table9 = 9*i;
			table6 = 6*i;
			subractedArray[i-1] = table9-table6;
		}
		
		for(int i=subractedArray.length-1;i>=0;i--)
		{
			System.out.println("(9*"+(i+1)+")-(6*"+(i+1)+")="+subractedArray[i]);
		}
	}
}