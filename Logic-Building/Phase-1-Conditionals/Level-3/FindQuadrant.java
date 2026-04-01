public class FindQuadrant {
    public static void main(String[] args) {
        int x = 5; // Example x-coordinate
        int y = -3; // Example y-coordinate
        String quadrant = findQuadrant(x, y);
        System.out.println("The point (" + x + ", " + y + ") is in " + quadrant);
    }

    public static String findQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return "Quadrant 1";
        } else if (x < 0 && y > 0) {
            return "Quadrant 2";
        } else if (x < 0 && y < 0) {
            return "Quadrant 3";
        } else if (x > 0 && y < 0) {
            return "Quadrant 4";
        } else if (x == 0 && y != 0) {
            return "On the Y-axis";
        } else if (y == 0 && x != 0) {
            return "On the X-axis";
        } else {
            return "At the Origin";
        }
    }
}
