public class CheckDistinctDigits {
    public static void main(String[] args) {
        int number = 1234; // Example number
        boolean hasDistinctDigits = checkDistinctDigits(number);
        System.out.println("Does the number " + number + " have distinct digits? " + hasDistinctDigits);
    }

    public static boolean checkDistinctDigits(int number) {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            for (int j = i + 1; j < numStr.length(); j++) {
                if (numStr.charAt(i) == numStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}