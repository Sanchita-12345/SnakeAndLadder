class SnakeAndLadder
{
   public static void main(String args[])
   {
      int pos=0,no_play=0,ladder=1,snake=2,count=0;
      System.out.println("Welcome to Snake And Ladder Problem");
   	while(pos!=100)
		{
	   	int check=(int) Math.floor(((Math.random()*10)%6)+1);
      	count++;
			int moves=(int) Math.floor((Math.random()*10)%3);
      	if(moves == no_play)
      	{
         	pos=pos;
      	}
      	else if (moves == ladder)
      	{
         	pos=pos+check;
      	}
      	else if (moves == snake)
      	{
         	pos=pos-check;
      	}
			else if (pos<0)
			{
				pos=0;
			}
			if (pos>100)
			{
				pos=pos;
			}
		}
		System.out.println("the number of times the dice was played to win : " +count);
      
     	System.out.println("The final position of the player is : " +pos);
   }
}
