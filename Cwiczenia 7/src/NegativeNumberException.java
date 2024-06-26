import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Mine {
    private static final int ARRAY_SIZE = 10;
    private static int[] numbers = new int[ARRAY_SIZE];

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }
    public static void fillArray() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        fillArray();

        System.out.println("Zawartość tablicy:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

