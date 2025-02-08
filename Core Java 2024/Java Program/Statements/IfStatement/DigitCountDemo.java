class DigitCountDemo{
	public static void main(String args[]){
		
		if((args[0].length()) >= 11){
			System.out.println("Digit cannot be more than 10000000000");
		}else{
			int digit =  Integer.parseInt(args[0]);
			if((digit>=0) && (digit <=9)){
				System.out.println(digit+" is single digit");
			}else if((digit>=10) && (digit<=99)){
				System.out.println(digit+" is double digit");
			}else if((digit>=100) && (digit <=999)){
				System.out.println(digit+" is trible digit");
			}else if(digit > 999){
				System.out.println(digit+" is larger digit");
			}else{
				System.out.println("Invalid digit");
			}
		}
	}
}