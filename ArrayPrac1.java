public class ArrayPrac1{
    public static void main(String[] args){
        int counter = 0;
        int rand[] = new int[40];
        for (int i = 0; i < 40; i++){
            rand[i] = ((int) Math.random()*50) + 1;
            if (rand[i] % 2 == 0)
                rand[i]-=2;
            if (i%2!=0)
                rand[i] = 5;
            if (i%2==0 && i%3==1)
                rand[i] = 8;
            if (i%2!=0 && i%4==3)
                rand[i] = 400;
            if (i%5==0){
                counter++;
                if (counter%1 == 0)
                    rand[i] = 7;
                else
                    rand[i] = 8;
            }
        }
    } 
}
