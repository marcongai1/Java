public class ArrayPrac2{
    public static void main(String[] args){
        int rand[] = new int[30];
        for (int i = 0; i < 30; i++){
            int temp;
            rand[i] = (int)(Math.random()*50) + 1;
            System.out.print(rand[i] + " ");
            if (i%2==0){
                rand[i] = 5;
            }
            System.out.print(rand[i] + " ");
        }
        System.out.println();

        int temp[] = new int[30];
        int ind = 29;
        for(int i = 0; i < (30); i++){
            temp[ind] = rand[i];
            ind--;
        }

        for(int i = 0; i < (30); i++){
            rand[i] = temp[i];
        }
        for(int i = 0; i < rand.length; i++){
            System.out.print(rand[i] + " ");
        }
    }
}