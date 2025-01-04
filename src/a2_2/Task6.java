package a2_2;

public class Task6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(5);
        universalMethod("Hello");
        universalMethod(3, 4);
        universalMethod(1.5, 2.5);
        universalMethod(5, 3.14);
        universalMethod("Hello", 3);
        universalMethod(3, "World");
        universalMethod("Goodbye", 2.5);
        universalMethod(10, 20, 30);
    }

    public static void universalMethod() {
        System.out.println("No parameters");
    }

    public static void universalMethod(int num) {
        System.out.println("Integer: " + num);
    }

    public static void universalMethod(String str) {
        System.out.println("String: " + str);
    }

    public static void universalMethod(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void universalMethod(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    public static void universalMethod(int a, double b) {
        System.out.println("Integer + Double: " + (a + b));
    }

    public static void universalMethod(String str, int num) {
        System.out.println("String + Integer: " + str + " " + num);
    }

    public static void universalMethod(int num, String str) {
        System.out.println("Integer + String: " + num + " " + str);
    }

    public static void universalMethod(String str, double num) {
        System.out.println("String + Double: " + str + " " + num);
    }

    public static void universalMethod(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
}

