import java.util.Scanner;

public class MethodReview{
    public MethodReview(){
        System.out.println(avg());
        Geometry();
        Physics();
    }

    public static void main(String[] args){
        MethodReview app = new MethodReview();
    }

    public static double avg (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input 4 numbers");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        double d = reader.nextDouble();
        return (numSum1(a, b) + numSum2(a, b, c) +numSum3(a, b, c, d) + numQuot(a, d))/4;
    }

    public static void Geometry(){
        Scanner reader = new Scanner(System.in);
        //rectangle
        System.out.println("Enter Length");
        double leng = reader.nextDouble();
        System.out.println("Enter width");
        double wid = reader.nextDouble();
        System.out.println("Rectangle Area: " + (double)(Math.round((leng*wid)*100))/100);
        //square
        System.out.println("Enter side legnth");
        double side = reader.nextDouble();
        System.out.println("Square Perimeter: " + (double)(Math.round((side*4)*100)/100));
        //triangle
        System.out.println("Enter Height");
        double h = reader.nextDouble();
        System.out.println("Enter Base");
        double b = reader.nextDouble();
        System.out.println("Triangle Area: " + (double)(Math.round((0.5*b*h)*100)/100));
        //circumference of circle with d
        System.out.println("Diameter of circle");
        double dia = reader.nextDouble();
        System.out.println("Circle Circumference with diameter "+ (double)(Math.round((Math.PI*dia)*100)/100));
        System.out.println("Radius");
        double rad = reader.nextDouble();
        System.out.println("Circle circumference with radius " + (double)(Math.round((Math.PI*2*rad)*100)/100));
    }

    public static void Physics(){
        //a
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Time");
        double t = reader.nextDouble();
        System.out.println("Enter height");
        double h = reader.nextDouble();
        System.out.println("Height in m dropped after t seconds" + -4.9*(t*t) + h);

        //b
        System.out.println("Enter intial velocity");
        double v = reader.nextDouble();
        System.out.println("Enter time");
        double t2 = reader.nextDouble();
        System.out.println("Velocity final: " + v+(-9.8*t2));

        //c
        System.out.println("Enter x1");
        double x1 = reader.nextDouble();
        System.out.println("x2");
        double x2 = reader.nextDouble();
        System.out.println("time a");
        double a = reader.nextDouble();
        System.out.println("time b");
        double b = reader.nextDouble();
        System.out.println("Average velocity: " + (x2-x1)/(b-a));
    }

    public static int numSum1(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int numSum2(int a, int b, int c){
        int sum = a + b;
        return sum;
    }
    public static int numSum3(int a, int b, int c, double d){
        int sum = a + b + c;
        return sum;
    }
    public static double numQuot(int a, double d){
        double quot = (double) a/d;
        return quot;
    }
}