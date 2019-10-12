import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListExercise2  {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sum = 0;
        // Average
        for (int index = 0; index < numbers.size(); index++) {
            int number = numbers.get(index);
            sum += number;
        }

        System.out.println("Average: " + sum/numbers.size());

        //System.out.println("Highest to Lowest: " + Collections.reverse(numbers.sort()));

        for (int index = numbers.size() - 1; index >= 0; index--) {
            int number = numbers.get(index);
            if (number % 2 == 0) {
                numbers.remove(index);
            }
        }

        System.out.println("Evens: " + numbers);
    }
}