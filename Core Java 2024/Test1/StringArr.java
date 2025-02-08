class StringArr{
	public static void main(String args[]){
		String strArr[] = {"hi","hello","how","are","you","world"};
		for(int i=strArr.length-1;i>=strArr.length/2;i--){
			System.out.println(strArr[i]);
		}
	}
}