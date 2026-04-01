

public class FizzBuzzCheck {
    public static void main(String[] args) {
        int number = 15;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is FizzBuzz.");
        } else if (number % 3 == 0) {
            System.out.println(number + " is Fizz.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is Buzz.");
        } else {
            System.out.println(number + " is not Fizz, Buzz, or FizzBuzz.");
        }
    }
}
