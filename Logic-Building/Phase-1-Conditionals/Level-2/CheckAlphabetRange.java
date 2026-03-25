public class CheckAlphabetRange {
    public static void main(String[] args) {
        char letter = 'G'; // Example letter

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is an uppercase letter.");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is a lowercase letter.");
        } else {
            System.out.println(letter + " is not an alphabetic character.");
        }
    }
}