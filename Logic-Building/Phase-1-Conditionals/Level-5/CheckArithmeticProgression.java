public class CheckArithmeticProgression {
    public static void main(String[] args) {
        int a = 2; // Example term 1
        int b = 4; // Example term 2
        int c = 6; // Example term 3

        if (isArithmeticProgression(a, b, c)) {
            System.out.println(a + ", " + b + ", and " + c + " form an arithmetic progression.");
        } else {
            System.out.println(a + ", " + b + ", and " + c + " do not form an arithmetic progression.");
        }
    }
    public static boolean isArithmeticProgression(int a, int b, int c) {
        return (b - a) == (c - b);
    }
}
