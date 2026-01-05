package January_2026;

public class Maximun_Matrix_Sum {


    public static long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];

                if (val < 0) negCount++;

                int absVal = Math.abs(val);
                totalSum += absVal;
                minAbs = Math.min(minAbs, absVal);
            }
        }

   
        if (negCount % 2 == 1) {
            totalSum -= 2L * minAbs;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        
        int arr[][] = {{1,-1},{-1,1}};
        System.out.println(maxMatrixSum(arr));
    }
}

