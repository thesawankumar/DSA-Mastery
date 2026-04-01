public class CalculateElectricityBill {
    public static void main(String[] args) {
        int unitsConsumed = 350; // Example units consumed
        double billAmount;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 0.5; // Rate for first 100 units
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 0.5 + (unitsConsumed - 100) * 0.75; // Rate for next 100 units
        } else {
            billAmount = 100 * 0.5 + 100 * 0.75 + (unitsConsumed - 200) * 1.0; // Rate for above 200 units
        }

        System.out.println("The electricity bill for " + unitsConsumed + " units is: $" + billAmount);
    }
}
