public class PrintFactors {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.println(i);

            }
        }
        System.out.println("Sum of factors: " + sum);
    }
}
