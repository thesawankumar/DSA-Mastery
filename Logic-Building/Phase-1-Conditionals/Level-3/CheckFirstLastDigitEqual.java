public class CheckFirstLastDigitEqual {
    public static void main(String[] args) {
        int number = 1231; // Example number
        boolean isFirstLastDigitEqual = checkFirstLastDigitEqual(number);
        System.out.println(
                "Does the number " + number + " have the first and last digits equal? " + isFirstLastDigitEqual);
    }

    public static boolean checkFirstLastDigitEqual(int number) {
        String numStr = Integer.toString(number);
        char firstDigit = numStr.charAt(0);
        char lastDigit = numStr.charAt(numStr.length() - 1);
        return firstDigit == lastDigit;
    }
}
