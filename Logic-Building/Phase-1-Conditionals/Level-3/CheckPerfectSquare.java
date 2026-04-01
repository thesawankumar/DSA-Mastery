public class CheckPerfectSquare {
    public static void main(String[] args) {
        int number = 17; // Example number
        boolean isPerfectSquare = checkPerfectSquare(number);
        System.out.println("Is the number " + number + " a perfect square? " + isPerfectSquare);
    }
    //without using Math.sqrt() method
    public static boolean checkPerfectSquare(int number) {
        if (number < 0) {
            return false; // Perfect squares are non-negative
        }
        int i = 0;
        while (i * i < number) {
            i++;
        }
        return i * i == number;
    }
}
