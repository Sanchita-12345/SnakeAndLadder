class SnakeAndLadder
{
   public static void main(String args[])
   {
      int pos=0,pos1=0,pos2=0,no_play=0,ladder=1,snake=2;
      System.out.println("Welcome to Snake And Ladder Problem");
   	while(pos1!=100 && pos2!=100)
		{
	   	int check1=(int) Math.floor(((Math.random()*10)%6)+1);
			int moves1=(int) Math.floor((Math.random()*10)%3);
			int check2=(int) Math.floor(((Math.random()*10)%6)+1);
         int moves2=(int) Math.floor((Math.random()*10)%3);

      	if(moves1 == no_play)
      	{
         	pos1=pos1;
      	}
      	else if (moves1 == ladder)
      	{
         	pos1=pos1+check1;
      	}
      	else if (moves1 == snake)
      	{
         	pos1=pos1-check1;
      	}
			else if (pos1<0)
			{
				pos1=0;
			}
			if (pos1>100)
			{
				pos1=pos1;
			}


			 if(moves2 == no_play)
         {
            pos2=pos2;
         }
         else if (moves2 == ladder)
         {
            pos2=pos2+check2;
         }
         else if (moves2 == snake)
         {
            pos2=pos2-check2;
         }
         else if (pos2<0)
         {
            pos2=0;
         }
         if (pos2>100)
         {
            pos2=pos2;
         }

		}
		System.out.println("1st Player position is : " +pos1);
		System.out.println("2nd Player position is : " +pos2);
		if(pos1==100)
      {
         System.out.println("1st Player win");
      }
      else if(pos2==100)
      {
         System.out.println("2nd Player win");
      }

   }
}
