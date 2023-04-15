import java.lang.reflect.Array;
import java.util.ArrayList;
public class ArrayListPTask{
    public ArrayListPTask(){
        //ArrayList with 50 random integers between 1 and 100 inclusive
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            list.add((int)(Math.random()*100)+1);
        }
        System.out.println(list);
        Div3(list);
        System.out.println(oddCounter(list));
        replaceOdd(list);
        add5Int(list);
        add10Int(list);
        System.out.println(largestInt(list));
        }

    public static void Div3(ArrayList<Integer> list){
        //Removes all numbers divisible by 3
        for (int i = list.size()-1; i >= 0; i--){
            if (list.get(i)%3==0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    public static int oddCounter(ArrayList<Integer> list){
        //Counts the number of odd numbers in an arraylist
        int count = 0;
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i)%2 != 0){
                count++;
            }
        }
        return count;
    }

    public static void replaceOdd(ArrayList<Integer> list){
        //Sets all odd numbers to the number that follows it in the list. If the last number is odd, replace it with the first number in the list.
        for (int i = list.size()-1; i>= 0; i--){
            if (list.get(i)%2 != 0){
                if(list.get(i) == list.get(list.size()-1)){
                    list.set(list.size()-1, list.get(0));
                }
                else{
                    list.set(i,list.get(i+1));
                }  
            }
        }
        System.out.println(list);
    }

    public static void add5Int(ArrayList<Integer> list){
        //5 new ints between 101- 200 inclusive are add if there is an odd integer in list. added to beginning
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i)%2 != 0){
                list.add(0, (int)(Math.random()*101)+101);
                list.add(1, (int)(Math.random()*101)+101);
                list.add(2, (int)(Math.random()*101)+101);
                list.add(3, (int)(Math.random()*101)+101);
                list.add(4, (int)(Math.random()*101)+101);
                break;
            }
        }
        System.out.println(list);
    }

    public static void add10Int(ArrayList<Integer> list){
        //adds 10 int is even number in arraylist. inc 101-200. rand location and if rand index = odd need new until even
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i)%2 == 0){
                for (int x = 0; x < 10; x++){
                    int index = (int)(Math.random()*list.size());
                    while (index%2 != 0){
                        index = (int)(Math.random()*list.size());
                    }
                    list.add(index, (int)(Math.random()*101)+101);
                }
                break;
            }
        }
        System.out.println(list);
    }

    public static int largestInt(ArrayList<Integer> list){
        //Write a linear search method that will identify the largest integer in the ArrayList. 
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < list.size()-1; i++){
            if(list.get(i)>temp){
                temp = list.get(i);
            }
        }
        return temp;
    }

    public static void main(String[] args){
        ArrayListPTask app = new ArrayListPTask();
    }
}