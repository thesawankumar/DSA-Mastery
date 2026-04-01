public class FindMedianOfThree {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 8;

        int median;

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            median = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            median = b;
        } else {
            median = c;
        }

        System.out.println("The median of " + a + ", " + b + ", and " + c + " is: " + median);
    }
}
