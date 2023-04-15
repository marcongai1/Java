import java.util.ArrayList;
public class selectionSort{
    public selectionSort(){
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

        //Selection Sort
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        System.out.println(list);
    }
        
    
    public static void main(String[] args){
        selectionSort app = new selectionSort();
    }
}