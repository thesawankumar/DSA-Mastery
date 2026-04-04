public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci terms
        int a = 0, b = 1;
        int sum = a + b; // Initialize sum with the first two Fibonacci numbers

        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b; // Calculate the next Fibonacci number
            System.out.print(next + " ");
            sum += next; // Add the next Fibonacci number to the sum
            a = b; // Update a to the last Fibonacci number
            b = next; // Update b to the current Fibonacci number
        }
        System.out.println("\nSum of Fibonacci Series: " + sum);
    }
}
