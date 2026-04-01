public class ValidatePassword {
    public static void main(String[] args) {
        String password = "Passw0rd!"; // Example password

        if (isValidPassword(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid.");
        }
    }

    public static boolean isValidPassword(String password) {
        // Check if password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        
        // Check if password contains at least one uppercase letter
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Check if password contains at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        // Check if password contains at least one special character
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()-+";
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        return true;
    }
}
