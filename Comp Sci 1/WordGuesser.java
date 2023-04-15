import java.util.Scanner;

public class WordGuesser
{
	public static void main(String[] args)
	{
		String[] easy = {"potato", "ramen", "carrot", "chicken", "protein", "powder"};
		String[] hard = {"supercalifragilisticexpialidocious", "hippopotomonstrosesquippedaliophobia", "pneumonoultramicroscopicsilicovolcanoconiosis", "voyeurism", "yachtsman", "quixotic"};
		int miss = 6;
		int score = 0;
		int round = 1;
		String word = "";
		String spaces = "";
		String guess = "";
		String letters = "";
		String option = "";
		boolean run = false;
		int x = (int)(Math.random()*6);

		Scanner reader = new Scanner(System.in);
		while (score == 0 && run == false || run == true)
		{
			round++;
			System.out.println("Easy or Hard mode?");
			option = reader.nextLine();
			option = option.toLowerCase();
			while (!option.equals("easy") && !option.equals("hard"))
			{
				System.out.println("This is not an option pick again");
				System.out.println("Easy or Hard mode?");
				option = reader.nextLine();
				option.toLowerCase();
			}
			if (option.equals("easy"))
				word = easy[x];
			else
				word = hard[x];

			for (int i = 0; i < word.length(); i++)
				spaces += "_";

			while (miss!=0)
			{
				System.out.println(printGuess(spaces));
				System.out.println("\nMisses left: " + miss);
				letters += guess;
				System.out.print("Letters guessed so far: " + letters);
				System.out.println("\nGuess a letter:");
				guess = reader.nextLine();
				guess.toLowerCase();
				while (guess.length() > 1 || letters.contains(guess) || guess.contains("0") || guess.contains("1") || guess.contains("2") || guess.contains("3") || guess.contains("4") || guess.contains("5") || guess.contains("6") || guess.contains("7") || guess.contains("8") || guess.contains("9"))
				{
					System.out.println("You can't do that!. Enter a letter");
					guess = reader.nextLine();
					guess.toLowerCase();
				}
				if (word.contains(guess))
				{
					System.out.println("Found " + guess);
					char temp = guess.charAt(0);
					for (int i = 0; i < word.length(); i++)
						if (word.charAt(i) == temp)
							spaces = spaces.substring(0,i) + guess + spaces.substring(i+1);
				}
				else
				{
					System.out.println("Nope! That's the wrong letter!");
					miss--;
				}
				if (!spaces.contains("_"))
					break;
			}

			if (!spaces.contains("_"))
			{
				System.out.println(">=>      >=>                           >=>        >=>                     >=>");
				System.out.println(" >=>    >=>                            >=>        >=>  >>                 >=>");
				System.out.println("  >=> >=>       >=>     >=>  >=>       >=>   >>   >=>     >==>>==>        >=>");
				System.out.println("    >=>       >=>  >=>  >=>  >=>       >=>  >=>   >=> >=>  >=>  >=>       >> ");
				System.out.println("    >=>      >=>    >=> >=>  >=>       >=> >> >=> >=> >=>  >=>  >=>       >> ");
				System.out.println("    >=>       >=>  >=>  >=>  >=>       >> >>    >===> >=>  >=>  >=>          ");
				System.out.println("    >=>         >=>       >==>=>       >=>        >=> >=> >==>  >=>       >=>");
				System.out.println("The word was " + word);
				score++;
			}
			else
			{
				System.out.println(">=>      >=>                           >=>                                          >=>");
				System.out.println(" >=>    >=>                            >=>                                          >=>");
				System.out.println("  >=> >=>       >=>     >=>  >=>       >=>          >=>      >===>    >==>          >=>");
				System.out.println("    >=>       >=>  >=>  >=>  >=>       >=>        >=>  >=>  >=>     >>   >=>        >> ");
				System.out.println("    >=>      >=>    >=> >=>  >=>       >=>       >=>    >=>   >==>  >>===>>=>       >> ");
				System.out.println("    >=>       >=>  >=>  >=>  >=>       >=>        >=>  >=>      >=> >>                 ");
				System.out.println("    >=>         >=>       >==>=>       >=======>    >=>     >=> >=>  >====>         >=>");
				System.out.println("The word was " + word);
			}

			System.out.println("Would you like to play again?");
			option = reader.nextLine();
			option.toLowerCase();
			while(!option.equals("yes") && !option.equals("no"))
			{
				System.out.println("Would you like to play again?");
				option = reader.nextLine();
				option.toLowerCase();
			}
			if (option.equals("yes"))
			{
				run = true;
				System.out.println("Starting Round " + round + " with a Score of " + score);
				spaces = "";
				letters = "";
				word = "";
				guess = "";
				x = (int)(Math.random()*6);
				miss = 6;
			}
			if (option.equals("no"))
			{
				run = false;
				System.out.println("Ending on Round " + round + " with a Score of " + score);
			}
		}
		reader.close();
	}

	public static String printGuess(String spaces)
	{
		for (int i = 0; i < spaces.length(); i++)
		{
			spaces = spaces.substring(0,i)+ spaces.charAt(i) + " " + spaces.substring(i+1);
			i++;
		}
		return spaces;
	}

}