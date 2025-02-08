class IfElseVowelDemo{
	public static void main(String args []){
		char ch = args[0].charAt(0);
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'u' || ch == 'U'){
			System.out.println(ch+" is vowel");
		}else{
			System.out.println(ch+" is not vowel");
		}
	}
}