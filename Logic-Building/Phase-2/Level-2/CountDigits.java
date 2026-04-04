
public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;

        while (n > 0) {
            n = n / 10; // Remove the last digit
            count++; // Increment the count of digits
        }

        System.out.println("Number of digits: " + count);
    }
}
