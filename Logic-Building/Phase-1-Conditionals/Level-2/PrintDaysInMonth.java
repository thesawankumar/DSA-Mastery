public class PrintDaysInMonth {
    public static void main(String[] args) {
        int month = 2; // Example month number (1 for January, 2 for February, ..., 12 for December)

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days (depending on leap year)");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}
