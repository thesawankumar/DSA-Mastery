public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n = 28;
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("It's a Prime Number");
        } else {
            System.out.println("It's Not a Prime Number");
        }

    }
}
