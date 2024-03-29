import java.util.Scanner;

public class SafeInput {
    /**
     * Get a non-zero length String input from the user.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @return a non-zero length String input from the user
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString;
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.isEmpty());
        return retString;
    }

    /**
     * Get an integer input from the user.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @return an integer input from the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt;
        do {
            System.out.print(prompt + ": ");
            while (!pipe.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print(prompt + ": ");
                pipe.next(); // Consume invalid input
            }
            retInt = pipe.nextInt();
        } while (retInt <= 0); // Allow only positive integers
        return retInt;
    }

    /**
     * Get a double input from the user.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @return a double input from the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble;
        do {
            System.out.print(prompt + ": ");
            while (!pipe.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a double.");
                System.out.print(prompt + ": ");
                pipe.next(); // Consume invalid input
            }
            retDouble = pipe.nextDouble();
        } while (retDouble <= 0); // Allow only positive doubles
        return retDouble;
    }

    /**
     * Get an integer input within a specified inclusive range from the user.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return an integer input within the specified range from the user
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt;
        do {
            System.out.print(prompt + " (" + low + " - " + high + "): ");
            while (!pipe.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer within the range.");
                System.out.print(prompt + " (" + low + " - " + high + "): ");
                pipe.next(); // Consume invalid input
            }
            retInt = pipe.nextInt();
        } while (retInt < low || retInt > high);
        return retInt;
    }

    /**
     * Get a double input within a specified inclusive range from the user.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return a double input within the specified range from the user
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble;
        do {
            System.out.print(prompt + " (" + low + " - " + high + "): ");
            while (!pipe.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a double within the range.");
                System.out.print(prompt + " (" + low + " - " + high + "): ");
                pipe.next(); // Consume invalid input
            }
            retDouble = pipe.nextDouble();
        } while (retDouble < low || retDouble > high);
        return retDouble;
    }

    /**
     * Get a Yes or No confirmation from the user.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @return true if the user confirms with Y/y, false otherwise
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        char userInput;
        do {
            System.out.print(prompt + " (Y/N): ");
            userInput = Character.toUpperCase(pipe.next().charAt(0));
            pipe.nextLine(); // Consume newline character
            if (userInput != 'Y' && userInput != 'N') {
                System.out.println("Invalid input. Please enter Y/y for Yes or N/n for No.");
            }
        } while (userInput != 'Y' && userInput != 'N');
        return userInput == 'Y';
    }

    /**
     * Get a String input from the user that matches a specified regular expression pattern.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  the regular expression pattern in Java String format to use for matching
     * @return a String input from the user that matches the specified regular expression pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String userInput;
        do {
            System.out.print(prompt + ": ");
            userInput = pipe.nextLine();
            if (!userInput.matches(regEx)) {
                System.out.println("Invalid input. Please enter a valid input that matches the specified pattern.");
            }
        } while (!userInput.matches(regEx));
        return userInput;
    }
}
