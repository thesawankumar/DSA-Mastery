public class CheckMiddleDigitLargestSmallest {
    public static void main(String[] args) {
        int mumber = 123456;
        int middleDigit = (mumber / 100) % 10;
        int largestDigit = 0;
        int smallestDigit = 9;
        int temp = mumber;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            temp /= 10;
        }
        if (middleDigit > largestDigit) {
            System.out.println("The middle digit " + middleDigit + " is the largest.");
        } else if (middleDigit < smallestDigit) {
            System.out.println("The middle digit " + middleDigit + " is the smallest.");
        } else {
            System.out.println("The middle digit " + middleDigit + " is neither the largest nor the smallest.");
        }

    }
}
