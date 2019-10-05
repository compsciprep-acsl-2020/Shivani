public class ProjectEuler_Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 0; number < 1000; number++) {
            if (((number % 3) == 0) || (number % 5) == 0) {
                sum += number;
            }
        }
        System.out.println("The sum of all the multiples of 3 and 5 is " + sum +  ".");
    }
}