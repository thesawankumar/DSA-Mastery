public class FindClockAngle {
    public static void main(String[] args) {
        int hours = 3; // Example hours
        int minutes = 15; // Example minutes

        double angle = findClockAngle(hours, minutes);
        System.out.println("The angle between the hour and minute hands at " + hours + ":" + minutes + " is: " + angle
                + " degrees.");
    }

    public static double findClockAngle(int hours, int minutes) {
        // Calculate the position of the hour hand
        double hourAngle = (hours % 12) * 30 + minutes * 0.5;

        // Calculate the position of the minute hand
        double minuteAngle = minutes * 6;

        // Calculate the absolute difference between the two angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Return the smaller angle
        return Math.min(angle, 360 - angle);
    }

}
