
public class CheckPointPosition {
    public static void main(String[] args) {
        int x = 3; // Example x-coordinate
        int y = -2; // Example y-coordinate

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") is in the fourth quadrant.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        } else if (x == 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is on the X-axis.");
        }
    }
}
