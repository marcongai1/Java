import java.util.Random;

public class array2DProgramPracT2{
    public array2DProgramPracT2(){
        
    }

    public static void fillArray(int[][] array, int start, int end, int targetCount) {
        int size = array.length * array[0].length;
        int[] numbers = new int[size];
        int index = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 0; j < targetCount; j++) {
                numbers[index++] = i;
            }
        }
        shuffleArray(numbers);
        index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = numbers[index++];
            }
        }
    }

    private static void shuffleArray(int[] numbers) {
        Random random = new Random();
        for (int i = numbers.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;
        }
    }
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        array2DProgramPracT2 app = new array2DProgramPracT2();
        int[][] array2by2 = new int[2][2];
        fillArray(array2by2, 1, 2, 2);
        printArray(array2by2);

        int[][] array4by4 = new int[4][4];
        fillArray(array4by4, 1, 2, 4);
        printArray(array4by4);

        int[][] array6by6 = new int[6][6];
        fillArray(array6by6, 1, 18, 2);
        printArray(array6by6);

        int[][] array6by6_2 = new int[6][6];
        fillArray(array6by6_2, 1, 9, 4);
        printArray(array6by6_2);
    }
}

