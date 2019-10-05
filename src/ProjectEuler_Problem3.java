import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectEuler_Problem3 {

    static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        long number = 600851475143L;


        for (int checkingNumber = 1; checkingNumber < number; checkingNumber++) {
            if ((number % checkingNumber == 0) && (prime(checkingNumber))) {
                primeFactors.add(checkingNumber);
            }
        }
        System.out.println("The largest prime factor of the number 600851475143 is " + Collections.max(primeFactors) + ".");
    }
}