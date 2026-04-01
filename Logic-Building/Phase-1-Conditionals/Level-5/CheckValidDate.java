public class CheckValidDate {
    public static void main(String[] args) {
        int day = 29; // Example day
        int month = 2; // Example month
        int year = 2020; // Example year

        if (isValidDate(day, month, year)) {
            System.out.println(day + "/" + month + "/" + year + " is a valid date.");
        } else {
            System.out.println(day + "/" + month + "/" + year + " is not a valid date.");
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        // Check if the year is valid
        if (year < 1) {
            return false;
        }

        // Check if the month is valid
        if (month < 1 || month > 12) {
            return false;
        }

        // Check if the day is valid for the given month and year
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }

        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
