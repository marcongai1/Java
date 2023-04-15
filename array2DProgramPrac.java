public class array2DProgramPrac{
    public array2DProgramPrac(){
        //a
        int[][] a = new int[10][10];
        for (int row = 0; row < a.length; row++){
            for(int col = 0; col < a.length; col++){
                a[row][col] = (int)(Math.random()*41)+10;
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

        //b
        int[] colSum = new int[10];
        System.out.println("Column sums: ");
        for (int col = 0; col < a.length; col++){
            int sum = 0;
            for (int row = 0; row < a.length; row++){
                sum += a[row][col];
            }
            colSum[col] = sum;
            System.out.print(colSum[col] + " ");
        }
        System.out.println();

        //c
        int[] rowSum = new int[10];
        System.out.println("Row sums: ");
        for (int row = 0; row < a.length; row++){
            int sum = 0;
            for (int col = 0; col < a.length; col++){
                sum += a[row][col];
            }
            rowSum[row] = sum;
            System.out.print(rowSum[row] + " ");
        }
        System.out.println();

        //d
        int[] colSum2 = new int[10];
        int[] rowSum2 = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
              colSum2[j] += a[i][j];
              rowSum2[i] += a[i][j];
            }
        }

        System.out.println("Column sums: ");
        for (int i = 0; i < 10; i++) {
          System.out.print(colSum2[i] + " ");
        }
        System.out.println();
        System.out.println("Row sums: ");
        for (int i = 0; i < 10; i++) {
          System.out.print(rowSum2[i] + " ");
        }
        System.out.println();

        //e
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int[] rowMaxes = new int[10];
        int[] rowMins = new int[10];
        int[] colMaxes = new int[10];
        int[] colMins = new int[10];
        for (int i = 0; i < 10; i++) {
            int rowMin = Integer.MAX_VALUE;
            int rowMax = Integer.MIN_VALUE;
            int colMin = Integer.MAX_VALUE;
            int colMax = Integer.MIN_VALUE;
            for (int j = 0; j < 10; j++) {
                //e
                if (a[i][j] > maxValue)
                    maxValue = a[i][j];
                //f
                if(a[i][j] < minValue)
                    minValue = a[i][j];
                //g
                if(a[i][j] > rowMax)
                    rowMax = a[i][j];
                if(a[i][j] < rowMin)
                    rowMin = a[i][j];
                if(a[j][i] > colMax)
                    colMax = a[j][i];
                if(a[j][i] < colMin)
                    colMin = a[j][i];
            }
            rowMaxes[i]+=rowMax;
            rowMins[i]+=rowMin;
            colMaxes[i]+=colMax;
            colMins[i]+=colMin;
          }
          System.out.println("Max Value: " + maxValue + " Min Value: " + minValue);

          System.out.println("Columns Max: ");
          for (int i = 0; i < 10; i++) {
            System.out.print(colMaxes[i] + " ");
          }
          System.out.println();
          System.out.println("Columns Min: ");
          for (int i = 0; i < 10; i++) {
            System.out.print(colMins[i] + " ");
          }
          System.out.println();

          System.out.println("Rows Max: ");
          for (int i = 0; i < 10; i++) {
            System.out.print(rowMaxes[i] + " ");
          }
          System.out.println();
          System.out.println("Rows Min: ");
          for (int i = 0; i < 10; i++) {
            System.out.print(rowMins[i] + " ");
          }
          System.out.println();
    }

    public static void main(String[] args){
        array2DProgramPrac app = new array2DProgramPrac();
    }
}