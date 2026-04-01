
public class CheckPythagoreanTriplet {
    public static void main(String[] args) {
        int a = 3; // Example side 1
        int b = 4; // Example side 2
        int c = 5; // Example side 3

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println(a + ", " + b + ", and " + c + " form a Pythagorean triplet.");
        } else {
            System.out.println(a + ", " + b + ", and " + c + " do not form a Pythagorean triplet.");
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);
    }
}
