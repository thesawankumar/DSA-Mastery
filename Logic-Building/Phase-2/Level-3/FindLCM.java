public class FindLCM {
    public static void main(String[] args) {
        // another way to find lcm is (a*b)/hcf
        int a = 48;
        int b = 18;
        int hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
