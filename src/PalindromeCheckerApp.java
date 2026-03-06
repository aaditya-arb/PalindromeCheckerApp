/**
 * Use Case 9: Recursive Palindrome Checker
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input : " + input);
        boolean isPalindrome = check(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base case: pointers meet or cross
        if (start >= end) {
            return true;
        }
        // Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}