public class CheckMultipleOf7OrEndsWith7 {
    public static void main(String[] args) {
        int number = 7; // Example number
        boolean isMultipleOf7OrEndsWith7 = checkMultipleOf7OrEndsWith7(number);
        System.out.println(
                "Is the number " + number + " a multiple of 7 or does it end with 7? " + isMultipleOf7OrEndsWith7);
    }

    public static boolean checkMultipleOf7OrEndsWith7(int number) {
        return (number % 7 == 0) && (number % 10 == 7);
    }

}
