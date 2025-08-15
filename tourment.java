import java.util.Scanner;

public class tourment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }

            if (k == n) {
                System.out.println("YES");
                continue;
            }

            int playerJStrength = a[j];
            int strongerThanJ = 0;
            int weakerThanJ = 0;
            for (int i = 1; i <= n; i++) {
                if (i != j) {
                    if (a[i] > playerJStrength) {
                        strongerThanJ++;
                    } else if (a[i] < playerJStrength) {
                        weakerThanJ++;
                    }
                }
            }

            int sameStrengthAsJ = n - 1 - strongerThanJ - weakerThanJ;

            if (strongerThanJ <= k - 1) {
                System.out.println("YES");
            } else {
                if (k >= 2) {
                    System.out.println("YES");
                } else {
                    if (strongerThanJ == 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        scanner.close();
    }

}
