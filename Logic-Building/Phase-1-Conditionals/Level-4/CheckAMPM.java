public class CheckAMPM {
    public static void main(String[] args) {
        int hour = 14; // Example hour in 24-hour format

        if (hour >= 0 && hour < 12) {
            System.out.println(hour + " is in the AM.");
        } else if (hour >= 12 && hour < 24) {
            System.out.println(hour + " is in the PM.");
        } else {
            System.out.println(hour + " is not a valid hour.");
        }
    }
}
