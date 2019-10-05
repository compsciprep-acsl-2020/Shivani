public class ProjectEuler_Problem6 {
    public static void main(String[] args) {
        int sumSquare = 0;
        int squareSum = 0;

        for (int number = 0; number <= 100; number++) {
            sumSquare += Math.pow(number, 2);
        }

        int sumTill100 = 100 * 101 / 2;
        squareSum = (int) Math.pow(sumTill100, 2);

        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " + Math.abs(sumSquare - squareSum) + ".");
    }
}

