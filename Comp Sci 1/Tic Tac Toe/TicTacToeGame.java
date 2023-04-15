import java.util.Scanner;

public class TicTacToeGame
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		TicTacToeBoard board = new TicTacToeBoard(620, 720);
		int[][] grid = {	{0, 200, 600, 200},
							{0, 400, 600, 400},
							{200, 0, 200, 600},
							{400, 0, 400, 600}	};
		board.defineBoard(grid);
		board.setFiles("x.jpg", "o.jpg");
		char[][] arr = new char[3][3];
		board.setBoard(arr);
		int mode, turn, xx, xy, ox, oy = 0;
		System.out.println("Welcome to Tic Tac Toe! Pick a Game Mode.");
		System.out.print("Enter '1' for the 1 Player Game Mode and Enter '2' for the 2 Player Game Mode: ");
		mode = reader.nextInt();
		if (mode < 1 || mode > 2){
			do{
				System.out.print("This is not a valid game mode, pick again. ");
				mode = reader.nextInt();
			}while(mode < 1 || mode > 2);
		}
		System.out.println();
		if (mode == 2)
		{
			turn = 0;
			while (turn < 9)
			{
				System.out.println("It's Player 1's turn\n");
				xx = 0;
				xy = 0;
				do{
					System.out.print("What row do you want? ");
					xx = reader.nextInt();
					if (xx < 0 || xx > 2){
						do{
							System.out.print("This is not a valid spot, pick again. ");
							xx = reader.nextInt();
						}while (xx < 0 || xx > 2);
					}
					System.out.print("What column do you want? ");
					xy = reader.nextInt();
					if (xy < 0 || xy > 2){
						do{
							System.out.print("This is not a valid spot, pick again. ");
							xy = reader.nextInt();
						}while (xy < 0 || xy > 2);
					}
					if (arr[xx][xy] == 'x' || arr[xx][xy] == 'o'){
						System.out.println("This spot is already occupied, pick again.\n");
					}
				}while ((xx < 0 || xx > 2) || (xy < 0 || xy > 2) || (arr[xx][xy] == 'x' || arr[xx][xy] == 'o'));
				System.out.println();
				arr[xx][xy] = 'x';
				turn++;
				board.repaint();
				if ((arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x') || (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x') || (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x') || (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x') || (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x') || (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
					break;
				if (turn == 9)
					break;
				System.out.println("It's Player 2's turn\n");
				ox = 0;
				oy = 0;
				do{
					System.out.print("What row do you want? ");
					ox = reader.nextInt();
					if (ox < 0 || ox > 2){
						do{
							System.out.print("This is not a valid spot, pick again. ");
							ox = reader.nextInt();
						}while (ox < 0 || ox > 2);
					}
					System.out.print("What column do you want? ");
					oy = reader.nextInt();
					if (oy < 0 || oy > 2){
						do{
							System.out.print("This is not a valid spot, pick again. ");
							oy = reader.nextInt();
						}while (oy < 0 || oy > 2);
					}
					if (arr[ox][oy] == 'x' || arr[ox][oy] == 'o'){
						System.out.println("This spot is already occupied, pick again.\n");
					}
				}while ((ox < 0 || ox > 2) || (oy < 0 || oy > 2) || (arr[ox][oy] == 'x' || arr[ox][oy] == 'o'));
				System.out.println();
				arr[ox][oy] = 'o';
				turn++;
				board.repaint();
				if ((arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o') || (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o') || (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o') || (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o') || (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o') || (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
					break;
				if (turn == 9)
					break;
			}
			if ((arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x') || (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x') || (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x') || (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x') || (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x') || (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
				System.out.print("Player 1 (X) Wins!");
			else if ((arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o') || (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o') || (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o') || (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o') || (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o') || (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
				System.out.print("Player 2 (O) Wins!");
			else
				System.out.print("It's a tie!");
		}else{
			turn = 0;
			while (turn < 9)
			{
				System.out.println("It's your turn.\n");
				xx = 0;
				xy = 0;
				do{
					System.out.print("What row do you want? ");
					xx = reader.nextInt();
					if (xx < 0 || xx > 2){
						do{
							System.out.print("This is not a valid spot, pick again. ");
							xx = reader.nextInt();
						}while (xx < 0 || xx > 2);
					}
					System.out.print("What column do you want? ");
					xy = reader.nextInt();
					if (xy < 0 || xy > 2){
						do{
							System.out.print("This is not a valid spot, pick again. ");
							xy = reader.nextInt();
						}while (xy < 0 || xy > 2);
					}
					if (arr[xx][xy] == 'x' || arr[xx][xy] == 'o'){
						System.out.println("This spot is already occupied, pick again.\n");
					}
				}while ((xx < 0 || xx > 2) || (xy < 0 || xy > 2) || (arr[xx][xy] == 'x' || arr[xx][xy] == 'o'));

				System.out.println();
				arr[xx][xy] = 'x';
				turn++;
				board.repaint();
				if ((arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x') || (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x') || (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x') || (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x') || (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x') || (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
					break;
				if (turn == 9)
					break;
				ox = 0;
				oy = 0;
				if (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] != 'x'){
					ox = 0;
					oy = 2;
				}else if (arr[0][0] == 'o' && arr[0][2] == 'o' && arr[0][1] != 'x'){
					ox = 0;
					oy = 1;
				}else if (arr[0][1] == 'o' && arr[0][2] == 'o' && arr[0][0] != 'x'){
					ox = 0;
					oy = 0;
				}else if (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] != 'x'){
					ox = 1;
					oy = 2;
				}else if (arr[1][0] == 'o' && arr[1][2] == 'o' && arr[1][1] != 'x'){
					ox = 1;
					oy = 1;
				}else if (arr[1][1] == 'o' && arr[1][2] == 'o' && arr[1][0] != 'x'){
					ox = 1;
					oy = 0;
				}else if (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] != 'x'){
					ox = 2;
					oy = 2;
				}else if (arr[2][0] == 'o' && arr[2][2] == 'o' && arr[2][1] != 'x'){
					ox = 2;
					oy = 1;
				}else if (arr[2][1] == 'o' && arr[2][2] == 'o' && arr[2][0] != 'x'){
					ox = 2;
					oy = 0;
				}else if (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] != 'x'){
					ox = 2;
					oy = 0;
				}else if (arr[0][0] == 'o' && arr[2][0] == 'o' && arr[1][0] != 'x'){
					ox = 1;
					oy = 0;
				}else if (arr[2][0] == 'o' && arr[1][0] == 'o' && arr[0][0] != 'x'){
					ox = 0;
					oy = 0;
				}else if (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] != 'x'){
					ox = 2;
					oy = 1;
				}else if (arr[0][1] == 'o' && arr[2][1] == 'o' && arr[1][1] != 'x'){
					ox = 1;
					oy = 1;
				}else if (arr[2][1] == 'o' && arr[1][1] == 'o' && arr[0][1] != 'x'){
					ox = 0;
					oy = 1;
				}else if (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] != 'x'){
					ox = 2;
					oy = 2;
				}else if (arr[0][2] == 'o' && arr[2][2] == 'o' && arr[1][2] != 'x'){
					ox = 1;
					oy = 2;
				}else if (arr[2][2] == 'o' && arr[1][2] == 'o' && arr[0][2] != 'x'){
					ox = 0;
					oy = 2;
				}else if (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] != 'x'){
					ox = 2;
					oy = 2;
				}else if (arr[0][0] == 'o' && arr[2][2] == 'o' && arr[1][1] != 'x'){
					ox = 1;
					oy = 1;
				}else if (arr[2][2] == 'o' && arr[1][1] == 'o' && arr[0][0] != 'x'){
					ox = 0;
					oy = 0;
				}else if (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] != 'x'){
					ox = 2;
					oy = 0;
				}else if (arr[0][2] == 'o' && arr[2][0] == 'o' && arr[1][1] != 'x'){
					ox = 1;
					oy = 1;
				}else if (arr[1][1] == 'o' && arr[2][0] == 'o' && arr[0][2] != 'x'){
					ox = 0;
					oy = 2;
				}else if (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] != 'o'){
					ox = 0;
					oy = 2;
				}else if (arr[0][0] == 'x' && arr[0][2] == 'x' && arr[0][1] != 'o'){
					ox = 0;
					oy = 1;
				}else if (arr[0][1] == 'x' && arr[0][2] == 'x' && arr[0][0] != 'o'){
					ox = 0;
					oy = 0;
				}else if (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] != 'o'){
					ox = 1;
					oy = 2;
				}else if (arr[1][0] == 'x' && arr[1][2] == 'x' && arr[1][1] != 'o'){
					ox = 1;
					oy = 1;
				}else if (arr[1][1] == 'x' && arr[1][2] == 'x' && arr[1][0] != 'o'){
					ox = 1;
					oy = 0;
				}else if (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] != 'o'){
					ox = 2;
					oy = 2;
				}else if (arr[2][0] == 'x' && arr[2][2] == 'x' && arr[2][1] != 'o'){
					ox = 2;
					oy = 1;
				}else if (arr[2][1] == 'x' && arr[2][2] == 'x' && arr[2][0] != 'o'){
					ox = 2;
					oy = 0;
				}else if (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] != 'o'){
					ox = 2;
					oy = 0;
				}else if (arr[0][0] == 'x' && arr[2][0] == 'x' && arr[1][0] != 'o'){
					ox = 1;
					oy = 0;
				}else if (arr[2][0] == 'x' && arr[1][0] == 'x' && arr[0][0] != 'o'){
					ox = 0;
					oy = 0;
				}else if (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] != 'o'){
					ox = 2;
					oy = 1;
				}else if (arr[0][1] == 'x' && arr[2][1] == 'x' && arr[1][1] != 'o'){
					ox = 1;
					oy = 1;
				}else if (arr[2][1] == 'x' && arr[1][1] == 'x' && arr[0][1] != 'o'){
					ox = 0;
					oy = 1;
				}else if (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] != 'o'){
					ox = 2;
					oy = 2;
				}else if (arr[0][2] == 'x' && arr[2][2] == 'x' && arr[1][2] != 'o'){
					ox = 1;
					oy = 2;
				}else if (arr[2][2] == 'x' && arr[1][2] == 'x' && arr[0][2] != 'o'){
					ox = 0;
					oy = 2;
				}else if (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] != 'o'){
					ox = 2;
					oy = 2;
				}else if (arr[0][0] == 'x' && arr[2][2] == 'x' && arr[1][1] != 'o'){
					ox = 1;
					oy = 1;
				}else if (arr[2][2] == 'x' && arr[1][1] == 'x' && arr[0][0] != 'o'){
					ox = 0;
					oy = 0;
				}else if (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] != 'o'){
					ox = 2;
					oy = 0;
				}else if (arr[0][2] == 'x' && arr[2][0] == 'x' && arr[1][1] != 'o'){
					ox = 1;
					oy = 1;
				}else if (arr[1][1] == 'x' && arr[2][0] == 'x' && arr[0][2] != 'o'){
					ox = 0;
					oy = 2;
				}else{
					do{
						ox = (int)(Math.random()*3);
						oy = (int)(Math.random()*3);
					}while (arr[ox][oy] == 'x' || arr[ox][oy] == 'o');
				}
				System.out.println("The computer chose row " + ox + " and coloumn " + oy + ".");
				System.out.println();
				arr[ox][oy] = 'o';
				turn++;
				board.repaint();
				if ((arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o') || (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o') || (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o') || (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o') || (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o') || (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
					break;
				if (turn == 9)
					break;
			}
			if ((arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x') || (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x') || (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x') || (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x') || (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x') || (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x') || (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
				System.out.print("You (X) Win!");
			else if ((arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o') || (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o') || (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o') || (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o') || (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o') || (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o') || (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
				System.out.print("The Computer (O) Wins!");
			else
				System.out.print("It's a tie!");
		}
	}
}