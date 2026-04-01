public class CompareTwoDates {
    public static void main(String[] args) {
        int day1 = 15, month1 = 8, year1 = 2022; // Example date 1
        int day2 = 10, month2 = 8, year2 = 2022; // Example date 2

        if (isFirstDateEarlier(day1, month1, year1, day2, month2, year2)) {
            System.out.println("The first date is earlier than the second date.");
        } else if (isFirstDateEarlier(day2, month2, year2, day1, month1, year1)) {
            System.out.println("The second date is earlier than the first date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }

    public static boolean isFirstDateEarlier(int day1, int month1, int year1, int day2, int month2, int year2) {
        if (year1 < year2) {
            return true;
        } else if (year1 > year2) {
            return false;
        }

        if (month1 < month2) {
            return true;
        } else if (month1 > month2) {
            return false;
        }

        return day1 < day2;
    }

}
