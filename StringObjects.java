import java.util.Scanner;

public class StringObjects{
    public StringObjects(){
        // //1
        // String str = "";
        // String rev = "";
        // char ch;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter Word: ");
        // str = input.nextLine();
        // for (int i=0; i<str.length(); i++){
        //     ch = str.charAt(i);
        //     rev = ch + rev;
        // }
        // System.out.print("Reversed word: " + rev);
        // input.close();

        // //2
        // String str2 = "";
        // String replaced = "";
        // Scanner input2 = new Scanner(System.in);
        // System.out.print("Enter Word: ");
        // str2 = input2.nextLine();
        // str2.toLowerCase();
        // for (int i = 0; i<str2.length(); i++){
        //     char temp = str2.charAt(i);
        //     if(temp == 'a'||temp == 'e'||temp == 'i'||temp == 'o'||temp == 'u'){
        //         int ascii = (int)(Math.random()*41)+80;
        //         char ch2 = (char) ascii;
        //         replaced = str2.replace(str2.charAt(i),ch2);
        //         str2 = replaced;
        //     }
        // }
        // System.out.println("ASCII 80-121 replace vowls: " + replaced);
        // input2.close();

        //3
        String str3 = "";
        String chop = "";
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Input: ");
        str3 = input3.nextLine();
        str3.toLowerCase();
        System.out.print(Chop(str3));
        input3.close();
    }


    public static String Chop(String str){
        StringBuilder chop = new StringBuilder(str);
        chop.deleteCharAt(str.length() - 1);
        chop.deleteCharAt(0);
        for (int i = 0; i<chop.length(); i++){
            char temp = chop.charAt(i);
            if(temp == ' '){
                chop.deleteCharAt(i+1);
                chop.deleteCharAt(i-1);
            }
    }
    return chop.toString();
}
    
    public static void main(String[] args){
        StringObjects app = new StringObjects();
    }
}
    