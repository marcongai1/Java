import java.util.ArrayList;
import java.util.Arrays;
public class criticalQs{
    public static ArrayList<String> addingLetters(String str){
        ArrayList<String> word = new ArrayList<String>();
        String wchar = "";
        for(int i = 0; i < str.length();i++){
            wchar = str.substring(i, i+1);
            word.add(wchar);
            word.add(wchar);
        } 
        return word;
    }
    public static ArrayList<String> removeVowels(String str){
        ArrayList<String> consonant = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++){
            if(!str.substring(i, i+1).equals("a")&&!str.substring(i, i+1).equals("e")&&!str.substring(i, i+1).equals("i")&&!str.substring(i, i+1).equals("o")&&!str.substring(i, i+1).equals("u")){
                if(consonant.indexOf(str.substring(i, i+1))<0){
                    consonant.add(str.substring(i, i+1));
                }
            }
        }
        return consonant;
    }
    public static String doubleVowel(String str){
        String[] vowels = {"a","e","i","o","u"};
        if(str.length()<=0){
            return str;
        }
        if(Arrays.asList(vowels).contains(str.substring(0, 1))){
            return str.substring(0, 1)+ str.substring(0, 1)+  doubleVowel(str.substring(1));
        }
        return str.substring(0, 1)+doubleVowel(str.substring(1));
    }
    public static void traversing(){
        
    }
    public static void main(String[] args){
        criticalQs app = new criticalQs();
        System.out.println(addingLetters("hello"));
        System.out.println(removeVowels("hello"));
        System.out.println(doubleVowel("hello"));
    }
}