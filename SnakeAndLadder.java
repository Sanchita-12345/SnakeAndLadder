class SnakeAndLadder
{
	int pos=0;
	public static void main(String args[])
	{
		System.out.println("Welcome to Snake And Ladder Problem");
		int check=(int) Math.floor(((Math.random()*10)%6)+1);
		System.out.println("The number is : " +check);
	}
}
