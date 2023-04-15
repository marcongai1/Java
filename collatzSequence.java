import java.util.Scanner;
public class collatzSequence{
    public collatzSequence(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int x = input.nextInt();
        while(x!=1){
            System.out.print(x + " ");
            if(x%2==0)
                x/=2;
            else
                x = (3 * x) + 1;
        }
        System.out.print(x);
    }

    public static void main(String[] args){
        collatzSequence app = new collatzSequence();
    }
}