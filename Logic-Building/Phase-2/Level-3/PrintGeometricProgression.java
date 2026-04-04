public class PrintGeometricProgression {
    public static void main(String[] args) {
        int a = 1; // First term
        int r = 2; // Common ratio
        int n = 10; // Number of terms

        for (int i = 0; i < n; i++) {
            int term = (int) (a * Math.pow(r, i));
            System.out.println(term);
        }
    }
}
