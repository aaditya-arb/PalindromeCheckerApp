interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Provides a Stack based implementation of PalindromeStrategy.
 * Uses LIFO behavior to reverse characters for comparison.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Example of injecting the strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        String input = "level";
        System.out.println("Result: " + strategy.check(input));
    }
}