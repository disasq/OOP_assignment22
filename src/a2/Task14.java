package a2;

import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                rowSums[i] += array[i][j];
                colSums[j] += array[i][j];
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int sum : rowSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }
        for (int sum : colSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }

        System.out.println(minSum);
    }
}
