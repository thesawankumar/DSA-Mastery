public class CheckEqIsandScTriangle {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}
