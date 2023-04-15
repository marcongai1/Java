import java.util.Scanner;

public class MagicSquare 
{
    public static void main(String[] args)
    {
        int[][] square = new int [4][4];
        boolean rowEqual = false;
        boolean colEqual = false;
        boolean diaEqual = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter 16 numbers");
        for(int c = 0; c < square.length; c++)
        {
            for(int r = 0; r < square[c].length; r++)
            {
                square[r][c] = reader.nextInt();
                System.out.print(square[r][c] + "\t");
            }
            System.out.println();
        }
        if (sumRow(square,0) == sumRow(square,1) && sumRow(square,0) == sumRow(square,2) && sumRow(square,0) == sumRow(square,3))
            rowEqual = true;
        if (sumCol(square,0) == sumCol(square,1) && sumCol(square,0) == sumCol(square,2) && sumCol(square,0) == sumCol(square,3))
            colEqual = true;
        if (diaEqual(square) == true)
            diaEqual = true;
        if (rowEqual==true && colEqual==true && diaEqual==true)
        {
            if (sumRow(square,0) == sumCol(square,0) && sumRow(square,0) == sumDiaL(square))
                System.out.println("This is a Magic Square!");
            else
                System.out.println("This is not a Magic Square!");
        }
        else
            System.out.println("This is not a Magic Square!");
        reader.close();
    }

    public static int sumRow (int square[][], int r)
    {
        return square[r][0] + square[r][1] + square[r][2] + square[r][3];
    }
    
    public static int sumCol (int square[][], int c)
    {
        return square[0][c] + square[1][c] + square[2][c] + square[3][c];
    }

    public static boolean diaEqual (int square[][])
    {
        int left = 0;
        int right = 0;
        left = square[0][0] + square[1][1] + square[2][2] + square[3][3];
        right = square [0][3] + square[1][2] + square[2][1] + square[3][0];
        if (left==right)
            return true;
        else
            return false;
    }

    public static int sumDiaL(int square[][])
    {
        return square[0][0] + square[1][1] + square[2][2] + square[3][3];
    }
}
