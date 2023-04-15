import java.util.Scanner;

public class ThreeZee
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int sf = 0;
		int sb = 0;
		int pair = 0;
		int chance = 0;
		int threezee = 0;
		int finalScore = 0;
		String[] scoreName = {"ONES", "TWOS", "THREES", "FORWARD STRAIGHT", "BACKWARD STRAIGHT", "PAIR", "CHANCE", "THREE-ZEE"};
		int[] score = {0, 0, 0, 0, 0, 0, 0, 0};
		for (int rounds = 0; rounds < 8; rounds++)
		{
			int rolls = 0;
			dice1 = (int)(Math.random()*3)+1;
			dice2 = (int)(Math.random()*3)+1;
			dice3 = (int)(Math.random()*3)+1;
			System.out.println("Dice 1: " + dice1 + "\tDice 2: " + dice2 + "\tDice 3: " + dice3);
			System.out.println("Do you want to see the scoreboard?");
			String q = reader.nextLine();
			q.toLowerCase();
			while (!q.equals("yes") && !q.equals("no"))
			{
				System.out.print("This is not an option. Pick Again. ");
				q = reader.nextLine();
				q = q.toLowerCase();
			}
			if (q.equals("yes"))
			{
				System.out.println();
				for (int i = 0; i < scoreName.length; i++)
				{
					if (scoreName[i].length() == 9)
						System.out.println(scoreName[i] + "\t\t" + score[i]);
					else if (scoreName[i].length() < 8)
						System.out.println(scoreName[i] + "\t\t\t" + score[i]);
					else
						System.out.println(scoreName[i] + "\t" + score[i]);
				}
			}
			System.out.println("ROLL or HOLD dice 1");
			String ans1 = reader.nextLine();
			ans1.toLowerCase();
			while (!ans1.equals("roll") && !ans1.equals("hold"))
			{
				System.out.println("This is not an option. Pick again.");
				ans1 = reader.nextLine();
				ans1.toLowerCase();
			}
			switch (ans1)
			{
				case "roll" :
						dice1 = (int)(Math.random()*3)+1;
						System.out.println("You rerolled a " + dice1);
						rolls = 1;
					break;
				case "hold" :
					break;
			}
			System.out.println("ROLL or HOLD dice 2");
			String ans2 = reader.nextLine();
			ans2.toLowerCase();
			while (!ans2.equals("roll") && !ans2.equals("hold"))
			{
				System.out.println("This is not an option. Pick again.");
				ans2 = reader.nextLine();
				ans2.toLowerCase();
			}
			switch (ans2)
			{
				case "roll" :
						dice2 = (int)(Math.random()*3)+1;
						System.out.println("You rerolled a " + dice2);
						rolls = 1;
					break;
				case "hold" :
					break;
			}
			System.out.println("ROLL or HOLD dice 3");
			String ans3 = reader.nextLine();
			ans3.toLowerCase();
			while (!ans3.equals("roll") && !ans3.equals("hold"))
			{
				System.out.println("This is not an option. Pick again.");
				ans3 = reader.nextLine();
				ans3.toLowerCase();
			}
			switch (ans3)
			{
				case "roll" :
						dice3 = (int)(Math.random()*3)+1;
						System.out.println("You rerolled a " + dice3);
						rolls = 1;
					break;
				case "hold" :
					break;
			}
			System.out.println("What would you like to score or reroll?");
			String opt = reader.nextLine();
			opt.toLowerCase();
			while (!opt.equals("reroll") && !opt.equals("score")){
				System.out.print("This is not an option. Pick Again. ");
				opt = reader.nextLine();
				opt = opt.toLowerCase();
			}
			if (opt.equals("score")){
				System.out.println("ones, twos, threes, forward straight (sf), backward straight (sb), pair, chance, threezee");
				opt = reader.nextLine();
				opt.toLowerCase();
				while (!opt.equals("ones") && !opt.equals("twos") && !opt.equals("threes") && !opt.equals("sf") && !opt.equals("sb") && !opt.equals("pair") && !opt.equals("chance") && !opt.equals("threezee"))
				{
					System.out.println("This is not an option. Pick again.");
					opt = reader.nextLine();
					opt.toLowerCase();
				}
				switch (opt)
				{
					case "ones" : score[0] = ones (dice1, dice2, dice3, ones);
						break;
					case "twos" : score[1] = twos (dice1, dice2, dice3, twos);
						break;
					case "threes" : score[2] = threes (dice1, dice2, dice3, threes);
						break;
					case "sf" : score[3] = sf (dice1, dice2, dice3, sf);
						break;
					case "sb" : score[4] = sb (dice1, dice2, dice3, sb);
						break;
					case "pair" : score[5] = pair (dice1, dice2, dice3, pair);
						break;
					case "chance" : score[6] = chance (dice1, dice2, dice3, chance);
						break;
					case "threezee" : score[7] = threezee(dice1, dice2, dice3, threezee);
						break;
				}
			}
			else{
				while(rolls!=3){
					System.out.println("Which dice would you like to reroll? 1, 2, 3, or all");
					rolls++;
					q = reader.nextLine();
					q.toLowerCase();
					while (!q.equals("1") && !q.equals("2") && !q.equals("3") && !q.equals("all"))
					{
						System.out.print("This is not an option. Pick Again. ");
						q = reader.nextLine();
						q = q.toLowerCase();
					}
					if(q.equals("1")){
						dice1 = (int)(Math.random()*3)+1;
						System.out.println("You rerolled a " + dice1);
					}
					if(q.equals("2")){
						dice2 = (int)(Math.random()*3)+1;
						System.out.println("You rerolled a " + dice2);
					}
					if(q.equals("3")){
						dice3 = (int)(Math.random()*3)+1;
						System.out.println("You rerolled a " + dice3);
					}
					if(q.equals("all")){
						dice1 = (int)(Math.random()*3)+1;
						dice2 = (int)(Math.random()*3)+1;
						dice3 = (int)(Math.random()*3)+1;
						System.out.println("Dice 1: " + dice1 + "\tDice 2: " + dice2 + "\tDice 3: " + dice3);
					}
					if(rolls!=3){
						System.out.println("score or reroll?");
						q = reader.nextLine();
						q.toLowerCase();
					}
					else{
						System.out.println("You have reached the max amount of rerolls. You have to score.");
						break;
					}
					while (!q.equals("score") && !q.equals("reroll"))
					{
						System.out.print("This is not an option. Pick Again. ");
						q = reader.nextLine();
						q = q.toLowerCase();
					}
					if(q.equals("score"))
						rolls = 3;
				}
				

				System.out.println("What would you like to score?");
				opt = reader.nextLine();
				opt.toLowerCase();
				while (!opt.equals("reroll")){
					System.out.print("This is not an option. Pick Again. ");
					opt = reader.nextLine();
					opt = opt.toLowerCase();
				}
				if (opt.equals("score")){
					System.out.println("ones, twos, threes, forward straight (sf), backward straight (sb), pair, chance, threezee");
					opt = reader.nextLine();
					opt.toLowerCase();
					while (!opt.equals("ones") && !opt.equals("twos") && !opt.equals("threes") && !opt.equals("sf") && !opt.equals("sb") && !opt.equals("pair") && !opt.equals("chance") && !opt.equals("threezee"))
					{
						System.out.println("This is not an option. Pick again.");
						opt = reader.nextLine();
						opt.toLowerCase();
					}
					switch (opt)
					{
						case "ones" : score[0] = ones (dice1, dice2, dice3, ones);
							break;
						case "twos" : score[1] = twos (dice1, dice2, dice3, twos);
							break;
						case "threes" : score[2] = threes (dice1, dice2, dice3, threes);
							break;
						case "sf" : score[3] = sf (dice1, dice2, dice3, sf);
							break;
						case "sb" : score[4] = sb (dice1, dice2, dice3, sb);
							break;
						case "pair" : score[5] = pair (dice1, dice2, dice3, pair);
							break;
						case "chance" : score[6] = chance (dice1, dice2, dice3, chance);
							break;
						case "threezee" : score[7] = threezee(dice1, dice2, dice3, threezee);
							break;
					}
				}
			}	
		}
			System.out.println();
			System.out.println("FINAL SCOREBOARD");
	
		for (int i = 0; i < scoreName.length; i++)
		{
			if (scoreName[i].length() == 9)
				System.out.println(scoreName[i] + "\t\t" + score[i]);
			else if (scoreName[i].length() < 8)
				System.out.println(scoreName[i] + "\t\t\t" + score[i]);
			else
				System.out.println(scoreName[i] + "\t" + score[i]);
		}
		for (int i = 0; i < score.length; i++)
			finalScore += score[i];
		System.out.println("The game is over! Your final score is " + finalScore);
		reader.close();
	
	}

	public static int threezee (int dice1, int dice2, int dice3, int threezee)
	{
		if (dice1==dice2 && dice2==dice3)
			threezee=18;
		return threezee;
	}

	public static int chance (int dice1, int dice2, int dice3, int chance)
	{
		chance = dice1 + dice2 + dice3;
		return chance;
	}

	public static int pair (int dice1, int dice2, int dice3, int pair)
	{
		if (dice1!=dice2 && dice1!=dice3)
			pair = 0;
		else
		{
			if (dice1==dice2)
				pair = dice1+dice2;
			if (dice1==dice3)
				pair = dice1+dice3;
			if (dice1==dice2 && dice2==dice3)
				pair = dice1+dice2;
		}
		return pair;
	}

	public static int sf (int dice1, int dice2, int dice3, int sf)
	{
		if (dice1==1 && dice2==2 && dice3==3)
			sf = 12;
		else
			sf = 0;
		return sf;
	}

	public static int sb (int dice1, int dice2, int dice3, int sb)
	{
		if (dice1==3 && dice2==2 && dice3==1)
			sb = 14;
		else
			sb = 0;
		return sb;
	}

	public static int ones (int dice1, int dice2, int dice3, int ones)
	{
		if (dice1!=1 && dice2!=1 && dice3!=1)
			ones = 0;
		else
		{
			if (dice1==1)
				ones++;
			if (dice2==1)
				ones++;
			if (dice3==1)
				ones++;
		}
		return ones;
	}

	public static int twos (int dice1, int dice2, int dice3, int twos)
	{
		if (dice1!=2 && dice2!=2 && dice3!=2)
			twos = 0;
		else
		{
			if (dice1==2)
				twos+=2;
			if (dice2==2)
				twos+=2;
			if (dice3==2)
				twos+=2;
		}
		return twos;
	}

	public static int threes (int dice1, int dice2, int dice3, int threes)
	{
		if (dice1!=3 && dice2!=3 && dice3!=3)
			threes = 0;
		else
		{
			if (dice1==3)
				threes+=3;
			if (dice2==3)
				threes+=3;
			if (dice3==3)
				threes+=3;
		}
		return threes;
	}
}