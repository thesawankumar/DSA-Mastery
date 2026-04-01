public class CheckCurrencyDivision {
    public static void main(String[] args) {
        int amount = 1200; // Example amount
        boolean canDivideIntoCurrency = checkCurrencyDivision(amount);
        System.out.println("Can the amount " + amount + " be divided into currency denominations? " + canDivideIntoCurrency);
    }
    public static boolean checkCurrencyDivision(int amount) {
        int[] denominations = {2000, 500, 200, 100}; // Common currency denominations
        for (int denomination : denominations) {
            if (amount % denomination == 0) {
                return true; // The amount can be divided into this denomination
            }
        }
        return false; // The amount cannot be divided into any of the denominations
    }
}
