public class FindThirdAngleOfTriangle {
    public static void main(String[] args) {
        int angle1 = 60; // Example angle 1
        int angle2 = 90; // Example angle 2
        int angle3 = findThirdAngle(angle1, angle2);
        System.out.println("The third angle of the triangle is: " + angle3);
    }

    private static int findThirdAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}
