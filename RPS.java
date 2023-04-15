import java.util.Scanner;

public class RPS
{
	public static void main(String[] args)
	{
		String user = userThrow();
		String comp = compThrow();
		determineWinner(user, comp);
	}

	public static void determineWinner(String u, String c)
	{
		switch (u)
		{
			case "Rock" :
				switch (c)
				{
					case "Rock" : System.out.println("Tie");
						break;
					case "Paper" : System.out.println("Computer Wins");
						break;
					case "Scissors" : System.out.println("User Wins");
						break;

				}
			break;
			case "Paper" :
				switch (c)
				{
					case "Rock" : System.out.println("User Wins");
						break;
					case "Paper" : System.out.println("Tie");
						break;
					case "Scissors" : System.out.println("Computer Wins");
						break;
				}
			break;
			case "Scissors" :
				switch(c)
				{
					case "Rock" : System.out.println("Computer Wins");
						break;
					case "Paper" : System.out.println("User Wins");
						break;
					case "Scissors" : System.out.println("Tie");
						break;
				}
			break;
		}
	}

	public static String compThrow()
	{
		int x = (int)(Math.random()*3) +1;
		switch(x)
		{
			case 1 : return "Rock";
			case 2 : return "Paper";
			case 3 : return "Scissors";
		}
		return "";
	}

	public static String userThrow()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("RPS?");
		return reader.nextLine();
	}
}