public class CheckWeekdayOrWeekend {
    public static void main(String[] args) {
        int day = 6; // Example day (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)

        if (day >= 1 && day <= 5) {
            System.out.println("It's a weekday.");
        } else if (day == 6 || day == 7) {
            System.out.println("It's a weekend.");
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}
