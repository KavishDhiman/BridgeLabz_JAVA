package Strings.Level1;

public class ArrayIndexDemo {

    static void generateException() {
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]);
    }

    static void handleException() {
        try {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
