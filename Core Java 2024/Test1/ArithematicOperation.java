class ArithematicOperation{
	public static void main(String args[]){
			 char operator = args[0].charAt(0);
		switch(operator){
			case '+':
				System.out.println(100+20);
				break;
			case '-':
				System.out.println(100-20);
				break;
			case '*':
				System.out.println(100*20);
				break;
			case '/':
				System.out.println(100/20);
				break;
			case '%':
				System.out.println(100%20);
				break;
			default:
				System.out.println("Not a valid Arithematic operator");
		}
	}
}