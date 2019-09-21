public class Binary {
    public static void main(String[] args) {
        int decimalNumber = 17; // enter the decimal number here
        int largestNumber = 0;
        String binaryNumber = "";

        while (((Math.pow(2, largestNumber)) > decimalNumber) == (false)) {
            largestNumber = largestNumber + 1;
        }

        largestNumber--;

        int numberLeft = decimalNumber;
        while (numberLeft != 0) {
            if (numberLeft > Math.pow(2, largestNumber)) {
                numberLeft = (int) (numberLeft - Math.pow(2, largestNumber));
                largestNumber--;
                binaryNumber = binaryNumber + "1";
            }
            else {
                largestNumber--;
                binaryNumber = binaryNumber + "0";
            }
        }
        System.out.println("The binary evaluation of " + decimalNumber + " is " + binaryNumber + ".");
    }
}
