public class CheckNumberInRange {
    public static void main(String[] args) {
        int number = 500; // Example number
        boolean isInRange = checkNumberInRange(number);
        System.out.println("Is the number " + number + " in the range of 100 to 999? " + isInRange);
    }

    public static boolean checkNumberInRange(int number) {
        return number >= 100 && number <= 999;
    }

}
