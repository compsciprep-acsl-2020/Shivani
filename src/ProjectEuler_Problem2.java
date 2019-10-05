public class ProjectEuler_Problem2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int collectiveSum = 2;
        int num1Temp;

        while (num2 < 4000000) {
            if (num2 % 2 == 0) {
                collectiveSum += num2;
            }
            num1Temp = num1;
            num1 = num2;
            num2 += num1Temp;

            System.out.println("Num 1: " + num1);
            System.out.println("Num 2: " + num2);
        }
        System.out.println("The sum of the terms in the Fibonacci sequence whose values do not exceed four million is " + collectiveSum + ".");
    }
}