
public class CheckValidTriangle {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
