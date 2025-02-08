class FindLengthOfArrayWithOutLengthKeyWord
{
	public static void main(String args[])
	{
		int intArray[] = {12, 34, 56, 78, 34, 56, 97, 72, 13, 43};
		int count = 0;
		for(int intVal:intArray){
			count++;
		}
		System.out.println("Count of Array:"+count);
	}
}