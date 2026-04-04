public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (rev == temp) {
            System.out.println("It's palindrome Number");
        } else {
            System.out.println("It's Not Palindrome Number");
        }
    }
}
