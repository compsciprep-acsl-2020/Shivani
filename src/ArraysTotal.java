import java.util.Random;

public class ArraysTotal {
    static void even(int numbers[]) {
        int numbersEven[] = new int[100];
        for (int i = 0; i < 100; i++) {
            if (numbers[i] % 2 == 0) {
                numbersEven[i] = numbers[i];
            }
        }
        System.out.println("Random List of Even Integers: " + numbersEven.toString());
    }

    static void odd(int numbers[]) {
        int numbersOdd[] = new int[100];
        for (int i = 0; i < 100; i++) {
            if (numbers[i] % 2 == 1) {
                numbersOdd[i] = numbers[i];
            }
        }
        System.out.println("Random List of Odd Integers: " + numbersOdd.toString());
    }

    public static void main(String[] args) {
        int numbers[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            numbers[i] = r.nextInt(1000);
        }
        System.out.println("Random List of Numbers: " + numbers.toString());

        even(numbers);
        odd(numbers);
    }
}