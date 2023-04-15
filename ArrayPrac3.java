public class ArrayPrac3{
    public static void main(String[] args){
        int num[] = new int[10];
        for (int i = 0; i < 10; i++){
            num[i] = i+1;
            System.out.print(num[i] + " ");

            if(i%2!=0){
                num[i] = num[i-1];
            }
            else{
                num[i] = num[i+1];
            }
        }
    }
}