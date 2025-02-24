package a2;

import java.util.Scanner;

public class Task13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println(max);
    }
}