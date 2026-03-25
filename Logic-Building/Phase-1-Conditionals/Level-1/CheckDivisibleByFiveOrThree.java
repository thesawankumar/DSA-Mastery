public class CheckDivisibleByFiveOrThree {
    public static void main(String[] args) {
        int n = 19;
        if (n % 5 == 0 || n % 3 == 0) {
            System.out.println("Divisible by 5 or 3");
        } else {
            System.out.println("Not Divisible by 5 or 3");
        }
    }
}
