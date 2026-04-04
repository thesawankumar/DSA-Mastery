public class PrintArithmeticProgression {
    public static void main(String[] args) {
        int a = 1; // First term
        int d = 2; // Common difference
        int n = 10; // Number of terms

        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.println(term);
        }
    }
}
