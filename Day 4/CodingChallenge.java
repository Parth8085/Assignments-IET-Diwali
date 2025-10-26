import java.util.*;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers from 0 to n (one missing):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }
}
