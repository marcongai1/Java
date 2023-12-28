import java.util.Scanner;

public class rutgersIntro {
    
    public rutgersIntro(){
        //Section 3: Question 4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days Meg makes donuts each week: ");
        int day = scanner.nextInt();

        System.out.print("Enter the number of donuts Meg makes each day: ");
        int donuts = scanner.nextInt();

        int total = day * donuts;
        System.out.println("Meg makes " + total + " donuts each week.");

        
    }  
     //Section 3: Question 5
    public void isPrime() {
        int n = Integer.parseInt(args[0]);
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
    public static void main(String[] args){
        rutgersIntro app = new rutgersIntro();
    }
}
/* Question 1
 * a) Should initially check if a and b are positive integers
 * by using an if statement asking if it is greater than 0.
 * if b is equal to 0 should print that a is not divisible by b.
 * Pseudocode:
 * 1. Read a
    2. Read b
    3. if b = 0
    4.    Print "error"
    5. else if a % b = 0
    6.    Print "a is divisible by b"
    7. else
    8.    Print "a is not divisible by b"
 * b) its just an input output 
 * c) the maximum number of operations executed in the program would be 3
 * d) the minimum would be 1
 * 
 * Question 2
 *  Read n
 *  IF n <= 0 THEN
 *      DISPLAY "Input must be a positive int"
 *  ELSE
 *    SET SUM to 0
 *    FOR i FROM 1 to n
 *    SET SUM to SUM + i
 *   END FOR
 * END IF
 * DISPLAY SUM
 * 
 * Question 3
 * a) the maximum number of operations executed in the program would be
 *  ADD 1 To count
 * COMPUTE num AS num/10
 * The max should be 2n. 2 iterations per digit
 *  
 * Section 2:
 * Question 1
 * c) 10
 * 
 * Quesiton 2:
 * a) num1 = 5, num2 = 5
 * c) num1 = 8, num2 = 5
 * 
 * Question 3:
 * a) 11
 * b) 39
 * 
 * Question 4:
 * 2000: true
 * 2026: false
 * 2016: true
 * 
 * Question 5:
 *  xxxxx --> n/d + " " + n%d + "/" + d
 * 
 * Question 6:
 * A) int, 5
 * B) double, 4.0
 * C) String, 151
 * D) String, 245
 * E) illegal, X
 * F) int, 6
 * G) boolean, false
 * H) boolean, true
 * 
 * Section 3:
 * Question 1:
 * b) 15
 * 
 * Question 2:
 * c)for(int i=0; i<10; i++){
 * if (i%2 == 0){
 * System.out.println(i);}
 * 
 * Question 3:
 * a) 25
 * 
 * Question 4:
 * Refer to code above
 * 
 * Question 5:
 * Refer to code above
 */



