public class CheckTaxEligibility {
    public static void main(String[] args) {
        int age = 30; // Example age
        double income = 45000.0; // Example income

        if (age >= 18 && income > 40000) {
            System.out.println("You are eligible to pay taxes.");
        } else {
            System.out.println("You are not eligible to pay taxes.");
        }
    }
}
