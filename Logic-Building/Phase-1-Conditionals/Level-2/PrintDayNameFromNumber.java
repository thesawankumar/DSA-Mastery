public class PrintDayNameFromNumber {
    public static void main(String[] args) {
        int dayNumber = 3; // Example day number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)

        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}
