import java.util.ArrayList;
public class insertionSort{
    public insertionSort(){
        //Creates List of values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(105);
        list.add(8);
        list.add(2);
        list.add(16);
        list.add(1);
        list.add(18);
        list.add(27);
        list.add(-10);
        list.add(12);
        System.out.println(list);

        //Insertion Sort
        int x,y;
        for (int i = 0; i < list.size(); i++){
            x = list.get(i);
            for (int z = 0; z < i; z++){
                if (x < list.get(z)){
                    y = list.get(z);
                    list.set(z,list.get(i));
                    list.set(i,y);
                }
            }
        }
        System.out.println(list);
    }


    public static void main(String[] args){
        insertionSort app = new insertionSort();
    }
}