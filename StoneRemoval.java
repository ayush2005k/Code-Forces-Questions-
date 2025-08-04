import java.util.InputMismatchException;
import java.util.Scanner;

public class StoneRemoval {
    /**
     * This program calculates the minimum number of stones to remove so that no two neighboring stones have the same color.
     * The logic is to count the number of times an adjacent pair of stones have the same color.
     * Each such pair requires one stone to be removed, so the total count is the answer.
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        try {
            System.out.print("Enter the number of stones (1 <= n <= 50): ");
            // Read the number of stones (n)
            n = scanner.nextInt();
            
            // This is crucial: consume the leftover newline character after reading the integer.
            // Without this, the next `nextLine()` call would read an empty string.
            scanner.nextLine(); 

        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer for the number of stones.");
            scanner.close();
            return;
        }

        System.out.print("Enter the string of colors (e.g., RRG): ");
        // Read the string of colors (s)
        String s = scanner.nextLine();

        // Validate that the length of the string matches the number of stones
        if (s.length() != n) {
            System.err.println("Error: The length of the color string must match the number of stones (n).");
            scanner.close();
            return;
        }

        // Initialize a counter for the stones to be removed
        int stonesToRemove = 0;

        // Iterate through the string, starting from the second character.
        // We compare each character with the one immediately preceding it.
        for (int i = 1; i < n; i++) {
            // Check if the current stone's color is the same as the previous stone's color
            if (s.charAt(i) == s.charAt(i - 1)) {
                // If they are the same, we need to remove one of them.
                // Increment the counter.
                stonesToRemove++;
            }
        }

        // Print the final count of stones to be removed
        System.out.println("Minimum stones to remove: " + stonesToRemove);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
