public class SumOfN {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int sum = (i * (i + 1)) / 2;
            System.out.println(sum);
        }
        // another way
        // int sum = 0;
        // for (int i = 0; i <= 10; i++) {
        // sum += i;
        // System.out.println(sum);
        // }
    }
}
