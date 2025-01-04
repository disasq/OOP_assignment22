package a2;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }
        for (int i = 0; i < N; i++) {
            System.out.print("Row " + (i + 1) + ": [");
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print((j > 0 ? ", " : "") + multiArray[i][j]);
            }
            System.out.println("]");
        }
    }
}