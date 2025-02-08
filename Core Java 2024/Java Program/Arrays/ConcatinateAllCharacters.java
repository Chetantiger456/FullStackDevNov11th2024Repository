class ConcatinateAllCharacters
{
	public static void main(String args[]){
		int asciiNum = 65;
		int lastAscii = asciiNum+26;
		
		String str="";
		for(int i=asciiNum;i<lastAscii;i++){
			
			str+=(char)i;
		}
		System.out.println("Using Ascii value:"+str);
		// or
			 char ch = 'A';
			String str1="";
			for(int i = 0;i<26;i++){
				str1+=ch++;
			}
			System.out.println("Usint char:"+str1);
		
	}
}