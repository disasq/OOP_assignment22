package a2_2;


public class Task8 {
    public static void main(String[] args) {
        long number = 5;
        System.out.println("Cube of " + number + ": " + cube(number));
    }

    public static long cube(long number) {
        return number * number * number;
    }
}
