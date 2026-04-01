public class CheckGeometricProgression {
    public static void main(String[] args) {
        int a = 2; // Example term 1
        int b = 4; // Example term 2
        int c = 8; // Example term 3

        if (isGeometricProgression(a, b, c)) {
            System.out.println(a + ", " + b + ", and " + c + " form a geometric progression.");
        } else {
            System.out.println(a + ", " + b + ", and " + c + " do not form a geometric progression.");
        }
    }
    private static boolean isGeometricProgression(int a, int b, int c) {
        return (b != 0 && c != 0) && (b / a == c / b);
    }

}
