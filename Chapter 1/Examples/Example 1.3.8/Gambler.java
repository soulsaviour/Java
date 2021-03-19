public class Gambler{
	public static void main(String[] args){
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trials = Integer.parseInt(args[2]);
		int bets = 0;
		int wins = 0;
		for (int n = 0 ; n < trials ; n ++)
		{		int cash = stake;
				while(0 < cash && cash < goal)
				{
					bets++;
					if (Math.random() > 0.5) cash++;
					else					 cash--;
				}
				if (cash == goal) {wins++;}
		}
		System.out.println(100*wins/trials);
		System.out.println(bets/trials);
			
	}
}