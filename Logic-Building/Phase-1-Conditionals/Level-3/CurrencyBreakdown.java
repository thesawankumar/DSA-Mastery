public class CurrencyBreakdown {
    public static void main(String[] args) {
        int amount = 3700;

        if (amount % 100 != 0) {
            System.out.println("Not possible");
            return;
        }

        int notes2000 = amount / 2000;
        amount = amount % 2000;

        int notes500 = amount / 500;
        amount = amount % 500;

        int notes100 = amount / 100;

        System.out.println("2000 notes: " + notes2000);
        System.out.println("500 notes: " + notes500);
        System.out.println("100 notes: " + notes100);
    }
}