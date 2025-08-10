import java.util.Scanner;

public class P112a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two strings
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        // Convert both strings to lowercase for case-insensitive comparison
        String firstLower = firstString.toLowerCase();
        String secondLower = secondString.toLowerCase();

        // Compare the lowercase strings lexicographically
        int result = firstLower.compareTo(secondLower);

        // Print the output based on the comparison result
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}


