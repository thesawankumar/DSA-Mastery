public class CheckDigitSumEqualsMiddle {
    public static void main(String[] args) {
        int num = 123; // Example three-digit number

        if (isDigitSumEqualsMiddle(num)) {
            System.out.println("The sum of the first and last digits of " + num + " equals the middle digit.");
        } else {
            System.out.println("The sum of the first and last digits of " + num + " does not equal the middle digit.");
        }
    }

    public static boolean isDigitSumEqualsMiddle(int num) {
        int firstDigit = num / 100;
        int middleDigit = (num / 10) % 10;
        int lastDigit = num % 10;

        return (firstDigit + lastDigit) == middleDigit;
    }
}
