import java.util.Scanner;

public class WMProgramPrac {
    public WMProgramPrac(){
        System.out.println(Task1());
        System.out.println(Task2());
        System.out.println(Task3());
        System.out.println(Task4());
        System.out.println(Task5());
        System.out.println(Task6());
    }
    public static int Task1(){
        return (int)(Math.random()*8)+56;
    }
    public static int Task2(){
        return (int)Math.pow((Math.random()*963)+45, 2);
    }
    public static int Task3(){
        return (int)Math.sqrt((Math.random()*119)+632);
    }
    public static double Task4(){
        int x;
        double avg = 0.0;
        for (int i = 0; i < 10; i++){
            x = (int) (Math.random()*68) +6;
            System.out.print(x + " ");
            avg += x;
        }
        return (double)avg/10.0;
    }
    public static int Task5(){
        int y;
        int temp = Integer.MAX_VALUE;
        for (int i = 0;  i <20 ;i++){
            y = (int)(Math.random()*18)+85;
            temp = y;
            if (y < temp)
                temp = y;
        }
        return temp;
    }
    public static int Task6(){
        int a,b,c,rand;
        String str, str2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 positive integers for a range");
        System.out.println("First #: ");
        str = input.nextLine();
        while (str.contains("-")){
            System.out.println("Enter a positive integer");
            str = input.nextLine();
        }
        System.out.println("Second #: ");
        str2 = input.nextLine();
        while (str2.contains("-")){
            System.out.println("Enter a positive integer");
            str2 = input.nextLine();
        }
        a = Integer.parseInt(str);
        b = Integer.parseInt(str2);
        if (a > b){
            c = a - b;
            c++;
            rand = (int)(Math.random()*c)+b;
            return rand;
        }
        else if (b > a){
            c = b - a;
            c++;
            rand = (int)(Math.random()*c)+a;
            return rand;
        }
        else{
            return a;
        }
    }
    public static void main(String[] args){
        WMProgramPrac app = new WMProgramPrac();
    }
}
