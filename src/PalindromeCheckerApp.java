import java.util.LinkedList;

/**
 * =====================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =====================================================================
 * Use Case 9: Recursive Palindrome Checker
 * Description: This class validates a palindrome using recursion.
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input : " + input);

        boolean isPalindrome = check(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base case: pointers meet or cross
        if (start >= end) {
            return true;
        }
        // Check characters at current pointers
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        // Recursive step
        return check(s, start + 1, end - 1);
    }
}