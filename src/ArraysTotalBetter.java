import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraysTotalBetter {
    static void even(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersEven = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            if ((numbers.get(i)) % 2 == 0) {
                numbersEven.add(numbers.get(i));
            }
        }
        System.out.println("Random List of Even Integers: " + numbersEven);
    }

    static void odd(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersOdd = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            if ((numbers.get(i)) % 2 == 0) {
                numbersOdd.add(numbers.get(i));
            }
        }
        System.out.println("Random List of Odd Integers: " + numbersOdd);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(r.nextInt(1000));
        }
        System.out.println("Random List of Numbers: " + numbers);

        even(numbers);
        odd(numbers);
    }
}