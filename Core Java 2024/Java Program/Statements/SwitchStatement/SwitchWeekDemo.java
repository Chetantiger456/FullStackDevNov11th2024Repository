class SwitchWeekDemo{
	public static void main(String args[]){
		int day = Integer.parseInt(args[0]);
		
		switch(day){
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Sunday");
				break;
			case 3:
				System.out.println("Sunday");
				break;
			case 4:
				System.out.println("Sunday");
				break;
			case 5:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Day does not exist");
		}
	}
}