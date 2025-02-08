class IncrementAndDecrementDemo
{
	public static void main(String args[]){
		int i, j;
		i = j = 10;
		i++;
		System.out.println("Post Increment Operator: =>"+i);
		i=j;
		i--;
		System.out.println("Post Decrement Operator: =>"+i);
	}
}