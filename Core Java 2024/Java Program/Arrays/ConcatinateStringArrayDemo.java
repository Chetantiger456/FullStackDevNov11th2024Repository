class ConcatinateStringArrayDemo
{
	public static void main(String args[])
	{
		String []strArray = {"Hi,", "How", "Are", "You"};
		String conStr = "";
		for(int i=0; i<strArray.length;i++){
			conStr+=strArray[i];
		}
		System.out.println("Concatinated String: "+conStr);
	}
}