package a2;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 1;
            doubleArray[i] = (i + 1) *1.1;
        }

        for (int value : intArray) {
            System.out.print(value + " ");
        }

        System.out.println();

        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
    }
}
