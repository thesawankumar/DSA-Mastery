public class CheckNumberDigitType {
    public static void main(String[] args) {
        int number = 1234; // Example number
        String digitType = checkNumberDigitType(number);
        System.out.println("The number " + number + " is a " + digitType + " digit number.");
    }

    public static String checkNumberDigitType(int number) {
        if (number >= 0 && number <= 9) {
            return "single";
        } else if (number >= 10 && number <= 99) {
            return "double";
        } else if (number >= 100 && number <= 999) {
            return "triple";
        } else if (number >= 1000 && number <= 9999) {
            return "four-digit";
        } else {
            return "multi-digit";
        }
    }
}