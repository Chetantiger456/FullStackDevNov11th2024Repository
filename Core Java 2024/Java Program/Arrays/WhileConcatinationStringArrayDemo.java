class WhileConcatinationStringArrayDemo
{
	public static void main(String args[])
	{
		String []strArray = {"#Whatsapp","#Instagram","#Twitter","#Facebook"};
		String conStr = "";
		
		int i=0;
		while(i<strArray.length)
		{
			conStr+=strArray[i];
			i++;
		}
		System.out.println("Concatinated String: "+conStr);
	}
}