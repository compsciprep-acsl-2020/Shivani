import java.util.ArrayList;

public class ProjectEuler_Problem20 {
    public static void main(String[] args) {
        int number = 101;
        int factorialNumber = 1;

        while (number != 1) {
            factorialNumber = factorialNumber * number;
            number--;
            System.out.println(number);
        }

        int sum = 0;

        while (factorialNumber != 0)
        {
            sum = sum + factorialNumber % 10;
            factorialNumber = factorialNumber/10;
        }

        System.out.println(sum);

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
    }
}
