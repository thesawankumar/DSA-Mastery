public class FindCenturyFromYear {
    public static void main(String[] args) {
        int year = 2024; // Example year

        int century = findCentury(year);
        System.out.println("The year " + year + " is in the " + century + " century.");
    }

    public static int findCentury(int year) {
        if (year % 100 == 0) {
            return year / 100;
        } else {
            return (year / 100) + 1;
        }
    }
}
